package code.Unidad_Colecciones;

import java.util.Arrays;

public class MetodoEstatico 
{
    public static void main(String[] args) 
    {
        String [] trozos = {};

        trozos = insertar (trozos , "cadena1");
        trozos = insertar (trozos , "trozo2");

        System.out.println(Arrays.toString(trozos));


        Integer [] numeros = {};

        numeros = insertar(numeros, 5);
        numeros = insertar(numeros, 8);
        numeros = insertar(numeros, 10);

        System.out.println(Arrays.toString(numeros));
        
    }

    public static <T> T[] insertar(T[] array , T nuevoElemento)
    {
       // T[]nuevoArray = new T [array.length+1] (ERROr no se puede hacer esto), Debemos realizar un :

      T[] nuevoArray =  Arrays.copyOf(array, array.length+1);

      nuevoArray[nuevoArray.length-1] = nuevoElemento;

      return nuevoArray;
    }
    
}
