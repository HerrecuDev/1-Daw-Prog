package EjercicioBINGO;

import java.security.AllPermission;
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


        //System.out.println(Arrays.deepToString(carton));
        
        
       


        //Variable para controlar si seguimos jugando otro carton o salimos del programa.
        boolean salir = true;

        do {

            

            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            //ponerBlancos(carton);

            System.out.println("------------------------------------------------------------------------");

            //introduzco los numeros de cada columna
            generarCarton(carton);
            System.out.println("------------------------------------------------------------------------");
            System.out.println(Arrays.deepToString(carton));

            //Generamos el carton vacio
            imprimirCarton(carton);
            System.out.println("------------------------------------------------------------------------");

            //Generamos el carton completo con los valores ordenados :
            
            // generarCarton(carton);
            ponerBlancos(carton);
            

          


            
            boolean jugar = false;


            while (jugar) 
            {

                //Saco numeros aleatorios
                


                //Pinto el carton con numeros sacados :
                
            }


            
        } while (!salir);
        
    }


    static void imprimirCarton (int [][]matriz)
    {
        for (int i = 0; i < matriz[0].length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
            
        }
       
    }


    

    static void generarCarton(int[][] matriz ) //matriz[9][3]
    {
        for (int columna = 0; columna < matriz.length; columna++) 
        {
            
            
            for (int fila = 0; fila < matriz[columna].length; fila++) 
            {
                
                generarAleaorio(matriz[columna], columna, fila);
               
                
                
            }
        ordenarCarton(matriz, columna);
        ponerBlancos(matriz);
       
        }
        
        
    }

    /**
     * Genera los valores aleatorios de cada columna y los intoduce en el carton
     * @param matriz
     */
    static void generarAleaorio (int [] array , int columna, int fila)
    {
       
                int posicion = 0;
        
                int aleatorio = 0;

                boolean ok = false;
                

                while (!ok)
                {

                    switch (columna) {
                        case 0:
                            aleatorio = (int)((Math.random()*9) +1);
                            break;
                        case 1 :
                            aleatorio = (int)((Math.random()*9) +10);
                            break;
                        case 2 :
                            aleatorio = (int)((Math.random()*9) +20);
                            break;
                        case 3 :
                            aleatorio = (int)((Math.random()*9) +30);
                            break;
                        case 4 :
                            aleatorio = (int)((Math.random()*9) +40);
                            break;
                        case 5 :
                            aleatorio = (int)((Math.random()*9) +50);
                            break;
                        case 6 :
                            aleatorio = (int)((Math.random()*9) +60);
                            break;
                        case 7 :
                            aleatorio = (int)((Math.random()*9) +70);
                            break;
                        case 8 :
                            aleatorio = (int)((Math.random()*9) +80);
                            break;
                        default:
                            break;
                    }

                    ok = esValorCorrecto(array, aleatorio);
                    
                    
                }
            
                array[fila]  = aleatorio;
                
               
               
            
            
    
    
    }

    static boolean esValorCorrecto(int [] array, int aleatorio)
    {
        boolean resultado = true;
        
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] == aleatorio)
            {
                resultado = false;
            }
            
            

        }




        return resultado;
    }

    static void ordenarCarton (int[][] array , int fila)
    {
        Arrays.sort(array[fila]);
    }

    static void ponerBlancos (int [][] matriz)
    {
        int blancosInsertados = 0;
        
        
            for (int columna = 0; columna < matriz[0].length; columna++) //por cada fila busco 4 blancos
            {
                while (blancosInsertados < 5) 
                {
                
                    int aleatorioBlancos = (int) (Math.random()*9);
                    //Recorre los 9 digitos de cada fila:
                    
                    //si esta ya blanco esa posicion busco otra nueva
                    //si no guardo -1 en esa posiicion
                    if (matriz[aleatorioBlancos][columna] != -1) //&& numeroBlancosColumna(matriz[aleatorioBlancos] < 2))
                    {
                        matriz[aleatorioBlancos][columna] = -1;
                        blancosInsertados++;
                    }
                    
                }
            
                
            
            }

        
    }
}
   

