/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import BD.empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alex
 */
public class VerificarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            String usuario, password;
            usuario = request.getParameter("txtUsuario");
            password = request.getParameter("txtPassword");
        
            
        /*si el usuario no existe en la BD que hare
        
        Si el usuario es 1 = duaño
        Si el usuario es 2 = encargado de tienda
        Si el usuario es 3 = encargado de bodega
        Si el usuario es 4 = vendedor
        */
        empleado emp = new empleado();
        
        //mando a llamar al metodo de verif
        emp = emp.VerificacionUsuario(usuario, password);
            if (emp != null) {
                //creamos la sesion del usuario pq si existe
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("emp", emp);
                HttpSession sesionok = request.getSession();
                sesionok.setAttribute("rol", usuario);
                
                
                if (emp.getId_rol()==1) {
                //es el dueño
                response.sendRedirect("dueno.jsp");
                }
                else if (emp.getId_rol()==2) {
                //es el encargado de tienda
                }
                else if (emp.getId_rol()==3) {
                //es el encargado de bodega
                }
                else if (emp.getId_rol()==4) {
                //es el vendedor
                }else{
                    //Cliente
                    response.sendRedirect("cliente.jsp");
                    
                }
            }else{
                //El usuario no existe
                response.sendRedirect("errores.jsp");
            }
                
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
