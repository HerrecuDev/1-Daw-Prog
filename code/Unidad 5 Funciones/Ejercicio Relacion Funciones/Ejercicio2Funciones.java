import java.util.Scanner;

public class Ejercicio2Funciones 
{
public static void main(String[] args) 
{   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introducir numero");
    int numero = sc.nextInt();
    boolean resultado = BibliotecaNumeros.esPrimo(numero);

    if (resultado) 
    {
        System.out.println("Es primo");
    }
    else 
    {
        System.out.println("no es Primo");
    }
    System.out.println(resultado);
}
}