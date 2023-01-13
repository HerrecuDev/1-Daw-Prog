import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Numeros de segundos?.");
        int segundos = sc.nextInt();

        float minutos = (int)Math.ceil(segundos/60f);
        System.out.println("El numero de minutos es " + (minutos));
        sc.close();
    }
    
}
