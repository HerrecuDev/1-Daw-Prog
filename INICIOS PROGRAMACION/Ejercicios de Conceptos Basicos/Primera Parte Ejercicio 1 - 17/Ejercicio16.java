import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        final float precioInfantil = 15.50f;
        final float precioAdulto = 20f;
        final float DESCUENTO = 0.05f;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas entradas infantiles son? ");
        int entradaInfantil = sc.nextInt();

        System.out.println("¿Cuantas entradas adultas son?");
        int entradaAdulto = sc.nextInt();

        float preciototal = (entradaAdulto*precioAdulto) + (entradaInfantil*precioInfantil);
        //PRIMERA OPCION DE APLICAR DESCUENTO
        //preciototal = (preciototal > 100) ? preciototal - preciototal *DESCUENTO : preciototal;
        
        //SeGUNDA OPCION DE REALIZARLO
        float descuento = (preciototal>100) ? preciototal*DESCUENTO: 0;
        preciototal = preciototal - descuento;
        System.out.println("El precio total es " + preciototal+ " TE AHORRAS " + descuento);
        sc.close();


    

        
    }
}
