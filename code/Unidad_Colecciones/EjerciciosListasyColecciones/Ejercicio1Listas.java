package code.Unidad_Colecciones.EjerciciosListasyColecciones;

import java.util.ArrayList;

public class Ejercicio1Listas 
{
    public static void main(String[] args) 
    {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        //Creamos los 20 numeros Aleatorios :

        for (int i = 0; i < 20; i++) 
        {
            int numAleatorio = (int)(Math.random()*11);

            listaNumeros.add(numAleatorio);

            
        }
        System.out.println(listaNumeros);

        

        






    }
    
}
