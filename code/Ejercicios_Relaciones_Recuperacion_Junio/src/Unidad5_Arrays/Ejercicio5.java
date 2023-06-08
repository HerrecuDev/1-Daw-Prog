package Unidad5_Arrays;

public class Ejercicio5 
{
    public static void main(String[] args) 
    {
        int[] listaNumeros = new int[10];
        int maximo = listaNumeros[0];
        int minimo = listaNumeros[0];

        for (int i = 0; i < listaNumeros.length; i++) 
        {
            listaNumeros[i] = (int)((Math.random()*40) -20);
           
           
           if (listaNumeros[i] > maximo) 
           {
                maximo = listaNumeros[i];
               
           }
          
           if (listaNumeros[i] < minimo) 
           {
                minimo = listaNumeros[i];
              
           }

          
            System.out.println("[" +  listaNumeros[i] + "]");
           
         
            
        }
        System.out.println();

        System.out.println("El numero mayor es = " + maximo);
        System.out.println("El numero menor es = " + minimo);
        
        
    }
    
}
