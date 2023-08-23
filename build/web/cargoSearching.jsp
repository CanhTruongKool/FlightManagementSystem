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
        <link rel="icon" href="https://png.pngtree.com/png-vector/20191023/ourlarge/pngtree-vector-airplane-icon-png-image_1851857.jpg">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <style><%@include file="/CSS/homecss.css"%>
            <%@include file="/CSS/ticketcss.css" %>
        </style>
    </head>
    <body>  
        <header>
            <%@include file="header.jsp" %>
        </header>
        <div class="content" >
            <form class="flight-box" action="searchCargo" method='post'>
                <div class="search-bar">
                    <div class="search-bar-item1">
                        <div class="transaction-search">
                            <h3 style="color: white">Enter cargo code: </h3> 
                            <input name="Code">
                        </div>
                    </div>
                    <div class="search-button">
                        <button id="search">Search <i class="fa fa-search"
                                                      aria-hidden="true"></i></button>
                    </div>
                </div>
            </form>
            <c:if test = "${requestScope.cargo != null}">

                <div class="ticket-details">
                    <div class="ticket-logo">
                        <span></span>
                        <h3>FMS <i class="fa fa-plane" aria-hidden="true"></i>
                            airline</h3>
                        <h3 style="font-size: 16px;">Boarding pass</h3>
                    </div>
                    <div class="ticket-left">
                        <div class="ticket-content-left">
                            <div class="ticket-infor">
                                <h4>Flight ID:</h4>
                                <p>FMS-A0${f.getFlightID()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Departure From: </h4>
                                <p>${requestScope.flight.getDeparturePlace()} </p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Destination: </h4>
                                <p>${requestScope.flight.getDestination()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Departure date: </h4>
                                <p>${requestScope.flight.getDepartureDate().toString().replace("T", " AT ")}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Cargo Weight: </h4>
                                <p>${(requestScope.cargo.getWeight())} - ${requestScope.cargo.getWeight()+10}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Cargo Category: </h4>
                                <p>${requestScope.cargo.getCategory()}</p>
                            </div>
                        </div>
                        <div class="ticket-content-right">
                            <div class="ticket-infor">
                                <h4>Passenger name: </h4>
                                <p id="passengerName">${requestScope.passenger.getName()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Passenger phone: </h4>
                                <p>${requestScope.passenger.getPhoneNumber()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Passenger ID: </h4>
                                <p id="passengerID" >${requestScope.passenger.getIdentityNumber()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Cargo-CODE: </h4>
                                <p>${requestScope.cargo.getCode()} </p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Price: </h4>
                                <p>${requestScope.cargo.getPrice()} </p>
                            </div>
                        </div>
                    </div>
                    <div class="ticket-right">
                        <div class="ticket-infor">
                            <h4>Passenger name: </h4>
                            <p id="passengerNameCopy">${requestScope.passenger.getName()}</p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Departure From: </h4>
                            <p>${requestScope.flight.getDeparturePlace()} </p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Destination: </h4>
                            <p>${requestScope.flight.getDestination()}</p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Flight ID:</h4>
                            <p>FMS-A0${f.getFlightID()}</p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Cargo-CODE: </h4>
                            <p>${requestScope.cargo.getCode()} </p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Passenger ID: </h4>
                            <p id="passengerIDCopy">${requestScope.passenger.getIdentityNumber()}</p>
                        </div>
                    </div>
                </div>
            </c:if>
        </div>
        <%@include file="contact.jsp" %>  
    </body>
</html>
