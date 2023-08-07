/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOS.FlightDAO;
import Model.Flight;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class SearchingFlightController extends HttpServlet {

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
        HttpSession session = request.getSession();
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");
        String date = request.getParameter("time");
        FlightDAO fd = new FlightDAO();
        //paging
        int page = 0;
        try {
            page =Integer.parseInt(request.getParameter("page")) ;
            System.out.println(page);
        } catch (Exception e) {
            page = 0;
        }
        
        if(page < 0) page = 0;
        
         ArrayList<Flight> FlightList = new ArrayList<>();
        try {
            FlightList= (ArrayList<Flight>)session.getAttribute("FlightList");
        } catch (Exception e) {
           
        }
        int size = 0;
        if(FlightList == null) size = fd.searchFlight(departure, destination, date).size();
        else size = fd.searchFlight(FlightList.get(0).getDeparturePlace(), FlightList.get(0).getDestination(),FlightList.get(0).getDepartureDate().toString().substring(0, 9)).size();
        int numberPerPage =9;
        int num = (size %9 == 0) ? (size /9 ) : ((size/9) +1);
        
        int start = 1, end = 0;
        start = (page)* numberPerPage;
        end = Math.min((page +1) * numberPerPage, size);
        System.out.println(start + "  " + end + " " + size);
        // end paging
        
        request.setAttribute("page", page);
        request.setAttribute("num", num);
       
        if(FlightList == null) FlightList=fd.getSearchFlight(departure, destination, date, start, end);
        else FlightList = fd.getSearchFlight(FlightList.get(0).getDeparturePlace(), FlightList.get(0).getDestination(),FlightList.get(0).getDepartureDate().toString().substring(0, 9),start,end);
        
        String SearchResult= "";
        if(FlightList.isEmpty()) SearchResult = "Searching result : Not Found";
        else
        {SearchResult = "Seaching result : Departure from : " + FlightList.get(0).getDeparturePlace() + ", Destination at :" + FlightList.get(0).getDestination();}
        
        request.setAttribute("position","searchflight");
        session.setAttribute("searchResult", SearchResult);
        session.setAttribute("FlightList", FlightList);
        request.getRequestDispatcher("home.jsp").forward(request, response);
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
    }// </editor-fold>g

}
