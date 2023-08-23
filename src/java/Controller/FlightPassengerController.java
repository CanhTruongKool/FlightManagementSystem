package Controller;

import Controller.DTOS.PaginatedListDTO;
import Controller.DTOS.PassengerDTO;
import DAOS.PassengerDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FlightPassengerController extends HttpServlet {

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

        String flightID = request.getParameter("id");
        String flightPage = request.getParameter("fp");
        String statusFlight = request.getParameter("st");

        PassengerDAO passengerDAO = new PassengerDAO();
        ArrayList<PassengerDTO> passengerList = new ArrayList<>();
        try {
            passengerList = passengerDAO.getPassengersByFlightID(flightID);
        } catch (SQLException ex) {
            Logger.getLogger(FlightPassengerController.class.getName()).log(Level.SEVERE, null, ex);
        }

        int pageSize = 10;
        int noOfPages = (int) Math.ceil(passengerList.size() * 1.0 / pageSize);
        String page_raw = request.getParameter("page");
        int page;
        try {
            page = Integer.parseInt(page_raw);
        } catch (Exception e) {
            page = 1;
        }

        request.setAttribute("passengerList", PaginatedListDTO.getPage(passengerList, page, pageSize));
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", page);
        request.setAttribute("flightPage", flightPage);
        request.setAttribute("flightID", flightID);
        request.setAttribute("statusFlight", statusFlight);

        RequestDispatcher view = request.getRequestDispatcher("flightPassenger.jsp");
        view.forward(request, response);
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
