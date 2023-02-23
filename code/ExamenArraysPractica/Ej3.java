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

        matrizFinal(matriz);

        imprimirFormato(matriz);

        System.out.println("Tal como se puede apreciar en la segunda Matriz que imprimo no logro covertir los 0 en numeros para que el TOTAL = 24");
        
       
    }




    static void imprimirFormato (int [][] matriz) //Creamos una Matriz de 5 filas con 10 elementos cada una.
    {
        for (int fila = 0; fila < matriz[0].length; fila++) 
        {
            System.out.print("Fila " + (fila +1) + "||  ");

            for (int elementos = 0; elementos < matriz.length; elementos++) 
            {
                rellenamosMatriz(matriz[elementos], fila);
                System.out.print(matriz[elementos][fila] + "\t");
                
            }
            System.out.println( " == " + sumaFilas(matriz));
           System.out.println();
            
        }
        System.out.println("-------------------------------------------------------------------");
    }



    static void rellenamosMatriz (int [] matriz, int fila)
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


    static int sumaFilas(int [][] matriz)
    {
        int sumaDeElementos = 0;
        for (int i = 0; i < matriz.length; i++) 
        {
           
            for (int j = 0; j < matriz[0].length; j++) 
            {
                
                sumaDeElementos = sumaDeElementos + matriz[i][j];
                matriz[i][j] = 0;
                
            }
           
            
        }
        return sumaDeElementos;
    }


    static void matrizFinal(int[][]matriz)
    {
       

        for (int i = 0; i < matriz[0].length; i++) 
        {
                
            
        
            int sumaTotal = 0;
            int numero0s = 0;
            int cantidadArepartir = 0;


            for (int j = 0; j < matriz.length; j++) 
            {
                
                    sumaTotal = sumaTotal + matriz[j][i];
                   
                    if (matriz[j][i] == 0)
                    {
                        numero0s++;
                    }
                    
        
            }

            for (int k = 0; k < matriz.length; k++) 
            {
                sumaTotal = sumaTotal + matriz[k][i];
                    if (matriz[k][i] == 0)
                    {
                        numero0s++;
                        
                    }
                  
            }
            cantidadArepartir = (24-sumaTotal)/numero0s;
            

        }
    
    }
}


