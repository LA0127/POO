
package Documentos;

import java.util.Scanner;


public class Revista extends CLibro{
    private String tipo_revista;
    //espectaculos chismes etc
    
    
    public Revista(){
    
    }

    public Revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }

    public Revista(String tipo_revista, String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        this.tipo_revista = tipo_revista;
    }

    public String getTipo_revista() {
        return tipo_revista;
    }

    public void setTipo_revista(String tipo_revista) {
        this.tipo_revista = tipo_revista;
    }
    
    //Datos del tipo de revista
    
    public void agregarRevista(){
        //Jalar metodo de aceptar datos y agregar tipo de revista
        CLibro datoslibro = new CLibro();
        Scanner entrada = new Scanner(System.in);

        
        datoslibro.aceptarDatos();
        System.out.println("Ingresa el tipo de revista");
        tipo_revista = entrada.nextLine();
        
    }
    
}
