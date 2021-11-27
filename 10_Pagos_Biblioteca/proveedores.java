/*
class libro con los libros que tu quieras
*/
import java.util.*;
//import java.swing.*;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Proveedores extends Libros{
    private String nombre_cliente;
    private String producto[] = new String[10];
    private int costo[] = new int[10];
    private int producto_existente[] = new int[10];
    int sumatotal;
    Scanner entrada = new Scanner(System.in);
    //menu
    public void menuproveedores(){
        String text;
        int opcion=0;
        try{
            //es para ingresar texto
            text = JOptionPane.showInputDialog("Seleccione la funcion deseada"
                                            + "\n 1.-Suma total de costos"
                                            + "\n 2.-Costo mayor"
                                            + "\n 3.-Costo menor"
                                            + "\n 4.-Costo promedio"
                                            + "\n 5.-Costo total del producto");
                    // cuando se utiliza JOptionPane solo se reciben cadenas
                    //voy a convertir esa cadena en un entero
                    opcion = Integer.parseInt(text);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Para acceder a un programa solo se puede ingresar los numeros del 1 al 3");
            //vamos a obtener el error, es visible para el usuario
            JOptionPane.showMessageDialog(null, "Efe"+e.getMessage());
            //si solo queremos imprimir el error en consola
            System.out.println("El error es: efe" + e.getMessage());

        }
        do{
        switch(opcion){
            case 1:
                sumatotal();
                break;
            case 2:
                costomayor();
                break;
            case 3:
                costomenor();
                break;
            case 4:
                costopromedio();
                break;
            case 5:
                costototal();
                break;
            default:
                System.out.print("Opcion no disponible, adios.");
            break;
        }
        }while(opcion>5);
    }
    
    public void sumatotal(){
        //libro uno + libro dos 
        String text;
        int sumat;
        Librouno cost = new Librouno("La Cumbre Escarlata", "Nancy Holder", "12345-B", "Terror, Ficcion gotica, Literatura fantastica.", 5, 500);
        cost.mostrarLibrouno();
        Librodos coste = new Librodos("Los pasos de Lopez", "Jorge Ibarguengoitia", "12345-A", "Ficcion", 6, 200);
        coste.mostrarLibrodos();

        sumat=200+500;
        text = JOptionPane.showInputDialog("La informacion de los libros se ha mostrado en consola.\n La suma del costo los libros para la biblioteca es de: \n Enter para continuar." + sumat);
        //Librodos coste = new Librodos("Los pasos de Lopez", "Jorge Ibarguengoitia", "12345-A", "Ficcion", 6, 200);
        //coste.mostrarLibrodos();
    }
    public void costomayor(){
        String text;
        text = JOptionPane.showInputDialog("El Libro con mayor precio se mostrara en consola: \nEnter para continuar");
        System.out.println("Costo Mayor");
        Librouno cost = new Librouno("La Cumbre Escarlata", "Nancy Holder", "12345-B", "Terror, Ficcion gotica, Literatura fantastica.", 5, 500);
        cost.mostrarLibrouno();
    }
    public void costomenor(){
        String text;
        text = JOptionPane.showInputDialog("El libro con menor precio se mostrara en consola: \nEnter para continuar.");
        System.out.println("Costo Menor\n");
        Librodos coste = new Librodos("Los pasos de Lopez", "Jorge Ibarguengoitia", "12345-A", "Ficcion", 6, 200);
        coste.mostrarLibrodos();
        
    }
    public void costopromedio(){
        String text;
        int prom=(500+200)/2;
        text=JOptionPane.showInputDialog("El costo promedio de los libros es: " + prom + "\nEnter para continuar.");
    }
    public void costototal(){
        String text;
        int costoTotal = (5*100)+(6*200);
        text = JOptionPane.showInputDialog("El costo total de todos los lobros y ejemplares es de: " + costoTotal+ "\nEnter para continuar.");
        System.out.println("Estos son todos los libros disponibles: \n");
        Librouno cost = new Librouno("La Cumbre Escarlata", "Nancy Holder", "12345-B", "Terror, Ficcion gotica, Literatura fantastica.", 5, 500);
        cost.mostrarLibrouno();
        Librodos coste = new Librodos("Los pasos de Lopez", "Jorge Ibarguengoitia", "12345-A", "Ficcion", 6, 200);
        coste.mostrarLibrodos();
    }

}