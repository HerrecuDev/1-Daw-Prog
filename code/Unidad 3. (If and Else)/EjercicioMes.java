import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class EjercicioMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir Mes");
        String mes = sc.nextLine().toUpperCase();

        switch (mes)
        {
            case "ENERO":
            case "MARZO":
            case "MAYO":
            case "JULIO":
            case "AGOSTO":
            case "SEPTIEMBRE":
            case "DICIEMBRE":

            System.out.println("Tiene 31 dias");
            break;
            case "ABRIL" :
            case "JUNIO" :
            case " OCTUBRE":
            case "NOVIEMBRE":
            System.out.println("Tiene 30 dias");
            break;

            case "FEBRERO" :
            System.out.println("Segun si es año Bisiesto o no tiene 28 o 29 dias");
            break;
            default :
            {
                System.out.println("Mes ERRONEO");
            }
        

        }
    }
    
}
