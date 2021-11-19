import java.util.*;
public class mascadenas{
    Scanner entrada = new Scanner(System.in);
    public void mascadenass(){
        String s1 = new String("No llega la tele del profe");
        String s2 = "Hrry por HBO";
        String s3 = "El profe quiere legos";
        String s4 = new String("Nueva saga HP wi");

        System.out.println("Escriba la letra de un caracter: ");
        char y = entrada.next().charAt(0);

        System.out.println("Escribiste: "+y);

        String salida = "Cadena s1: " + s1 + "\n" + "\n Cadena s2: " + s2 + "\n"+"\n Cadena s3: " + s3 + "\n" + "\n Cadena s4: "+s4+"\n";
        System.out.println(salida);
        String salidas = "";
                        //igualdad de una cadena
        if(s1.equals("Solo jugo conmigo")){
                salida += "Si es igual la cadena";
                    System.out.println(salida);
        }else{
                salida += "No es la misma porque objeto";
                    System.out.println(salida);
        }
        
        //probar con ==, solo sirve para objetos no para cadenas
        if(s1 == "No llega la tele del profe"){
            salidas += "Si es igual a la cadena";
            System.out.println(salida);
        }else{
            salidas += "No es la misma cadena por el objeto";
            System.out.println(salida);
        }

        //Probar la igualdad ignorando mayusculas
        if(s3.equalsIgnoreCase(s4)){
            salidas += "Si es la misma cadena\n";
            System.out.println(salidas);
        }else{
            salidas += "No es la misma cadena\n";
            System.out.println(salidas);
        }

        //probar compareTo
        salida+="\n s1 compareTo (s2): " + s1.compareTo(s2) +
                "\n s2 compareTo (s1): " + s2.compareTo(s1) +
                "\n s3 compareTo (s4): " + s3.compareTo(s4) +
                "\n s4 compareTo (s3): " + s4.compareTo(s3) + "\n";

        System.out.println(salida);

        String s5= "Patito color cafe";
        int pos=0;
        pos = s5.indexOf('t', pos+1);

        System.out.println("La segunda aparicion de la t es: " + pos);







                        

    }
}