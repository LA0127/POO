/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sockets;

import java.io.*;
import java.net.*;
import java.util.*;


public class Escribir extends Thread {
    Socket socket;
    String nombre;
    Scanner entrada;
            //Conexion      Dato que se intercambia
    Escribir (Socket socket, String nombre){
        /*
        Recibe un objeto tipo socket para identificar el socket
        que se esta ejecutando en el proceso entre el cliente y el 
        servidor
        */
        entrada = new Scanner(System.in);
        this.socket = socket;//porque es el nuevo que se recibe de parametro = nombre
        this.nombre = nombre;
        //inicializa
        start();
        
        
    
    
    }
    //metodo run
        public void run(){
            
            try{
            boolean terminar = false;
            String mensaje;
            while (!terminar){
                OutputStream os = socket.getOutputStream();//canal
                DataOutputStream flujosDOS= new DataOutputStream(os);//flujo de datos de salida del buffer
                System.out.println("Escribe tu mensjae "+nombre+"");
                mensaje = entrada.nextLine();
                //bucle para ingresar las palabras
                if (mensaje.equals("Salir")) {
                    terminar=true;
                }else{
                    flujosDOS.writeUTF(nombre + "dice: " + mensaje);
                }
            }
            //cierra socket
            socket.close();
            }catch(Exception e){
                System.out.println("Error amigo");
                System.out.println(e.getMessage());
            }
        }
}
