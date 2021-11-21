import java.util.*;
import java.util.Scanner;

public class ejercicio2{//Ejercicio dos, permite ingresar 10 numeros y sacar el promedio de los pares.
    public void ejercicios2(){
        Scanner entrada =new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        double promedio=0.0;
        System.out.println("\n\nIngresa 10 numeros, pulsa enter para agregar cada numero");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        num5 = entrada.nextInt();
        num6 = entrada.nextInt();
        num7 = entrada.nextInt();
        num8 = entrada.nextInt();
        num9 = entrada.nextInt();
        num10 = entrada.nextInt();
        int numeros [] = new int[10];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        numeros[3] = num4;
        numeros[4] = num5;
        numeros[5] = num6;
        numeros[6] = num7;
        numeros[7] = num8;
        numeros[8] = num9;
        numeros[9] = num10;
        int positivos=0;
        int negativos=0;
        int ceros=0;
        promedio = (num1+num3+num5+num7+num9)/5;
        System.out.println("El promedio de los numeros pares es: " + promedio);
    }
}