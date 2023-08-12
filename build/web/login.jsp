<%-- 
    Document   : Login
    Created on : Aug 3, 2023, 3:26:11 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="login" method="post">
            <h3>Login</h3>
            <label for="username">User Name:</label>
            <input type="text" id="username" name="username">
            <br>
            <label for="password">Password:</label>
            <input type="text" id="password" name="password">
            <br>
            <font style="color: red;">${requestScope.error}</font>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
