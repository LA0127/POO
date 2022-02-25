/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sockets;

import java.io.*;
import java.util.*;
import java.net.*;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Cliente {

        Scanner entrada = new Scanner(System.in);
        Cliente(){
            try {
                Socket skcliente = new Socket("10.125.21.118",5000);
                System.out.println("Introduce tu nombre: ");
                String nombre = entrada.next();
                //se crea un hilo que atienda las peticiones
                Escribir hilo1= new Escribir(skcliente,nombre);
                //envia el hilo que escribe el nombre del cliente 
                //debemos leer
                Leer hilo2 = new Leer(skcliente);
            } catch (Exception e) {
                System.out.println("Error de comunicacion");
                System.out.println(e.getMessage());
            }
            
        }
        public static void main(String[] args){
            new Cliente();
            
            //falta servidor y la accion de atender al cliente
            
        }
   
}
