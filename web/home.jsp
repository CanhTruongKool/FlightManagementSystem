<%-- 
    Document   : home
    Created on : Aug 3, 2023, 3:15:03 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home page</title>
        <link rel="icon"
              href="https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <link rel="stylesheet" href="./CSS/homecss.css" type="text/css">
        <style><%@include file="/CSS/homecss.css"%></style>
    </head>
    <body>  
        <header>
            <%@include file="header.jsp" %>           
        </header>
        <div class="content">
            <c:set var = "canSearch" scope = "session" value = "${requestScope.FlightList}"/>
            <c:if test = "${canSearch != null}">
                <form  class="flight-box" action="searchflight" method='post'>
                    <div class="search-bar">
                        <div class="search-bar-item1">
                            <p>Departure Place: </p> 
                            <select id="departure" name="departure">
                                <option>Choose departure</option>
                                <option>Ha Noi</option>
                                <option>TP Ho Chi Minh</option>
                                <option>Hue</option>
                                <option>Da Nang</option>
                                <option>Hai Duong</option>
                                <option>Can Tho</option>
                                <option>Gia Lai</option>
                            </select>
                        </div>
                        <div class="search-bar-item1">
                            <p>Destination: </p> 
                            <select id="destination" name="destination">
                                <option>Choose departure</option>
                                <option>Ha Noi</option>
                                <option>TP Ho Chi Minh</option>
                                <option>Hue</option>
                                <option>Da Nang</option>
                                <option>Hai Duong</option>
                                <option>Can Tho</option>
                                <option>Gia Lai</option>
                            </select>
                        </div>
                        <div class="search-bar-item2">
                            <p>Departure date:</p> 
                            <input id="time" name="time" type="datetime-local">
                        </div>
                        <div class="search-button">
                            <button id="search">Search <i class="fa fa-search" aria-hidden="true"></i></button>
                        </div>
                    </div>
                </form>
            </c:if>


            <div>
                <h3 class="searchResult">${sessionScope.searchResult}</h3>
            </div> 

            <div class="container" style="color: white">
                <c:forEach var="f" items="${requestScope.FlightList}" varStatus="status">  
                    <div class="product">
                        <h4>ID: ${f.getID()} </h4>
                        <h5>Departure place: ${f.getDeparturePlace()} || Destination: ${f.getDestination()}</h5>                        
                        <h5>At time: ${f.getDepartureDate()}</h5>
                        <button id="search">View Detail</button>
                    </div>  
                </c:forEach>
            </div>
            <div class="container" style="color: white">
                <c:forEach var="f" items="${sessionScope.FlightList}" varStatus="status">  
                    <div class="product">
                        <h4>ID: ${f.getID()} </h4>
                        <h5>Departure place: ${f.getDeparturePlace()} || Destination: ${f.getDestination()}</h5> 
                        <h5>At time: ${f.getDepartureDate()}</h5>
                        <button id="search">View Detail</button>
                    </div>  
                </c:forEach>
            </div>

            <div  style="position: fixed; bottom: 0; right: 0;">
                <c:set var = "Page" scope = "request" value = "${requestScope.page}"/>
                <c:if test = "${Page > 0}">
                    <button id=""><a href="${requestScope.position}?page=${requestScope.page -1}">Previous </button>
                </c:if>
                <c:set var = "num" scope = "request" value = "${requestScope.num}"/>
                <c:if test = "${Page < num -1}">
                    <button id=""><a href="${requestScope.position}?page=${requestScope.page +1}">Next</a></button>
                </c:if>

            </div>
        </div>

    </body>
    <script>
        document.querySelector('form').addEventListener('submit', function (event) {
            event.preventDefault();
            const inputElement = document.getElementById('time');
            inputElement.value = inputElement.value.replace(' ', 'T'); // Thêm ký tự "T" vào trước giờ
            this.submit();
        });
    </script>
</html>
