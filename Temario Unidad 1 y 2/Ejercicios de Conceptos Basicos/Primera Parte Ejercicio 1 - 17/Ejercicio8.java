import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("¿Tienes Dinero para ir de vacaciones?");
        boolean tienesdinero = sc.nextBoolean();
        
        
        System.out.println("¿Tengo reserva?");
        boolean tienesreserva = sc.nextBoolean();

        
        System.out.println("¿Tengo pasaporte en regla?");
        boolean tienespasporte = sc.nextBoolean();

        boolean voyVacaciones = (tienesdinero) || (tienesreserva&&tienespasporte);

        System.out.println("¿Vas de vcaciones? " + voyVacaciones);
        
        // Traducir bien las condicones del enunciado del ejercicio 8.
        //Donde voy
        // playa = true
        // montaña = false


        System.out.println("Hijo1 ¿playa o montaña? playa-true / montaña-false");
        boolean Hijo1 = sc.nextBoolean();


        System.out.println(" Hijo2 ¿playa o montaña? playa-true / montaña-false ");
        boolean Hijo2 = sc.nextBoolean();

        System.out.println(" Hijo3 ¿playa o montaña? playa-true / montaña-false ");
        boolean Hijo3 = sc.nextBoolean();


        boolean voyalamontana = (Hijo1 && Hijo2 && Hijo3);
        System.out.println("¿Voy a la montaña? " + voyalamontana);

        


        System.out.println("¿Voy a la playa? " + !voyalamontana);
        
        // ! comando para declarar la NEGACION DE VOYALAMONTAÑA. AL PONER ! HACEMOS LA NEGACION DE  voyalaMontaña.

        sc.close();




        


        



         

        
    }
}
