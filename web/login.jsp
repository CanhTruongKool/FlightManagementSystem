<%-- 
    Document   : Login
    Created on : Aug 3, 2023, 3:26:11 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
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
        <style> <%@include file="/CSS/logincss.css" %></style>
    </head>
    <body>
        <header>
            <%@include file="header.jsp" %>
        </header>

        <div class="login">
            <form action="" action="login" method="post">
                <h1>Login</h1>
                <div class="login-field">
                    <label for="username">User Name:</label>
                    <input type="text" id="username" name="username">
                </div>
                <div class="login-field">
                    <label for="password">Password :</label>
                    <input type="password" id="password" name="password">
                </div>
                <font style="color: red;">${requestScope.error}</font>
                <button type="submit">Login</button>
            </form>
        </div>
        <%@include file="contact.jsp" %> 
    </body>              
</html>
