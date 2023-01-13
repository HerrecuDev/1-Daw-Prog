import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir Texto");
        String texto = sc.nextLine();

        System.out.println("Introducir Posicion");
        int posicion = sc.nextInt();
        sc.close();

        String ParteIzquierda = texto.substring(0,posicion);
        System.out.println(ParteIzquierda);

        String ParteDerecha = texto.substring(posicion);

        System.out.println(" La pate de la Izquierda es " + ParteIzquierda + " La Parte Derecha es " + ParteDerecha);
        
    }
    
}
