package Unidad5_Arrays;

import java.util.Arrays;

public class Ejercicio6 
{
    public static void main(String[] args) 
    {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) 
        {
            array[i] = (int)(Math.random()*16);
            System.out.print("[" + array[i] + "]");
            
        }

        System.out.println();


        int valorNuevo = array[0];
        
        for (int i = 0; i < array.length-1; i++) 
        {
            
            
            int valorleido = array[i+1];
            //valorNuevo = array[i+1];
            array[i+1] = valorNuevo;
            valorNuevo = valorleido;
            

        }

        array[0]= valorNuevo;


        System.out.println(Arrays.toString(array));

    }
}
