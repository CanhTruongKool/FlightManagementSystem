<%-- 
    Document   : cargoSearching
    Created on : Aug 14, 2023, 4:50:01 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cargo searching</title>
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
            <form  class="flight-box" action="searchCargo" method='post'>
                <div class="search-bar">
                    <div class="search-bar-item1">
                        <p>Enter cargo code: </p> 
                        <input name="Code">
                    </div>
                    <div class="search-button">
                        <button id="search">Search <i class="fa fa-search" aria-hidden="true"></i></button>
                    </div>
                </div>
            </form>
            <h3 style="color: white">${requestScope.searchResult}</h3>
            <c:if test = "${requestScope.cargo != null}">
                <div class="flight">
                    <div class="flight-right">
                        <div class="flight-right-content">
                            <h4>Flight ID:<p>FMS-A0${f.getFlightID()} <p></h4>
                        </div>
                        <div class="flight-right-content">
                            <h4>Departure from: <p>${requestScope.flight.getDeparturePlace()} <p></h4>
                        </div>
                        <div class="flight-right-content">
                            <h4>Destination :<p>${requestScope.flight.getDestination()} <p></h4>
                        </div>
                        <div class="flight-right-content">
                            <h4>Date/Time <p>${requestScope.flight.getDepartureDate().toString().replace("T", " AT ")} <p></h4>
                        </div>
                        <div class="flight-travel">
                            <div class="flight-right-content">                               
                                <h4>Passenger name: <p>${requestScope.passenger.getName()}</p> </h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Passenger phone: <p>${requestScope.passenger.getPhoneNumber()}</p> </h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Passenger ID:<p>${requestScope.passenger.getIdentityNumber()}</p></h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Code: <p> ${requestScope.cargo.getCode()} </p></h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Category: <p> ${requestScope.cargo.getCategory()} </p></h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Weight <p> ${(requestScope.cargo.getWeight()-10)} - ${requestScope.cargo.getWeight()} </p></h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Price: <p> ${requestScope.cargo.getPrice()} </p></h4>
                            </div>
                        </div>
                    </div>
                </div>
            </c:if>
        </div>
    </body>
</html>
