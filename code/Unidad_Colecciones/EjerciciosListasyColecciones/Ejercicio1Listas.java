package code.Unidad_Colecciones.EjerciciosListasyColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.logging.Handler;

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

        //Mostramos la lista :
        System.out.println(listaNumeros);

        //Mostramos los numeros que estan en la lista:
        System.out.println("-------------------HASHET------------------");

        HashSet<Integer> numeroSinrepetir = new HashSet<>(listaNumeros);
        System.out.println(numeroSinrepetir);

        //Conjunto con los numeros repetidos :
        HashSet<Integer> conjuntoRepetidos = new HashSet<>();
        HashSet<Integer> conjunto1Aparicion = new HashSet<>();

       for (int i = 0; i < listaNumeros.size(); i++) 
       {
        int numeroLeido = listaNumeros.get(i);

        if (!conjuntoRepetidos.contains(numeroLeido) && !conjunto1Aparicion.contains(numeroLeido)) 
        {
            conjunto1Aparicion.add(numeroLeido);
        }

        else
        {
            conjuntoRepetidos.add(numeroLeido);
            conjunto1Aparicion.remove(numeroLeido);
            
        }


        
       }
       System.out.println("Conjuntos Repetidos " + conjuntoRepetidos);
       System.out.println("Conjuntos Aparecen 1 vez = " + conjunto1Aparicion);

     
    }
    
}
