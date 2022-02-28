/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defaultpackage;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Servidor {
    
    //id
    private static int uniqueID;
    
    private ArrayList<ClienteThread> al;
    
    private SimpleDateFormat fecha;
    
    private int port;
    
    private boolean keepgoing;
    
    private String notificaciones = " *** ";
    
    //constructor del servidor
    
    public Servidor(int port){
        this.port = port;
        fecha = new SimpleDateFormat("HH:mm:ss");
        al = new ArrayList<ClienteThread>();
    }
    public void start(){
        keepgoing=true;
        //Se crea el socket de conexiones
        try {
            ServerSocket serversocket =new ServerSocket(port);
            //que sea infinito para esperar conexiones
            while (keepgoing) {                
                display("Servidor esperando por el cliente en el puerto: "+port+".");
                //aceptando conexiones
                Socket socket = serversocket.accept();
                if (!keepgoing) {
                    break;
                    
                }
                ClienteThread t = new ClienteThread(socket);
                al.add(t);
                t.start();
                try {
                    serversocket.close();
                    for (int i = 0; i < al.size(); ++i) {//se pone ++i para que encuentre al primer cliente ya que estamos en i=0
                        ClienteThread tc = new ClienteThread(socket);
                        tc.in.close();
                        tc.os.close();
                        tc.socket.close();
                        //Secierran los flujos de entrada y salida 
                    }
                } catch (IOException e) {
                    System.out.println("Error no se puede cerrar a un cliente inexistente");
                    System.out.println(e.getMessage());
                }
    
            }
            
        } catch (IOException e) {
            System.out.println("Error no hay clientes");
            System.out.println(e.getMessage());
        }
    }
    
    //detener el servidor
    protected void stop(){
        keepgoing=false;
        try {
            new Socket("localhost", port);
        } catch (Exception e) {
            System.out.println("No se quiere mudar el server");
            System.out.println(e.getMessage());
        }
    }

    private void display(String string) {
        String msg = null;
        String tiempo = fecha.format(new Date()+" "+msg);
        System.out.println(tiempo);
                
    }
    //declarar clase/ Constructor
    class ClienteThread extends Thread{
        Socket socket;
        ObjectInputStream in;
        ObjectOutputStream os;
        int id;
        String username;
        //obj para los mensajes
        ChatMessage cm;
        String dato;

        public ClienteThread(Socket socket) {
            id = ++uniqueID;
            this.socket = socket;
            System.out.println("Creacion del hilo de los flujos del input y del output");
            try {
                //entrada y salida de los datos
                in = new ObjectInputStream(socket.getInputStream());
                os = new ObjectOutputStream(socket.getOutputStream());
                username = (String)in.readObject();//leyendo al usuario
                //falta saber si se conecto para obtener la notificacion
                
                
            } catch (IOException e) {
                System.out.println("Error al conectaaar");
                System.out.println(e.getMessage());
            }catch(ClassNotFoundException ce){
                System.out.println("Error no encontroooo la clase");
                System.out.println(ce.getMessage());
            }
            dato = new Date().toString() + "\n";
        }
        
        public String getusername(){
            return username;
        }
        public void setusername(String username){
            return ;
        }
        
    }

    
    
    
}
