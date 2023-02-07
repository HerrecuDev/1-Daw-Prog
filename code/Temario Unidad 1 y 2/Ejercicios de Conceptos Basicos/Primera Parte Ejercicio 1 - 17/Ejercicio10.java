import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Horas trabajadas esta semana ");
        float horastrabajadas = sc.nextFloat();

        float salarioxsemana = 12*horastrabajadas;
        System.out.println(" Tu salario semanal seria " + salarioxsemana);



    }
    
}
