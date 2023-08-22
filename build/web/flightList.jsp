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
                <th>Departure Date</th>
            </tr>
            <c:forEach var="flight" items="${requestScope.data}">
                <tr>
                    <td> <p>FMS-A0${flight.ID}</p></td>
                </tr>
            </c:forEach>
        </table>
        <a href="management"><button>Back</button></a>
    </body>
</html>
