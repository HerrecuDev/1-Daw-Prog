import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir dia de la semana");
        String DiadelaSemana = sc.nextLine().toLowerCase();

        switch (DiadelaSemana)
        {
            case "lunes":
            System.out.println("Programacion");
            break;
            case "martes":
            case "viernes":
            System.out.println("Base de Datos");
            break;
            case "miercoles":
            System.out.println("FOL");
            break;

            case "jueves":
            System.out.println("Sistemas Informaticos");
            break;

            default:
            System.out.println("DIA SIN CLASE");

        }
    }
}