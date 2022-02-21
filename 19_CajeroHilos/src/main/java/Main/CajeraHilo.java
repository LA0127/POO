package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 *///Sobrecarga ya que ya existe el metodo de correr el hilo 
public class CajeraHilo extends Thread{
    private String nombre;
    private Cliente cliente;
    private long initialTime; //long para el tiempo inicial y cuanto se va a tardar el proceso

    public CajeraHilo (){
        
    }
    
    public CajeraHilo(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }
    
    @Override
    //metodo para correr el hilo
    public void run(){
        System.out.println("La cajera : " +this.nombre 
                + "Comienza a procesar su compra señor cliente: "
                + cliente.getNombre() + "\n En el tiempo: "
                + (System.currentTimeMillis() - initialTime)/1000 + "segundos");
        //tenemos que obtener todos los productos del carrito
        
        //recorrer la cantidad de productos
        for(int i = 0; i < cliente.getCarroCompra().length; i++){
            //empezar a definir los tiempos para su proceso de compra
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            
            System.out.println("Procesando el producto: " + (i+1)
                                + " -> Tiempo: " 
                    + (System.currentTimeMillis() - initialTime)/1000 + "segundos");
            
            System.out.println("La cajera: " + this.nombre 
                    + "ha terminado de procesar" + cliente.getNombre() 
                    + "en el tiempo" 
                    + (System.currentTimeMillis() - initialTime)/1000 + "segundos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    private void esperarXsegundos(int segundos) {
        try{
            Thread.sleep(segundos*1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
    
}
