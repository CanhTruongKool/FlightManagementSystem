<%-- 
    Document   : contact
    Created on : Aug 20, 2023, 7:27:33 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style.css">
        <link rel="icon"
              href="https://codelearn.io/CodeCamp/CodeCamp/Upload/60329921a2cc4b7abf76f8f97ab7e62e.png">
        <link rel="stylesheet"
              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Roboto:wght@100&display=swap"
            rel="stylesheet">
        <script src="https://kit.fontawesome.com/48fb0be74f.js"
        crossorigin="anonymous"></script>

        <style>
            .contact-box {
                cursor: pointer;
                display: flex;
                left: 0;
                background-color: #1e3f85;
                position: absolute;
                width: 3%;
                height: 12%;
                bottom: 25%;
                padding: 0.1%;
                border-top-right-radius: 10px;
                border-bottom-right-radius: 10px;
                transition: 1s ease;
            }
            .contact-box i {
                color: white;
                width: 20%;
                height: 20%;
                position: absolute;
                top: 43%;
                left: 60%;
                transition: 1s ease;
            }
            .contact-box h4 {
                margin: auto;
                color: white;
                margin-left: -55%;
                font-family: "Times New Roman", Times, serif;
                rotate: 270deg;
                transition: 1s ease;
            }
            .contact-box:hover {
                width: 9%;
            }
            .contact-box:hover > h4 {
                margin-left: 20%;
                rotate: 360deg;
            }
            .contact-box:hover > i {
                left: 85%;
            }
            .overlay {
                height: 100%;
                width: 0%;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: rgba(0, 0, 0, 0.9);
                overflow-x: hidden;
                transition: 0.5s;
            }
            .overlay a {
                cursor: pointer;
                padding: 8px;
                text-decoration: none;
                font-size: 36px;
                color: #818181;
                display: block;
                transition: 0.3s;
            }

            .overlay a:hover,
            .overlay a:focus {
                cursor: pointer;
                color: #f1f1f1;
            }

            .overlay .closebtn {
                cursor: pointer;
                position: absolute;
                top: 20px;
                right: 45px;
                font-size: 60px;
            }
            .earth-display {
                float: left;
                display: flex;
                flex-direction: column;
                align-items: center;
                justify-content: center;
                width: 50%;
                height: 100%;
                transition: 5s ease;
                opacity: 0;
            }
            .FMS-logo {
                position: absolute;
                display: flex;
                align-items: center;
                background-image: url("https://upload.wikimedia.org/wikipedia/commons/5/57/Airplane_silhouette_S.png");
                background-repeat: no-repeat;
                background-size: 70%;
                width: 20%;
                background-position-x: 50%;
                padding: 3% 0;
            }
            .FMS-logo h1 {
                font-family: "Times New Roman", Times, serif;
                font-weight: bold;
                color: white;
                width: 100%;
                text-align: center;
            }
            .earth {
                margin: 5%;
                background-image: url("https://1.bp.blogspot.com/-UUXaK5GCj-k/UcsKJRMgkVI/AAAAAAAACfM/sePP_H08JTQ/s1600/1.jpg");
                width: 400px;
                height: 400px;
                border-radius: 50%;
                background-size: cover;
                animation: spin 30s linear alternate infinite;
                box-shadow: -20px -20px 50px 2px #000 inset;
            }
            .cloud {
                background-image: url("https://upload.wikimedia.org/wikipedia/commons/d/df/Earth-clouds.png");
                width: 400px;
                height: 400px;
                border-radius: 50%;
                background-size: cover;
                animation: spin 30s linear alternate infinite;
                box-shadow: -20px -20px 50px 2px #000 inset;
            }

            .overlay-left {
                width: 50%;
                height: 100%;
                float: right;
                display: flex;
                align-items: center;
                justify-content: center;
            }
            .overlay-left .team-infor {
                width: 70%;
                height: 70%;
                display: flex;
                align-items: center;
                flex-direction: column;
            }
            .overlay-left .team-infor h1 {
                margin-top: 10%;
            }
            .overlay-left .team-infor h1,
            h2 {
                margin-bottom: 4%;
                color: white;
                font-weight: bolder;
                font-family: "Times New Roman", Times, serif;
            }
            .team-infor .team-member {
                color: white;
                font-size: larger;
                height: 50%;
                display: flex;
                flex-direction: column;
                align-items: center;
                justify-content: space-around;
            }

            @keyframes spin {
                100% {
                    background-position: 100%;
                }
            }
        </style>
    </head>
    <body>
        <div class="contact-box"  onclick="openNav()">
            <h4>Informarion</h4>
            <i class="fas fa-chevron-right"></i>
        </div>
        <div class="overlay" id="myNav">
            <a class="closebtn" onclick="closeNav()">&times;</a>
            <div class="earth-display">
                <div class="FMS-logo">
                    <h1>FMS <i class="fa fa-plane" aria-hidden="true"></i> airline</h1>
                </div>
                <div class="earth"> 
                    <div class="cloud"></div>
                </div>
            </div>
            <div class="overlay-left">
                <div class="team-infor">
                    <h1>FMS-TEAM</h1>
                    <h2>Team Member</h2>
                    <div class="team-member">
                        <p>Đặng Ngọc Hưng</p>
                        <p>Trương Thế Cảnh</p>
                        <p>Phạm Ngọc Quyền</p>
                        <p>Nguyễn Trung Dũng</p>
                        <p>Lê Cảnh Trọng</p>
                    </div>
                </div>
            </div>
        </div>
        <script>
            function openNav() {
                document.getElementById("myNav").style.width = "100%";
                document.getElementsByClassName("earth-display")[0].style.opacity = '1'
            }

            function closeNav() {
                document.getElementById("myNav").style.width = "0%";
                document.getElementsByClassName("earth-display")[0].style.opacity = '0'
            }
        </script>
    </body>
</html>
