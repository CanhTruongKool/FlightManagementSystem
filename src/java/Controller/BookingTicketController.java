/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOS.PassengerDAO;
import DAOS.TicketDAO;
import Model.Passenger;
import Model.Ticket;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class BookingTicketController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String FlightID = request.getParameter("flightID");
        String name = request.getParameter("name").toUpperCase();
        String identifyNumber = request.getParameter("identifyNumber");
        String phone = request.getParameter("phone");
        PassengerDAO pd = new PassengerDAO();
        int passenger = pd.getPassenger(name.toUpperCase(), identifyNumber, phone);
        if (passenger == 0) {
            passenger = pd.CreatePassenger(name.toUpperCase(), identifyNumber, phone);
        }
        TicketDAO td = new TicketDAO();
        Ticket ticket = td.createTicket(FlightID, passenger,
     shortenHash(hashString(FlightID +generateRandomNumber() + shortenHash(hashString(name), 3) + passenger), 6));

        response.sendRedirect("ticketSearching?Code="+ticket.getCode());
    }

    public String hashingTicketID(String ID) {
        return shortenHash(hashString(ID), 6);
    }

    public static String hashString(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder hashString = new StringBuilder();
            for (byte b : hashBytes) {
                hashString.append(String.format("%02x", b));
            }

            return hashString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String shortenHash(String hash, int length) {
        if (hash.length() < length) {
            return hash;
        }
        return hash.substring(7, length + 7);
    }
    
    public static int generateRandomNumber() {
        Random random = new Random();
        int min = 1;
        int max = 500;
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
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
