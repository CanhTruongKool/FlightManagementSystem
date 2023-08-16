/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOS.DataAccessObject;
import DAOS.FlightDAO;
import DAOS.PassengerDAO;
import DAOS.TicketDAO;
import Model.Flight;
import Model.Passenger;
import Model.Ticket;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class SearchingTicketController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = request.getParameter("Code");
        String searchResult = "";

        TicketDAO td = new TicketDAO();
        Ticket ticket = td.searchTicket(code);
        PassengerDAO pd = new PassengerDAO();
        FlightDAO fd=  new FlightDAO();
        
        if (ticket == null) {
            searchResult = "Not found ticket";
        } else {
            searchResult = "Found ticket";
            Passenger passenger = pd.getPassengerFromID(ticket.getPassengerID());
            Flight flight = fd.searchFlightByID(ticket.getFlightID());
            int ticketStatus = td.getTicketStatus(code);
            request.setAttribute("ticketStatus", ticketStatus);
            request.setAttribute("ticket", ticket);
            request.setAttribute("flight", flight);
            request.setAttribute("passenger", passenger);
        }
        
        request.setAttribute("searchResult", searchResult);
        request.getRequestDispatcher("ticketSearching.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
