import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero para Leerlo del reves.");
        int numero = sc.nextInt();
        int n = 0 ;
        int invertido = 0 , 
        resto = 0;

        if (numero < 10) {
            System.out.println("El numero introducido debe tener al menos 2 digitos");
            System.exit(0);
            
        }
        
       

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido *10 + resto;
            numero /= 10;
            
        }
        System.out.println(invertido);
        sc.close();
    }
    
}
