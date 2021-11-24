import java.util.Scanner;
import javax.swing.JOptionePane;

public class principal{
    int choice;
    String text_menu;
    public static void main(String[]args){

        
        String text;
        int opciones=0;

        //Visualizar en una interfaz pequeña, opciones del menu
        //menu
        principal mainp = new principal();

        //Ciclo para que menu se repita
        do{
            mainp.MenuP();
            text = JOptionePane.showInputDialog("Para ingresar al programa digite 1.");
            opciones = Integer.paseInt(text)


        }while(opciones==1);
    }
    public void MenuP(){
        /*Los metodos void vacios son porque no reciben ningun parametro
        Excepciones*/
        try{
            text = JOptionePane-showInputDialog("Seleccione el programa a ejecutar de la siguiente lista: \n 1.-Consultar sueldo de personal \n 2.-Costos y proveedores \n 3.-Prestamos y devolucion de libros");
            opciones=Integer.paseInt(text);
        }catch(Exception e){
            JOptionePane.showInputDialog(null, "Para acceder al programam solo se puede ingresar J");
            //Vamos a obtener el error, es visible para el usuario
            JOptionePane.showInputDialog(null, "" + e.getMessage());
            //Si solo queremos imprimir el error de consola
            System.out.println("El error es: " + e.getMessage());
        }
        switch (opciones){
            case 1:
                //metodo
                break;
            case 2:
                //metodo
                break;
            case 3:
                //metodo
                break;
            default: 
                JOptionePane.showInputDialog(null,"vuelva pronto.");

        }



    }
    

}