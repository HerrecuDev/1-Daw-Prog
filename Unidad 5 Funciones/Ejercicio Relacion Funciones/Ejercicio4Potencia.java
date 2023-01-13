import java.util.Scanner;

public class Ejercicio4Potencia 
{
    public static void main(String[] args) 
    {   Scanner sc =  new Scanner(System.in);

        System.out.println("Introducir numero");
        long numero = sc.nextLong();

        System.out.println("Introudicr exponente");
        long exponente = sc.nextLong();


        long resultado = BibliotecaNumeros.potencia(numero , exponente);

        System.out.println(resultado);
    }
    
}
