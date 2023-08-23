<%-- 
    Document   : FlightList
    Created on : Aug 3, 2023, 3:23:33 PM
    Author     : Administrator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flight List</title>
    </head>
    <body>
        <h1>TRACKING FLIGHTS</h1>
        <table border ="1px">
            <tr>
                <th>ID</th>
                <th>Departure Place</th>
                <th>Destination</th>
                <th>Departure Date</th>
                <th>Number Of Seats</th>
                <th>Max Cargo Weight</th>
                <th>Price</th>
                <th>Created By</th>
                <th>Created Time</th>
                <th>Modified By</th>
                <th>Last Modified Time</th>
                <th>Status</th>
            </tr>
            <c:forEach var="flight" items="${requestScope.flightList}">
                <tr>
                    <td> <p>FMS-A0${flight.ID}</p></td>
                    <td> <p>${flight.getDeparturePlace()}</p></td>
                    <td> <p>${flight.getDestination()}</p></td>
                    <td> <p>${flight.getDepartureDate().toString().replace("T", " AT ")}</p></td>
                    <td> <p>${flight.getNumberOfSeats()}</p></td>
                    <td> <p>${flight.getMaxCargoWeight()}</p></td>
                    <td> <p>${flight.getPrice()}</p></td>
                    <td> <p>${flight.getCreatedBy()}</p></td>
                    <td> <p>${flight.getCreatedTime().toString().replace("T", " AT ")}</p></td>
                    <td> <p>${flight.getModifiedBy()}</p></td>
                    <td> <p>${flight.getLastModifiedTime().toString().replace("T", " AT ")}</p></td>

                    <c:set var = "status" value = "${flight.getIsActivity()}"/>
                    <c:if test = "${status == 1}">
                        <td><a style="color: greenyellow" href="cancelFlight?page=${currentPage}&id=${flight.ID}" >Activity</a></td> 
                    </c:if>
                    <c:if test = "${status != 1}">
                        <td><p style="color: red">Cancelled</p></td> 
                    </c:if>
                </tr>
            </c:forEach>
        </table>
        <a href="management"><button>Back</button></a>
        
        <c:if test="${currentPage != 1}">
        <td><a href="flightlist?page=${currentPage - 1}">Previous</a></td>
    </c:if>

    <%--For displaying Page numbers. The when condition does not display
                a link for the current page--%>

    <table border="1" cellpadding="5" cellspacing="5">
        <tr>
            <c:forEach begin="1" end="${noOfPages}" var="i">
                <c:choose>
                    <c:when test="${currentPage eq i}">
                        <td>${i}</td>
                    </c:when>
                    <c:otherwise>
                        <td><a href="flightlist?page=${i}">${i}</a></td>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
        </tr>
    </table>

    <%--For displaying Next link --%>

    <c:if test="${currentPage lt noOfPages}">
        <td><a href="flightlist?page=${currentPage + 1}">Next</a></td>
    </c:if>
</body>
</html>
