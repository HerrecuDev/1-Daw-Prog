import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("DIme un Caracter");
        char caracter = sc.next().charAt(0);
        sc.close();

        int CaracterInt = Integer.valueOf(caracter);
        System.out.println("Con interget.valueoff = " + CaracterInt);

        //int caracterInt2 = (int)caracter;
        //System.out.println("Con (int) caracter = " + CaracterInt);

       
        boolean esDigito = (caracter >= 48)&& (caracter<= 57);
        boolean esEspacio = (caracter == 32);
        boolean esMayuscula = (caracter >=65) && (caracter<=90);
        System.out.println(caracter + " es digito:" +  esDigito);
        System.out.println(caracter + " es Espacio"  + esEspacio);
        System.out.println(caracter + " es Mayuscula"  + esMayuscula);

        
        




    }
    
}
