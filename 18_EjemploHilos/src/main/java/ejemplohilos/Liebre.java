
package ejemplohilos;

/*
Ejemplo de un hilo de la fabula de la liebre y la tortuga
la liebre debe tener un proceso inicial 
o hasta 100 ms 
una vez finalizado ese tiempo
el hilo se duerme
*/

import java.util.logging.Level;//Level Para cargar la sesion
import java.util.logging.Logger;

import static java.lang.Thread.sleep;//java.lang.Thread Libreria. Static hara fijo el tiempo de espera


public class Liebre extends Thread{ //Herencia de Hilo thread
    
    //Metodo para que corra
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("Avanza la Liebre "+i);
         //cuando llegue a 100 se duerme Try Catch 
         try{
             sleep(300);//ms, por defecto lo toma como milisegundos
         }catch(InterruptedException ex){
             Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
             
         }
         
        }
        System.out.println("C Durmio la Liebre");
    }
    
}

