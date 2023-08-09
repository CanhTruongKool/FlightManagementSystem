package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.DTOS.LoginDTO;
import DAOS.AdminDAO;
import Model.Admin;

/**
 *
 * @author Administrator
 */
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Admin admin = new AdminDAO().Get(new LoginDTO(username, password));
            if (admin == null) {
                response.sendError(401, "User name or password is invalid");
            } else {
                HttpSession session = request.getSession(true);
                session.setMaxInactiveInterval(60);
                session.setAttribute("username", admin.getUserName());
                session.setAttribute("id", admin.getID());
                response.sendRedirect("managementMenu.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
