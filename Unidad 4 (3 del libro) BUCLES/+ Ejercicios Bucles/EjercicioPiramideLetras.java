import java.util.Scanner;

public class EjercicioPiramideLetras 
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    char CaracterInicio = 'A';

    int Altura = 0;


    System.out.println("Introducir Altura de la Piramide Recuerda que no puede ser Mayor de 25.");
     Altura = sc.nextInt();
    
    
    
    for (int i = 0; i < Altura; i++) 
    {
        for (int caracter = 0; caracter <= i; caracter++) 
        {
             char caracterPrimero = CaracterInicio;
            System.out.println(caracterPrimero);
        }
        System.out.println();
    char CaracterNuevo = (char)((int)CaracterInicio +i);    
    System.out.print(CaracterNuevo);    
    }
    
}    
}
