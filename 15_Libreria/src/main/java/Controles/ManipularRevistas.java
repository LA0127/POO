
package Controles;

import Documentos.Revista;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Luis
 */

public class ManipularRevistas {
        
    //vamos a crear un metodo para agregar varios revista
    
    //los objetos que son capaces de soportar diferentes tipos de datos
    
    private ArrayList<Revista> listaderevista;//= new ArrayList;
    
    //objeto para arcgivo de mis revista
    
    private ArchivoR objetoarchivorevista = new ArchivoR();
    //esta clase es la que se encarga de crear y leer los archivos del doc
    //del tipo revista
    
    
    //consultar lista revista
    
    //Hacer el crud de revista
    //C Create R read U update D delete
    
    public ManipularRevistas(){
        listaderevista = new ArrayList<Revista>();
        //aplicar sobrecarga al objeto para mandar
        //a llamar su lectura correspondiente del archivo
        listaderevista = objetoarchivorevista.leer();
        //Esto es una sobrecarga al objeto. Transforma un objeto de un array list y lo transforma a un archivo
        //instancia para poder llamar los metodos
        
        
    
    }
    
    //CRUD
    public void agregarRevista(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            //Hacemos obj de revista y mando a llamar al metodo de los datos
            Revista objrevista = new Revista();
            objrevista.aceptarDatos();
            
            listaderevista.add(objrevista);
            System.out.println("¿Agregar otro revista?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //Aqui va lo de la captura
    public void consultaGeneral(){
        if(listaderevista.isEmpty()){
            System.out.println("No hay revista agregados");
        }else{
            System.out.println("Los revista son: ");
            for(int i = 0; i< listaderevista.size(); i++) {
                System.out.println("Nombre del revista: " + listaderevista.get(i).getNombre());
            }
        }
    }
    
    
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista de revista
        
        for(int i = 0; i<listaderevista.size(); i++){
            if(buscarNombre.equalsIgnoreCase(listaderevista.get(i).getNombre())){
                pos = i;
                existe = true;
                
            }else{
                System.out.println("No existe el registro del revista");
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
        
        System.out.println("revista a buscar por nombre: ");
        
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traePosicion(nombreBuscar);
        
        System.out.println("Nombre del revista: " + listaderevista.get(posbuscar).getNombre());
        System.out.println("Autor del revista: " + listaderevista.get(posbuscar).getAutor());
        System.out.println("Editorial del revista: " + listaderevista.get(posbuscar).getEditorial());
        System.out.println("Precio del revista: " + listaderevista.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String revistaborrar;
        int posborrar;
        
        if(listaderevista.isEmpty()){
            System.out.println("No hay revista registrados");
        }else{
            System.out.println("Ingresa el id del revista que vas a eliminar");
            posborrar = buscar();
            if(posborrar<listaderevista.size()){
                //si esta dentro de la lista
                listaderevista.remove(posborrar);
                System.out.println("revista eliminado");
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
        
        System.out.println("Nombre del revista a modificar");
        modificar = entrada.nextLine();
        
        while ("s".equalsIgnoreCase(opcion)) {
            posmodificar = traePosicion(modificar);
            
            System.out.println("Que dato deseas modificar del revista?"
                    + "\n 1.-Autor"
                    + "\n 2.-Editorial"
                    + "\n 3.-Precio");
                resmod = entrada.nextInt();
            switch(resmod){
                case 1:
                    System.out.println("El autor es: ");
                    System.out.println("Autor: " + listaderevista.get(posmodificar).getAutor());
                    System.out.println("Ingrese el nuevo autor: ");
                    listaderevista.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo autor: " + listaderevista.get(posmodificar).getAutor());
                    break;
                case 2:
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: " + listaderevista.get(posmodificar).getEditorial());
                    System.out.println("Ingrese la nueva editorial: ");
                    listaderevista.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo editorial: " + listaderevista.get(posmodificar).getEditorial());
                    break;
                case 3:
                    System.out.println("El precio es: ");
                    System.out.println("Precio: " + listaderevista.get(posmodificar).getPrecio());
                    System.out.println("Ingrese el nuevo precio: ");
                    listaderevista.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo precio: " + listaderevista.get(posmodificar).getPrecio());
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
        getObjetoarchivorevista().Serializar(listaderevista);
    }
    
    
    
    
    
    public ArrayList<Revista> getListaderevista() {
        return listaderevista;
    }

    public void setListaderevista(ArrayList<Revista> listaderevista) {
        this.listaderevista = listaderevista;
    }

    public ArchivoR getObjetoarchivorevista() {
        return objetoarchivorevista;
    }

    public void setObjetoarchivorevista(ArchivoR objetoarchivorevista) {
        this.objetoarchivorevista = objetoarchivorevista;
    }
    
    
    
}
