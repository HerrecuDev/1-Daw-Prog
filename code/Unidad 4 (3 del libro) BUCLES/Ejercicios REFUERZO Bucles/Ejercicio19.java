import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        /*Realiza un programa que pinte una piramide por pantalla */
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introducir altura de la piramide");
    int altura = sc.nextInt();
    
    sc.nextLine();

    System.out.println("Introducir Caracter para pintar la piramide");
    String caracter = sc.nextLine();
/* */
    //Pintamos cada una de las Filas:

        for (int Altura_Actual = 1; Altura_Actual <= altura; Altura_Actual++) {
           //Pongo los espacion en blanco de la Linea:
           //Cada Linea tiene altura - alturaActual de espacios en blanco.
           for (int blancos  = 1; blancos <= altura - Altura_Actual; blancos++) {
            System.out.print("_");
            
           }
           //Pongo los asteriscos de Cada Linea :

           for (int relleno = 1; relleno <= (Altura_Actual*2) -1; relleno++) {
            System.out.print(caracter);
           }
           System.out.println();

        }
       
    }
    
}
