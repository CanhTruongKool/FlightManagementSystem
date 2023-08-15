<%-- 
    Document   : Ticket
    Created on : Aug 3, 2023, 3:24:53 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Searching Ticket</title>
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
            <form  class="flight-box" action="ticketSearching" method='post'>
                <div class="search-bar">
                    <div class="search-bar-item1">
                        <p>Enter ticket code: </p> 
                        <input name="Code">
                    </div>
                    <div class="search-button">
                        <button id="search">Search <i class="fa fa-search" aria-hidden="true"></i></button>
                    </div>
                    <div class="search-button">
                        <button id="cargo"> <a style="color: white; align-items: flex-start" href="cargoSearching.jsp">Cargo</a></button>
                    </div>
                </div>
            </form>
            <h3 style="color: white">${requestScope.searchResult}</h3>
            <c:set var = "f" scope = "request" value = "${requestScope.ticket}"/>
            <c:if test = "${f != null}">
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
                            <form action="editTicket" method="post">
                                <div class="flight-right-content">
                                    <input id="Code" name="Code" style="display: none" value="${f.getCode()}">
                                    <h4>Passenger name: <p>${requestScope.passenger.getName()}</p> 
                                        <input id="name" name="name" style="display: none" value="${requestScope.passenger.getName()}">
                                    </h4>
                                </div>
                                <div class="flight-right-content">
                                    <h4>Passenger phone: <p>${requestScope.passenger.getPhoneNumber()}</p>
                                    <input id="phoneNumber" name="phone" style="display: none" value="${requestScope.passenger.getPhoneNumber()}">
                                    </h4>
                                </div>
                                <div class="flight-right-content">
                                    <h4>Passenger ID:<p>${requestScope.passenger.getIdentityNumber()}</p>
                                        <input id="identifyNumber" name="identifyNumber" style="display: none"  value="${requestScope.passenger.getIdentityNumber()}">
                                    </h4>
                                </div>
                                <div class="flight-right-content">                                  
                                    <h4><button id="okButton" style="display: none" >OK</button></h4>
                                </div>
                            </form>
                            <h4><button id="editButton" onclick="openEdit()" >Edit Ticket</button></h4>
                            <div class="flight-right-content">
                                <h4>Code: <p> ${f.getCode()} </p></h4>
                            </div>
                            <div class="flight-right-content">
                                <h4>Price: <p> ${requestScope.flight.getPrice()} </p></h4>
                            </div>
                            <div class="flight-right-content">
                                <c:set var = "ticketStatus" scope = "request" value = "${requestScope.ticketStatus}"/>
                                <c:if test = "${ticketStatus == 0}">
                                    <button><a href="refundTicket?Code=${f.getCode()}">Refund ticket</a></button>
                                </c:if>
                                <c:if test = "${ticketStatus == 1}">
                                    <h4> This ticket has been canceled </h4>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
            </c:if>
        </div>
        <script>
            let Namefield = document.getElementById("name");
            let IDfield = document.getElementById("identifyNumber");
            let okButton = document.getElementById("okButton");
            let editButton = document.getElementById("editButton");

            function openEdit()
            {
                if (Namefield.style.display == "none")
                {
                    Namefield.style.display = "block";
                    IDfield.style.display = "block";
                    okButton.style.display = "block";
                    editButton.value = "Close Edit";
                } else {
                    Namefield.style.display = "none";
                    IDfield.style.display = "none";
                    okButton.style.display = "none";
                    editButton.value = "Edit Ticket";
                }
            }
        </script>
    </body>
</html>
