package code.ExamenArraysPractica;

import java.util.Arrays;

public class Ej1 
{
    public static void main(String[] args) 
    {
        int[] arrayOriginal = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};
        int [] NuevoArray = new int [arrayOriginal.length];
        
       
        recorrerArray(arrayOriginal);
        System.out.println("------------------------------");
        incrementamosValor(NuevoArray);
    
    
       
       
    

    }
    //Creamos otrta funcion para recorer el array
    static void recorrerArray(int [] matriz)
    {
        for (int j = 0; j < matriz.length; j++) 
        {
            System.out.print( + matriz[j] + ", " );
        }
    }


    //Creamos una funcion para encontrar el valor maximo del Array :

    static int valorMaximoArray(int [] array)
    {
        int valorMaximo = array[0];
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] > valorMaximo) 
            {
                valorMaximo = array[i];

            }
            
        }
        
        return valorMaximo;
    }

    //Creamos una funcion para recorrer el Array y buscar numero que este repetido :

    static int [] incrementamosValor(int [] array)
    { 
        //Definimos el nuevoArray
        // int [] arrayIncrementado = new int [array.length+1];
      
        //Definimos el valor maximo del Array original:
        int max = valorMaximoArray(array);
        
        for (int i = 0; i < array.length; i++) 
        {
            if ( array[i] == array[i+1])
            {
                array[i] = max +1;
            }
            else
            {
                array[i] = array[i];
            }
            
        }

        return array;
           

    }
}
