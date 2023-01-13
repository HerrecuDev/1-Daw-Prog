import java.util.Arrays;

public class UtilesArrayPablo 
{

    /**
     * 
     * @return
     */
    static int [] limpiar() 
    {
        int [] nuevo = new int [0];
        return nuevo;
    }

    /**
     * 
     * @param numeroElementos
     */

    static int[] rellenar(int[] arrayOriginal, int numeroElementos) 
    {
        int[] nuevo = new int[numeroElementos];
        return nuevo;
    }

    static void imprimir(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
    static int[] rellenar (int [] array, int numeroElementos, int valor)
    {
        int [] nuevo = new int [numeroElementos];

        for (int i = 0; i < nuevo.length; i++) 
        {
            nuevo[i] = valor;
        }
        return nuevo;
    }

    static int[] insertarAlPrincipio (int[] array, int elemento)
    {
        int [] nuevo = new int[array.length+1];
        nuevo[0] = elemento;
    
        return nuevo;
    }

/*
 * static int[] insertarOrdenado(int[] array, int elementoNuevo)
    {
        int [] nuevo = new int[array.length+1];

        //Encontrar en la posicion de inseccion
        int posicionInsercion = 0;

        boolean noencontradoPosicion = true;

        for (int i = 0; i < array.length; i++) 
        {
            if (elementoNuevo < ) {
                
            }

        }
    

 */
    
    

        //Insertar el nuevo valor en esa posicion en el nuevo array
        //inserto la parte izquierda del array (de 0 a posicion -1)
        //inserto el nuevo elemento 
        //inserto la parte derecha del array (de posicion al ultimo)
    }
    
    
    

