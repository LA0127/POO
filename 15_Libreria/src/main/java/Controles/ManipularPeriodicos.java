
package Controles;

import Documentos.Periodico;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Luis
 */

public class ManipularPeriodicos {
        
    //vamos a crear un metodo para agregar varios periodico
    
    //los objetos que son capaces de soportar diferentes tipos de datos
    
    private ArrayList<Periodico> listadeperiodicos ;//= new ArrayList;
    
    //objeto para arcgivo de mis periodico
    
    private ArchivoP objetoarchivoperiodicos = new ArchivoP();
    //esta clase es la que se encarga de crear y leer los archivos del doc
    //del tipo periodico
    
    
    //consultar lista periodico
    
    //Hacer el crud de periodico
    //C Create R read U update D delete
    
    public ManipularPeriodicos(){
        listadeperiodicos = new ArrayList<Periodico>();
        //aplicar sobrecarga al objeto para mandar
        //a llamar su lectura correspondiente del archivo
        listadeperiodicos = objetoarchivoperiodicos.leer();
        //Esto es una sobrecarga al objeto. Transforma un objeto de un array list y lo transforma a un archivo
        //instancia para poder llamar los metodos
        
        
    
    }
    
    //CRUD
    public void agregarPeriodico(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            //Hacemos obj de periodico y mando a llamar al metodo de los datos
            Periodico objperiodico = new Periodico();
            objperiodico.aceptarDatos();
            
            listadeperiodicos.add(objperiodico);
            System.out.println("¿Agregar otro periodico?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //Aqui va lo de la captura
    public void consultaGeneral(){
        if(listadeperiodicos.isEmpty()){
            System.out.println("No hay periodico agregados");
        }else{
            System.out.println("Los periodico son: ");
            for(int i = 0; i< listadeperiodicos.size(); i++) {
                System.out.println("Nombre del periodico: " + listadeperiodicos.get(i).getNombre());
            }
        }
    }
    
    
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;
        
        //recorrer la lista de periodico
        
        for(int i = 0; i<listadeperiodicos.size(); i++){
            if(buscarNombre.equalsIgnoreCase(listadeperiodicos.get(i).getNombre())){
                pos = i;
                existe = true;
                
            }else{
                System.out.println("No existe el registro del periodico");
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
        
        System.out.println("periodico a buscar por nombre: ");
        
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traePosicion(nombreBuscar);
        
        System.out.println("Nombre del periodico: " + listadeperiodicos.get(posbuscar).getNombre());
        System.out.println("Autor del periodico: " + listadeperiodicos.get(posbuscar).getAutor());
        System.out.println("Editorial del periodico: " + listadeperiodicos.get(posbuscar).getEditorial());
        System.out.println("Precio del periodico: " + listadeperiodicos.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
    
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String periodicoborrar;
        int posborrar;
        
        if(listadeperiodicos.isEmpty()){
            System.out.println("No hay periodico registrados");
        }else{
            System.out.println("Ingresa el id del periodico que vas a eliminar");
            posborrar = buscar();
            if(posborrar<listadeperiodicos.size()){
                //si esta dentro de la lista
                listadeperiodicos.remove(posborrar);
                System.out.println("periodico eliminado");
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
        
        System.out.println("Nombre del periodico a modificar");
        modificar = entrada.nextLine();
        
        while ("s".equalsIgnoreCase(opcion)) {
            posmodificar = traePosicion(modificar);
            
            System.out.println("Que dato deseas modificar del periodico?"
                    + "\n 1.-Autor"
                    + "\n 2.-Editorial"
                    + "\n 3.-Precio");
                resmod = entrada.nextInt();
            switch(resmod){
                case 1:
                    System.out.println("El autor es: ");
                    System.out.println("Autor: " + listadeperiodicos.get(posmodificar).getAutor());
                    System.out.println("Ingrese el nuevo autor: ");
                    listadeperiodicos.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo autor: " + listadeperiodicos.get(posmodificar).getAutor());
                    break;
                case 2:
                    System.out.println("La editorial es: ");
                    System.out.println("Editorial: " + listadeperiodicos.get(posmodificar).getEditorial());
                    System.out.println("Ingrese la nueva editorial: ");
                    listadeperiodicos.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo editorial: " + listadeperiodicos.get(posmodificar).getEditorial());
                    break;
                case 3:
                    System.out.println("El precio es: ");
                    System.out.println("Precio: " + listadeperiodicos.get(posmodificar).getPrecio());
                    System.out.println("Ingrese el nuevo precio: ");
                    listadeperiodicos.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato ha sido modificado.");
                    System.out.println("Nuevo precio: " + listadeperiodicos.get(posmodificar).getPrecio());
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
        getObjetoarchivoperiodico().Serializar(listadeperiodicos);
    }
    
    
    
    
    
    public ArrayList<Periodico> getListadeperiodico() {
        return listadeperiodicos;
    }

    public void setListadeperiodico(ArrayList<Periodico> listadeperiodicos) {
        this.listadeperiodicos = listadeperiodicos;
    }

    public ArchivoP getObjetoarchivoperiodico() {
        return objetoarchivoperiodicos;
    }

    public void setObjetoarchivoperiodico(ArchivoP objetoarchivoperiodicos) {
        this.objetoarchivoperiodicos = objetoarchivoperiodicos;
    }
    
    
    
}


