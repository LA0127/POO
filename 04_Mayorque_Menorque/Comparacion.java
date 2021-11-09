import java.util.Scanner;
class Comparacion{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int A, B, C;
        System.out.println("Ingresa el número A: ");
        A = entrada.nextInt();
                System.out.println("Ingresa el número B: ");
        B = entrada.nextInt();
                    System.out.println("Ingresa el número C: ");
        C = entrada.nextInt();
        if (A == B && B == C){
            System.out.println("Los tres numeros son iguales.");
        } else if (A > B && A > C){
            System.out.println("A = "+A+ " es el mayor de los tres. ");
        } else if (B > A && B>C){
            System.out.println("B = "+ B + " es el mayor de los tres. ");
        } else {
            System.out.println("C = "+C+ " es el mayor de los tres. ");
        }
    }
}