import java.util.Scanner;
/* Genera un nº del 1 al 100
 * pide un numero
 * Dice -Acierto - Fin
 * MAyor / Menor -> vuelve a pedir un numero.
 * 
 * 
*/


public class EjercicioNumeroSereto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int numeroAdivinar = (int) (Math.random()*100 +1);
       
        System.out.println("Introducir un numero");
            int NumeroIntroducido = sc.nextInt();

            while (NumeroIntroducido != -1 && NumeroIntroducido != numeroAdivinar) {
                
                if (NumeroIntroducido > numeroAdivinar) {

                    System.out.println(" EL NUMERO  es Mayor");
                }
                else{
                    System.out.println("EL NUMERO  es menor");
                }
               
                //Actualizamos la condicion 
            System.out.println("Introducir un numero");
                NumeroIntroducido = sc.nextInt();
            }

            if (NumeroIntroducido == numeroAdivinar) {
                System.out.println("HAS GANADO");
            }
            else if(NumeroIntroducido == -1) {
                System.out.println("ME RINDO");
            }

    }
    
}
