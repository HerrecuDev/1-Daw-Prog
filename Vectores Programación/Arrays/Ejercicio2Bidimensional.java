import java.util.Arrays;

public class Ejercicio2Bidimensional 
{
    public static void main(String[] args) 
    {
        //valor generico que le damos a cada fila y columna para que sea una matriz magica
        int valor = 4;
        //Declaramos la matriz
        int[][] matriz = new int[4][4];
        //Rellenamos la matriz
        rellenarMatriz(matriz);
        //Mostrar la matriz
        imprimirMatriz(matriz);
        //imprimir(matriz);

        //esMAgica
        esMagica(matriz);

        
    }

    static void rellenarMatriz(int [][] arraybid)
    {
        for (int fila = 0; fila < arraybid[0].length; fila++) 
        {
            for (int columna = 0; columna < arraybid.length; columna++) 
            {
                int aleatorios = (int)(Math.random()*15);
                arraybid[fila][columna] = aleatorios;
            }
        }

    }
    static void imprimirMatriz(int [][]arraybid)
    {
        //recorrer la matriz
        for (int fila = 0; fila < arraybid.length; fila++) 
        {
  
                int[]filaArray = arraybid[fila];
                int sumaFila = 0;
                for (int columna = 0; columna < filaArray.length; columna++) 
                {
                    System.out.print(filaArray[columna] + "\t ");
                    sumaFila += filaArray[columna];
                }
                System.out.println("suma total = " + sumaFila);

           
        }
        System.out.println("----------------------------------------------------------");
        int total = 0;
        //calculo el total de cada columna
        for (int colummnas = 0; colummnas < arraybid[0].length; colummnas++) 
        {
            int sumaColumna = 0;
            for (int fila = 0; fila < arraybid.length; fila++) 
            {
                sumaColumna+= arraybid[fila][colummnas];
            }
            total += sumaColumna;
            System.out.print(sumaColumna + "\t");
            
        }
        System.out.println(total);

    }
    static boolean esMagica (int[][] arraybid)
    {
        boolean resultado = true;
        int valorCheck = 0;
        //comprobamos la suma de las filas
        int sumafila = 0;

        for (int i = 0; i < arraybid.length; i++) 
        {
            int [] fila = arraybid[i];
            for (int j = 0; j < fila.length; j++) 
            {
                sumafila+= fila[j];
                
            }
            if (i==0) 
            {
                valorCheck = sumafila;
            }
            else
            {
                resultado= (resultado && (valorCheck==sumafila));
            }
            
        }
        //Comprobamos la suma de las columnas
        for (int i = 0; i < arraybid[0].length; i++) 
        {
            int sumaColumna = 0;
            for (int j = 0; j < arraybid.length; j++) 
            {
                sumaColumna+= arraybid[j][i];
            }
            resultado = resultado && (valorCheck==sumaColumna);
            
        }
        return resultado;
    }

}
