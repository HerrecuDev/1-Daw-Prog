import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float Numero_Pi = 3.14f;

        System.out.println("valor de r es ");
        float r = sc.nextFloat();

        System.out.println("valor de h es ");
        float h = sc.nextFloat();

        float volumenCono = (0.33f * Numero_Pi)* ((r*r)) * (h);
        System.out.println("El Volumen del Cono es " + volumenCono);

        sc.close();
    }
}
