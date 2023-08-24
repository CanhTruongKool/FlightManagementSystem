<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Passenger of Flight</title>
    </head>
    <body>
        <h1>Passenger of Flight FMS-A0${requestScope.flightID}</h1>
        <c:if test="${statusFlight == 1}">
        <a href="cancelFlight?fp=${flightPage}&id=${flightID}" ><button>Cancel Flight FMS-A0${requestScope.flightID}</button></a>
        </c:if> 
        <c:if test="${statusFlight != 1}">
            <h4>FMS-A0${requestScope.flightID} Is Cancelled</h4>
        </c:if>
        <table border ="1px">
            <tr>
                <th>Passenger ID</th>
                <th>Name</th>
                <th>Phone Number</th>
                <th>Identify Number</th>
                <th>Ticket Code</th>
                <th>Buy Time</th>
                <th>Modified Time</th>
                <th>Status</th>
            </tr>
            <c:forEach var="p" items="${requestScope.passengerList}">
                <tr>
                    <td> <p>${p.getPassengerID()}</p></td>
                    <td> <p>${p.getName()}</p></td>
                    <td> <p>${p.getPhoneNumber()}</p></td>
                    <td> <p>${p.getIdentifyNumber()}</p></td>
                    <td> <p>${p.getTicketCode()}</p></td>
                    <td> <p>${p.getBuyTime()}</p></td>
                    <td> <p>${p.getModifiedTime()}</p></td>

                    <c:set var = "status" value = "${p.getStatus()}"/>
                    <c:if test = "${status == 0}">
                        <td><p style = "color: greenyellow">Active</p></td>
                    </c:if>
                    <c:if test = "${status != 0}">
                        <td><p style="color: red">Cancelled</p></td> 
                    </c:if>
                </tr>
            </c:forEach>
                
            <table border="1" cellpadding="5" cellspacing="5">
                <tr>
                    <c:forEach begin="1" end="${noOfPages}" var="i">
                        <c:choose>
                            <c:when test="${currentPage eq i}">
                                <td>${i}</td>
                            </c:when>
                            <c:otherwise>
                                <td><a href="flightPassenger?fp=${flightPage}&id=${flightID}&st=${statusFlight}&page=${i}">${i}</a></td>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                </tr>
            </table>

            <c:if test="${currentPage != 1}">
                <td><a href="flightPassenger?fp=${flightPage}&id=${flightID}&st=${statusFlight}&page=${currentPage - 1}">Previous</a></td>
            </c:if>

            <c:if test="${currentPage lt noOfPages}">
                <td><a href="flightPassenger?fp=${flightPage}&id=${flightID}&st=${statusFlight}&page=${currentPage + 1}">Next</a></td>
            </c:if>
                <a href="flightlist?page=${requestScope.flightPage}"><button>Back</button></a>
        </table>
    </body>
</html>
