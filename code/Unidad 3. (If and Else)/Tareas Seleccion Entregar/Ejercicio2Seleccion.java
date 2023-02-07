import java.util.Scanner;

public class Ejercicio2Seleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanta Comida Diaria tengo ?");
        int comidadiaria = sc.nextInt();

        System.out.println("¿Cuantos animales tengo ?");
        int numeroanimales = sc.nextInt();

        System.out.println("¿Cuantos kilos de comida son necesarios x animal?");
        int kilosXanimal = sc.nextInt();

        float comidanecesaria = kilosXanimal*numeroanimales;

        String resultado = " ";


        if (comidadiaria > comidanecesaria ) {
            resultado = "SI hay comida suficente para cada animal";

        }
        else if (comidadiaria < comidanecesaria) {
            int comidaxAnimal = (comidadiaria/numeroanimales);
          
            resultado = "Se necesitarian " + comidanecesaria + " Kilos de comida Diaria para que cada animal pueda comer los kg de racion diari que necesitan. Al no tener suficente comida a cada animal le corresponde " + comidaxAnimal + "Kg";
        }
            System.out.println(resultado);
        }
    }
    

