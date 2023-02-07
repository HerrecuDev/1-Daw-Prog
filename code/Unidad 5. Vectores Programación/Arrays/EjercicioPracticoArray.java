import java.sql.Array;
import java.util.Scanner;
import java.util.Vector;

public class EjercicioPracticoArray 
{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
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
        String [] nombres = new String [10];

        boolean salir = false;


         do 
         {
          
            int opcion = menu();
            

            switch (opcion) {
                case 1:
                    limpiar(nombres);
                    break;
                case 2:
                    insertarEn(nombres);
                    break;
                case 3 :
                    mostrarValor(nombres);
                    break;
                case 4 :
                    llenarCon(nombres);
                    break;
                case 5 :
                    imprimirArray(nombres);
                    break;
                case 6 :
                    ordenar(nombres);
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
            System.out.println("0 - Salir.");
            System.out.println("¿Que opcion quiere Realizar?");

            int opcion = sc.nextInt();
            return opcion;
        }


        static void limpiar(String [] vector)
        {
            for (int i = 0; i < vector.length; i++) 
            {
                vector [i] = null;
            }
        }

    
        static void insertarEn (String [] vector) 
        {
            sc.nextLine();
            System.out.println("Dime cadena que quieres insertar");
            String cadenaNueva = sc.nextLine();
         
            System.out.println("En que posicion quieres insertarlo");
            int posicion = sc.nextInt();

            

            //Dentro de los valores del rango :
            if (posicion >=0 && posicion < vector.length) 
            {
                vector [posicion] = cadenaNueva;
            }

            else 
            {
                System.out.println("FUERA DE RANGO");
            }

           
            
        }


        static void mostrarValor (String [] vector)
        {
            System.out.println("¿Que posicion quiere que se muestre?");
            int posicion = sc.nextInt();

            if (posicion >=0 && posicion < vector.length) 
            {
                System.out.println(vector[posicion]);
            }
        }


        static void llenarCon (String [] vector)
        {
            for (int aux = 0; aux < vector.length; aux++) 
            {
                vector [aux] = "cadena " + aux;
            }
        }


        static void imprimirArray (String [] vector)
        {
            //int indice = 0;

            for (String cadena : vector) 
            {
                System.out.println("( " + cadena + ")") ;
                //indice++;
            }
        }

        static String[] ordenar (String[] array)
        {
            Array.sort(array);
            return array;
        }
    


}
