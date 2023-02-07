import java.util.Scanner;

public class Ejercicio7claseMATH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Primero sacamos las 3 tiradas.
        int Tirada1 = ((int)(Math.random()*6) +1 );
        System.out.println("La tirada del jugador 1 es = " + Tirada1);

        int Tirada2 = ((int) (Math.random()*6 ) +1 );
        System.out.println("La Tirada deljugador 2 es = " + Tirada2);

        int Tirada3 = ((int) (Math.random()*6 ) +1 );
        System.out.println("La Tirada deljugador 3 es = " + Tirada3);

        sc.close();
        //Para calcular la tirada Mayor de las 3 =
        int Tiradaentre = Math.max(Tirada1, Tirada2);
        int TiradaMayorTodas = Math.max(Tiradaentre, Tirada3);

        //Para calcular la tirada menor de las 3 = 
        int Tiradaentremenor = Math.min(Tirada1,Tirada2);
        int TiradaMenorTodas = Math.min(Tiradaentremenor, Tirada3);


        System.out.println("La tirada Mayor es = " + TiradaMayorTodas);
        System.out.println("La tirada menor es = " + Tiradaentremenor);



    }
    
}