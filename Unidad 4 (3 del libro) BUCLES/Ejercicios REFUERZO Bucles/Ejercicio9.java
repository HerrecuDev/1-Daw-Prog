import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir numero");
        int numero = sc.nextInt();

        int NumeroDigitos = 1;
        int Numerodivision = numero/10;

        while (Numerodivision>0) {
           
            NumeroDigitos++;
            Numerodivision = Numerodivision/10;
        }
        System.out.println( "El numero = " + numero + " Tiene " + NumeroDigitos + " Digitos");
    }
    
}
