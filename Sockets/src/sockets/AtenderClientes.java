/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sockets;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 *
 * @author Alex
 */
public class AtenderClientes extends Thread{
    Socket socket;
    String mensajes;
    ArrayList<Socket> listacliente;
    int clientes;
    
    //primero recibe toda la lista de los clientes
    //a partir de ahi atendera las solicitudes por First in First out FIFO
    
    
    AtenderClientes(ArrayList<Socket> lista, Socket socket){
        //Esto es un constructor debe coincidir con el nombre de la clase
        //3 sockets, cada proceso es un socket
        this.listacliente = lista;
        this.socket = socket;
        //inicializar el hilo
        start();
    }
    public void run(){
        //un bucle infinito para que se pueda atender a todos los clientes que existan
        while (true) {            
            try {
            InputStream is=socket.getInputStream();
            DataInputStream flujo=new DataInputStream(is);
            mensajes = flujo.readUTF();
            
            //tenemos leer todos los mensajes que vienen por partes de los clientes
            for (int cont = 0; cont < listacliente.size(); cont++) {
                OutputStream os = listacliente.get(cont).getOutputStream();
                //por cada uno de los objetos de array voy contando 
                DataOutputStream flujoDos = new DataOutputStream(os);
                flujoDos.writeUTF(mensajes);
            }
            
        } catch (Exception e) {
            System.out.println("Error de comunicacion");
                System.out.println(e.getMessage());
        }
        }
    }
}
