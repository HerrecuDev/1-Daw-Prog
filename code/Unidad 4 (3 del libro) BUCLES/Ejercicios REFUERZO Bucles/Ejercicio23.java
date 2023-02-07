import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int acumulador = 0;
        int contador = 0;
        int numeroMaximo, numeroMinimo;
        
        System.out.println("Introducir numero");
        int numero = (int)(Math.random()*1000);

        acumulador = numero;
        contador++;

        numeroMaximo = numero;
        numeroMinimo = numero;





        while ( acumulador <= 10000) {

            System.out.println("Introducir otro numero");
            numero = (int)(Math.random() * 1000);
           
            acumulador = acumulador + numero;
           
            contador++;

            System.out.println("La suma es = " + acumulador);

           

            
        }

       

        System.out.println("La suma total de los numeros introducidos es = " + acumulador );
        System.out.println("El total de numeros introducidos = " + contador);

        float media = acumulador /contador;

        System.out.println("La media total es = " + media);








    }
    
}
