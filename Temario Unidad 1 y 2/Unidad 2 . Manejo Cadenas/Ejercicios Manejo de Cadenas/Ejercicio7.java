import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("DIme un Caracter");
        char caracter = sc.next().charAt(0);
        sc.close();

        System.out.println("¿Es digito? " + Character.isDigit(caracter));
        System.out.println("¿Es un espacio en blanco? " + Character.isSpaceChar(caracter));
        System.out.println("¿Esta en Mayuscula? " + Character.isUpperCase(caracter));


    }
    
}
