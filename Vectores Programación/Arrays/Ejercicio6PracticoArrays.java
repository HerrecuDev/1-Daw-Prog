import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio6PracticoArrays 
{
    public static void main(String[] args) 
    {
        int [] numeros = new int [15];

        //Imprimimos los numeros aleatoriamente :
        rellenarAleatoriamente(numeros);
        rotarXveces(numeros, 2);
        rotarArray(numeros);

        System.out.println(Arrays.toString(numeros));
    }


    /**
     * 
     * @param matriz
     */
    static void rellenarAleatoriamente(int [] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            int aleatorio = (int)(Math.random()*21);
            matriz[i] = aleatorio;
            //System.out.print("{" + matriz[i] + "}");
        }
       

    }


/**
 * 
 * @param matriz
 * @param numRotaciones
 */
    static void rotarXveces (int[] matriz , int numRotaciones)
    {
        for (int i = 0; i < numRotaciones; i++) 
        {
           rotarArray(matriz);
            
        }
    }

    /**
     * 
     * @param array
     */
    static void rotarArray(int[] array)
    {
        int [] copia = Arrays.copyOfRange(array, 0, array.length);
        for (int i = 0; i < array.length; i++) 
        {
            if (i < array.length-1) 
            {
                array[i+1] = copia[i];
            }
            else//Caso de la ultima posicion el valor esta en 14.
            {
                array[0] = copia[i];
            }
            
        }
    }
    
}
