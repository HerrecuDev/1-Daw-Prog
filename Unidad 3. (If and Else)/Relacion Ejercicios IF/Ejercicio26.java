import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PRECIO_ENTRADA_NORMAL = 8;
        final int PRECIO_ENTRADA_ESPECTADOR = 5;
        final int PRECIO_ENTRADA_PAREJA = 11;
        System.out.println("¿Cuantas entradas quieres?");
        int Asistentes = sc.nextInt();
        System.out.println("Introducir dia de la semana");
        String diaDelaSemana = sc.nextLine();

        System.out.println("¿Tiene la tarjeta CineCAmpa");
        String TarjetaSIoNO = sc.nextLine();

        switch (diaDelaSemana)
        {
            case "miercoles" :
            preciototal = PRECIO_ENTRADA_ESPECTADOR*Asistentes;
            
            


        }


    }
    
}
