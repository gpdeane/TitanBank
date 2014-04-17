<%-- 
    Document   : Accounts
    Created on : Apr 15, 2014, 1:05:43 AM
    Author     : Autumn and Greg
--%>

<%@page import="com.Titan_Bank.domain.bll.*"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!Account checking;%>
<%!Account savings;%>
<%!Customer currentCustomer;%>
<%!ArrayList<Account> accounts = currentCustomer.getAccounts();%>
<% for(Account c:accounts) {
    
    if (c.getAccountType().equals(Account.AccountType.CHECKINGS)) {

        checking.equals(c);
%>
<%
    }else {        
        savings.equals(c);
    }
%>
<%
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank Accounts</title>
        <link rel="stylesheet" type="text/css" href="Accounts.css">
        <link rel="stylesheet" type="text/css" href="homecss.css">
    </head>
    <body>
        <%@include file="Header.jsp"%>
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
        </div>
        <div class="table">
            <table> 
                <tr>
                    <td>Checking:</td>
                    <td>$<%=checking.getBalance()%>0</td>
                </tr>
                <tr>
                    <td>Savings:</td>
                    <td>$<%=savings.getBalance()%>0</td>
                </tr>
                <tr>

                </tr>
                <tr>

                </tr>
            </table>
        </div>
    </body>
</html>
