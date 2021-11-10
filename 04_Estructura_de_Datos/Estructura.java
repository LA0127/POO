import java.util.Scanner;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar; De pronto aparecio esta linea de codigo
class Estructura{
        
    public static void main(String[] args){
        //Objetos
        Scanner entrada = new Scanner(System.in);
        //Scanner letras = new Scanner(System.in);
        
        //Variables
        int edad, opcion, socio, numerobinario, figura, base, altura, perimetro;
        int ladoizq, ladoder, radio, radiocubo, radiocuadrado, num1, num2, total, numc4;
        int numfact =0, positivos=0, negativos=0;
        double precio, bono, volumen, area, grados, resultado, factorial=1;
        float precios = 0;
        float resultado2=0;
        int cantidad = 0;
        var pi = 3.14159265359;
        char letras;
        String binario="";
        
        //Cuerpo del programa
        //Menu de las opciones
        do{

            System.out.println("");
            System.out.println("---------------Bienvenido a estructuras.---------------");
            System.out.println(" --------------Elija la opcion deseada.--------------");
            System.out.println("           -----------------------------------");
            System.out.println("          | 1.- Descuento por edad            |");
            System.out.println("          | 2.- Convertir Decimal a binario   |");
		    System.out.println("          | 3.- Conversiones de temperatura   |");
		    System.out.println("          | 4.- Numeros positivos y negativos |");
		    System.out.println("          | 5.- Tienda                        |");
		    System.out.println("          | 6.- Area y perimetro o volumen    |");
		    System.out.println("          | 7.- Tabla                         |");
		    System.out.println("          | 8.- Factorial                     |");
		    System.out.println("          | 9.- Dibujos de codigo             |");
	    	System.out.println("          | 10.- Figura hueca                 |");
		    System.out.println("          | 11.- Patrones de codigo           |");
	    	System.out.println("          | 12.- Diamante                     |");
	    	System.out.println("          | 13.- Calculadora                  |");
	    	System.out.println("          | 14.- Salir                        |");
            System.out.println("           -----------------------------------");

            //Condicion switch para el menu
            opcion = entrada.nextInt();
                //Primer switch para escoger programa a ejecutar
            switch(opcion){
                case 1:  //Bono y descuentos
                    System.out.println("Ingresa el Bono a cobrar. ");
                    bono = entrada.nextDouble();
                    System.out.println("Ingresa la edad. ");
                    edad = entrada.nextInt();
                        //Condiciones
                    if(edad>=65){
                        bono = bono * .6;
                        System.out.println("Su descuento es de 40%.");
                        System.out.println("El total a pagar es de: " + bono);
                    }//Cierre de if(edad>=65)

                    if(edad<= 21){
                        System.out.println("Si tus padres son socios ingresa 1, si no lo son ingresa 2");
                        socio = entrada.nextInt();

                        switch(socio){
                            case 1:
                                bono = bono * .55;
                                System.out.println("Su descuento es de 45%.");
                                System.out.println("El total a pagar es de: " + bono);
                                break;
                            case 2: 
                                bono = bono * .75;
                                System.out.println("Su descuento es de 25%.");
                                System.out.println("El total a pagar es de: " + bono);
                                break;
                            default:    //Quiere decir que son los demas casos
                                System.out.println("Opcion no valida. ");
                        }//Cierre switch(socio) (interno al if)
                    }//Cierre if(edad<=21)
                        System.out.println("Tu edad es de: "+ edad);
                         System.out.println("El total a pagar es: " + bono);
                            break;

                case 2:  //Decimal a binario
                    System.out.println("Conversion de decimal a binario");
                    System.out.println("Digite el numero que desea convertir a binario. (Solo numeros reales y enteros).");
                    numerobinario = entrada.nextInt();  //Positivo
                    if(numerobinario>0){
                        while(numerobinario>0){
                        if(numerobinario%2==0){
                            binario = "0"+binario;
                        }else{
                            binario="1"+binario;
                        }
                        numerobinario=(int)numerobinario/2;
                    }
                         }else if(numerobinario==0){
                             binario="0";
                         }else{
                            binario= "no se pudo convertir el numero, solo positivos";
                    }
                    System.out.println("El numero binario es: "+binario);
                    break;
                case 3:  // Conversiones de temperatura
                    System.out.println("Conversiones de temperatura");
                    System.out.println("Cambio de grados Celsius a grados Farenheit o viseversa.");
                    System.out.println("1.-C° a F° \n2.-F° a C°");
                    opcion = entrada.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("Haz elegido convertir C° a F°");//(grados*9/5)+32   (9/5=1.8)
                            grados = entrada.nextDouble();
                            resultado = (grados*1.8)+32;
                            System.out.println("Los grados en F°: " + resultado + "°F");
                            break;
                        case 2:
                            System.out.println("Haz elegido convertir F° a C°");//(grados-32)*9/5   (5/9 = 0.555556)
                            grados = entrada.nextDouble();
                            resultado = (grados-32)*0.555556;
                            System.out.println("Los grados en C°: " + resultado + "°C");
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                    } //Cierre switch (opcion) Cambios de temperatura
                    break;
                
                case 4:  // Contar numeros positivos y negativos
                    System.out.println("Contar numeros positivos y negativos");
                    System.out.println("Cuantos numeros deseas ingresar? ");
                    total =entrada.nextInt();
                    do{
                        System.out.print("Digite el numero: ");
                        numc4 = entrada.nextInt();
                        if (numc4 == 0){
                          positivos = positivos + 0; //va a acumular los numeros positivos  
                        }else{
                            if(numc4 > 0){ //empieza a sumar los positivos
                            positivos = positivos + 1;
                            }else{
                                negativos = negativos + 1;
                            }
                        }
                        total = total - 1;
                                        //Se deben inicializar las variables porque no puede tomar un valor, no se sabe que valor es.
                    }while(total != 0);
                        System.out.println("El total de positivos es: \n" + positivos);
                        System.out.println("El total de negativos es: \n" + negativos);
                    break;
                case 5:  //Tienda
                    System.out.println("Cuantos elementos vas a ingresar. ");
                    total = entrada.nextInt();
                    for(int i = 1; i <= total; i ++){  //se necesita un for en vez de un do
                        System.out.println("Ingresa el precio: ");
                        precios = entrada.nextFloat();
                        System.out.println("Ingresa la cantidad del producto: ");
                        cantidad = entrada.nextInt();
                         
                        resultado2 = precios * cantidad; //resultado esta tomando una variable de tipo local
                        
                    }
                        System.out.println("El resultado es: " + resultado2);
                    break;
                case 6:  //Area y perietro y Volumen
                    System.out.println("Area y perimetro de un rectangulo y triangulo. Volumen de esfera y cilindro");
                    System.out.println("Digite el numero de la figura que desea hacer las operaciones ");
                    System.out.println("1.-Rectangulo.\n2.-Triangulo. \n3.-Esfera \n4.-Cilindro");
                    figura = entrada.nextInt();
                    switch(figura){  //switch area, perimetro, volumen figuras
                        case 1:
                            System.out.println("\nHaz elegido area y perimetro de un rectangulo. ");
                            System.out.print("Digita la base del rectangulo: ");
                            base = entrada.nextInt();
                            System.out.print("Digita la altura del rectangulo: ");
                            altura = entrada.nextInt();
                            area = base*altura;
                            perimetro = (2*base)+(2*altura);
                            System.out.println("\nEl area del rectangulo es de: " + area + "\nEl perimetro del rectangulo es de: " + perimetro);
                            break;
                        case 2:
                            System.out.println("\nHaz elegido area y perimetro de un triangulo. ");
                            System.out.print("Digita la base del triangulo: ");
                            base = entrada.nextInt();
                            System.out.print("Digita el lado izquierdo del triangulo: ");
                            ladoizq = entrada.nextInt();
                            System.out.print("Digita el lado derecho del triangulo: ");
                            ladoder = entrada.nextInt();
                            System.out.print("Digita la altura del triangulo: ");
                            altura = entrada.nextInt();
                            area = (base * altura)/2;
                            perimetro = base + ladoder + ladoizq;
                            System.out.println("\nEl area del triangulo es de: " + area + "\nEl perimetro del triangulo es de: " + perimetro);
                            break;
                        case 3: // 4/3(pi)(r)^3
                            System.out.println("\nHaz elegido volumen de una esfera. ");
                            System.out.print("Digita el valor del radio de la esfera: ");
                            radio = entrada.nextInt();
                            radiocubo = radio*radio*radio;
                            volumen = (1.33333)*(pi)*(radiocubo); //1.33333 es el valor de 4/3 No se por que lo tomaba distinto
                            System.out.println("El volumen de la esfera es de: " + volumen);
                            break;
                        case 4:     // V=Ab*h       Ab=pi*r^2
                            System.out.println("\nHaz elegido el volumen de un cilindro. ");
                            System.out.print("Digita el radio de la base: ");
                            radio = entrada.nextInt();
                            System.out.print("Digita la altura del cilindro: ");
                            altura = entrada.nextInt();
                            radiocuadrado = radio*radio;
                            area = pi*radiocuadrado;
                            volumen = area * altura;
                            System.out.println("El volumen del cilindro es de: " + volumen);
                            break;
                        default:
                        System.out.println("Opcion no valida");
                    } //Fin switch(figura)

                    break;

                case 7:  //Tabla de valores de N
                    System.out.println("Tabla de valores de N");

                    break;
                case 8:  //Factorial
                    System.out.println("Calcular el factorial de N numero no negativo");
                    System.out.println("Digite el numero al que desea hacer su factorial: ");
                    numfact = entrada.nextInt();
                    while(numfact != 0){ //Se declara diferente de cero para que no se multiplique por cero
                        factorial *= numfact;
                        numfact --; // Se decrementa porque va de adelante hacia atras
                    }
                    System.out.println("El factorial del numero dado es: " + factorial);
                    break;
                case 9:  //Cuadro segun usuario
                    System.out.println("Imprimir un cuadrado segun el numero que ingrese el usuario. (1-20)");
                    break;
                case 10: //Cuadro hueco segun usuario
                    System.out.println("Cuadrado hueco segun el numero que ingrese el usuario. (1-20)");
                    break;
                case 11: //Patron asteriscos
                    System.out.println("Ver patron de asteriscos");
                    System.out.println("******** \n ********\n******** \n ********\n******** \n ********\n******** \n ********");//1
                   /* System.out.println(" ********");//2
                    System.out.println("******** ");//3
                    System.out.println(" ********");//4
                    System.out.println("******** ");//5
                    System.out.println(" ********");//6
                    System.out.println("******** ");//7
                    System.out.println(" ********");//8*/
                    break;
                case 12: //Diamante
                    System.out.println("Forma de diamante con asteriscos ");
                    System.out.println("        *        \n       ***       \n      *****      \n     *******     \n    *********    \n     *******     \n      *****      \n       ***       \n        *        ");//1  1
                   /* System.out.println("       ***       ");//2  3*  
                    System.out.println("      *****      ");//3  5*  
                    System.out.println("     *******     ");//4  7* 
                    System.out.println("    *********    ");//5  9* 
                    System.out.println("     *******     ");//6  7* 
                    System.out.println("      *****      ");//7  5* 
                    System.out.println("       ***       ");//8  3* 
                    System.out.println("        *        ");//9  1* 
                    */
                    break;
                case 13: //Calculadora
                    System.out.println("Calculadora a dos digitos");
                    System.out.println("Selecciona una operaciòn que quieras realizar.\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division");
                    opcion =entrada.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.print("Haz elegido suma de dos digitos. ");
                            System.out.print("Digita el primer numero: ");
                            num1 = entrada.nextInt();
                            System.out.print("Digita el segundo numero: ");
                            num2 = entrada.nextInt();
                            resultado = num1 + num2;
                            System.out.println("El resultado de la suma es de: " + resultado);
                            break;
                        case 2:
                            System.out.print("Haz elegido resta de dos digitos. ");
                            System.out.print("Digita el primer numero: ");
                            num1 = entrada.nextInt();
                            System.out.print("Digita el segundo numero: ");
                            num2 = entrada.nextInt();
                            resultado = num1 - num2;
                            System.out.println("El resultado de la resta es de: " + resultado);
                            break;
                        case 3:
                            System.out.print("Haz elegido multiplicacion de dos digitos. ");
                            System.out.print("Digita el primer numero: ");
                            num1 = entrada.nextInt();
                            System.out.print("Digita el segundo numero: ");
                            num2 = entrada.nextInt();
                            resultado = num1 * num2;
                            System.out.println("El resultado de la multiplicacion es de: " + resultado);
                            break;
                        case 4:
                            System.out.print("Haz elegido division de dos digitos. ");
                            System.out.print("Digita el primer numero: ");
                            num1 = entrada.nextInt();
                            System.out.print("Digita el segundo numero: ");
                            num2 = entrada.nextInt();
                            resultado = num1 / num2;
                            System.out.println("El resultado de la division es de: " + resultado);
                            break;
                        default:
                            System.out.println("\nOpcion no valida.");
                    }   //Cierre de switch(opcion) para Calculadora
                    break;
                default:       
                    System.out.println("Gracias por usarme. :D");

            }//Cierre switch(opcion)
            System.out.println("\nDeseas repetir el programa? si lo desea escriba 's'");
            letras = entrada.next().charAt(0);

        }while(letras == 's'); //Cierre de do
    
    }
}