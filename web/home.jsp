<%-- 
    Document   : home
    Created on : Aug 3, 2023, 3:15:03 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home page</title>
        <link rel="stylesheet" href="./CSS/homecss.css">
        <link rel="icon"
            href="https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png">
        <link rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
    </head>
   <body>  
        <header>
            <%@include file="header.jsp" %>           
        </header>
        <div class="content">
            <form  class="flight-box">
                <div class="search-bar">
                    <div class="search-bar-item1">
                        <p>Departure From: </p> 
                        <select id="departure" name="departure">
                            <option>Choose departure</option>
                            <option>Hà Nội</option>
                            <option>Tp Hồ Chí Minh</option>
                            <option>Huế</option>
                            <option>Đà Nẵng</option>
                            <option>Hải Dương</option>
                            <option>Cần Thơ</option>
                            <option>Gia Lai</option>
                        </select>
                    </div>
                    <div class="search-bar-item1">
                        <p>Destination: </p> 
                        <select id="destination" name="destination">
                            <option>Choose destination</option>
                            <option>Hà Nội</option>
                            <option>Tp Hồ Chí Minh</option>
                            <option>Huế</option>
                            <option>Đà Nẵng</option>
                            <option>Hải Dương</option>
                            <option>Cần Thơ</option>
                            <option>Gia Lai</option>
                        </select>
                    </div>
                    <div class="search-bar-item2">
                        <p>Departure date:</p> 
                        <input name="time" type="date">
                    </div>
                    <div class="search-button">
                    <button id="search">Search <i class="fa fa-search" aria-hidden="true"></i></button>
                </div>
                </div>
                
            </form>
        </div>
    </body>
</html>
