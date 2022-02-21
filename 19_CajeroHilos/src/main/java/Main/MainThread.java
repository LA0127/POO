/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Alex
 */
public class MainThread {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Cliente Michael", new int[]{2,2,1,5,2});
        Cliente cliente2 = new Cliente("Cliente Mario", new int[]{2,2,1,5,2});
        Cliente cliente3 = new Cliente("Cliente Guillian", new int[]{2,2,1,5,2});
        
        
        long initialTime = System.currentTimeMillis();
        
        CajeraHilo cajero1 = new CajeraHilo("Cajero Cesar", cliente1, initialTime);
        CajeraHilo cajero2 = new CajeraHilo("Cajero Dionicio ", cliente2, initialTime);
        CajeraHilo cajero3 = new CajeraHilo("Cajero Lala ", cliente3, initialTime);
        
        cajero1.start();
        cajero2.start();
        cajero3.start();
    }
    
}
