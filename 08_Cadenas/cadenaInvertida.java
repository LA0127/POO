import java.util.*;

public class cadenaInvertida{
    //Se ingresara una oracion y se va a invertir
    Scanner entrada = new Scanner(System.in);
    public void cadenaInvertidapalabras(){
        String cadena="";
        System.out.println("Ingresa la oracion a invertir");
        cadena =entrada.nextLine();
        String invertida = "";
        
        //Se va a recorrer el tamaño de la cadena al reves

        for(int i = cadena.length()-1; i >=0;i--){
            //obtener el char por cada posicion de i
            char car= cadena.charAt(i);
            //se suma a invertida
            invertida += car;
        }
        System.out.println("La cadena invertida es: "+invertida);
        //ejemplo ---> Hola --> aloh
    }
}