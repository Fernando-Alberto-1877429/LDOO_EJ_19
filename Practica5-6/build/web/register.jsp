<%-- 
    Document   : register
    Created on : 24/03/2019, 01:33:07 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¡Registrate!</title>
    </head>
    <body>
        <h1 style = font-family:Arial>Registro</h1>
        <form action = "login.jsp" method = "post">
            <input type = "text" name = "name" placeholder = "Nombre de Usuario"><br><br>
            <input type = "password" name = "password" placeholder = "Contraseña"><br><br>
            <input type = "submit" value = "Registrarse"><br><br>
            <div style = font-family:Arial><a href = "login.jsp">Iniciar sesión</a></div>
        </form>
    </body>
</html>
