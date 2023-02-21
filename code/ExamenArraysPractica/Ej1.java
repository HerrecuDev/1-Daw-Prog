package code.ExamenArraysPractica;

import java.util.Arrays;

public class Ej1 
{
    public static void main(String[] args) 
    {
        int[] arrayOriginal = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};
        int [] NuevoArray = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        
       System.out.println(Arrays.toString(NuevoArray));
    //buscarRepetido(arrayOriginal, NuevoArray);
        System.out.println("------------------------------");

        //System.out.println(Arrays.toString(NuevoArray));
        recorrerArray(arrayOriginal);
        System.out.println("------------------------------");
        buscarRepetido(arrayOriginal, NuevoArray);
        System.out.println(Arrays.toString(NuevoArray));

        
       
        
        
        
       
       
    

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

    static void buscarRepetido ( int [] array, int [] matrizFinal)
    {   
        int max = valorMaximoArray(array);

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 1; j < matrizFinal.length; j++) 
            {
                if (array[i] == matrizFinal[j]) 
                {
                    matrizFinal[j] = max +1;
                }

                
            }
            
        }

        

        
    }
    

    
}
