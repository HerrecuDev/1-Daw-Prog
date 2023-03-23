package code.Unidad_Colecciones.EjerciciosListasyColecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2Colecciones 
{
    public static void main(String[] args) 
    {

        ArrayList<Integer> listadoNumeros = new ArrayList<>();
        
        int resultado = 0;

        //Creamos los 100 numeros aleatorios :
        for (int i = 0; i < 100; i++) 
        {
            resultado = (int)(Math.random()*11);
            listadoNumeros.add(resultado);
            
        }
        System.out.println(listadoNumeros);
        System.out.println("El tamaño total del listado incluyendo el numero 5 es = " + listadoNumeros.size());
        System.out.println("-----------------------------------------");

        for (int i = 0; i < listadoNumeros.size(); i++) 
        {
            if (listadoNumeros.get(i) == 5) 
            {
                listadoNumeros.remove(i);
            }
            
        }
        System.out.println("Lista con los numeros 5 Borrados " + listadoNumeros);
        System.out.println("El tamaño total del listado si BORRAMOS el numero 5 es = " + listadoNumeros.size());
        

        //Borramos los 4 con iterator : 

        Iterator<Integer> Borramoslos4 = listadoNumeros.iterator();
        while (Borramoslos4.hasNext()) 
        {
            Integer numero = Borramoslos4.next();

            if (numero == 4) 
            {
                Borramoslos4.remove();
            }
        }

        System.out.println("\n " + listadoNumeros);

        System.out.println("Tamaño = " + listadoNumeros.size());
    }
    
}
