import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PESETAS = 166.38f;

        System.out.println("Introducir cantidad en euros");
        float euro = sc.nextFloat();

        float conversion = ((euro)*(PESETAS));
        System.out.println("En pesetas son " + conversion);


        sc.close();
    }
    
}
