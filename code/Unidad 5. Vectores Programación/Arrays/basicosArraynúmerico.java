import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import javax.sound.midi.Soundbank;

public class basicosArraynúmerico 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) 
    {
        //Crear array de String de la posición Menú:
        //Menu 
        //-1 Limpiar (null)
        /* -2 Insertar en posicion.
         * -3 Mostrar valor en posicion
         * -4 LLenar todo el array con "cadena"
         * -5 Mostrar todo el array
         * 0 - Salir.
         */

         //Creo el Array de 10 posiciones de Cadena :
        int [] numeros = new int [10];

        boolean salir = false;


         do 
         {
          
            int opcion = menu();
            

            switch (opcion) {
                case 1:
                    limpiar(numeros);
                    break;
                case 2:
                    insertarEn(numeros);
                    break;
                case 3 :
                    mostrarValor(numeros);
                    break;
                case 4 :
                    llenarCon(numeros);
                    break;
                case 5 :
                    imprimirArray(numeros);
                    break;
                case 6 :
                    ordenar(numeros);
                    break;
                case 7 :
                    buscar(numeros, opcion);
                    break;
                case 8: 
                    buscarOrenado(numeros, opcion);
                    break;
                case 9 :
                    desordenarArray(numeros);
                    break;

                case 0 :
                    sc.close();
                    salir = true;
               
                    break;

            
                default:

                    break;
            }
            
         } while (!salir);
    }


        static int menu ()
        {
            System.out.println("1 Limpiar (null)");
            System.out.println("2 Insertar en posicion.");
            System.out.println("3 Mostrar valor en posicion");
            System.out.println("4 Llenar todo el array con");
            System.out.println("5 Mostrar todo el array");
            System.out.println("6 - ordenar");
            System.out.println("7 - buscar");
            System.out.println("8 - Buscar Ordenada");
            System.out.println("9 - Desrdenar el Array");
            System.out.println("0 - Salir.");
            System.out.println("¿Que opcion quiere Realizar?");

            int opcion = sc.nextInt();
            return opcion;
        }


        static void limpiar(int [] vector)
        {
            for (int i = 0; i < vector.length; i++) 
            {
                vector [i] = 0;
            }
        }

    
        static void insertarEn (int [] vector) 
        {
            sc.nextInt();
            System.out.println("Dime cadena que quieres insertar");
            int nuevoNumero = sc.nextInt();
         
            System.out.println("En que posicion quieres insertarlo");
            int posicion = sc.nextInt();

            

            //Dentro de los valores del rango :
            if (posicion >=0 && posicion < vector.length) 
            {
                vector [posicion] = nuevoNumero;
            }

            else 
            {
                System.out.println("FUERA DE RANGO");
            }

           
            
        }


        static void mostrarValor (int [] vector)
        {
            System.out.println("¿Que posicion quiere que se muestre?");
            int posicion = sc.nextInt();

            if (posicion >=0 && posicion < vector.length) 
            {
                System.out.println(vector[posicion]);
            }
        }


        static void llenarCon (int [] vector)
        {
            for (int aux = 0; aux < vector.length; aux++) 
            {
                vector [aux] = aux;
            }
        }


        static void imprimirArray (int [] vector)
        {
        //     //int indice = 0;

        //     for (int nuevoNumero : vector) 
        //     {
        //         System.out.println("( " + nuevoNumero + ")") ;
        //         //indice++;
                
        //     }
        System.out.println(Arrays.toString(vector));
        }
        

        static int[] ordenar (int[] array)
        {
            int [] copia = Arrays.copyOf(array,array.length);
            Arrays.sort(array);
            return array;
        }

        static int buscar (int [] array , int elementoBuscado)
        {
            int posicion = -1;
            // for(int aux = 0; aux < array.length; aux++)
            // {
            //     if (array[aux] == elementoBuscado) 
            //     {
            //         //encontrado
            //         posicion = aux;
            //     }
            // }

            int indice = 0;
           
            while (indice < array.length && posicion == -1) 
            {
                if (array[indice] == elementoBuscado) 
                {
                    posicion = indice;
                }
                else
                {
                    indice++;
                }
                
            }
            return posicion;

        }


        //Buscamos un numero en concreto partiendo desde la mitad del array , ya sea buyscando hacia arriba o hacia abajo de nuestro array completo.
        static int buscarOrenado (int [] array , int elemento)
        {
            boolean esta = false;
            int posicion = Arrays.binarySearch(array, elemento);
           
            return posicion;
        }

        static int [] desordenarArray (int [] array)
        {
           
            
            for (int i = 0; i < array.length; i++) 
            
            {
            int aleatorioVector = (int) (Math.random() * array.length);
           
            int valor = array[i];
            array[i] = array [aleatorioVector];
            array[aleatorioVector] = valor;
            }
            
            return array;

        }
    
}
