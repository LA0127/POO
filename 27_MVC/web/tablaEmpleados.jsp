<%-- 
    Document   : tablaEmpleados
    Created on : 3 mar. 2022, 11:54:02
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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido: <%=usuario%></title>
    </head>
    <body>
        <h1 align="center">Tabla de empleados de la tienda</h1>
        <br>
        <h1 align="center">Tabla empleados</h1>
        <br>
        <% Vector<Empleado> listarEmpleados = new Empleado().listarEmpleados();%>
        <div class="table_usuarios">
            <table border="1" class="tabla_empleados" align="center">
                <tr>
                    <th>Numero de Empleado</th>
                    <th>Nombre</th>
                    <th>Id Rol</th>
                    <th>Nombre Rol</th>
                </tr>
                <%
                    for (Empleado emp: listarEmpleados) {
                            
                        
                %>
                <tr>
                    <td align="center"><%=emp.getNum_empleado()%></td>
                    <td><%=emp.getNombre()%></td>
                    <!--<td><%=emp.getUser()%></td>--
                    <td><%=emp.getPass()%></td>-->
                    <td align="center"><%=emp.getId_rol()%></td>
                    <td><%=emp.getNombre_rol()%></td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>

