import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int patas_Hormiga = 6;
        final int patas_Aranas = 8;
        final int patas_Cochinitas = 14;
        
        
        System.out.println("¿Cuantas hormigas has capturado?");
        
        int hormigas = sc.nextInt();
        int totalpatashormiga = hormigas *patas_Hormiga;

        System.out.println("El total de patas de hormigas son " + totalpatashormiga);

        
        System.out.println("¿Cuantas Arañas has capturado?");
        
        int aranas = sc.nextInt();
        int totalpatasarana = aranas *patas_Aranas;

        System.out.println("El total de patas de arañas son " + totalpatasarana);

        
        System.out.println("¿Cuantas cochinitas has capturado?");
        
        int cochinitas = sc.nextInt();
        int totalpatascochinitas = cochinitas *patas_Cochinitas;

        System.out.println("El total de patas de cochinitas son " + totalpatascochinitas);


        sc.close();


    }
}
