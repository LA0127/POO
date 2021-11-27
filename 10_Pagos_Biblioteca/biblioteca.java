/*
Funciones de la biblioteca
Prestamo de libros
*/

import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class biblioteca{
    Scanner entrada = new Scanner(System.in);

    /*
    Vamos a realizar el prestamo de libros
    Variables:
    Devolucion
    Autor, Titulo, ISBN, Genero
    Ejemplares, costo del prestamo
        Metodos
        Prestamo de libros
        Devolucion de libros


    costo prestamo

    */
    String titulo, autor, isbn, genero;
    int ejemplares;
    double costo_prestamo, total;
    public void libros(){
        //Menu para el prestamo del libro
        //Agregar try catch para el manejo de errores
        //Identificar si son variables publicas o privadas para el manejo de los datos
        String text;
        text = JOptionePane.showInputDialog("Elija la funcion que desea ejecutar: "
                                            + "\n 1.-Prestamo del libro"
                                            + "\n 2.-Devolucion del libro");
        int opcion;
        opcion = Integer.parseInt(text);
        switch(opcion){
            case 1: 
                prestamo();
                break;
            case 2:
                devolucion();
                break;
            default:
                JOptionePane.showInputDialog("Gracias, por usar el programa de prestamos de libros");
                break;
        }
    }

    public void prestamo(){
        /*
        
        Objetos de libros
        Se deberan poner libros diferentres
        Precargar la informacion del libro
            Primero creas
        Crear class libro
        libro drama = new libro("La cumbre escarlata", "No me lo se(Autor)", "isbn 12345", Num ejemplares Sin comillas);
        libro fantasmas = new libro("Cronicas mutantes, "No me lo se xD", "isbn", 23):
        
            Segundo Llamar a los libros
        Aparecer la lista de todos los libros (class libros), imprimir lista de libros

        
            Tercero
        Ingrese el titulo que desee para su prestamo y la cantidad de libros que debes
        Preguntar si desea agregar un libro mas
            
            Cuarto
            Visualizar los datos del libro que se presto y decir la cantidad de libros que restan en la biblioteca


        */
    }

    public void devolucion(){

        /*
        Primero
        Buscar en el sistema que se presto
        Segundo 
        Cambiar el estado del prestamo -> Volver a sumar el libro a la biblioteca
        Tercero
        Visualizar los datos del libro de nuevo para confirmar que se cargo

        */
    }
}