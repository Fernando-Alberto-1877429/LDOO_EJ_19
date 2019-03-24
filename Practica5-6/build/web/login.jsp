<%-- 
    Document   : login
    Created on : 24/03/2019, 04:07:22 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Práctica 5-6</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1 style = font-family:Arial>Inicio de sesión</h1>
        <form action = "ValidateSession" method = "post">
            <%                
                Cookie[] cookies = request.getCookies();
                String nombre = "";
                String contra = "";
                for(Cookie c:cookies){
                    if(c.getName().equals("name")){
                        nombre = (String)c.getValue();
                    }
                    if(c.getName().equals("password")){
                        contra = (String)c.getValue();
                    }
                }
            %>
            <input type = "text" name = "name" placeholder = "Nombre de Usuario" value = "<%=nombre%>"><br><br>
            <input type = "password" name = "password" placeholder = "Contraseña" value = "<%=contra%>"><br><br>
            <%--<div style = font-family:Arial><input type = "checkbox" name = "remember">Recordar mis Datos</div><br>--%>
            <input type = "submit" value = "Iniciar Sesión"><br><br>
            
            <div style = font-family:Arial><a href = "register.jsp">Registrarse</a></div>
            
        </form>
    </body>
</html>