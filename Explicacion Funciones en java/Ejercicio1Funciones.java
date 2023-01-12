import java.util.Scanner;

public class Ejercicio1Funciones 
{
    public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero");
        int numero = sc.nextInt();

        boolean resulado = UtilesParaNumeros.esCapicua(numero);

        if(resulado)
        {
            System.out.println("ES capicuo");
        }
        else 
        {
            System.out.println("No es capico");
        }
        System.out.println(resulado);
    }
    
}
