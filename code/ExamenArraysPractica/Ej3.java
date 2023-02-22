package code.ExamenArraysPractica;

import java.sql.Array;
import java.util.Arrays;

import javax.lang.model.element.Element;

public class Ej3 
{
    public static void main(String[] args) 
    {
        int fila = 5;
        int elementos = 10;
        int [][] matriz = new int [elementos][fila];;
       

        imprimirFormato(matriz);
        matrizFinal(matriz, elementos);

        imprimirFormato(matriz);
        
       
    }




    static void imprimirFormato (int [][] matriz) //Creamos una Matriz de % filas con 10 elementos cada una.
    {
        for (int elemento = 0; elemento < matriz.length; elemento++) 
        {
            
            rellenamosMatriz(matriz[elemento],elemento);
           
            for (int fila = 0; fila < matriz[0].length; fila++) 
            {
                System.out.print("Fila " + (fila+1) + "||");
                
                System.out.print(" " + matriz[fila][elemento] + "\t");
            
            }
            System.out.println( "== " + sumaFilas(matriz, elemento));
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");
    }



    static void rellenamosMatriz (int [] matriz, int elemento)
    {
       int aleatorio = 0;

       switch (elemento) 
       {
        case 0:
            aleatorio = (int)(Math.random()*5);
            break;
        case 1:
            aleatorio = (int)(Math.random()*5);
            break;
        case 2:
            aleatorio = (int)(Math.random()*5);
            break;
        case 3:
            aleatorio = (int)(Math.random()*5);
            break;
        case 4:
            aleatorio = (int)(Math.random()*5);
            break;
            
       
        default:
            break;
       }
       matriz[elemento] = aleatorio;

    }


    static int sumaFilas(int [][] matriz , int suma)
    {
        int sumaDeElementos = 0;
        for (int i = 0; i < matriz[0].length; i++) 
        {
           
            for (int j = 0; j < matriz.length; j++) 
            {
                
                sumaDeElementos = sumaDeElementos + matriz[j][i];
                matriz[j][i] = 0;
            }
            
        }
        return sumaDeElementos;
    }


    static void matrizFinal(int[][]matriz, int sumatorio)
    {
       
        for (int i = 0; i < matriz.length; i++) 
        {
            
        
            int sumaTotal = 0;
            int numero0s = 0;


            for (int j = 0; j < matriz[0].length; j++) 
            {
                
                    sumaTotal = sumaTotal + matriz[i][j];
                    if (matriz[i][j] == 0)
                    {
                        numero0s ++;
                    }
        
            }

            int cantidadArepartir = (24-sumaTotal)/numero0s;


            for (int j = 0; j < matriz[0].length; j++) 
            {
                
                    if (matriz[i][j] == 0)
                    {
                        matriz[i][j] = cantidadArepartir;
                    }
        
            }



            //     if (matriz[j][i] == 0 && sumaTotal > 24) 
            //     {
            //         int resto = 24 - sumaTotal ;

            //         matriz[j][i] = resto;
            //     }

            //     else if (matriz[j][i] < 24) 
            //     {
            //         int resto = sumaTotal -24;
            //         matriz[j][i] = resto;
            //     }
            //     matriz[j][i] = 0;
            // }
            
        }
       
       

       
       
       
       
       
       
            
    }
    
}


