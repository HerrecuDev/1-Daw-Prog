package code.ExamenArraysPractica;

import java.util.Scanner;

public class Ej2 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Creamos los 3 Arrays :
        String[] frutasArray = new String [0];
        double[] preciosArray = new double [0];
        double[] cantidadVendida= new double [0];

        boolean salir = true;
        do 
        {
            String opcion = menu();

            switch (opcion) 
            {
                case "a":
                    
                    break;
                case "b":
      
                    break;
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
            
            
        } while (!true);
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

   // static

}
