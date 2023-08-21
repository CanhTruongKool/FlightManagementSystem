<%-- 
    Document   : ManagementMenu
    Created on : Aug 3, 2023, 3:26:31 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Management Page</title>
    <link rel="stylesheet" href="managementCss.css">
    <script src="https://kit.fontawesome.com/48fb0be74f.js"
    crossorigin="anonymous"></script>
    <link rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="icon" href="https://img.favpng.com/2/22/3/airplane-aircraft-logo-icon-a5-png-favpng-g0VhdxjfFf5Uedzuma2CxapfQ.jpg">
    <style><%@include file="/CSS/managementMenuCss.css" %></style>
</head>
<body>
    <div class="nav-bar">
        <nav>
            <div class="logo">
                <h1>FMS <i class="fa fa-plane" aria-hidden="true"></i> airline</h1>
            </div>
            <div class="title">
                <h1>Welcome to FMS-airline!</h1>
            </div>
            <div class="user-title">
                <h3>Welcome User: <img src="https://cdn-icons-png.flaticon.com/512/3177/3177440.png" alt=""> ${sessionScope.username}</h3>
            </div>
            <div>
                 <a href="home">Logout </a>      
            </div>
        </nav>
    </div>
    <div class="content">
        <div class="use-case">
            <div class="use-case-title">
               <a href="addFlight"><h2>Create Flight</h2></a>
            </div>
        </div>
        <div class="use-case">
            <div class="use-case-title">
                <h2>Flight List</h2>
            </div>
        </div>
        <div class="use-case">
            <div class="use-case-title">
                <h2>Passenger List</h2>
            </div>
        </div>
        <div class="use-case">
            <div class="use-case-title">
                <h2>Crew List</h2>
            </div>
        </div>
        <div class="use-case">
            <div class="use-case-title">
                <h2>Cargo List</h2>
            </div>
        </div>
        <div class="use-case">
            <div class="use-case-title">
                <a href="analyzeRevenue.jsp"><h2>Revenue</h2></a>
            </div>
        </div>
    </div>
</body>
</html>

