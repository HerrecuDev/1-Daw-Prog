public class Ejercicio3Bidimensional 
{
    public static void main(String[] args) 
    {
        int filas = 4;
        int colummnas = 5;
        //declarar la matriz
        int[][] matriz = new int[4][5];

        //rellenar la matriz
        rellenarMatriz(matriz);

        //pintar la matriz
        imprimirMatriz(matriz);

   

        //Pintar numero Columnas y filas
        //imprimirGeneral(matriz, filas, colummnas);

        
    }



    static void rellenarMatriz(int[][] arraybid)
    {
        for (int fila = 0; fila < arraybid.length; fila++) 
        {
            for (int columna = 0; columna < arraybid[0].length; columna++) 
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

    
    


}
