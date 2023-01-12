import java.util.Scanner;

/*HACER UN RECTANGULO
 * PEDIMOS ALTURA Y ANCHURA
 * 
 *      XX ALTURA = 2
 *      X X X ANCHURA = 3
 */

public class EjercicioRectanguloFOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introducir altura");
        int altura = sc.nextInt();

        System.out.println("introducir anchura");
        int anchura = sc.nextInt();

        
        
        for (int alt = 1; alt <= altura; alt++) {

           
            for (int anch = 1; anch <= anchura ; anch++) {
                System.out.print("*");
            
            }
            System.out.println(" ");
        }

    }
}
