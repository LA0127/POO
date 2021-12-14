
package Controles;
//@Author Luis
import Documentos.CLibro;
import Documentos.Periodico;
import java.util.*;
import java.io.*;
class ArchivoP implements Serializable{
    /*
    
    Crear objeto que vamos a serializar
    de la lista de los periodico
    
    */
    
    
    ArrayList<Periodico> listarecuperada = new ArrayList<Periodico>();
    
    
    //Metodo para generar la lectura del archivo
    //Metodo que lee el archivo
    
    public ArrayList<Periodico> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("periodico.txt"));
            listarecuperada = (ArrayList<Periodico>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("Se origino: " + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    //Metodo que serializa
    //Metodo que escribe el archivo
    void Serializar(ArrayList<Periodico> listaserializada){
        try{
            //Genera el archivo de salida
            FileOutputStream salida = new FileOutputStream("periodico.txt");
            
            
            //Genera la creacion de objetos
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);            
            salidaobjeto.writeObject(listaserializada);
        }catch(Exception e){
            System.out.println("" + e.getMessage());
            System.out.println("" + e.getStackTrace());
        }
}
    
}
