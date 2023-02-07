import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir n (Altura) que tendra la piramide");
        int altura = sc.nextInt();

        for (int alt = 1; alt <= altura; alt++) {

            for (int espacio =  1; espacio <= altura - alt; espacio++) 
            {
                System.out.print(" ");
                
            }
            //Pintamos la Parte izquierda:

            for (int i = 1; i <= alt; i++) {
                System.out.print(i);
            }

            //Ahora intentamos Pintar la Parte de la Derecha de la piramide:
            for (int d = alt - 1; d >= 1; d--) {
                System.out.print(d);
            }

            
            System.out.println();
        }

        
    
}
}
