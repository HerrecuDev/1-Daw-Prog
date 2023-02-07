import java.util.Scanner;

public class Ejercicio8 {
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

        if (notaMEdia < 5)
        {
            System.out.println("INSUFICIENTE");
        }
        else if (notaMEdia >= 5 && notaMEdia < 6)
        {
            System.out.println("SUFICIENTE");
        }
        else if (notaMEdia > 6 && notaMEdia <=7)
        {
            System.out.println("BIEN");
        }
        else if (notaMEdia > 7 && notaMEdia<=9)
        {
            System.out.println("NOTABLE");
        }
        else if (notaMEdia>9 && notaMEdia<=10)
        {
            System.out.println("SOBRESALIENTE");
        }

    }
    
}
