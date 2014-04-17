<%-- 
    Document   : index
    Created on : Apr 16, 2014, 10:41:05 PM
    Author     : Autumn and Greg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Titan Bank Online</title>
        <link rel="stylesheet" type="text/css" href="header.css">
        <link rel="stylesheet" type="text/css" href="index.css">
    </head>
    <body>
        <div class="banner">
            <h1>Titan Bank</h1>    
            <img src="blue_header.png" alt="blue_banner" id="blue">
        </div>
        <div class="centerPage">
            <form action="Home.jsp" method="post">
                <table class="login_table">
                    <h2>Enter Login Information</h2>
                    <tr align="left"><th>Username</th>
                        <th><input type="text" name="username" autofocus=""></th></tr>

                    <tr align="left"><th>Password</th>
                        <th><input type="text" name="password" border="solid"></th></tr>

                    <tr align="left"><th></th>
                        <th><input type="submit" value="Login"></th></tr>
                </table>
            </form>
            <a target="" href="">Administrator</a>
            <img align="right" src="big-bank-building.jpg" alt="big bank sign">
        </div>
    </body>
</html>

