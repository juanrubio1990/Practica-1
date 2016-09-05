<%-- 
    Document   : index
    Created on : 05/09/2016, 12:22:10 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resgistrar Alumno</title>
    </head>
    <body>
        <h1>REGISTRAR ALUMNO</h1>
        <h2>USUARIO: user</h2>
        <p>Ingrese datos del alumno.</p>
            <form action="emailList" method="post">        
        <input type="hidden" name="action" value="add">          
        <label class="pad_top">Codigo:</label>        
        <input type="text" name="codigo" required><br>        
        <label class="pad_top">Nombre:</label>        
        <input type="text" name="nombre" required><br>        
        <label class="pad_top">Apellidos:</label>        
        <input type="text" name="apellidos" required><br>     
        <label class="pad_top">Email:</label>        
        <input type="email" name="email" required><br> 
        <label>&nbsp;</label>        
        <input type="submit" value="REGISTRAR ALUMNO" class="margin_left">       
    </form>
    </body>
</html>
