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

        boolean salir = false;
        double ganancias = 0;
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
                
                añadirCompra(frutasArray, cantidadVendida);
                System.out.println("FRUTA = " +  Arrays.toString(frutasArray));
                System.out.println("Cantidad" + Arrays.toString(cantidadVendida));
                
                    break;
                //Modifica el precio de la fruta segun la cantidad que tenga. Pregunta por el precio y x la fruta se modfica.
                case "c":
                modificarPrecio(frutasArray, preciosArray, cantidadVendida);
                System.out.println("Frutas " + Arrays.toString(frutasArray));
                System.out.println("Cantidad" + Arrays.toString(cantidadVendida));
                System.out.println("Su precio segun la cantidad que hay es = " + Arrays.toString(preciosArray));
      
                    break;
                case "d":
                    System.out.println("De las frutas :" + Arrays.toString(frutasArray));
                    cambiosPrecios(frutasArray, cantidadVendida, preciosArray);
                    System.out.println("Los nuevos precios son :" + Arrays.toString(preciosArray));
                    break;
                case "e":
                sc.nextLine();
                System.out.println("-------Precio------" + "\n" + "----Cantidad----"+ "-----Ganancias----");
                sacarInforme(frutasArray, cantidadVendida, preciosArray, ganancias);
                System.out.println("Fruta:  " + Arrays.toString(frutasArray) + Arrays.toString(cantidadVendida) + " " + Arrays.toString(preciosArray) + " " + ganancias);
                
                    break;
                case "x":
                    salir = true;
                    System.out.println("El programa ha FINALIZADO");
                    break;
            
                default:
                
                    System.out.println("Opcion NO VALIDA");
                    break;
            }
            
            
        } while (salir !=true);
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
            if (fruta[i].equals(frutaAintroducir)) 
            {
                System.out.println("FRUTA YA INTRODUCIDA , PRUEBE CON OTRA FRUTA");
                frutaAintroducir = sc.nextLine();
            }
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
    static  void añadirCompra( String [] fruta, double [] cantidadVendida)
    {
        System.out.println("¿A Que Fruta desea modificar la cantidad vendida?");
        String frutaAñadida = sc.nextLine().toLowerCase();

        System.out.println("¿Que cantidad se ha vendido?");
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
    static void modificarPrecio(String [] fruta, double [] precio, double [] cantidad)
    {
        System.out.println("¿De que fruta desea Modificar el precio?");
        String frutaCambiarPrecio = sc.nextLine().toLowerCase();

        System.out.println("¿Cual es su nuevo Precio X UNIDAD ?");
        double precioNuevo = sc.nextDouble();

        for (int i = 0; i < fruta.length; i++) 
        {
            if (fruta[i].equals(frutaCambiarPrecio)) 
            {
                precio[i] = cantidad[i] * precioNuevo;
            }
            
        }

    }

    //4.Modifica todos los precios (Si la cantidad vendida es > media le suma al precio 0.25 si en cambio es < media le resta ala precio -0.15)

    static void cambiosPrecios(String [] fruta ,double[] cantidad , double [] precio)
    {
        double media = 0;
        double sumaCantidad = 0;
        
        for (int i = 0; i < cantidad.length; i++) 
        {
            sumaCantidad = sumaCantidad + cantidad[i];
            media = sumaCantidad/(cantidad.length);

            if (cantidad[i] >  media) 
            {
                precio[i] = precio[i] + 0.25;
            }

            else if (cantidad[i] < media)
            {
                precio[i] = precio[i] -0.15;
            }

            
            
        }


    }


    //5. Mostrar informe de todo : 

static void sacarInforme(String [] fruta, double [] cantidad, double [] precio, double ganancias)
{
    
    double cantidadFruta = 0;
    double precioFruta = 0;

    for (int i = 0; i < fruta.length; i++) 
    {
        cantidad [i] = cantidadFruta;
        precio[i] = precioFruta;
        ganancias = cantidadFruta*precioFruta;
        
    }
}
   

}
