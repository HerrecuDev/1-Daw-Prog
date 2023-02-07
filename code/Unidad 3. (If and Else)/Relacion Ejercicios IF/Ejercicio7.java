import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir nota1");
        float nota1 = sc.nextFloat();

        System.out.println("Introducir nota2");
        float nota2 = sc.nextFloat();

        System.out.println("Introducir nota3");
        float nota3 = sc.nextFloat();

        float notaMEdia = (nota1 + nota2 +nota3)/3;
        System.out.println("La nota Media es " + notaMEdia);

    }
    
}
