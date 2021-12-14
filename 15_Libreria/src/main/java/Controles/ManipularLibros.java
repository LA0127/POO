
package Controles;

//apuntador
import Documentos.CLibro;
import java.util.*;
import java.io.*;

public class ManipularLibros implements Serializable{
    
    //vamos a crear un metodo para agregar varios libros
    
    //los objetos que son capaces de soportar diferentes tipos de datos
    
    private ArrayList<CLibro> listadelibros ;//= new ArrayList;
    
    //objeto para arcgivo de mis libros
    
    private ArchivoL objetoarchivolibros = new ArchivoL();
    //esta clase es la que se encarga de crear y leer los archivos del doc
    //del tipo libro
    
    
    //consultar lista libros
    
    //Hacer el crud de libros
    //C Create R read U update D delete
    
    public ManipularLibros(){
        listadelibros = new ArrayList<CLibro>();
        //aplicar sobrecarga al objeto para mandar
        //a llamar su lectura correspondiente del archivo
        listadelibros = objetoarchivolibros.leer();
        //Esto es una sobrecarga al objeto. Transforma un objeto de un array list y lo transforma a un archivo
        //instancia para poder llamar los metodos
        
        
    
    }
    
    //CRUD
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            //Hacemos obj de libro y mando a llamar al metodo de los datos
            CLibro objlibro = new CLibro();
            objlibro.aceptarDatos();
            
            listadelibros.add(objlibro);
            System.out.println("¿Agregar otro libro?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //Aqui va lo de la captura
    public void consultaGeneral(){
        if(listadelibros.isEmpty()){
            System.out.println("No hay libros agregados");
        }else{
            System.out.println("Los libros son: ");
            for(int i = 0; i< listadelibros.size(); i++) {
                System.out.println("Nombre del libro: " + listadelibros.get(i).getNombre());
            }
        }
    }
    
    
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista de libros
        
        for(int i = 0; i<listadelibros.size(); i++){
            if(buscarNombre.equalsIgnoreCase(listadelibros.get(i).getNombre())){
                pos = i;
                existe = true;
                
            }else{
                System.out.println("No existe el registro del libro");
            }
        }
        return pos;
    }
    
    //metodo de la busqueda
    
    //buscar por nombre, editorial, precios
    public int buscar(){
        int posbuscar=0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Libro a buscar por nombre: ");
        
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traePosicion(nombreBuscar);
        
        System.out.println("Nombre del libro: " + listadelibros.get(posbuscar).getNombre());
        System.out.println("Autor del libro: " + listadelibros.get(posbuscar).getAutor());
        System.out.println("Editorial del libro: " + listadelibros.get(posbuscar).getEditorial());
        System.out.println("Precio del libro: " + listadelibros.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroborrar;
        int posborrar;
        
        if(listadelibros.isEmpty()){
            System.out.println("No hay libros registradis");
        }else{
            System.out.println("Ingresa el id del libro que vas a eliminar");
            posborrar = buscar();
            if(posborrar<listadelibros.size()){
                //si esta dentro de la lista
                listadelibros.remove(posborrar);
                System.out.println("Libro eliminado");
            }else{
                //esta fuera del rango
                System.out.println("Imposible eliminar el registro. \nRegistro inexistente");
                
            }
        }
    }
    
    //Modificar
    //Autor, editorial, precio
    
    public void modificar(){
        int posmodificar;
        int resmod = 0;//Respuesta modificacion
        String modificar;
        String opcion = "s";
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("Nombre del libro a modificar");
        modificar = entrada.nextLine();
        
        while ("s".equalsIgnoreCase(opcion)) {
            posmodificar = traePosicion(modificar);
            
            System.out.println("Que dato deseas modificar del libro?"
                    + "\n 1.-Autor"
                    + "\n 2.-Editorial"
                    + "\n 3.-Precio");
                resmod = entrada.nextInt();
            switch(resmod){
                case 1:
                    System.out.println("El autor es: ");
                    System.out.println("Autor: " + listadelibros.get(posmodificar).getAutor());
                    System.out.println("Ingrese el nuevo autor: ");
                    listadelibros.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo autor: " + listadelibros.get(posmodificar).getAutor());
                    break;
                case 2:
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: " + listadelibros.get(posmodificar).getEditorial());
                    System.out.println("Ingrese la nueva editorial: ");
                    listadelibros.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo editorial: " + listadelibros.get(posmodificar).getEditorial());
                    break;
                case 3:
                    System.out.println("El precio es: ");
                    System.out.println("Precio: " + listadelibros.get(posmodificar).getPrecio());
                    System.out.println("Ingrese el nuevo precio: ");
                    listadelibros.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo precio: " + listadelibros.get(posmodificar).getPrecio());
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
            
            System.out.println("¿Quieres cambiar?");
            opcion= entrada.nextLine();
        }
        
    }

    
    public void grabar(){
        //mandando a que se cree el archivo
        getObjetoarchivolibros().Serializar(listadelibros);
    }
    
    
    
    
    
    public ArrayList<CLibro> getListadelibros() {
        return listadelibros;
    }

    public void setListadelibros(ArrayList<CLibro> listadelibros) {
        this.listadelibros = listadelibros;
    }

    public ArchivoL getObjetoarchivolibros() {
        return objetoarchivolibros;
    }

    public void setObjetoarchivolibros(ArchivoL objetoarchivolibros) {
        this.objetoarchivolibros = objetoarchivolibros;
    }
    
    
    
}
