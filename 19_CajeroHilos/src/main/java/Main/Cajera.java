/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Alex
 */

//objeto el cual debe de tener: nombre, procesocompra, esperarXsegundos




public class Cajera {
    
    private String nombre;
    
    public Cajera(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(Cliente cliente, long timeStamp){
        System.out.println("La cajera : " +this.nombre 
                + "Comienza a procesar su compra señor cliente: "
                + cliente.getNombre() + "\n En el tiempo: "
                + (System.currentTimeMillis() - timeStamp)/1000 + "segundos");
        //tenemos que obtener todos los productos del carrito
        
        //recorrer la cantidad de productos
        for(int i = 0; i < cliente.getCarroCompra().length; i++){
            //empezar a definir los tiempos para su proceso de compra
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            
            System.out.println("Procesando el producto: " + (i+1)
                                + " -> Tiempo: " 
                    + (System.currentTimeMillis() - timeStamp)/1000 + "segundos");
            
            System.out.println("La cajera: " + this.nombre 
                    + "ha terminado de procesar" + cliente.getNombre() 
                    + "en el tiempo" 
                    + (System.currentTimeMillis() - timeStamp)/1000 + "segundos");
        }
        
    }
    
    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos*1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        
        }
    }
    
}