import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Ejercicio15Arrays 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Declararel Array :
        int [] mesas = new int [10];
        //Rellena el array
        rellenarMesas(mesas);
        //pintar mesas
        imprimir(mesas);
        boolean salir = false;
        //Bucle para introducir personas -1 para salir
        do 
        {
            //preguntar por la cantidad de personas
            System.out.println("¿cuantos son? (-1 para salir)");
            int cantidad = sc.nextInt();

            //Actualizamos la variable de salida
            salir = (cantidad == -1);

            if (cantidad == -1) 
            {
                salir = true;
            }
            else if (cantidad > 4) 
            {
                System.out.println("No puede haber grupos mayores de 4");
            }
            else
            {
                //Introducir personas en el array
               int numeroMesaVacia = buscarPrimeraMesaVacia(mesas);

               if (numeroMesaVacia >= 0) 
               {
                    mesas[numeroMesaVacia] = cantidad;
                    System.out.println("Sientensen en la mesa " + (numeroMesaVacia + 1));
               }
               else 
               {
                    //no hay mesas vacias
                    //hay que compartir
                    numeroMesaVacia = buscarMesaParaCompartir(mesas , cantidad);
                

                    if (numeroMesaVacia >= 0) 
                    {
                        System.out.println("Tiene que compartir.Sientese en la mesa " + (numeroMesaVacia +1));
                        mesas[numeroMesaVacia] = mesas[numeroMesaVacia] + cantidad;

                    }
                    else 
                    {
                        System.out.println("No hay hueco para usted vuelva otro dia");
                    }
                }

            }
        } while (salir);
        

        //Imprimir total de Comensales:
        imprimirTotalComensales(mesas);
        
    }
    

    static void imprimir (int [] mesas)
    {
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.println("│Mesa no │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ 10 │"); 
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤"); 
        System.out.println("│Ocupación│" + cadenaOcupantes(mesas)); 
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
        System.out.println("");

    }

    static String cadenaOcupantes (int[] array)
    {
        String cadenaResultado = "";
        for (int i = 0; i < array.length; i++) 
        {
            int ocupacionMesa = array[i];
            cadenaResultado += " " + ocupacionMesa + "  |";
        }
        return cadenaResultado;
    }
    static void rellenarMesas (int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int) (Math.random()*5);
            array[i] = aleatorio;
        }
    }

    static int buscarPrimeraMesaVacia (int [] array)
    {
        boolean noEncontrada = true;
        int mesaVacia = -1;

        for (int i = 0; i < array.length; i++) 
        {
            if (array [i] == 0 && noEncontrada) 
            {
                mesaVacia = i;
                noEncontrada = false;
            }
            
        }
        return mesaVacia;
    }

    static int buscarMesaParaCompartir(int[] array, int numPersonas)
    {
        int mesaparacompartir = -1;
        boolean noEcontrada = true;

        for (int i = 0; i < array.length; i++) 
        {
            if (array [i] + numPersonas <= 4 && noEcontrada) 
            {
                mesaparacompartir = i;
                noEcontrada = false;
                

            }
            
        }
        return mesaparacompartir;
    }
    static void imprimirTotalComensales (int[] array)
    {
        int totalcomensales = 0;
        for (int i = 0; i < array.length; i++) 
        {
            totalcomensales += array[i];
        }
        System.out.println("Total de comenales = " + totalcomensales);
    }
}
