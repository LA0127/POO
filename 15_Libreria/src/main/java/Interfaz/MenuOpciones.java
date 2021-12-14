
package Interfaz;

import Controles.ManipularLibros;
import Controles.ManipularPeriodicos;
import Controles.ManipularRevistas;
import java.util.*;
class MenuOpciones {
    Scanner entrada = new Scanner(System.in);
    char op;
    public void menu(){
        int op;
        System.out.println("Libreria");
        System.out.println("1.- Libro");
        System.out.println("2.- Periodico");
        System.out.println("3.- Revista");
        System.out.println("Cualquier otra opcion sale del programa");
        op = entrada.nextInt();
        switch(op){
            case 1:
                    Libro();
                break;
            case 2:
                    Periodico();
                 break;
            case 3:
                    Revista();
                break;
            default:
                System.out.println("Gracias por jugar.");
                break;
        }
    }
    
    public void Libro(){
        
        ManipularLibros listadeLibrosobj = new ManipularLibros();
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
                      
            }while((opcion>=1)&&(opcion<6));
        
    }
    public void Periodico(){
        ManipularPeriodicos listadePeriodicosobj = new ManipularPeriodicos();
        int opcion;
            do{
                System.out.println("Bienvenido a la biblioteca");
                System.out.println("Ingrese la opcion deseada");
                System.out.println("1.-Agregar nuevo periodico");
                System.out.println("2.-Consultar periodico");
                System.out.println("3.-Consultar todos los periodicos");
                System.out.println("4.-Borrar un periodico");
                System.out.println("5.-Modificar los datos de un periodico");
                System.out.println("6.-Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                        listadePeriodicosobj.agregarPeriodico();
                        break;
                    case 2:
                        listadePeriodicosobj.buscar();
                    case 3:
                        listadePeriodicosobj.consultaGeneral();
                        break;
                    case 4:
                        listadePeriodicosobj.borrar();
                        break;
                    case 5:
                        listadePeriodicosobj.modificar();
                        break;
                    case 6:
                        System.out.println("Hasta Luego.");
                        
                        //vamos a generar el archivo
                        listadePeriodicosobj.grabar();
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
                      
            }while((opcion>=1)&&(opcion<6));
    }
    public void Revista(){
        ManipularRevistas listadeRevistasobj = new ManipularRevistas();
        int opcion;
            do{
                System.out.println("Bienvenido a la biblioteca");
                System.out.println("Ingrese la opcion deseada");
                System.out.println("1.-Agregar nueva revista");
                System.out.println("2.-Consultar revista");
                System.out.println("3.-Consultar todas las revistas");
                System.out.println("4.-Borrar una revista");
                System.out.println("5.-Modificar los datos de una revista");
                System.out.println("6.-Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                        listadeRevistasobj.agregarRevista();
                        break;
                    case 2:
                        listadeRevistasobj.buscar();
                    case 3:
                        listadeRevistasobj.consultaGeneral();
                        break;
                    case 4:
                        listadeRevistasobj.borrar();
                        break;
                    case 5:
                        listadeRevistasobj.modificar();
                        break;
                    case 6:
                        System.out.println("Hasta Luego.");
                        
                        //vamos a generar el archivo
                        listadeRevistasobj.grabar();
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
                      
            }while((opcion>=1)&&(opcion<6));
    }
}
