import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir numero ");
        int numero = sc.nextInt();

        int restodivision = numero %2; //numero con el resto que tenemos == en comparacion con 1 y 0.
        boolean espar = (restodivision==0);
        boolean esimpar = !espar;

        System.out.println("El numero es par " + espar);
        System.out.println("El numero es impar "+ esimpar);
        String mensaje = (espar )  ? "Es par" : "Es Impar"
        System.out.println("El numero" + numero + mensaje);
        sc.close();








    }
    
}
