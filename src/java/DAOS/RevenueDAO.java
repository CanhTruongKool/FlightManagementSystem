package DAOS;

import Model.Revenue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RevenueDAO extends DataAccessObject {

    public RevenueDAO() {
    }

    public Revenue getTotalRevenue() {

        Revenue result = new Revenue();

        try {
            String sql = "SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo \n"
                    + "FROM ( \n"
                    + "	SELECT ID, QuanlityTicket*Flights.PriceTicket AS RevenueTicket, RevenueCargo\n"
                    + "	FROM Flights left join(\n"
                    + "		SELECT FlightID, COUNT(*) AS QuanlityTicket\n"
                    + "		FROM Tickets \n"
                    + "		GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(\n"
                    + "			SELECT FlightID, SUM(FlightCargo.PriceCargo) AS RevenueCargo\n"
                    + "			FROM FlightCargo\n"
                    + "			GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();   // show data

            while (rs.next()) {
                float revenueTicket = rs.getInt("RevenueTicket");
                float revenueCargo = rs.getInt("RevenueCargo");
                result = new Revenue(revenueTicket, revenueCargo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public Revenue getRevenueByFlightID(String flightID) {

        Revenue result = new Revenue();

        try {
            String sql = "SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo \n"
                    + "FROM ( \n"
                    + "	SELECT ID, QuanlityTicket*Flights.PriceTicket AS RevenueTicket, RevenueCargo\n"
                    + "	FROM Flights left join(\n"
                    + "		SELECT FlightID, COUNT(*) AS QuanlityTicket\n"
                    + "		FROM Tickets \n"
                    + "		GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(\n"
                    + "			SELECT FlightID, SUM(FlightCargo.PriceCargo) AS RevenueCargo\n"
                    + "			FROM FlightCargo\n"
                    + "			GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r\n"
                    + "WHERE r.ID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, flightID);
            ResultSet rs = stmt.executeQuery();   // show data

            while (rs.next()) {
                float revenueTicket = rs.getInt("RevenueTicket");
                float revenueCargo = rs.getInt("RevenueCargo");
                result = new Revenue(revenueTicket, revenueCargo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
