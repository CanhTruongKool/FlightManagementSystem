package DAOS;

import Controller.DTOS.RevenueDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RevenueDAO extends DataAccessObject {

    public RevenueDAO() {
    }

    public RevenueDTO getTotalRevenue() {
        RevenueDTO result = new RevenueDTO();
        try {
            String sql = "SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo \n"
                    + "FROM ( \n"
                    + "	SELECT ID, QuanlityTicket*Flights.Price AS RevenueTicket, RevenueCargo\n"
                    + "	FROM Flights left join(\n"
                    + "		SELECT FlightID, COUNT(*) AS QuanlityTicket\n"
                    + "		FROM Tickets \n"
                    + "		GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(\n"
                    + "			SELECT FlightID, SUM(FlightCargo.Price) AS RevenueCargo\n"
                    + "			FROM FlightCargo\n"
                    + "			GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();   // show data

            while (rs.next()) {
                double revenueTicket = rs.getDouble("RevenueTicket");
                double revenueCargo = rs.getDouble("RevenueCargo");
                result = new RevenueDTO(revenueTicket, revenueCargo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public RevenueDTO getRevenueByFlightID(String flightID) {

        RevenueDTO result = new RevenueDTO();

        try {
            String sql = "SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo \n"
                    + "FROM ( \n"
                    + "	SELECT ID, QuanlityTicket*Flights.Price AS RevenueTicket, RevenueCargo\n"
                    + "	FROM Flights left join(\n"
                    + "		SELECT FlightID, COUNT(*) AS QuanlityTicket\n"
                    + "		FROM Tickets \n"
                    + "		GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(\n"
                    + "			SELECT FlightID, SUM(FlightCargo.Price) AS RevenueCargo\n"
                    + "			FROM FlightCargo\n"
                    + "			GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r\n"
                    + "WHERE r.ID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, flightID);
            ResultSet rs = stmt.executeQuery();   // show data

            while (rs.next()) {
                double revenueTicket = rs.getDouble("RevenueTicket");
                double revenueCargo = rs.getDouble("RevenueCargo");
                result = new RevenueDTO(revenueTicket, revenueCargo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
