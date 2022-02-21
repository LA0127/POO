/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;//java.lang.Thread Libreria. Static hara fijo el tiempo de espera
import java.util.logging.Level;//Level Para cargar la sesion

public class Tortuga extends Thread{ //Herencia de Hilo thread
    
    //Metodo para que corra
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Avanza la Tortuga "+i);
         //cuando llegue a 100 se duerme Try Catch 
         try{
             sleep(300);//ms, por defecto lo toma como milisegundos
         }catch(InterruptedException ex){
             Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
             
         }
         
        }
        System.out.println("Termino Tortuga");
        System.out.println("Gana Carlo");
    }
}
