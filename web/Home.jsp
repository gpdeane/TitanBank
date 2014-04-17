<%-- 
    Document   : Home
    Created on : Apr 11, 2014, 12:44:11 PM
    Author     : Autumn and Greg
--%>
<%@page import="com.Titan_Bank.domain.bll.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! UserRepository someUsers;%>
<% User user = someUsers.FindByUsername(request.getParameter("username"));%>
<% Authenticate auth = new Authenticate(someUsers);%>
<% if (auth.login(user.getUsername(), user.getPassword()) == null) {
%>
<jsp:forward page="Error.html"/>
<%
    }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="homecss.css">
        <title>Titan Bank Home</title>
    </head>
    <body>
        <%@include file="/Header.jsp" %>
        <div class="header_and_links">
            <div class="links">
                <a href="Home.jsp" id="home">Home&nbsp;</a>
                <a href="Accounts.jsp" id="accounts">Accounts&nbsp;</a>
                <a href="" id="transfers">Transfers&nbsp;</a>
                <a href="" id="checks">Checks&nbsp;</a>
                <a href="" id="administrator">Administrator&nbsp;</a>
                <a href="" id="logout">Logout&nbsp;</a>    
            </div>
            <img src="blueheader.jpg" alt="blue">
            <div class="pageBody">
                <p class="pageBodyText">Welcome <%=request.getParameter("username")%>!</p>
                <img src="big-bank-building.jpg" alt="big bank">
            </div>
        </div>
    </body>
</html>