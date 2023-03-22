package code.Unidad_Colecciones.EjerciciosListasyColecciones;

import java.util.ArrayList;

public class Ejercicio2Colecciones 
{
    public static void main(String[] args) 
    {

        ArrayList<Integer> listadoNumeros = new ArrayList<>();
        
        int resultado = 0;

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
        System.out.println(listadoNumeros);
        System.out.println("El tamaño total del listado si BORRAMOS el numero 5 es = " + listadoNumeros.size());
        
    }
    
}
