package code.ExamenArraysPractica;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Ej2 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Creamos los 3 Arrays :
        String[] frutasArray = new String [0];
        double[] preciosArray = new double [0];
        double[] cantidadVendida = new double [0];

        boolean salir = true;
        do 
        {
            String opcion = menu();

            switch (opcion) 
            {
                //Añadimos la Fruta con precio 1 y cantidad 0.
                case "a":
                    frutasArray = insertarFruta(frutasArray);
                    preciosArray = insertarPrecio(preciosArray);
                    cantidadVendida = insertarCantidad(cantidadVendida);
                    System.out.println("FRUTA = " +  Arrays.toString(frutasArray));
                    System.out.println("Precio X Unidad " +  Arrays.toString(preciosArray));
                    System.out.println("Cantidad Vendida " + Arrays.toString(cantidadVendida));
                    break;
                //Añadimos una compra Realizada , buscando la fruta y modificando su cantidad.
                case "b":
                
                cantidadVendida = añadirCompra(cantidadVendida);
                System.out.println(Arrays.toString(cantidadVendida));
                    break;
                //Modifica el precio de la fruta segun la cantidad que tenga. Pregunta por el precio y x la fruta se modfica.
                case "c":
      
                    break;
                case "d":
      
                    break;
                case "e":
      
                    break;
            
                default:
                
                    System.out.println("Opcion NO VALIDA");
                    break;
            }
            
            
        } while (salir !=false);
    }
    




    static String menu()
    {
        System.out.println("a - Insertar fruta");
        System.out.println("b - Añadir compra");
        System.out.println("c - modificar precio fruta");
        System.out.println("d - Modificar todos los precios");
        System.out.println("e - mostrar informe");
        System.out.println("x - salir");
        System.out.println("---------------------------------------------");
        System.out.println(" Indique opción...");
        System.out.println();
        String opcion = sc.nextLine();

        return opcion;

    }
    //1. Insertamos la fruta , precio 1 y cantidad 0 en los Arrays correspondientes.
    static String [] insertarFruta(String [] fruta)
    {
        //Preguntamos que fruta queremos introducir :
        System.out.println("¿Que fruta quiere introducir?");
        String frutaAintroducir = sc.nextLine().toLowerCase();

        //Creamos un nuevoArray para introducir las frutas :
        String [] nuevoArray = new String [ fruta.length+1];

        for (int i = 0; i < fruta.length; i++) 
        {
            nuevoArray [i] = fruta[i];
        }
          //Añade en la ultima posiicon del array el nuevo valor
          nuevoArray[nuevoArray.length-1] = frutaAintroducir;
          return nuevoArray;

    }

    static double [] insertarPrecio ( double [] precio)
    {   
        int precioFruta = 1;

        double [] nuevoArray = new double[precio.length+1];
        for (int i = 0; i < precio.length; i++) 
        {
            nuevoArray[i] = precioFruta;
        }

        nuevoArray[nuevoArray.length-1] = precioFruta;

        return nuevoArray;
        
    }

    static double [] insertarCantidad (double [] cantidad)
    {
        int cantidadFruta = 0;

        double [] nuevoArray = new double[cantidad.length+1];
        for (int i = 0; i < cantidad.length; i++) 
        {
            nuevoArray[i] = cantidadFruta;
        }

        nuevoArray[nuevoArray.length-1] = cantidadFruta;

        return nuevoArray;
    }

    //2.Modifica la cantidad en el Array cantidad Vendida de la fruta que le indiquemos que hemos comprado :
    static void añadirCompra( String [] fruta, double [] cantidadVendida)
    {
        System.out.println("¿Que Fruta desea añadir a la compra?");
        String frutaAñadida = sc.nextLine().toLowerCase();

        System.out.println("¿Que cantidad ha vendido?");
        double cantidad = sc.nextDouble();

    

       for (int i = 0; i < fruta.length; i++) 
       {
        if (fruta[i].equals(frutaAñadida)) 
        {
            cantidadVendida[i] += cantidad;
        }
        
       }

    }
    //3. Modifica el precio de la fruta calculandolo segun la cantidad que se le ha pasado. Pregunta  x la Fruta y precio que tendria.
    static double [] ModificarPRecio(double [] precio)
    {
        System.out.println("¿De que fruta desea Modificar el precio?");
        String fruta = sc.nextLine().toLowerCase();

        System.out.println("¿Cual es su nuevo Precio?");
        double precioNuevo = sc.nextDouble();

    }

    //4.Modifica todos los precios (Si la cantidad vendida es > media le suma al precio 0.25 si en cambio es < media le resta ala precio -0.15)

    static void cambiosPrecios(double [] cantidad , double [] precio)
    {

    }


    //5. Mostrar informe de todo : 


   

}