import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir Nombre Atacante");
        String nombreAtacante = sc.nextLine();

        System.out.println("Introducir Nombre Defensor");
        String nombreDefensorString = sc.nextLine();


        System.out.println("¿Porcentaje de acierto de 2 del jugador Atacante ? ");
        int porcentajedeAciertode2 = sc.nextInt();

        System.out.println("¿Porcentaje de acierto de 3 del jugador Atacante ? ");
        int porcentajedeAciertode3 = sc.nextInt();


        System.out.println("¿Numero de veces que el jugador defensor logra que el atacante falle");
        int eficaciaDefensa = sc.nextInt();

        System.out.println("¿Desde donde tira el jugador atacante?");
        int FormaTirar = sc.nextInt();



         double NumeroalAzarAtaque = Math.random();
         System.out.println("El numero de ataques es = " + NumeroalAzarAtaque);

         double numeroAlAzarDefensa = Math.random();
         System.out.println("El numero de defensa es = " + numeroAlAzarDefensa);



         //Forma 1 Bruta
        boolean mete2 = (Math.random()* porcentajedeAciertode2) > (Math.random()* numeroAlAzarDefensa*10);
        boolean mete3 = (Math.random()* porcentajedeAciertode3) > (Math.random()* numeroAlAzarDefensa*10);
        System.out.println("El jugador 1 sobre el jugador 2 " + mete2 );
        System.out.println("El jugador 1 sobre el jugador 2 " + mete3 );


        //Forma 2 Elegante
        int porcentajeAtaque  = (FormaTirar==2) ? porcentajedeAciertode2: porcentajedeAciertode3;
        

        double fuerzaAtaque = Math.random() * porcentajeAtaque;
        double fuerzaDefensa = Math.random() * numeroAlAzarDefensa;

        boolean meteTiro = (fuerzaAtaque) > (fuerzaDefensa);

        String haMetidoTiro = (meteTiro) ? " ha encestado " : " no ha encestado";
        System.out.println(" El jugador " + nombreAtacante + haMetidoTiro + " de " + FormaTirar +
        " sobre eljugador " + nombreDefensorString + fuerzaDefensa);




    }
}
