import java.util.Arrays;

public class Ejercicio4practicoArray1D 
{
    public static void main(String[] args) 
    {
        //Definimos los Arrays :
        int[] numero = new int [20];
        int[] cuadrado = new int [20];
        int[] cubo = new int [20];

        //Creamos el Array con aleatorios:
       rellenarAleatorio(numero);

       //Imprimimos el Array con los numeros exponeciales:
        rellenarConExponente(cuadrado, numero, 2);
        //Imprimimos array con el cubo
        rellenarConExponente(cubo, numero, 3);

        //Devolvemos el array completo :
        imprimimosArray(numero, cuadrado, cubo);
    }


    static void rellenarAleatorio (int[] array)
    {
        for (int i = 0; i < 20; i++) 
        {
            int aleatorio = (int)(Math.random()*101);
            array[i] = aleatorio;
            
        }
        
    }

    static void rellenarConExponente(int[] arrayDestino, int[] arrayOrigen, int exponente )
    {
        for (int i = 0; i < arrayOrigen.length; i++) 
        {
            int numero = arrayOrigen[i];
            int nuevoValor = (int)(Math.pow(arrayOrigen[i], exponente));
            arrayDestino[i] = nuevoValor;
            
        }
       
       
    }


    static void imprimimosArray (int[] array1, int[] array2, int[] array3)
    {
        for (int i = 0; i < array1.length; i++) 
        {
            System.out.println(array1[i] + "\t" + array2[i] + "\t" + array3[i]);
            
        }
    }
    
}
