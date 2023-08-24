package DAOS;

import Controller.DTOS.RevenueDTO;

public class RevenueDAO extends DataAccessObject {

    public RevenueDAO() {
    }

    public RevenueDTO getTotalRevenue() {
        RevenueDTO result = new RevenueDTO();
        try {
            String sql = "SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo\n"
                    + "FROM ( \n"
                    + "	SELECT ID, QuanlityTicket*Flights.Price AS RevenueTicket, RevenueCargo\n"
                    + "	FROM Flights left join(\n"
                    + "		SELECT FlightID, COUNT(*) AS QuanlityTicket\n"
                    + "		FROM Tickets\n"
                    + "		WHERE IsCancelled = 0\n"
                    + "		GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(\n"
                    + "			SELECT FlightID, SUM(FlightCargo.Price) AS RevenueCargo\n"
                    + "			FROM FlightCargo\n"
                    + "			GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r";

            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                double revenueTicket = resultSet.getDouble("RevenueTicket");
                double revenueCargo = resultSet.getDouble("RevenueCargo");
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
            String sql = "SELECT SUM(r.RevenueTicket) AS RevenueTicket, SUM(r.RevenueCargo) AS RevenueCargo\n"
                    + "FROM ( \n"
                    + "	SELECT ID, QuanlityTicket*Flights.Price AS RevenueTicket, RevenueCargo\n"
                    + "	FROM Flights left join(\n"
                    + "		SELECT FlightID, COUNT(*) AS QuanlityTicket\n"
                    + "		FROM Tickets\n"
                    + "		WHERE IsCancelled = 0\n"
                    + "		GROUP BY FlightID) AS t on t.FlightID = Flights.ID left join(\n"
                    + "			SELECT FlightID, SUM(FlightCargo.Price) AS RevenueCargo\n"
                    + "			FROM FlightCargo\n"
                    + "			GROUP BY FlightID HAVING COUNT(*) > 0) AS c on c.FlightID = Flights.ID) AS r\n"
                    + "WHERE r.ID = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, flightID);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                double revenueTicket = resultSet.getDouble("RevenueTicket");
                double revenueCargo = resultSet.getDouble("RevenueCargo");
                result = new RevenueDTO(revenueTicket, revenueCargo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
