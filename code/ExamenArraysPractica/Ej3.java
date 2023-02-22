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
        for (int fila = 0; fila < matriz[0].length; fila++) 
        {
            System.out.print("Fila " + (fila+1) + "||");
           
           
            for (int elemento = 0; elemento < matriz.length; elemento++) 
            {
              
                rellenamosMatriz(matriz[elemento], fila, elemento);
                System.out.print(" " + matriz[elemento][fila] + "\t");
            
            }
            System.out.println( "== " + sumaFilas(matriz, fila));
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");
    }



    static void rellenamosMatriz (int [] matriz, int fila, int elemento)
    {
       int aleatorio = 0;

       switch (fila) 
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
       matriz[fila] = aleatorio;

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
        
        int sumaTotal = 0;


        for (int i = 0; i < matriz[0].length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                sumaTotal = sumaTotal + matriz[j][i];
                

                if (matriz[j][i] == 0 && sumaTotal > 24) 
                {
                    int resto = 24 - sumaTotal ;

                    matriz[j][i] = resto;
                }

                else if (matriz[j][i] < 24) 
                {
                    int resto = sumaTotal -24;
                    matriz[j][i] = resto;
                }
                matriz[j][i] = 0;
            }
            
        }
       
       

       
       
       
       
       
       
            
    }
    
}


