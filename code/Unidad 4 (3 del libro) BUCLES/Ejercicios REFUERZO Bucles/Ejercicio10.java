import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero");
        float numero = sc.nextInt();


        float contador = 0;
        float acumulador = 0;
        

        while (numero>0) {
            acumulador = acumulador + numero;
            contador++;

            System.out.println("Introduce otro numero");
            numero = sc.nextInt();
            
        }
       System.out.println("Ha terminado de introducir los datos");
       float media = acumulador/contador;
       System.out.println("La media de todos los numeros introducidos es = " + media);


    }
    }
    

