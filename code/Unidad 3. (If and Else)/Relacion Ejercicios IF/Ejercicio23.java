import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        
        final int IVA_NORMAL = 21;
        final int IVA_REDUCIDO = 10;
        final int IVA_SUPERREDUCIDO = 4;

        //Variables que voy a necesitar
        double baseimponible = 0;
        double ivaseleccionado = 0;
        double ImporteIva = 0;
        double precioConIva = 0;
        double descuento = 0;
        double total = 0;

        //Lectura de Datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el importe de la base");
         baseimponible = sc.nextDouble();

         System.out.println("Introduzca el tipo de IVA  (general, reducido o superreducido):");
          ivaseleccionado = sc.nextDouble().

         System.out.println("Introduzca Codigo Promocional (nopro, mitad, meno5 o 5porc):  ");
          String CodigoPromocional = sc.nextLine().toLowerCase();


          //Calculo el IVa Seleccionado.

          switch (ivaseleccionado)
          {
            case "general" :
            ivaseleccionado = IVA_NORMAL;
            break;
            case "reducido" :
            ivaseleccionado = IVA_REDUCIDO;
            break;
            case "superreducido" :
            ivaseleccionado = IVA_SUPERREDUCIDO;
            break;
          }

          switch(CodigoPromocional)
          {
            case "nopro" :
            descuento = 0;
            break;

            case "mitad" :
            descuento = baseimponible * 0.5;
            break;
            case "meno5" :
            descuento = baseimponible - 5;
            break;

            case "5porc":
            descuento = baseimponible * 0.05;
          }
          System.out.println("Base Imponible :" + baseimponible);

          System.out.println("Iva con el (10%) :" + ivaseleccionado);

          System.out.println("Precio con IVA :" + precioConIva);

          System.out.println("Descuento :" + descuento);
          System.out.println("El importe total :" + total);

    }
    }

    
    

