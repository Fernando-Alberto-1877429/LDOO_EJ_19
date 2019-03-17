<%-- 
    Document   : nameView
    Created on : 14/03/2019, 10:23:46 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h1>Introduzca sus datos</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
            Nombre:
                <input type="text" name="name">
            Edad:
                <input type="text" name="age">  
            ID:
                <input type="text" name="id">
               
                <input type="submit" name="Enviar">
            </form>
        </spring:nestedPath>
    </body>
</html>
