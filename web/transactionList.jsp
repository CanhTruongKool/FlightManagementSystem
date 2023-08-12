<%-- 
    Document   : TransactionList
    Created on : Aug 3, 2023, 3:23:11 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Transaction list page</title>
        <link rel="stylesheet" href="./CSS/homecss.css">
        <link rel="icon"
              href="https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <style><%@include file="/CSS/homecss.css"%></style>
    </head>
    <body>  
        <header>
            <%@include file="header.jsp" %>
        </header>
        <div class="content">
            <form  class="flight-box" action="viewtrans" method='post'>
                <div class="search-bar">
                    <div class="search-bar-item1">
                        <p>Enter Passenger Identify number: </p> 
                        <input name="ID">
                    </div>
                    <div class="search-button">
                        <button id="search">Search <i class="fa fa-search" aria-hidden="true"></i></button>
                    </div>
                </div>
            </form>
            <h3 style="color: white">${requestScope.searchResult}</h3>
            <c:forEach var = "f" items= "${requestScope.tickets}" varStatus="status">
                <div class="flight">
                    <div class="flight-travel">
                        <div class="flight-right-content">
                            <h4 style="color: white">Ticket code: ${f.getCode()} </h4>
                            <button> <a href="ticketSearching?Code=${f.getCode()}">View Detail</a> </button>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
