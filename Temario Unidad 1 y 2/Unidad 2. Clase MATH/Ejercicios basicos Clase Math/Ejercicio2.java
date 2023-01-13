import java.util.Base64;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir base");
        double base = sc.nextDouble();

        System.out.println("Introducir exponente");
        double exponente = sc.nextDouble();
        sc.close();

       double Resultado = Math.pow(base, exponente);
       System.out.println("Resultado de " + base + " elevado a " + exponente + " es " + Resultado );




    }
    
}
