<%-- 
    Document   : agecalculator
    Created on : 22-Sep-2022, 9:26:14 AM
    Author     : ericm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
            <p>${message}</p>
        
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
