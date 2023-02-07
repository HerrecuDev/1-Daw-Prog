import java.util.Scanner;



public class EjercicioPropuestoProfesor {
   
        /* Introduzco edades y me dice al terminar la edad maxima y minima
         * para parar de introducir numeros , introducir -1
         */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una edad ");
        int edad = sc.nextInt();

        int edadMaxima = edad;
        int edadMinima = edad;

        while (edad > -1) {
        //Conjunto de intrucciones
         if (edadMaxima <= -1 ) {
            edadMaxima = edad;
         
            
        }
        edadMinima = Math.min(edadMinima, edad);
        //Actualizar la condicion
        System.out.println("introduce otra edad");
        edad = sc.nextInt();
    }

    if (edadMaxima <=-1) {
        System.out.println("no has metido ninguna edad valida");
    }
        else 
        {
        System.out.println("La edad maxima es " + edadMaxima);
        System.out.println("La edad minima es " + edadMinima);
                                                                }
       sc.close();
    }
    
}
