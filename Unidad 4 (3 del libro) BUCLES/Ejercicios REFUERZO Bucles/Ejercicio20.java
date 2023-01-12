import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introducir altura de la piramide");
        int altura = sc.nextInt();
        
        sc.nextLine();

        System.out.println("Introducir Caracter para pintar la piramide");
        String caracter = sc.nextLine();

        for (int a = 0; altura < a ; a++) {
            for (int h = 0; a < altura; h++) {
                System.out.print(" ");
                
            }
            System.out.println(caracter);
            
        }
        
    }
    
}
