import java.util.*;
import java.util.Scanner;

class ejercicio3{
    Scanner entrada =new Scanner(System.in);
    int op;
    public void menu(){
        //Menu del programa
        System.out.println("Ejercicios");
        System.out.println("1.-Ejercicio 1: Ingresar 10 numeros y leer los positivos, negativos y ceros.");
        System.out.println("2.-Ejercicio 2: Ingresar 10 numeros y sacar el promedio de los pares.");
        System.out.println("3.-Ejercicio 3: Calificaciones");
        op = entrada.nextInt();
        switch(op){
            case 1:
                    ejercicios1();
                break;
            case 2:
                    ejercicios2();
                break;
            case 3:
                    ejercicios3();
                break;
            default:
                System.out.println("Cualquier opcion sale del programa.");
        }
    }
    public void ejercicios1(){    
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        System.out.println("Ingresa 10 numeros, pulsa enter para agregar cada numero");
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
        for(int i =0;i<numeros.length;i++){
            if(numeros[i]>0){
                positivos++;
            }else if(numeros[i]<0){
                negativos++;
            }else if(numeros[i]==0){
                ceros++;
            }

        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    public void ejercicios2(){
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
        //int positivos=0;
        //int negativos=0;
        //int ceros=0;
        promedio = (num1+num3+num5+num7+num9)/5;
        System.out.println("El promedio de los numeros pares es: " + promedio);
    }
    public void ejercicios3(){
            //double n1=0.0, n2=0.0, n3=0.0, n4=0.0, n5=0.0, n6=0.0, n7=0.0, n8=0.0, n9=0.0, n10=0.0;
            double califaprob=0.0;
            double promedio=0.0;
            int materiasrepr=0, materiasapr=0;
            System.out.println("A continuacion se ingresaran las calificaciones de un alumno en sus diez materias.");
            double calificaciones [] = new double[10];
            System.out.println("Guardando las calificaciones...");
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Digite la calificacion: ");
                calificaciones[i] = entrada.nextDouble();
            }
            System.out.println("Que desea realizar:");
            System.out.println("1.-Imprimir todas las calificaciones \n2.-Promedio de las calificaciones \n3.-Mostrar calificacion mas alta y mas baja \n4.-Total de calificaciones superiores al promedio \n5.-Cantidad de materias aprobadas y reprobadas");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    System.out.println("Imprimir todas las calificaciones.");
                    for(double i:calificaciones){
                        System.out.println(i);
                    }
                    break;
                case 2:
                    System.out.println("Promedio de las calificaciones");
                    promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4] + calificaciones[5] + calificaciones[6] + calificaciones[7] + calificaciones[8] + calificaciones[9])/10;
                    System.out.println("El promedio del alumno es: " + promedio);
                    break;
                case 3: 
                    System.out.println("Calificacion mas alta y mas baja");
                    break;
                case 4: 
                    System.out.println("Calificaciones del alumno superiores a su promedio final.");
                    promedio = (calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4] + calificaciones[5] + calificaciones[6] + calificaciones[7] + calificaciones[8] + calificaciones[9])/10;
                    System.out.println("El promedio es: " + promedio);
                    break;
                case 5: 
                    System.out.println("Materias aprobadas, materias reprobadas");
                    for(int i =0;i<calificaciones.length;i++){
                        if(calificaciones[i]>=6){
                            materiasapr++;
                        }else if(calificaciones[i]<6){
                            materiasrepr++;
                        }
                    }
                    System.out.println("El alumno aprobo: " + materiasapr + " materias y reprobo: " + materiasrepr + " materias.");
                    break;
                default:
                    System.out.println("No es una opcion, intente nuevamente.");
            }
    }
}