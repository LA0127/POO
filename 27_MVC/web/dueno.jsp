<%-- 
    Document   : dueño
    Created on : 23 feb. 2022, 09:14:15
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %>
<%@page import = "BD.*" %>

<%@page session="true" %>

<% 
    
    String usuario = "";
    HttpSession sesionok = request.getSession();
    
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
        <h1>Tabla de empleados de la tienda</h1>
        <br>
        <% Vector<Empleado> listarEmpleados = new Empleado().listarEmpleados();%>
        <div class="table_usuarios">
            <table border="1" class="tabla_empleados">
                <tr>
                    <th>Numero de Empleado</th>
                    <th>Usuario</th>
                    <th>Password</th>
                    <th>Rol</th>
                </tr>
                <%
                    for (Empleado emp: listarEmpleados) {
                            
                        
                %>
                <tr>
                    <td><%=emp.getNum_empleado()%></td>
                    <td><%=emp.getNombre()%></td>
                    <<td><%=emp.getUser()%></td>
                    <td><%=emp.getPass()%></td>
                    <td><%=emp.getId_rol()%></td>
                    <<td><%=emp.getNombre_rol()%></td>
                </tr>
                <%}%>
                <tr>
                    <td>Cell3</td>
                    <td>Cell4</td>
                </tr>
            </table>
        </div>
    </body>
</html>
