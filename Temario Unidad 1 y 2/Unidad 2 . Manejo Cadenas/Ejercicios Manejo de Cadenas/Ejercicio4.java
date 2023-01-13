import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introducir Texto");
        String texto = sc.nextLine();

    System.out.println("Indica un caracter");
    char caracterBuscado = sc.nextLine().charAt(0);
    System.out.println("Introducir siguiente caracter");
    char caracterNuevo = sc.nextLine().charAt(0);
    sc.close();

    String textoModificado = texto.replace(caracterBuscado,caracterNuevo);
    System.out.println(textoModificado);





    }
    
}
