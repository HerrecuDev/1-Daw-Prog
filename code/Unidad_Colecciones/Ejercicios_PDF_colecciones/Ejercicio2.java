package code.Unidad_Colecciones.Ejercicios_PDF_colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        int cantidadNumeros = (int)(Math.random()*11 +10);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < cantidadNumeros; i++) 
        {
            listaNumeros.add((int)(Math.random()*101));
        }
        System.out.println(listaNumeros);

        System.out.println("El minimo es = " + min(listaNumeros));
        
    }

    public static int suma(ArrayList<Integer>lista)
    {
        int total = 0;
        for (Integer numer : lista) 
        {
            
        }
    }
}
