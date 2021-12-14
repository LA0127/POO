
package Documentos;
import java.util.*;
public class Periodico extends CLibro{

    private Date fecha = new Date();
    //private String fecha2;
    
    public Periodico(){}

    public Periodico(String nombre, String autor, String editorial, float precio) {
        super(nombre, autor, editorial, precio);
        //this.fecha2 = fecha2;
    }
    
    //@SuppressWarnings("deprecation")
    public void agregarPeriodico(){
        //Jalar metodo de aceptar datos y agregar tipo de revista
        CLibro datoslibro = new CLibro();
        Scanner entrada = new Scanner(System.in);

        
        datoslibro.aceptarDatos();
        System.out.println("Ingresa la fecha de publicacion");
        //fecha2 = entrada.nextLine();
        System.out.println("Año: " + fecha.getYear());
        System.out.println("Mes: " + fecha.getMonth());
        System.out.println("Dia: " + fecha.getDay());
        
    }

    /*public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    */
    
    
    
    
}
