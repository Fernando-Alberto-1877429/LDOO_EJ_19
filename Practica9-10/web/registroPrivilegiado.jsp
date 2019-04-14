<%-- 
    Document   : registroPrivilegiado
    Created on : 13/04/2019, 07:28:28 PM
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
        <h1 style = font-family:Arial>Registro Usuario Privilegiado</h1>
        <form action = "SignUp" method = "post">
            <input type = "text" name = "user" placeholder = "Nombre"><br><br>
            <input type = "password" name = "password" placeholder = "Contraseña"><br><br>
            <input type = "text" name = "birthdate" placeholder = "Fecha de Nacimiento"><br><br>
            <input type = "text" name = "email" placeholder = "Correo"><br><br>
            <input type = "text" name = "id" placeholder = "ID de Usuario"><br><br>
            <input type = "text" name = "numEmpleado" placeholder = "Número de Usuario"><br><br>
            <input type = "submit" value = "Registrarse"><br><br>          
            <div style = font-family:Arial><a href = "login.jsp">Iniciar Sesión</a></div>
            <input type = "hidden" name = "Privilegiado">
        </form>
    </body>
</html>