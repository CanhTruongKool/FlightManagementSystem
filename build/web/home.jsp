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
                            <p>Departure Place:</p> 
                            <select id="departure" name="departure">
                                <option>Choose departure</option>

                            </select>
                        </div>
                        <div class="search-bar-item1">
                            <p>Destination:</p> 
                            <select id="destination" name="destination">
                                <option>Choose destination</option>

                            </select>
                        </div>
                        <div class="search-bar-item2">
                            <p>Departure date:</p> 
                            <input id="time" name="time" type="date">
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
            <c:set var = "canSearch" scope = "session" value = "${sessionScope.FlightList}"/>
            <c:if test = "${canSearch == null}">
                <div class="flight-list">
                    <c:forEach var="f" items="${requestScope.FlightList}" varStatus="status"> 
                        <div class="flight">
                            <div class="flight-left">
                                <div class="flight-logo">
                                    <h4>FMS <i class="fa fa-plane" aria-hidden="true"></i>
                                        airline</h4>
                                </div>
                                <h3>Flight ID:</h3>
                                <p>FMS-A0${f.getID()}</p>
                            </div>
                            <div class="flight-right">
                                <div class="flight-travel">
                                    <div class="flight-right-content">
                                        <h4>Departure Place:<p> ${f.getDeparturePlace()}</p></h4>
                                    </div>
                                    <div class="flight-right-content">
                                        <h4>Destination:<p> ${f.getDestination()} <p></h4>
                                    </div>
                                </div>
                                <div class="flight-right-content">
                                    <h4 class="date">Departure date: <p> ${f.getDepartureDate().toString().replace("T", " AT ")} <p></h4>
                                </div>
                                <div class="book-nav">
                                    <a style="color: white" href="viewflight?ID=${f.getID()}">Details</a>
                                    <i class="fa fa-caret-right" aria-hidden="true"></i>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </c:if>
            <c:set var = "canSearch" scope = "session" value = "${sessionScope.FlightList}"/>
            <c:if test = "${canSearch != null}">
                <div class="flight-list">
                    <c:forEach var="f" items="${sessionScope.FlightList}" varStatus="status"> 
                        <div class="flight">
                            <div class="flight-left">
                                <div class="flight-logo">
                                    <h4>FMS <i class="fa fa-plane" aria-hidden="true"></i>
                                        airline</h4>
                                </div>
                                <h3>Flight ID:</h3>
                                <p>FMS-A0${f.getID()}</p>
                            </div>
                            <div class="flight-right">
                                <div class="flight-travel">
                                    <div class="flight-right-content">
                                        <h4>Departure Place:<p> ${f.getDeparturePlace()}</p> </h4>
                                    </div>
                                    <div class="flight-right-content">
                                        <h4>Destination:<p> ${f.getDestination()} </p></h4>
                                    </div>
                                </div>
                                <div class="flight-right-content">
                                    <h4 class="date">Departure date:<p> ${f.getDepartureDate().toString().replace("T", " AT ")} </p></h4>
                                </div>
                                <div class="book-nav">
                                    <a style="color: white" href="viewflight?ID=${f.getID()}">Details</a>
                                    <i class="fa fa-caret-right" aria-hidden="true"></i>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </c:if>
            <div class="paging-button">
                <c:set var = "Page" scope = "request" value = "${requestScope.page}"/>
                <c:if test = "${Page > 0}">
                    <button id="previous"><a href="${requestScope.position}?page=${requestScope.page -1}">Previous <i class="fa fa-caret-square-o-left" aria-hidden="true"></i></button>
                    </c:if>
                    <c:set var = "num" scope = "request" value = "${requestScope.num}"/>
                    <c:if test = "${Page < num -1}">
                    <button id="next"><a href="${requestScope.position}?page=${requestScope.page +1}">Next <i class="fa fa-caret-square-o-right" aria-hidden="true"></i> </a></button>
                </c:if>

            </div>
        </div>
        <%@include file="contact.jsp" %>           
    </body>
    <script>
        document.querySelector('form').addEventListener('submit', function (event) {
            event.preventDefault();
            const inputElement = document.getElementById('time');
            inputElement.value = inputElement.value.replace(' ', 'T'); // Thêm ký tự "T" vào trước giờ
            this.submit();
        });

        async function getDistrict() {
            const response = await fetch("https://provinces.open-api.vn/api/p/");
            var districtList = response.json();
            districtList.then(arr => {
                arr.forEach((item) => {
                    var opt = document.createElement('option');
                    var opt2 = document.createElement('option');
                    (async () => {
                        await (() => {
                            ;
                            opt.value = removeAccents(item.name);
                            opt.innerHTML = removeAccents(item.name);
                            opt2.value = removeAccents(item.name);
                            opt2.innerHTML = removeAccents(item.name);
                        })();
                        await (() => {
                            document.getElementById('destination').appendChild(opt);
                        })();
                        await (() => {
                            document.getElementById('departure').appendChild(opt2);
                        })();
                    })();
                })
            });
        }
        ;
        function removeAccents(str) {
            return str.normalize('NFD')
                    .replace(/[\u0300-\u036f]/g, '')
                    .replace(/đ/g, 'd').replace(/Đ/g, 'D')
                    .replace('Tinh', '')
                    .replace('Thanh pho', '');
        }
        document.onreadystatechange = function () {
            if (document.readyState == "complete") {
                getDistrict();
            }
        }
    </script>
</html>
