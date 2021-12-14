
package com.mycompany.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class InicioSesion implements ActionListener{
    private static JLabel nombre;
    private static JLabel appat;
    private static JLabel appmat;
    private static JTextField texto;
    private static JTextField texto2;
    private static JTextField texto3;
    private static JLabel contrasenia;
    private static JPasswordField contraTexto;
    private static JLabel fechaNacimiento;
    private static JTextField fechaTexto;
    private static JButton boton;
    private static JLabel exitoso;
    private static JLabel falla;
    private static JLabel datos;
    private static JLabel fechaNaci;
    
    
    public static void main(String[] args){
        JFrame ventana1 = new JFrame();
        JPanel panel = new JPanel();
        ventana1.setSize(500,250);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.add(panel);
        
        panel.setLayout(null);
        
        nombre = new JLabel("Nombre");
        nombre.setBounds(10, 10, 80, 25);
        panel.add(nombre);
        
        texto = new JTextField(20);
        texto.setBounds(150, 10, 165, 25);
        panel.add(texto);
        
        appat = new JLabel("Apellido Paterno");
        appat.setBounds(10, 40, 150, 25);
        panel.add(appat);
        
        texto2 = new JTextField(20);
        texto2.setBounds(150, 40, 165, 25);
        panel.add(texto2);
        
        appmat = new JLabel("Apellido Materno");
        appmat.setBounds(10, 70, 150, 25);
        panel.add(appmat);
        
        texto3 = new JTextField(20);
        texto3.setBounds(150, 70, 165, 25);
        panel.add(texto3);
        
        contrasenia = new JLabel("Contraseña");
        contrasenia.setBounds(10, 130, 100, 25);
        panel.add(contrasenia);
        
        contraTexto = new JPasswordField(20);
        contraTexto.setBounds(150, 130, 165, 25);
        panel.add(contraTexto);
        
        fechaNacimiento = new JLabel("Fecha de nacimiento");
        fechaNacimiento.setBounds(10, 100, 150, 25);
        panel.add(fechaNacimiento);
        
        fechaTexto = new JTextField(20);
        fechaTexto.setBounds(150, 100, 165, 25);
        panel.add(fechaTexto);
        
        boton = new JButton("Agregar");
        boton.setBounds(10, 180, 80, 25);
        boton.addActionListener(new InicioSesion());//Da acciones al boton, se debe poner el nombre del boton y seguido del addAction
        panel.add(boton);
        
        exitoso = new JLabel("");
        exitoso.setBounds(10, 110, 300, 25);
        panel.add(exitoso);   
        
        falla = new JLabel("");
        falla.setBounds(10, 130, 300, 25);
        panel.add(falla);
        
        ventana1.setVisible(true);
        ventana1.setLocation(390, 275);
        //640x400----500x250----250x125
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = texto.getText();
        String apellido = texto2.getText();
        String apellidoMat = texto3.getText();
        String password = contraTexto.getText();
        String fechaNac = fechaTexto.getText();
        
        //System.out.println(usuario + ", " + password);
        
        //if(usuario.equals("Pedro") && password.equals("araña1")){
            
            JFrame ventana2 = new JFrame();
            JPanel panel = new JPanel();
            ventana2.setSize(500,250);
            ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana2.add(panel);
            
            
            //exitoso = new JLabel("");
            //exitoso.setBounds(10, 110, 300, 25);
            //panel.add(exitoso);
            datos = new JLabel("Bienvenido " + usuario +" "+ apellido +" "+ apellidoMat);
            datos.setBounds(10, 10, 80, 25);            
            panel.add(datos);
            
            fechaNaci = new JLabel("\nFecha de nacimiento: " + fechaNac);
            fechaNaci.setBounds(10, 50, 80, 25);
            panel.add(fechaNaci);
            
            ventana2.setVisible(true);
            ventana2.setLocation(390, 275);
            
            
            //exitoso.setText("Bienvenido " + usuario);
            
            
        //}else{
            //falla.setText("Tu no eres Pedro.");
            
        //}
        
    }
}
