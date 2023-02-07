import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        final int numeroCombinacion = 2156;
        Scanner sc = new Scanner(System.in);
        //RALIZADO POR EL PROFESOR.
        boolean encontrado = false;
        int numeroIntentos = 4;

        do {
            System.out.println("Introduce la clave , Tienes " + numeroIntentos + " Intentos");
            int NumroIntroducido = sc.nextInt();
            
            encontrado = (NumroIntroducido) == numeroCombinacion;
            if (!encontrado) {
                numeroIntentos--;
            }
            
        } while (!encontrado && (numeroIntentos >= 1));
        if (encontrado) {
            System.out.println("BIEN");
        }
        else{
            System.out.println("NO TIENES MAS INTENTOS");
        }
       

       










/* while (numeroIntentos >= 1 && numeroIntentos <=4) {
            
            
            if (numero != numeroCombinacion) {
                System.out.println("Lo siento esa no es la combinacion, Intentelo de nuevo");
                
                System.out.println("Introducir combinacion de la caja fuerte");
                numero = sc.nextInt();

                numeroIntentos++;
                
            }
            
            
           
            
           
          
        }
        if (numero == numeroCombinacion) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            
        }
        else {
            System.out.println("No dispones de mas intentos");
        }  
 * 
 */

            
       
       
       
        
    }
}