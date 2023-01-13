import java.util.Scanner;

public class EjercicioSofware2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir nombre del Atacante");
        String jugador1 = sc.nextLine();
        System.out.println("introducir Nombre de jugador Defensor");
        String jugador2 = sc.nextLine();

        System.out.println("Decir porcentaje de acieto de 2 y de 3 del jugador atacante");
        int aciertoDE2 = sc.nextInt();
        int aciertoDE3 = sc.nextInt();

        System.out.println("Decir numero de veces que el jugador atacante falla gracias al defensa");
        int VecesfallaAtacante = (int)(Math.random()+1);
        System.out.println("numero de veces que falla el atacante = " + VecesfallaAtacante);


        System.out.println("¿Jugador atacante decide tirar de ?");
        int TiroDesde = sc.nextInt();

        int NumeroalAzarAtaque = (int)(Math.random()*50 +1);
        System.out.println("numero al azar ataque = " + NumeroalAzarAtaque);

        int NumeroalAzarDefensa = (int)(Math.random()*50 +1);
        System.out.println("numero al azar Defensa = " + NumeroalAzarDefensa);

        sc.close();





        //Para saber si Mete canasta o no =
        boolean formulaParaSaberSiEsCAnastaDE2 = ((int)(Math.random()*50 +1) * aciertoDE2 ) >((int)(Math.random()*50 +1)* VecesfallaAtacante*10);
        System.out.println(" El jugador " + jugador1 + "  ha encestado de 2 sobre " + jugador2 + " " + formulaParaSaberSiEsCAnastaDE2);


        boolean formulaParaSaberSiEsCAnastaDE3 = ((int)(Math.random()*50 +1) * aciertoDE3 ) >( (int)(Math.random()*50 +1)* VecesfallaAtacante*10);
        System.out.println(" El jugador " + jugador1 + " ha encestado de 3 sobre " + jugador2 + " " + formulaParaSaberSiEsCAnastaDE3);



    }
    
}
