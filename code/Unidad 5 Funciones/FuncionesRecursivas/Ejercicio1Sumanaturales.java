import java.util.Scanner;

public class Ejercicio1Sumanaturales 
{
        public static void main(String[] args) 
        { Scanner sc = new Scanner(System.in);


            
            //Funciones suma recursiva
            int resultadosuma = sumaNaturales(10);
            System.out.println("Resultado suma = " + resultadosuma);
        
        
            //Funcion Factorial de un numero:
            int resultadoFactorial = factorial(10);
            System.out.println("Resultado factorial = " + resultadoFactorial);

            //Ejercicio 3 : figura
           int altura = 4;
           figura(altura);

           //Ejercicio 4 :
           String cadena = "la vaca lola esta loca de la cabeza";
           String[] palabras = cadena.split(" ");
           System.out.println(recorreArray(palabras));



    
    
        
        }
    
    
    
    
        static  int sumaNaturales (int numero)
        {
            //caso base :
            if (numero == 1) 
            {
                return 1;
            }
            // Llamada a si misma :
            else 
            {
                return numero + sumaNaturales(numero -1);
            }
        
        }
    
        static int factorial (int n)
        {
            //Caso base
            if (n == 1) 
            {
                return 1;
            }
            else
            {
                return n *factorial(n-1);
            }
        
        }

        //Ejercicio 3 :
        static void figura (int altura)
        {
            if (altura > 1) //Llamada recursiva
            {
                pintarfila(altura);
                System.out.println();
                figura(altura-1);
            }
            else //Caso base:
            {
                System.out.println("*");
            }
            
        }
        static void pintarfila (int numero)
        {
            if (numero == 0) //Caso base
            {
                System.out.print(" ");
                
            }
            else // Caso recursiva
            {
                System.out.print("*");
                pintarfila(numero -1);
            }
        }

        //Ejercicio 4:

        static String recorreArray (String [] lista)
        {
            String resultado = "";
            int posicion = lista.length;
            resultado = recorreArray(lista, posicion-1);
            recorreArray(lista);
            return resultado;
        }
        static String recorreArray (String [] lista, int posicion )
        {
            String resultado = "";
            if (posicion == 0) //Caso base
            {
                resultado = lista(posicion);
            }
            else //Llamada recursiva
            {
                resultado = recorreArray(lista, posicion -1) + "\n" + lista(posicion);
            }
        }
    }


