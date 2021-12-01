/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._arraypersona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ManipularPersona {
    Scanner entrada = new Scanner(System.in);
    
    int opcion;
    
    //instancia de la clase controladorpersona
    ControladorPersona crud = new ControladorPersona();
    
    //metodo principal del menu
    public void Principal(){
        do{
            System.out.println("Bienvenido a Netbeans"
                    + "\nPor favor elige una opcion del siguiente menu: "
                    + "\n 1.-Mostrar lista del personal"
                    + "\n 2.-Registrar una nueva persona"
                    + "\n 3.-Editar los datos de una persona"
                    + "\n 4.-Borrar el registro de una persona"
                    + "\n 5.-Salir"); 
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    ArrayList<Persona> listapersona = crud.mostrarPersonas();
                    //Recorrer el objeto para mostrarlo
                    for(Persona objeto : listapersona){
                        System.out.println("El id: " + objeto.getId()
                                        + "\nEl nombre es: " + objeto.getNombre()
                                        + "\nLa edad es: " + objeto.getEdad()+"\n");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el id de la persona: ");
                    int idpersona = entrada.nextInt();
                    
                    System.out.println("Ingresa el nombre de la persona: ");
                    
                    String nombrepersona = entrada.nextLine();
                    
                    System.out.println("Ingresa la edad de la persona");
                    
                    int edadpersona = entrada.nextInt();
                    
                    //enviar los nuevos datos a mi listapersonas
                    Persona nuevaPersona = new Persona(idpersona, nombrepersona, edadpersona);
                    
                    crud.registrarPersona(nuevaPersona);
                    break;
                case 3:
                    //Buscar
                    
                    System.out.println("Ingresa ID de la persona que desea actualizar");
                    int id = entrada.nextInt();
                    
                    Persona personaSeleccionada =  crud.buscarPersona(id);
                    //mostrar los datos
                    System.out.println("La informacion de la persona es: ");
                    System.out.println("Id: " + personaSeleccionada.getId()
                                      +"\n Nombre"+ personaSeleccionada.getNombre()
                                      + "\n Edad: " + personaSeleccionada.getEdad());
                    
                    //ingresa los datos
                    System.out.println("Ingresa el nuevo nombre para el registro");
                    String nuevonombre = entrada.nextLine();
                    System.out.println("Ingresa la nueva edad para el registro: ");
                    int nuevaedad = entrada.nextInt();
                    
                    //enviar nuevos datos
                    
                    personaSeleccionada.setNombre(nuevonombre);
                    personaSeleccionada.setEdad(nuevaedad);
                    crud.actualizarPersona(personaSeleccionada);
                    break;
                case 4:
                    System.out.println("Ingresa el Id de la persona a borrar");
                    int ideliminar = entrada.nextInt();
                    Persona personaEliminar = crud.buscarPersona(ideliminar);
                    crud.eliminarPersona(personaEliminar);
                    System.out.println("Registro eliminado");
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    
            }
        }while(opcion != 5);
    }
}
