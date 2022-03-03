<%-- 
    Document   : edebode
    Created on : 3 mar. 2022, 00:16:37
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="BD.*" %>

<%@page session="true"%>

<% 
    
    String usuario = "";
    HttpSession sesionok = request.getSession(true);
    
    if(sesionok.getAttribute("empleado")==null){
        %>
        <jsp:forward page="index.html">
            <jsp:param name="Error" value="Es obligatorio Autenticarse"/>
        </jsp:forward>
        
        
        <%
    }else{
    usuario = (String)sesionok.getAttribute("name");
}
%>

<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Bienvenido: <%=usuario%></title> 
	<meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
        <link rel="stylesheet" href=\all.css" >
	<link rel="stylesheet" href="estilos.css">
	

</head>  
<body>
    <% Vector<Empleado> listarEmpleados = new Empleado().listarEmpleados();%>

    
    <div class="contenedor">
            
        <h1>Encargado de bodega</h1>
     
        <div align="center"><img src="lol.jpeg" width="160" class="imagen"></div>
     
    </div> 
         
    <div class="input-contenedor">
        <form method="post" name="formulario" action="edebode">
        <i class="fas fa-envelope icon"></i>
        <a href="tablaEmpleados.jsp"><input type="button" value="Consultar lista de empleados" class="button"></a>
        </form> 
        
     </div>
         
</body>
</html>