
package Interfaz;

/**
 *
 * @author Cristian
 */

import Controles.ManipularLibros;
import Controles.ManipularPeriodicos;
import Controles.ManipularRevistas;
import java.io.*;
import java.util.*;
public class Principal {
    public static void main(String[] args){
        MenuOpciones obj = new MenuOpciones();
        obj.menu();
        //Scanner entrada = new Scanner(System.in);
        
        
        
        
        
        //instancia de manipular libros
        
        /* ManipularLibros listadeLibrosobj = new ManipularLibros();
            int opcion;
            do{
                System.out.println("Bienvenido a la biblioteca");
                System.out.println("Ingrese la opcion deseada");
                System.out.println("1.-Agregar nuevo libro");
                System.out.println("2.-Consultar libro");
                System.out.println("3.-Consultar todos los libros");
                System.out.println("4.-Borrar un libro");
                System.out.println("5.-Modificar los datos de un libro");
                System.out.println("6.-Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                        listadeLibrosobj.agregarLibro();
                        break;
                    case 2:
                        listadeLibrosobj.buscar();
                    case 3:
                        listadeLibrosobj.consultaGeneral();
                        break;
                    case 4:
                        listadeLibrosobj.borrar();
                        break;
                    case 5:
                        listadeLibrosobj.modificar();
                        break;
                    case 6:
                        System.out.println("Hasta Luego.");
                        
                        //vamos a generar el archivo
                        listadeLibrosobj.grabar();
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
                      
            }while((opcion>=1)&&(opcion<6));*/
    }
}
