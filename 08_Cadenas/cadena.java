
import java.util.Scanner;

public class cadena{
    Scanner entrada = new Scanner(System.in);

    public void cadenas(){
        String s1 = "Hola perritito lindo gato xD";

        System.out.println("el tamanio de la cadena es de: "+ s1.length());

        //System.out.println("La cadena inicia V o F con Hola?"+s1.Startswith("Hola"));

        //System.out.println("La cadena termina V o F con gato?"+s1.Endswith("gato"));

        System.out.println("Ingrese una palabra: ");
        String s2 = entrada.nextLine();
        System.out.println("La palabra es: " + s2);

        System.out.println("Parte de una subcadena de s1: "+s1.indexOf("tito"));
        System.out.println("Primera parte: "+s1.substring(12));
        System.out.println("Segunda parte: "+s1.substring(3,11));

        //Convertir variable a cadena

        int valor =24;
        String s3 = String.valueOf(valor);
        System.out.println("El valor es de: " + s3 + " como cadena");


        String s4 = "20";
        int numero = Integer.parseInt(s4);
        System.out.println("El valor es de: " + numero + "ahora es un numero");

        String s5 = "20.89";
        Double numero1 = Double.parseDouble(s5);
        System.out.println("El valor es de: " + numero1 + " ahora es un double");

        //metodo tu string que convierte un entero a una cadena

        Integer x = 5;
        System.out.println("El valor de: " + x.toString() + " ahora es una cadena.");

        System.out.println("El valor de: " + Integer.toString(12) + " ahora es una cadena.");


    }
}