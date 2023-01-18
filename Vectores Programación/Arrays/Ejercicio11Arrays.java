import java.util.Arrays;

public class Ejercicio11Arrays
{
    public static void main(String[] args) 
    {
        //Crear array Inicial:
        int [] matriz = new int [10];

        //Rellenar el Array inicial:
        rellenarConAleatorio(matriz);

        //Mostrar el Array:
        System.out.println(Arrays.toString(matriz));

        //Buscar los primos:
        //int[]primosArray = buscarPrimo(matriz);

        //Buscar los NO primos:
        //int[]noPimosArray = buscarNoPrimo(matriz);
        //Unir primos + NO PRIMOS:

        //Mosrar el Array Resultante:

        
    }

    static void rellenarConAleatorio(int [] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int) (Math.random() *16);
            array[i] = aleatorio;
        }
    }
    /*
     *  static int[] buscarPrimo(int[]array)
    {
        int[]nuevo = new int[0];
        for (int i = 0; i < array.length; i++) 
        {
            if (funcionesDeclaradas.BibliotecaNumeros.esPrimo (array[i]) == true) 
            {
                nuevo = UtilesArrayPablo
            }
            
        }
     */
   





    }