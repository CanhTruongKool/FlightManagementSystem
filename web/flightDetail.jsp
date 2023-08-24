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
        <title>Flight Details</title>
        <link rel="stylesheet" href="style.css">
        <link rel="icon" href="https://png.pngtree.com/png-vector/20191023/ourlarge/pngtree-vector-airplane-icon-png-image_1851857.jpg">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <script src="https://kit.fontawesome.com/48fb0be74f.js"
        crossorigin="anonymous"></script>

        <style> <%@include file="CSS/flightDetailcss.css" %></style>
    </head>
    <body>  
        <header>
            <%@include file="header.jsp" %>
        </header>
        <div class="content">

            <c:set var = "f" scope = "request" value = "${requestScope.Flight}"/>
            <div class="plane-details">
                <div class="flight-details">
                    <div class="details-content">
                        <h2>Flight Id: </h2>
                        <p style="color: white">FMS-A0${f.getID()}</p>
                    </div>
                    <div class="details-content">
                        <span class="line"></span>
                        <h3 id="effect">Departure from: </h3>
                        <p style="color: white">${f.getDeparturePlace()}</p>
                    </div>
                    <div class="details-content">
                        <h3>Destination: </h3>
                        <p style="color: white">${f.getDestination()}</p>
                    </div>
                    <div class="details-content">
                        <h3>Departure date <i class="fa fa-calendar"
                                              aria-hidden="true"></i>: </h3> 
                        <p style="color: white">  ${f.getDepartureDate().toString().replace("T", " AT ")} </p>
                    </div>

                    <div class="details-content">
                        <h3>Number of ticket available <i class="fa fa-ticket"
                                                          aria-hidden="true"></i>: </h3>
                        <p style="color: white;"> ${f.getNumberOfSeats()-requestScope.NumberOfSeats}</p>
                    </div>

                    <div class="details-content">
                        <h3>Cargo Weight available <i class="fas fa-boxes"></i>:
                        </h3>      
                        <p style="color: white">${f.getMaxCargoWeight()} (KG) </p>
                    </div>

                    <div class="details-content">
                        <h3 style="width: 120%">Ticket price <i class="fa-solid fa-money-bill"></i>:
                        </h3>           
                        <p style="color: white"> ${f.getPrice()} </p>
                    </div>

                </div>
                <button id="booking-button" onclick="showBookForm()">Booking</button>
                <p id="closeBooking" onclick="closeBookForm()">&times;</p>
                <div class="booking" id="booking">
                    <div class="booking-form">
                        <div class="booking-choice">
                            <div class="choice-radio" onclick="selectBooking(0)">
                                <input id="buyTicket" type="radio" name="choice">
                                <label for="buyTicket">Ticket</label>
                            </div>
                            <div class="choice-radio" onclick="selectBooking(1)">
                                <input id="buyCargo" type="radio" name="choice">
                                <label for="buyCargo">Cargo</label>
                            </div>
                        </div>
                        <div class="booking-content">
                            <form id="ticketForm" onsubmit="return(validateForm(0))" action="booking" method="post">
                                <div class="user-input">
                                    <h3>Flight ID: </h3>
                                    <p> <input name="flightID" style="display: none" value="${f.getID()}" readonly> FMS-A0${f.getID()}</p>                                
                                </div>
                                <div class="user-input">
                                    <h3>Enter your Identity card number: </h3>
                                    <input type="tel" pattern="[0-9]{12}" name="identifyNumber">
                                </div>
                                <div class="user-input">
                                    <h3>Enter your name: </h3>
                                    <input type="text" name="name" id="passengerName">
                                </div>
                                <div class="user-input">
                                    <h3>Enter your phone number: </h3>
                                    <input type="tel" pattern="[0-9]{10}" title="Phone number must be 10 digits" name="phone" id="passengerPhone">
                                </div>
                                <div class="user-input">
                                    <h3>Ticket price: </h3>
                                    <c:set var = "f" scope = "request" value = "${requestScope.Flight}"/>
                                    <p id="ticketPrice"> ${f.getPrice()}</p>
                                </div>
                                <div class="details-content">                         
                                    <p style="color: red">You will have 20kg of free cargo, if you want to have more cargo weight, please buy more at cargo </p>
                                </div>
                                <c:set var = "canBuy" scope = "request" value = "${f.getNumberOfSeats()-requestScope.NumberOfSeats}"/>  
                                <c:if test = "${canBuy > 0}">
                                    <button type="submit">Book Ticket!</button>
                                </c:if>
                                <c:if test = "${canBuy <= 0}">
                                    <h4 style="color:white">This flight has fully booked</h4>
                                </c:if>

                            </form>
                            <form id="cargoForm" onsubmit="return(validateForm(1))" action="bookingCargo" method="post">
                                <div class="user-input">
                                    <h3>Flight ID: </h3>
                                    <p> <input name="flightID" style="display: none" value="${f.getID()}" readonly> FMS-A0${f.getID()}</p>
                                </div>
                                <div class="user-input">
                                    <h3>Enter your Identity card number: </h3>
                                    <input type="tel" pattern="[0-9]{12}" name="identifyNumber" title="Identify number must be 12 digits" id="identifyNumber">
                                </div>
                                <div class="user-input">
                                    <h3>Enter your name: </h3>
                                    <input type="text" name="name" id="name">
                                </div>
                                <div class="user-input">
                                    <h3>Enter your phone number: </h3>
                                    <input type="tel" pattern="[0-9]{10}"  title="Phone number must be 10 digits" name="phone" id="passengerPhone">
                                </div>
                                <div class="user-input">
                                    <h3>Enter Cargo category: </h3>
                                    <select name="category" id="cargoCategory">
                                        <option>Select Cargo category</option>
                                        <option>Handle with care</option>
                                        <option>Liquid</option>
                                        <option>Select category </option>
                                        <option>Perishables </option>
                                        <option>Electronics </option>
                                        <option>Pharmaceuticals </option>
                                        <option>Precious Cargo </option>
                                        <option>Agricultural Products </option>
                                        <option>Consumer Goods </option>
                                        <option>Sports Equipment </option>
                                    </select>
                                </div>
                                <div class="user-input">
                                    <h3>Enter Cargo Weight: </h3>
                                    <select name="weight" id="cargoWeight" onchange="calculatePrice()">
                                        <option value="0">Select Weight Range</option>
                                    </select>
                                </div>
                                <div class="user-input">
                                    <h3 style="width: 120%">Ticket price: </h3>
                                    <c:set var = "f" scope = "request" value = "${requestScope.Flight}"/>
                                    <p> <input name="price" id="cargoPrice" value="" readonly> </p>
                                </div>
                                <button type="submit">Book Cargo!</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <script>

            function calculatePrice() {
                var weight = document.getElementById("cargoWeight").value;
                var price = 0
                price = 50000 + (weight - 1) * 5000;
                document.getElementById("cargoPrice").value = price;
            }
            var maxWeight = ${requestScope.Flight.getMaxCargoWeight()}; // Giá trị tối đa cho trọng lượng

            function populateWeightOptions() {
                var select = document.getElementById("cargoWeight");

                for (var i = 1; i <= maxWeight; i += 10) {
                    var option = document.createElement("option");
                    option.value = i;
                    option.text = i + "-" + (i + 9) + " KG";
                    select.appendChild(option);
                }
            }
            window.onload = populateWeightOptions;
            function repeatAnimations() {
                let container = document.createElement('div');
                container.classList.add('fly-effect');
                let animation1 = document.createElement('i');
                animation1.classList.add('fa-solid', 'fa-plane-departure');
                let animation2 = document.createElement('i');
                animation2.classList.add('fas', 'fa-plane');
                let animation3 = document.createElement('i');
                animation3.classList.add('fa-solid', 'fa-plane-arrival');
                container.appendChild(animation1);
                container.appendChild(animation2);
                container.appendChild(animation3);
                document.getElementById('effect').appendChild(container);
                animation1.style.animation = 'fly 3s ease forwards';
                animation1.addEventListener('animationend', () => {
                    animation2.style.animation = 'fly2 5s ease forwards';
                });

                animation2.addEventListener('animationend', () => {
                    animation3.style.animation = 'fly3 4s ease forwards';
                });

                animation3.addEventListener('animationend', () => {
                    while (container.firstChild) {
                        container.firstChild.remove();
                    }
                    repeatAnimations();
                });
            }

            repeatAnimations();
            function openNav() {
                document.getElementById("myNav").style.width = "100%";
                document.getElementsByClassName("earth-display")[0].style.opacity = '1';
            }

            function closeNav() {
                document.getElementById("myNav").style.width = "0%";
                document.getElementsByClassName("earth-display")[0].style.opacity = '0';
            }
            function showBookForm() {
                document.getElementById('buyTicket').checked = 'true';
                selectBooking(0);
                document.getElementById('closeBooking').style.fontSize = '4em';
                document.getElementById('booking').style.width = '100%';
                document.getElementById('booking').style.height = '100%';
                document.getElementById('booking').addEventListener('transitionend', formAnimation());
            }
            function formAnimation() {
                setTimeout(() => {
                    document.getElementsByClassName('booking-form')[0].style.width = '50%';
                    setTimeout(() => {
                        document.getElementsByClassName('booking-form')[0].style.height = '90%';
                    }, 800);
                }, 1000);
            }
            function closeBookForm() {
                document.getElementById('closeBooking').style.fontSize = '0em';
                document.getElementsByClassName('booking-form')[0].style.width = '0%';
                document.getElementsByClassName('booking-form')[0].style.height = '.5%'
                setTimeout(() => {
                    document.getElementById('booking').style.width = '0';
                }, 500);
            }
            function selectBooking(choice) {
                document.getElementsByClassName('choice-radio')[choice].style.borderBottom = 'none';
                document.getElementsByClassName('choice-radio')[choice == 0 ? 1 : 0 ].style.borderBottom = 'solid 2px black';
                if (choice == 1) {
                    document.getElementById('ticketForm').style.visibility = 'hidden';
                    document.getElementById('cargoForm').style.visibility = 'visible';
                } else {
                    document.getElementById('cargoForm').style.visibility = 'hidden';
                    document.getElementById('ticketForm').style.visibility = 'visible';
                }
            }
            function validateForm(choice) {

                let getPrice = 0;
                let price = document.createElement('input');
                price.setAttribute('type', 'tel');
                price.setAttribute('name', 'price');
                let flyID = document.createElement('input');
                flyID.setAttribute('type', 'text');
                flyID.setAttribute('name', 'flyID');
                let id = ''
                if (choice == 0) {
                    getPrice = document.getElementById('ticketPrice')
                    id = document.getElementById('flyID').innerHTML;
                } else {
                    getPrice = document.getElementById('cargoPrice')
                    id = document.getElementById('flyIDCargo').innerHTML;
                }
                price.value = getPrice.textContent.replace('K', '000');
                price.style.display = 'none'
                flyID.style.display = 'none'
                flyID.value = id;
                if (choice == 0) {
                    document.getElementById('ticketForm').append(price)
                    document.getElementById('ticketForm').append(flyID)
                } else {
                    document.getElementById('cargoForm').append(price)
                    document.getElementById('cargoForm').append(flyID)
                }
                return true;
            }
        </script>
        <%@include file="contact.jsp" %>  
    </body>

</html>
