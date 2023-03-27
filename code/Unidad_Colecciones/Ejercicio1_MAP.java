package code.Unidad_Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1_MAP 
{
    public static Scanner sc = new Scanner(System.in);

    // 1 - Insertar Prodcuto (cantidad = 0)
    // 2 - Borrar Producto.
    // 3- Cambiar Stock.
    // 4 - Mostrar Informacion.
    // 5 - Salir.

    public static void main(String[] args) 
    {
       
        boolean salir = false;

        do 
        {

            //Creacion e inicializacion de Atributos del ejercicio:
            HashMap<Integer , String> existencias = new HashMap<>();

            //Impresion de menu y tomar la opcion del usuario : 
            
           int opcion = menu();
          


            switch (opcion) 
            {
                //Insertar Producto:
                case 1:
                    System.out.println("Dime el codigo del producto");
                    String codigo = sc.nextLine().toUpperCase();
                    insertarNuevoProducto(codigo, existencias);
                    break;
                //Borrar Producto :
                case 2 :
                borrarProducto(existencias);

                    break;
                //Cambiar Stock :
                case 3 :
                    System.out.println("Indica el codigo");
                    codigo =  sc.nextLine().toUpperCase();
                    if (!existencias.containsKey(codigo)) 
                    {
                        System.out.println("Dime la nueva cantidad");
                        int nuevaCantidad = sc.nextInt();
                        modificarStock(existencias);
                        int antigua = existencias.put(nuevaCantidad, codigo)
                        System.out.println(antigua);
                        
                    }
                    else
                    {
                        System.out.println("El codigo introducido no esta registrado en el STOCK");
                    }

                    break;
                //Mostrar Informacion
                case 4 :
                System.out.println(existencias);

                    break;
                // Salir.
                case 0 :
                    salir = false;
                    break;
                default :
                    System.out.println("Opcion no Valida");
                    break;

            }
            
        } while (!salir);


    }

    public static int menu()
    {
         //Creamos el Menu : 
         System.out.println("--------------------EXISTENCIAS-----------------------");
         System.out.println("1 - Insertar Prodcuto");
         System.out.println("2 - Borrar Producto");
         System.out.println("3 - Cambiar Stock");
         System.out.println("4 - Mostrar Informacion");
         System.out.println("5 - Mostrar Informacion Ordenada por Cantidad");
         System.out.println("0 - SALIR");

         System.out.println("¿Que opcion desea Realizar?");
         int opcion = sc.nextInt();
         sc.nextLine(); //Limpiamos el Buffer.

         return opcion;
    }

    public static void insertarNuevoProducto(String codigo ,  HashMap<Integer , String> existencias)
    {
        if (!existencias.containsKey(codigo)) 
        {
            existencias.put(0,codigo);
        }
        else
        {
            System.out.println( "Ya existe el producto " + codigo );
        }
        

    }

    public static void borrarProducto (HashMap<Integer , String> existencias)
    {
        System.out.println("Introduzca el código del producto");
        String codigo = sc.nextLine().toUpperCase();

        if (existencias.containsKey(codigo)) 
        {
            existencias.remove(codigo);
        }
        else
        {
            System.out.println("No existe el codigo del producto Buscado.");
        }

    }

    public static void modificarStock(HashMap<Integer , String> existencias)
    {

    }

    public static void ordenarPorCantidad(HashMap<Integer , String> existencias)
    {
        //Odenamos la salida del producto por la cantidad que tienen : 
        existencias.values();


    }



    
}
