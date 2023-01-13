import java.util.Scanner;

import javax.sound.sampled.Line;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Eres usuario Vip?");
        boolean eresvip = sc.nextBoolean();

        System.out.println("¿Tienes las cuotas al dia?");
        boolean cuotasAldia = sc.nextBoolean();

        System.out.println("¿Estas recomendado por alguien vip?");
        boolean recomendado = sc.nextBoolean();
        System.out.println("¿Estas en elperiodo de prueba?");
        boolean pruebaVip = sc.nextBoolean();

       
        boolean vipSi = (eresvip)&&(cuotasAldia) || (recomendado)&&(pruebaVip);
        
        String mensaje = ( vipSi ) ? " Si es Vip":" FUERA DE AQUI NO ERES Vip";

        
        System.out.println("¿Es usuario VIP? " + vipSi +  mensaje);

        



    

        sc.close();




    }
    
}
