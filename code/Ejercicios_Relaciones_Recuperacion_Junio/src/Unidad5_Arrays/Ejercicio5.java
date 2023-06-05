package Unidad5_Arrays;

public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        int[] listaNumeros = new int[10];

        for (int i = 0; i < listaNumeros.length; i++) 
        {
            listaNumeros[i] = ((int)(Math.random()*51) -30);
            System.out.print("[" + listaNumeros[i] + "]");
        }
        
    }
    
}
