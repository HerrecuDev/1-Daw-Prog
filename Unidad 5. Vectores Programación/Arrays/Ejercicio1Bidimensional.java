import java.util.Arrays;

public class Ejercicio1Bidimensional 
{
    public static void main(String[] args) 
    {
        int fila = 5;
        int columna = 5;
        //Declarar Array Bidimensional de 5x5:
        int [][] matriz = new int [5][5];

        //Rellenar Matriz
        rellenarMatriz(matriz);
        //mostrar la matriz
        System.out.println(Arrays.deepToString(matriz));

        //mostrar la matriz pero por colummnas
        imprimirMatriz(matriz);

        System.out.println("---------------------------------------------------------");
        //Mostrar la matriz invertida
        matrizInvertida(matriz);


    }


    static void rellenarMatriz(int[][] arraybid)
    {
        //recorrer la matriz
        for (int fila = 0; fila < arraybid.length; fila++) 
        {
  
                int[]filaArray = arraybid[fila];

                for (int columna = 0; columna < filaArray.length; columna++) 
                {
                    int valorPosicion = (10*fila) + columna;
                    filaArray[columna] = valorPosicion; //arraybird [fila][columna] = valorPosicion
                }
           
        }
       
    }
    static void imprimirMatriz (int [] [] arraybid)
    {
        //recorrer la matriz
        for (int fila = 0; fila < arraybid.length; fila++) 
        {
  
                int[]filaArray = arraybid[fila];

                for (int columna = 0; columna < filaArray.length; columna++) 
                {
                    System.out.print(filaArray[columna] + " ");
                }
                System.out.println();

           
        }


    }
    static void matrizInvertida (int [] [] arraybird)
    {
          //recorrer la matriz invertida 
          for (int columna = 0; columna < arraybird[0].length; columna++) 
          {
    
                  
  
                  for (int fila = 0; fila< arraybird.length; fila++) 
                  {
                      System.out.print(arraybird[fila][columna] + " ");
                  }
                  System.out.println();
  
             
          }
    }
    
}
