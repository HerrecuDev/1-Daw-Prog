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


        System.out.println(Arrays.deepToString(carton));
        imprimirCarton(carton);


        //Variable para controlar si seguimos jugando otro carton o salimos del programa.
        boolean salir = true;

        do {
          


            
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

            
        // int aleatorio = 0;
        // for (int i = 0; i < matriz[0].length; i++) 
        // {
            
        //     int [] fila = matriz[i];
           
            
        //     for (int j = 0; j < fila.length; j++) 
        //     {
        //         aleatorio = (int)((Math.random()*89) + 1);
        //         matriz [j][i] = aleatorio;
               
        //         System.out.print(matriz[j][i] + "\t");
                
        //     }
        //     System.out.println();
            
        // }
        
        
        //Recorremos las columnas :
        int aleatorio = 0;
        for (int i = 0; i < matriz[0].length; i++) 
        {
            
            
            for (int j = 0; j < matriz.length; j++) 
            {
                int [] position = matriz[j];
                int BlancoAzar = (int)(Math.random()*3);
               for (int lugar = 0; lugar < position.length; lugar++) 
               {
                if (lugar == BlancoAzar) 
                {
                    System.out.print("¬");
                
                
                
                    switch (j) {
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
                }
                
               

                
                
            }
               
                matriz[j][i] = aleatorio;
                
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
            
        }

        return 0;
    }

    static void imprimirBlancos (int [] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            
        }
    }
    
}
