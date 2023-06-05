package Unidad5_Arrays;

public class Ejercicio4 
{
    public static void main(String[] args) 
    {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        System.out.println("ARRAY DE NUMEROS :");

        for (int i = 0; i < numero.length; i++) 
        {
            numero[i] = (int)(Math.random()*101);

            System.out.print( "|" + "[ " + numero[i] + "]"); 
        }

        System.out.println();
        for (int i = 0; i < numero.length; i++) 
        {
            cuadrado[i] = numero[i] * numero[i];
            System.out.print( "|" + "[ " + cuadrado[i] +  " ]");
        }

        System.out.println();

        for (int i = 0; i < numero.length; i++) 
        {
            cubo[i] = numero[i]*numero[i]*numero[i];
            System.out.print( "|" + "[ " + cubo[i] +  " ]");
            
        }

        
    }
    
}
