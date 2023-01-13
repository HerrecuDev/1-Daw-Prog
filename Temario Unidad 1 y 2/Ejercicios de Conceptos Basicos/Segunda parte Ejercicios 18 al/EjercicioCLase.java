import java.lang.StackWalker.Option;
import java.util.Scanner;

public class EjercicioCLase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.println(option);

        System.out.println("Indique un caracter");

        char option = sc.next().charAt(0); // SACAR CHARACTER EN POSICION

        System.out.println(" indique un numero");
        int num1 = sc.nextInt();
        System.out.println("indique otro numero");
        int num2 = sc.nextInt();

        int resultadoSuma = num1 + num2;
        String cadenasMostradas = ((char) num1 + "-" + (char) num2);
        System.out.println("El resultado es " + (option == 's' ? (resultadoSuma) : (cadenasMostradas)));
        





        sc.close();





    }
    
}



/*Leer de teclado un caracter 
 * Si es la "s" , entonces sumo 2 valores enteros
 * 
 * Si no es"s" entonces muestro los caracteres con esos codigos ASCII 
 * 
 * 
 */