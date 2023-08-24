<%-- 
    Document   : AnalyzeRevenue
    Created on : Aug 3, 2023, 3:30:14 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Revenue</title>
        <link rel="icon" href="https://png.pngtree.com/png-vector/20191023/ourlarge/pngtree-vector-airplane-icon-png-image_1851857.jpg">
    </head>
    <body>
        <h1>Revenue</h1><table border ="1px">
            <form action="revenueFlight" method="post">
                <input name="flightID">
            </form>
            <c:set var = "flightID" value = "${requestScope.flightID}"/>
            <c:if test = "${flightID != null}">
                <h2>FMS - A0${requestScope.flightID}</h2>
            </c:if>
        </table><table border ="1px">
            <tr>
                <th>Revenue Ticket</th>
                <th>Revenue Cargo</th>
                <th>Total</th>
            </tr>
            <c:set var="r" value="${requestScope.data}"/>
            <tr>
                <td> <p>${r.revenueTicket}</p></td>
                <td> <p>${r.revenueCargo}</p></td>
                <td> <p>${r.totalRevenue}</p><br/></td>
            </tr>
        </table>
        <a href="management"><button>Back</button></a>
    </body>
</html>
