
package Controles;
//@Author Luis
import Documentos.Revista;
import java.util.*;
import java.io.*;
class ArchivoR implements Serializable{
    /*
    
    Crear objeto que vamos a serializar
    de la lista de los revistas
    
    */
    
    
    ArrayList<Revista> listarecuperada = new ArrayList<Revista>();
    
    
    //Metodo para generar la lectura del archivo
    //Metodo que lee el archivo
    
    public ArrayList<Revista> leer(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("revista.txt"));
            listarecuperada = (ArrayList<Revista>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("Se origino: " + e.getStackTrace());
        }
        return listarecuperada;
    }
    
    //Metodo que serializa
    //Metodo que escribe el archivo
    void Serializar(ArrayList<Revista> listaserializada){
        try{
            //Genera el archivo de salida
            FileOutputStream salida = new FileOutputStream("revista.txt");
            
            
            //Genera la creacion de objetos
            ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);            
            salidaobjeto.writeObject(listaserializada);
        }catch(Exception e){
            System.out.println("" + e.getMessage());
            System.out.println("" + e.getStackTrace());
        }
}
    
}
