
package com.mycompany._ventana;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana implements ActionListener{
    public static void main(String[] args){
        //Primero crear el frame
        
        JFrame ventana = new JFrame("Hola mundo");
        
        
        //Definir el tamanio de la ventana
        ventana.setSize(500,150);
        //acciones de la vcentana
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel para incorporar los componentes de la interfaz
        JPanel panel=new JPanel();
        //agregamos los componentes
        ventana.add(panel);
        
        //Crear metodo para agrupar componentes
        
        agregarComponente(panel);
        ventana.setVisible(true);
        ventana.setLocation(390, 325);
        //1280x800------640x400
        //ventana.setLocationRelativeTo(null);
    }

    private static void agregarComponente(JPanel panel) {
        //Se debe inicializar el panel
        panel.setLayout(null);//Panel vacio
        
        
        //Agregamos componentes:
        JLabel userlabel = new JLabel("Nombre de usuario");
        /*Inicializar componentes se utiliza
        setBounds
        2 como coordenadas x, y
        2 definir tamanio
        */
        
        userlabel.setBounds(10, 10, 120, 50);
        //Agregar al panel
        panel.add(userlabel);
        //Campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(150, 20, 150, 25);
        panel.add(usertext);
        //etiqueta de password
        
        JLabel passwordLabel = new JLabel("Contrasenia");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        //dos botones
        JButton loginbutton =new JButton("Iniciar sesion");
        loginbutton.setBounds(10, 80, 80, 25);
        loginbutton.addActionListener(new Ventana());
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("Registrarse");
        registrobutton.setBounds(180, 80, 80, 25);
        registrobutton.addActionListener(new Ventana());
        panel.add(registrobutton);
        
        /*
        Integrar metodo para llamar a la ventana al centro de la pantalla
        Password que salga en modo ***
        Tener un usuario por defecto y que nos salga una ventana de bienvenido
        en caso de no ingresar bien el usuario "Usuario inexistente"
        
        Ventana del registro de los datos:
        Nombre
        Apellido Paterno
        Apellido Materno 
        Fecha de nacimiento/Agregar objeto calendario/Agregar elementos de lista
        dia-mes-anio
        Usuario 
        Contrasenia
        */
        
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        JFrame ventana2 = new JFrame();
            JPanel panel = new JPanel();
            ventana2.setSize(350,200);
            ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana2.add(panel);
            
            ventana2.setVisible(true);
            ventana2.setLocation(465, 300);
        
    }
}
