import java.text.BreakIterator;
import java.util.Scanner;

public class Ejercicio1Seleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("¿Cual es el Aforo Maximo del local?");
        int AforoMAximo = sc.nextInt();
        float PorcientoAforominimo = (AforoMAximo*(0.2f));
        float mitadAfro = (AforoMAximo*(0.5f));


        System.out.println("¿Precio de la entrada?");
        int PrecioEntrada  = sc.nextInt();

        System.out.println("¿Cuantas entradas se han vendido?");
        int NumeroEntradasVendidas = sc.nextInt();
        String resultado = "";

        if (NumeroEntradasVendidas < PorcientoAforominimo ) {
            resultado = "SE CANCELA EL CONCIERTO";
        }
            
        else if ((NumeroEntradasVendidas < mitadAfro) && (NumeroEntradasVendidas > PorcientoAforominimo)) {
            float descuento = PrecioEntrada * (0.25f);
            resultado = "Se aplica un 25% de Descuennto = " + descuento;
        }
        else {
            resultado = "Precio de la entrada no obtiene descuento =  " + PrecioEntrada;
        }
        System.out.println(resultado);
           

        
            
            
           
        }
    }
      