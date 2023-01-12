import java.util.Scanner;

public class EjercicioPracticaFORmultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introducir n para calcular sus multiplos de 7");
        int n = sc.nextInt();
        int limite = 50;
        

        for (int num = 7; num < limite; num+=7) {
            System.out.println("Multiplos de 7 = "  + num);
        }

    }
    
}
