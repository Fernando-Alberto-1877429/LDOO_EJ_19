<%-- 
    Document   : registro
    Created on : 6/04/2019, 04:21:36 PM
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
        <form action = "Register" method = "post">
            <div style = font-family:Arial>Elige el tipo de Usuario:</div><br>
            <select name="userType">
                <option value="Privilegiado">Privilegiado</option>
                <option value="SinPrivilegio">Usuario sin Privilegio</option>
                <option value="Invitado">Invitado</option>
            </select><br><br> 
            <input type = "submit" value = "Registrarse"><br><br>
            <div style = font-family:Arial><a href = "login.jsp">Iniciar sesión</a></div>
        </form>
    </body>
</html>