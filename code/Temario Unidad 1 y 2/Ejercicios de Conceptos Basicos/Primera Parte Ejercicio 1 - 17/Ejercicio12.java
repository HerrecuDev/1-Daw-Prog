import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Esta lloviendo?");
        boolean estalloviendo = sc.nextBoolean();

        System.out.println("¿Tienes deberes que hacer? ");
        boolean tieneDeberes = sc.nextBoolean();

        System.out.println("¿Tienes que ir a la biblioteca?");
        boolean biblioteca = sc.nextBoolean();


        boolean IralaCalle = (biblioteca) || (estalloviendo&&tieneDeberes);
        System.out.println("¿Puedo ir a la calle? ");


        System.out.println((IralaCalle) ? "Salgo a a calle":"TE Quedas en casa");


        sc.close();










    }
}
