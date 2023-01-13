import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero decimal es ");
        float num1 = sc.nextFloat();

        System.out.println("Segundo numero decimal es ");
        float num2 = sc.nextFloat();

        float resultadoMultiplicacion = (num1) *(num2);

        System.out.println("El resultado es " + resultadoMultiplicacion)  ;
        sc.close();
    }
}
