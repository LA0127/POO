import java.util.Scanner;
class Suma2Numeros{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
         int num1, num2;
         int resultado=0;
        do{
         System.out.println("Ingresa un numero a sumar (si pone 0 se detiene y se realiza la suma): ");
         num1 = entrada.nextInt();
         //System.out.println("Ingresa el segundo numero a sumar: ");
         //num2 = entrada.nextInt();
        //resultado=num1+num2;
        resultado = resultado + num1;
        }while (num1 !=0);
            System.out.println("El resultado es: " + resultado);    
        
    }
}
    //identado del código
    //método principal
     /* Realizar instancia del objeto
        NombreClase nombreobjeto = new NombreClase();
        System.in es una Clase suoerior donde nosotros podemos
        obtener los datos que vienen por parte de la 
        entrada estandar de la computadora (Consola)*/
        //definir un objeto de la libreria Scanner
