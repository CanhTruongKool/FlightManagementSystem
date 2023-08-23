<%-- 
    Document   : TransactionList
    Created on : Aug 3, 2023, 3:23:11 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Transaction list page</title>
        <link rel="stylesheet" href="./CSS/homecss.css">
        <link rel="icon" href="https://png.pngtree.com/png-vector/20191023/ourlarge/pngtree-vector-airplane-icon-png-image_1851857.jpg">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <style><%@include file="/CSS/homecss.css"%>
            .transaction-search h3 {
                color: white;
            }
            .list-transactions {
                display: flex;
                flex-direction: row;
                margin-left: 5%;
                margin-top: 2%;
                width: 90%;
                height: 80%;
                justify-content: center;
                align-items: center;
                overflow-y: scroll;
                flex-wrap: wrap;
            }
            .list-transactions .transaction {
                margin-bottom: 2%;
                width: 90%;
                height: 10%;
                border-bottom: solid 2px rgb(220, 217, 217);
                display: flex;
                justify-content: space-between;
                align-items: center;
            }
            .list-transactions .transaction h3 {
                height: max-content;
                color: white;
                font-weight: bold;
            }
            .list-transactions .transaction button {
                background-color: rgba(255, 255, 255, 0.274);
                border: none;
                font-size: 1.1rem;
                color: white;
                cursor: pointer;
                border-radius: 7px;
                transition: 0.5s ease;
                padding: 0 10px;
                height: 80%;
            }
            .list-transactions .transaction button:hover {
                background-color: rgba(171, 171, 171, 0.274);
                box-shadow: 0px 0px 10px white;
            }
            /* width */
            ::-webkit-scrollbar {
                width: 8px;
                border-radius: 10px;
            }

            /* Track */
            ::-webkit-scrollbar-track {
                background: #f1f1f100;
                border-radius: 10px;
            }

            /* Handle */
            ::-webkit-scrollbar-thumb {
                background: #888;
                border-radius: 10px;
            }

            /* Handle on hover */
            ::-webkit-scrollbar-thumb:hover {
                background: #555;
            }
        </style>
    </head>
    <body>  
        <header>
            <%@include file="header.jsp" %>
        </header>
        <div class="content">
            <form  class="flight-box" action="viewtrans" method='post'>
                <div class="search-bar">
                    <div class="search-bar-item1">
                        <p>Enter Passenger Identify number: </p> 
                        <input type="tel" pattern="[0-9]{12}" name="ID" title="Identify number must be 12 digits" id="identifyNumber">
                    </div>
                    <div class="search-button">
                        <button id="search">Search <i class="fa fa-search" aria-hidden="true"></i></button>
                    </div>
                </div>
            </form>
            <h3 style="color: white">${requestScope.searchResult}</h3>

            <div class="list-transactions">
                <c:forEach var = "f" items= "${requestScope.tickets}" varStatus="status">
                    <div class="transaction">
                        <h3>Ticket code: ${f.getCode()}</h3>
                        <button> <a href="ticketSearching?Code=${f.getCode()}">View Detail</a> </button>
                    </div>
                </c:forEach>
            </div>

        </div>
        <%@include file="contact.jsp" %>  
    </body>
</html>
