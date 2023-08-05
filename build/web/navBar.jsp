<%-- 
    Document   : NavBar
    Created on : Aug 3, 2023, 3:41:43 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <nav class="nav-bar">
        <div class="nav-item" >
            <p>Flights</p>
            <a class="nav-icon" href="home.jsp">
                <i class="fa fa-plane" aria-hidden="true"></i>
            </a>
        </div>
        <div class="nav-item">
            <p>Transaction History</p>
            <a class="nav-icon" href="transactionList.jsp">
                <i class="fa fa-list" aria-hidden="true"></i>
            </a>
        </div>
        <div class="nav-item">
            <p>Searching Id Ticket</p>
            <a class="nav-icon" href="ticketSearching.jsp">
                <i class="fa fa-ticket" aria-hidden="true"></i>
            </a>
        </div>
        <div class="nav-item">
            <p>Management Mode</p>
            <a class="nav-icon" href="login.jsp">
                <i class="fa fa-wrench" aria-hidden="true"></i>
            </a>
        </div>
    </nav>
</html>
