package EjercicioBINGO;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBingoPablo 
{

    public Scanner sc = new Scanner(System.in);




    public static void main(String[] args) 
    {
        //CARTON CON VARIABLES FIJAS :
        // int [] col0 = {2,5,8};
        // int [] col1 = {12,15,18};
        // int [] col2 = {22,25,28};
        // int [] col3 = {32,35,38};
        // int [] col4 = {42,45,48};
        // int [] col5 = {52,55,58};
        // int [] col6 = {62,65,68};
        // int [] col7 = {72,75,78};
        // int [] col8 = {82,85,88};


        //CARTON CON VARIABLES AL AZAR :


        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];
        
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        int [] numerosGenerados = new int [0];


        System.out.println(Arrays.deepToString(carton));
        imprimirCarton(carton);


        //Variable para controlar si seguimos jugando otro carton o salimos del programa.
        boolean salir = true;

        do {
            //Crear/restaurar carton vacio y vaciado de los numeros generados en eljuego anterior
            
            
            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            //ponerBlancos(carton);

            //introduzco los numeros de cada columna
            for (int i = 0; i < col0.length; i++) 
            int aleatorioCol0 = (int)((Math.random()*9) +1);
            
            {
    
               
            }
            System.out.println(col0[0]);
            //rellenarNumerosCarton(carton);

            //pinto el cartón ;
            //pintarCarton(carton, numerosGenerados);

            //pregunto si quiero sacar otra bola o terminar este juego


            
            boolean jugar = false;


            while (jugar) 
            {

                //Saco numeros aleatorios


                //Pinto el carton con numeros sacados :
                
            }


            
        } while (!salir);
        
    }



    static int imprimirCarton(int[][] matriz ) //matriz[9][3]
    {
        
        //Recorremos las filas
        // for (int i = 0; i < matriz.length; i++) 
        // {
        //     for (int j = 0; j < matriz[0].length; j++) 
        //     {
        //         System.out.print(matriz[i][j] + "\t");
        //     }
        //     System.out.println();
            
        // }

            //Recorremos las columnas :
        for (int i = 0; i < matriz[0].length; i++) 
        {
            
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
            
        }

        return 0;
    }
    
}
