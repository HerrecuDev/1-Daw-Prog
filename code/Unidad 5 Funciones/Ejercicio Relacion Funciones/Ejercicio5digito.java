import java.util.Scanner;

public class Ejercicio5digito 
{
    public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);

        int contadordigitos = 0;

        System.out.println("Introducir numero");
        long numero = sc.nextLong();


        long resultado = BibliotecaNumeros.digito(numero);

        System.out.println(resultado);


        
    }
}
