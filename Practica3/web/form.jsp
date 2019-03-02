<%-- 
    Document   : form
    Created on : 2/03/2019, 12:31:35 AM
    Author     : Fernando Alberto Aguirre Rodríguez 1877429
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 3 JSP</title>
    </head>
    <body>
        <% 
            String name = request.getParameter("name");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String birth = request.getParameter("birth");
            String exp = request.getParameter("exp");
            String log = request.getParameter("log");
            String carrera = request.getParameter("carrera");
        %>
        <h1 style = "font-family: Arial">Bienvenido!</h1>
        <p style = "font-family: Arial">Nombre del usuario: <% out.println(name); %></p>
        <p style = "font-family: Arial">Contraseña: <% out.println(pass); %> </p>
        <p style = "font-family: Arial">Correo electrónico: <% out.println(email); %> </p>         
        <p style = "font-family: Arial">Fecha de nacimiento: <% out.println(birth); %> </p>
        <p style = "font-family: Arial">Experiencia: <% out.println(exp); %> %</p>
        <p style = "font-family: Arial">Hora de este registro: <% out.println(log); %> </p>
        <p style = "font-family: Arial">Carrera: <% out.println(carrera); %> </p>
    </body>
</html>
