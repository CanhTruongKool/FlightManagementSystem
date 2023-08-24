<%-- 
    Document   : AddFlight
    Created on : Aug 3, 2023, 3:28:25 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Add flight Page</title>
        <link rel="stylesheet" href="addFlight.css">
        <script src="https://kit.fontawesome.com/48fb0be74f.js"
        crossorigin="anonymous"></script>
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="icon" href="https://png.pngtree.com/png-vector/20191023/ourlarge/pngtree-vector-airplane-icon-png-image_1851857.jpg">
        <style> <%@include file="CSS/addFlightcss.css" %></style>
    </head>
    <body>
        <div class="content">
            <div class="background"></div>
            <h1>Add Flight</h1>
            <div class="form">
                <form action="addFlight" method="post" >
                    <div class="infor">
                        <h2>Departure Place: </h2>
                        <select name="departurePlace" id="departure">
                            <option value="0">Select province/city</option>
                        </select>
                    </div>
                    <div class="infor">
                        <h2>Departure Date: </h2>
                        <input type="datetime-local" id="date" name="departureDate">
                    </div>
                    <div class="infor">
                        <h2>Destination: </h2>
                        <select name="destination" id="destination">
                            <option value="0">Select province/city</option>
                        </select>
                    </div>
                    <div class="infor">
                        <h2>Number of seats: </h2>
                        <input type="number" name="numOfSeats" id="" min="0">
                    </div>
                    <div class="infor">
                        <h2>Max cargo weight: </h2>
                        <input type="number" name="maxCargoWeight" id="" min="0">
                    </div>
                    <div class="infor">
                        <h2>Price: </h2>
                        <input type="number" name="price" id="" min="0">
                    </div>
                    <font style="color: seagreen;">${requestScope.success}</font>
                    <button>ADD</button>
                </form>
                <button id="return"><a href="management"> BACK</a></button>
            </div>
        </div>
        <script>
            async function getDistrict() {
                const response = await fetch("https://provinces.open-api.vn/api/p/");
                var districtList = response.json();
                districtList.then(arr => {
                    arr.forEach((item) => {
                        var opt = document.createElement('option');
                        var opt2 = document.createElement('option');
                        (async () => {
                            await (() => {
                                ;
                                opt.value = removeAccents(item.name);
                                opt.innerHTML = removeAccents(item.name);
                                opt2.value = removeAccents(item.name);
                                opt2.innerHTML = removeAccents(item.name);
                            })();
                            await (() => {
                                document.getElementById('destination').appendChild(opt);
                            })();
                            await (() => {
                                document.getElementById('departure').appendChild(opt2);
                            })();
                        })();
                    })
                });
            }
            ;

            function removeAccents(str) {
                return str.normalize('NFD')
                        .replace(/[\u0300-\u036f]/g, '')
                        .replace(/đ/g, 'd').replace(/Đ/g, 'D')
                        .replace('Tinh', '')
                        .replace('Thanh pho', '');
            }
            document.onreadystatechange = function () {
                if (document.readyState == "complete") {
                    // getLocalTime();
                    restrictPastDates();
                    getDistrict();
                }
            }
            function restrictPastDates() {
                const dateInput = document.getElementById("date");

                dateInput.addEventListener("change", function () {
                    const selectedDate = new Date(this.value);
                    const currentDate = new Date();

                    if (selectedDate < currentDate) {
                        // Nếu ngày đã chọn là ngày trong quá khứ, đặt giá trị thành ngày hiện tại
                        const year = currentDate.getFullYear();
                        const month = String(currentDate.getMonth() + 1).padStart(2, "0");
                        const day = String(currentDate.getDate()).padStart(2, "0");
                        const hours = String(currentDate.getHours()).padStart(2, "0");
                        const minutes = String(currentDate.getMinutes()).padStart(2, "0");
                        const formattedCurrentDate = `${year}-${month}-${day}T${hours}:${minutes}`;
                                        this.value = formattedCurrentDate;
                                    }
                                });

                                dateInput.addEventListener("blur", function () {
                                    // Kiểm tra ngày khi người dùng rời khỏi trường input
                                    const selectedDate = new Date(this.value);
                                    const currentDate = new Date();

                                    if (selectedDate < currentDate) {
                                        // Nếu ngày đã chọn là ngày trong quá khứ, đặt giá trị thành ngày hiện tại
                                        const year = currentDate.getFullYear();
                                        const month = String(currentDate.getMonth() + 1).padStart(2, "0");
                                        const day = String(currentDate.getDate()).padStart(2, "0");
                                        const hours = String(currentDate.getHours()).padStart(2, "0");
                                        const minutes = String(currentDate.getMinutes()).padStart(2, "0");
                                        const formattedCurrentDate = `${year}-${month}-${day}T${hours}:${minutes}`;
                                                        this.value = formattedCurrentDate;
                                                    }
                                                });
                                            }


        </script>
    </body>
</html>
