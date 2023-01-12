import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio6Array 
{
    public static void main(String[] args) 
    {
        int [] numero =  new int [15];
        rellenarAleatorio(numero);
        rotarXveces(numero, 3);
        rotarArray(numero);

        System.out.println(Arrays.toString(numero));
       





    }


    
    /**
     * 
     * @param array
     * 
     * 
     */
    static void rellenarAleatorio (int [] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)(Math.random() * 101);
            array[i] = aleatorio;
        }
    }


    /**
     * 
     * @param array
     * @param numeroRotaciones
     */
    static void rotarXveces ( int [] array , int numeroRotaciones)
    {
        for (int i = 0; i < numeroRotaciones; i++) 
        {
            rotarArray(array);
        }
    }



    /**
     * 
     * @param array
     */
    static void rotarArray ( int [] array)
    {
        int [] copia = Arrays.copyOfRange(array, 0, array.length);
        
        
        for (int i = 0; i < array.length; i++) 
        {
            if (i < array.length -1) //caso base
            {
                array [i +1] = copia [i];
            }
            else //caso de la ultima posicion (el valor que esta en 14)
            {
                array[0] = copia[i];
            }

        }
    }
    
}
