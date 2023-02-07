import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un Texto");
        String cadena = sc.nextLine();
        
        
        System.out.println("Dime un numero");
        int posicion = sc.nextInt();
        sc.close();

        //Comprobamos que la posicion es valida
        //boolean posicionvalida = posicion<=cadena.length () -1

        boolean posicionValida = posicion<cadena.length();
        char caracterBuscado = ((posicionValida)) ? cadena.charAt(posicion): ' ';
        
        String MensajeError = "Error. La posicion no es valida";

        
        
        System.out.println((posicionValida)? " El texto introducido es " + cadena + " La posicion valida es " + caracterBuscado: MensajeError);
    }
    
}
