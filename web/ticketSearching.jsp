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
        <link rel="icon" href="https://png.pngtree.com/png-vector/20191023/ourlarge/pngtree-vector-airplane-icon-png-image_1851857.jpg">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <style><%@include file="/CSS/homecss.css"%>
            <%@include file="/CSS/ticketcss.css" %></style>
        <script src="https://kit.fontawesome.com/48fb0be74f.js"
        crossorigin="anonymous"></script>
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
            <c:set var = "f" scope = "request" value = "${requestScope.ticket}"/>
            <c:if test = "${f == null}">
                <h3 style="color: white">${requestScope.searchResult}</h3>
            </c:if>
            <c:set var = "f" scope = "request" value = "${requestScope.ticket}"/>
            <c:if test = "${f != null}">
                <div class="ticket-details">
                    <div class="ticket-logo">
                        <span></span>
                        <h3>FMS <i class="fa fa-plane" aria-hidden="true"></i>
                            airline</h3>
                        <h3 style="font-size: 16px">Boarding pass</h3>
                    </div>
                    <div class="ticket-left">
                        <div class="ticket-content-left">
                            <div class="ticket-infor">
                                <h4>Flight ID:</h4>
                                <p>FMS-A0${f.getFlightID()} </p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Departure From: </h4>
                                <p>${requestScope.flight.getDeparturePlace()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Destination: </h4>
                                <p>${requestScope.flight.getDestination()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Departure date: </h4>
                                <p>${requestScope.flight.getDepartureDate().toString().replace("T", " AT ")}</p>
                            </div>
                        </div>
                        <div class="ticket-content-right">
                            <div class="ticket-infor">
                                <h4>Passenger name: </h4>
                                <p id="passengerName">${requestScope.passenger.getName()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Passenger phone: </h4>
                                <p id="phone">${requestScope.passenger.getPhoneNumber()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Passenger ID: </h4>
                                <p id="passengerID" >${requestScope.passenger.getIdentityNumber()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Ticket-CODE: </h4>
                                <p id="code">${f.getCode()}</p>
                            </div>
                            <div class="ticket-infor">
                                <h4>Price: </h4>
                                <p>${requestScope.flight.getPrice()}</p>
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
                            <p>${requestScope.flight.getDeparturePlace()}</p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Destination: </h4>
                            <p>${requestScope.flight.getDestination()}</p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Flight ID:</h4>
                            <p>FMS-A0${f.getFlightID()} </p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Ticket-CODE: </h4>
                            <p> ${f.getCode()} </p>
                        </div>
                        <div class="ticket-infor">
                            <h4>Passenger ID: </h4>
                            <p id="passengerIDCopy">${requestScope.passenger.getIdentityNumber()}</p>
                        </div>
                    </div>
                </div>
                <div class="alert-edit" id="alertEdit">
                    <p>Focus mouse on Field ( Passenger name or Passenger ID ) on the left of the ticket to editing. </p>
                </div>
                <div class="ticket-selection" style="margin-top: 80px">
                    <c:set var = "ticketStatus" scope = "request" value = "${requestScope.ticketStatus}"/>
                    <c:if test = "${ticketStatus == 0}">
                        <button id="editTicket" onclick="editTicket()">Edit</button>
                        <button><a href="refundTicket?Code=${f.getCode()}">Refund ticket</a></button>
                    </c:if>
                    <c:if test = "${ticketStatus == 1}">

                        <h4 style="color: white"> This ticket has been canceled </h4>
                    </c:if>                      
                </div>
            </div>
        </c:if>
        <%@include file="contact.jsp" %>  
        <script>
            function editTicket() {
                let alertEdit = document.getElementById('alertEdit');
                if (alertEdit.style.opacity == 0) {
                    alertEdit.style.opacity = 1;
                } else {
                    alertEdit.style.opacity = 0;
                }
                ;
                let button = document.getElementById('editTicket');
                let passName = document.getElementById('passengerName');
                let passID = document.getElementById('passengerID');
                let passNameCopy = document.getElementById('passengerNameCopy');
                let passIDCopy = document.getElementById('passengerIDCopy');
                if (button.innerHTML == 'Edit') {
                    button.innerHTML = 'Finished';
                } else {
                    button.innerHTML = 'Edit';
                    sendData();
                }
                passName.contentEditable = 'true';
                passName.focus();
                passName.addEventListener('focusout', () => {
                    passNameCopy.innerHTML = passName.innerHTML;
                });
                passID.contentEditable = 'true';
                passID.addEventListener('focusout', () => {
                    passIDCopy.innerHTML = passID.innerHTML;
                })
            }
            function sendData() {
                let code = document.getElementById("code").innerHTML;
                let phone = document.getElementById("phone").innerHTML;
                let passName = document.getElementById('passengerName')
                let passID = document.getElementById('passengerID');
                let formEdit = document.createElement('form');
                formEdit.style.width = '0';
                formEdit.style.height = '0';
                document.body.appendChild(formEdit);
                let passengerName = document.createElement('input');
                passengerName.type = Text;
                passengerName.value = passName.innerHTML;
                passengerName.name = 'name';
                formEdit.appendChild(passengerName);
                let passengerID = document.createElement('input');
                passengerID.type = Text;
                passengerID.value = passID.innerHTML;
                passengerID.name = 'identifyNumber';
                formEdit.appendChild(passengerID);
                let codeID = document.createElement('input');
                codeID.type = Text;
                codeID.value = code;
                codeID.name = 'code';
                formEdit.appendChild(codeID);
                let phoneID = document.createElement('input');
                phoneID.type = Text;
                phoneID.value = phone;
                phoneID.name = 'phone';
                formEdit.appendChild(phoneID);
                formEdit.action = "editTicket";
                formEdit.method = "post";
                formEdit.style.width = '0';
                formEdit.style.height = '0';
                formEdit.style.visibility = "hidden";
                formEdit.submit();
            }
        </script>

    </body>
</html>
