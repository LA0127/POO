
import java.util.*;

public class Arreglos{
    public static void main(String[] args){
        /*Vamos a realizar un arreglo unidimensional
        y recorrerlo para ver que hay dentro de cada elemento
        Tipo de dato    nombre  tamanio */
        //int arreglo[]= new int[10];//Para agregar valores definidos es con llaves y comas{}
        //Vamos a recorrer el arreglo
        //for(int i = 1; i < arreglo.length; i++){
            //System.out.println("Magia: " + arreglo[i]);
            Scanner entrada =new Scanner(System.in);
            int matriz[][] = new int[3][3];
            //sumar las filas del arreglo y sacar el promedio
            float sumafilas=0;
            //ingresar los valores a la matriz y recorrerlas
            for(int i=0;i<matriz.length;i++){
                    //System.out.println(i);
                    //columnas
                 for(int j = 0; j<matriz.length;j++){
                     //System.out.println(j);
                     //llenamos la matriz
                     System.out.println("Valor de fila: " + i + "\nValor columna: " + j + " ");
                      //vamos a la posicion
                     matriz[i][j] = entrada.nextInt();

                    }
        } 
        for(int i=0;i<matriz.length;i++){
            for(int j = 0;j<matriz.length;j++){
                sumafilas += matriz[i][j];
                System.out.println(String.format("%d", matriz[i][j]));
            }
            System.out.println(String.format("\n Suma de filas %f, Promedio de la fila %f", sumafilas, sumafilas/matriz.length));
        }
    }
    
}