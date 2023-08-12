package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOS.FlightDAO;
import Model.Flight;

@WebServlet(urlPatterns = "/addFlight")
public class AddFlightController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addFlight.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String departurePlace = req.getParameter("departurePlace");
            LocalDateTime departureDate = LocalDateTime.parse(req.getParameter("departureDate"));
            String destination = req.getParameter("destination");
            int numberOfSeats = Integer.parseInt(req.getParameter("numOfSeats"));
            int maxCargoWeight = Integer.parseInt(req.getParameter("maxCargoWeight"));
            int price = Integer.parseInt(req.getParameter("price"));
            int currentUserId = Integer.parseInt(req.getSession().getAttribute("id").toString());
            FlightDAO flightDAO = new FlightDAO();
            Flight flight = new Flight(currentUserId, LocalDateTime.now(), currentUserId, LocalDateTime.now(), 1, 0,
                    departurePlace, destination, departureDate, numberOfSeats, maxCargoWeight, price);
            flightDAO.addFlight(flight);
            resp.setStatus(HttpServletResponse.SC_CREATED);
            resp.sendRedirect("addFlight");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
