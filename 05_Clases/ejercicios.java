import java.util.Scanner;
class ejercicios{


    Scanner entrada = new Scanner(System.in);
    char op;
    double a, b;
    public void menu(){
        //Menu del programa
        char op;
        System.out.println("Ejercicios");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cuadros");
        System.out.println("d.- Movimiento en cuadro");
        System.out.println("Cualquier otra opcion sale del programa");
        op = entrada.next().charAt(0);
        switch(op){
            case 'a':
                    ejercicio1();
                break;
            case 'b':
                    ejercicio2();
                 break;
            case 'c':
                    ejercicio3();
                break;
            case 'd':
                    ejercicio4();
                 break;
            default:
                System.out.println("Gracias por jugar.");
                break;
        }
    }

    public void ejercicio1(){
        
        double num1 = 0.00, suma = 0.00, multi = 1.00;
        char op;
        System.out.println("Selecciona la operacion que deseas realizar:");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
                do{
                    System.out.println("Para detener la operacion presiona 0");
                    System.out.println("Escriba los numeros que desee sumar o restar");             
                    suma += num1;

                }while(num1 != 0);
                System.out.println("El resultado es: " + suma);

                break;
            case 'b':
                do{
                    System.out.println("Para detener la operacion presiona 0");
                    System.out.println("Escriba los numeros que desee multiplicar");
                    num1 = entrada.nextDouble();

                    if(num1 > 0){
                        multi *= num1;
                    }else{
                        System.out.println("Error, solo con positivos");
                    }

                }while(num1 != 0);
                System.out.println("El resultado es: "+multi);

                break;
            case 'c':
                    double r, aux, aux2;
                    int aux3=0;
                    do{
                    System.out.println("Digita el dividendo");
                    aux = entrada.nextDouble();
                    //do
                    System.out.println("Digita e kdivisor");
                    aux2 = entrada.nextDouble();
                    }while(aux3 != 0);

                break;
            default:
                System.out.println("Opcion no valida.");
                break;

        }
    }
    public void ejercicio2(){
        //Convertir metros a cm y pulgadas. Kg a libras y gramos m/s a km/h
        double metros =0.00, kilogramos=0.0, velocidad = 0.00, cm = 100.00, pulgada = 39.7, gramos = 1000.00, libra =2.20, ms=0.00;
        System.out.println("Seleccione la cantidad que desee convertir");
        System.out.println("a.- Metros a cm y pulgadas");
        System.out.println("b.- Kilogramos a libras y gramos");
        System.out.println("c.- m/s a km/h");
        op = entrada.next().charAt(0);
        switch(op){
            case 'a':
                System.out.println("Digite los metros");
                metros = entrada.nextDouble();
                a = metros*cm;
                b = metros*pulgada;
                System.out.println("la cantidad de metros es:"+metros+" de m a cm:" + a+" de m a pulgadas"+ b);
                break;
            case 'b':
                System.out.println("Digite los kilogramos");
                kilogramos = entrada.nextDouble();
                a = kilogramos*gramos;
                b = kilogramos*libra;
                System.out.println("la cantidad de kilogramos es: "+kilogramos+" de kg a gr: " + a+" de kg a lbrs: "+ b);
            case 'c':
                System.out.println("Digite los kilogramos");
                kilogramos = entrada.nextDouble();
                a = ms*(3600*1000);
                System.out.println("La conversion de m/s a km/h es: "+a);
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
    public void ejercicio3(){
        int n, m=0;

        do{
            System.out.println("Ingrese el numero de asteriscos que desea tener en el cuadro");
            n = entrada.nextInt();

            if(n<0 || n>1000){
                System.out.println("El cuadro no acepta ni negativos ni mayores a 1000");
            }else{
                for(int i =1; i<=n; i++){
                    System.out.print("*");
                }
                System.out.println();
                for(int i = 0; i<n-2; i++){
                    System.out.print("*");
                    for(int j = 0; j<n-2;j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                for(int i = 1; i<=n; i++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }while(m==0);
    }
    public void ejercicio4(){

    }
}