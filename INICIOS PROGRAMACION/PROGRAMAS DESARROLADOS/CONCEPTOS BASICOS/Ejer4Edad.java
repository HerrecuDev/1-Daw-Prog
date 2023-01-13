import java.util.Scanner;

public class Ejer4Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce Tu ano de Nacimiento");
        int anoNacimiento = sc.nextInt();
        System.out.println("Introduce ano atual");
        int anoactual = sc.nextInt();

        int edadActual = (anoactual - anoNacimiento);

        System.out.println("Su edad Actual es " + edadActual);
        sc.close();


    }
    
}
