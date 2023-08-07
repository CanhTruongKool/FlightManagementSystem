<%-- 
    Document   : FlightDetail
    Created on : Aug 3, 2023, 3:30:38 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Plane Management</title>
        <link rel="icon"
              href="https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <style> <%@include file="CSS/flightDetailcss.css" %></style>
    </head>
    <body>  
        <header>
            <%@include file="header.jsp" %>
        </header>
        <div class="content">
            <c:set var = "f" scope = "request" value = "${requestScope.Flight}"/>
            <form action="booking" method="post" class="BookTicketForm" id="BookTicketForm" style="display:none">
                <h4> <label for="">Flight ID </label> <input name="flightID" value="${f.getID()}" readonly="readonly"></h4>
                <h4><label for="">Enter your Identity card number</label> <input type="tel" name="identifyNumber" pattern="[0-9]{12}"></h4>
                <h4><label for="">Enter your name:</label> <input name="name" type="text"></h4>
                <h4><label for="phone">Enter your phone number:</label><input type="tel" id="phone" name="phone" pattern="[0-9]{10}"></h4>
                <h4> <label for="">Flight Price </label> <input name="flightPrice" value="${f.getPrice()}" readonly="readonly"></h4>
                <button onclick=""> Buy </button>
                <button onclick="closeFormTicket(event)"> Close Form </button>
            </form>
            <c:set var = "f" scope = "request" value = "${requestScope.Flight}"/>
            <div class="flight" >
                <div class="flight-right"  style="width: 100%">
                    <div class="flight-logo">
                        <h4>FMS <i class="fa fa-plane" aria-hidden="true"></i>
                            airline</h4>
                    </div>
                </div>
                <div class="flight-right"  style="width: 100%">
                    <div class="flight-travel">
                        <div class="flight-right-content">
                            <h4>Flight ID:</h4>
                            <p style="font-size: 24px;"> ${f.getID()}</p>
                        </div>
                        <div class="flight-right-content">
                            <h4>Departure Place:</h4>
                            <p style="font-size: 24px;"> ${f.getDeparturePlace()}</p> 
                        </div>
                        <div class="flight-right-content">
                            <h4>Destination:  </h4>
                            <p style="font-size: 24px;"> ${f.getDestination()} </p>
                        </div>
                    </div>
                    <div class="flight-right-content">
                        <h4 class="date">Departure date: </h4>
                        <p style="font-size: 24px;"> ${f.getDepartureDate().toString().replace("T", " AT ")} </p>
                    </div>
                    <div class="flight-right-content">
                        <h4>Total seats : </h4>
                        <p style="font-size: 24px;"> ${f.getNumberOfSeats()} </p>
                    </div>
                    <div class="flight-right-content">
                        <h4>Number of Seats left : </h4>
                        <p style="font-size: 24px;"> ${f.getNumberOfSeats()-requestScope.NumberOfSeats} </p>
                    </div>
                    <div class="flight-right-content">
                        <h4>Total weight : </h4>
                        <p style="font-size: 24px;"> ${f.getMaxCargoWeight()}</p>
                    </div>
                      <div class="flight-right-content">
                        <h4>Price : </h4>
                        <p style="font-size: 24px;"> ${f.getPrice()}</p>
                    </div>
                </div>
            </div>

            <button id="TicketButton" onclick="openFormTicket()">Book Ticket</button>
            <button id="CargoButton">Book Cargo Shipment</button>
        </div>
        <script>
            let ticketForm = document.getElementById("BookTicketForm");
            let ticketButton = document.getElementById("TicketButton");
            let cargoButton = document.getElementById("CargoButton");
            function openFormTicket() {

                if (ticketForm.style.display == "none")
                {
                    ticketForm.style.display = "block";
                    ticketButton.style.display = "none";
                    cargoButton.style.display = "none";
                }
            }
            
            function closeFormTicket(event){
                event.preventDefault();
                if (ticketForm.style.display != "none")
                {
                    ticketForm.style.display = "none";
                    ticketButton.style.display = "inline";
                    cargoButton.style.display = "inline";
                }
            }
        </script>
    </body>
</html>
