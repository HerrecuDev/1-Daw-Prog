package Unidad5_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) 
        {
            System.out.println("¿Que numero quiere introducir en la posicion " + i + "?");
            numero[i] = sc.nextInt();

            
        }

        System.out.println(Arrays.toString(numero));

        System.out.println(" ARRAY recorrido de forma INVERSA");
        for (int i = numero.length-1; i >=0; i--) 
        {
            System.out.print("[" + numero[i] + "]");
            
        }
        



        
    }
    
}
