
package Controles;
//@Author Luis
import Documentos.CLibro;
import java.util.*;
import java.io.*;
class ArchivoL implements Serializable{
    /*
    
    Crear objeto que vamos a serializar
    de la lista de los libros
    
    */
    
    
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    
    
    //Metodo para generar la lectura del archivo
    //Metodo que lee el archivo
    
    public ArrayList<CLibro> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("Se origino: " + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    //Metodo que serializa
    //Metodo que escribe el archivo
    void Serializar(ArrayList<CLibro> listaserializada){
        try{
            //Genera el archivo de salida
            FileOutputStream salida = new FileOutputStream("libro.txt");
            
            
            //Genera la creacion de objetos
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);            
            salidaobjeto.writeObject(listaserializada);
        }catch(Exception e){
            System.out.println("" + e.getMessage());
            System.out.println("" + e.getStackTrace());
        }
}
    
}
