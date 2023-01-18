import java.util.Arrays;

public class EjemploBidimensionalVectores 
{
    public static void main(String[] args) 
    {
        int filas = 3;
        int columnas = 4;
        //Declarar array bidimensional
        int[][] matriz;
        matriz = new int[filas][columnas];


        //insertar un valor en la matriz pos : fila: 1 / columna : 3
        matriz [1][3] = 10;
        System.out.println(Arrays.deepToString(matriz));

        imprimirMatriz(matriz);


        //Array TRIDIMENSIONAL : 
        int [][][] matrizTriple = new int [3][4][2];
        System.out.println(Arrays.deepToString(matrizTriple));
    }


    static void imprimirMatriz (int[][] arrayBid)
    {
        for (int i = 0; i < arrayBid.length; i++) 
        {
            //arraybird.length Es igual al numero de filas.
            //Recorro cada una de las filas
            System.out.println("Fila " + i);

            //Po cada fila recorro sus columnas
            int [] fila = arrayBid[i];
            for (int j = 0; j < fila.length; j++) 
            {
                System.out.print(fila[j] + " |");
            }
            //Al terminar de recrer los elementos de la columna : hago un salto de linea
            System.out.println();
        }
    }

}
