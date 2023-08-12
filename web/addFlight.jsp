<%-- 
    Document   : AddFlight
    Created on : Aug 3, 2023, 3:28:25 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="management">back</a>
        <form action="addFlight" method="post">
            <h3>Add Flight</h3>
            <label for="departurePlace">Departure Place:</label>
            <input type="text" name="departurePlace">
            <br>
            <label for="departureDate">Departure Date:</label>
            <input type="datetime-local" name="departureDate">
            <br>
            <label for="destination">Destination:</label>
            <input type="text" name="destination">
            <br>
            <label for="numOfSeats">Number of seats:</label>
            <input type="number" name="numOfSeats">
            <br>
            <label for="maxCargoWeight">Max Cargo Weight:</label>
            <input type="number" name="maxCargoWeight">
            <br>
            <label for="price">Price:</label>
            <input type="number" name="price">
            <br>
            <font style="color: seagreen;">${requestScope.success}</font>
            <input type="submit" value="Add">
        </form>
    </body>
</html>
