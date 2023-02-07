import java.util.Scanner;
/* En los bucles FOR siempre inicializamos el contador a 0, (int contador = 0;condicion<10;contador++).
 * Despues ponemos una condicion por ejemplo condicion < 10 y siempre sele pone un acumulador(contador++), Para
 * que se nos actualice nuestro contador.
 */
public class BucleFORejercicio {
    public static void main(String[] args) {
        //Escribe 10 veces "Hola"
        Scanner sc = new Scanner(System.in);
        int longitud = 10;

        for (int aux = 0; aux < longitud; aux++) {
            System.out.println("Hola" + aux);
        }
        for (int aux = longitud; aux >0 ; aux--) {
            System.out.println( "Adios " + aux);
        }

        //De 2 en 2 =
        for (int aux = 0; aux < longitud; aux+=2) {
            System.out.println("Hola " + aux);
        }
    }
    
}
