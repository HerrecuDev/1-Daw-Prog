import java.util.Scanner;

//Tres jugadores tiran un dado ( 1 al 6) , 
//Muestra la tirada de cada uno de ellos,y
//y quien ha sacado el numero mayor

public class EjercicioClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aleatorio1 = ((int) (Math.random() *6 + 1));
        System.out.println("Tirada 1 =  " + aleatorio1 );


        int aleatorio2 = ((int) (Math.random() * 6 + 1));
        System.out.println("Tirada 2 =  " + aleatorio2);
       
       
        int aleatorio3 = ((int) (Math.random() * 6 + 1));
        System.out.println("tirada 3 =  " + aleatorio3);



        

        int ResutadoMaximo = Math.max(aleatorio1,aleatorio2);
        System.out.println("Maximo es  " + Math.max(ResutadoMaximo, aleatorio3));


       //int ResultadoMaximo2 = Math.max ((aleatorio3), Math.max(aleatorio1, aleatorio1)); //2º da forma de realizar elvalor maximo.
        //System.out.println("tirada maxima es " + ResultadoMaximo2);

        int ResultadoMinimo = Math.min(aleatorio1, aleatorio2);
        System.out.println("Minimo es " + Math.min(ResultadoMinimo, aleatorio3));
        
    }
    
}
