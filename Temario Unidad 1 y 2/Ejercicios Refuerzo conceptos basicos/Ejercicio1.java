import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Primer Numero");
        float num1 = sc.nextFloat();
        System.out.println("Introduzca Segundo Numero");
        float num2 = sc.nextFloat();


    
        float resultadomultiplicacion = ((num1)*(num2));
        System.out.println("La Multilicacion es " + resultadomultiplicacion);




        sc.close();
    }
}