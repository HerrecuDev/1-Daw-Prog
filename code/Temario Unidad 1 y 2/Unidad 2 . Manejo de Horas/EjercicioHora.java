import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.sound.sampled.Line;

//Pedir fecha de nacimiento 

//Pedirla por pantalla -> Dias -mesconletras - yy
//Mostrar la Edad 
//Cuanto quedapara tu proximo cumpleaños con Period y Chronounit.


public class EjercicioHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir ano");
        int ano = sc.nextInt();

        System.out.println("Introducir mes");
        int mes = sc.nextInt();

        System.out.println("Introducir dia");
        int dia = sc.nextInt();

        System.out.println("Tu cumpleaños es : " + LocalDate.of(ano, mes, dia));

        LocalDate fechaCumple = LocalDate.of(ano, mes, dia);

        DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("dd/MM/yyyy  'Mes' MM  ");
        System.out.println("Fecha con formatoMio " + fechaCumple.format(formatoMio.withLocale(new Locale("es" , "ES"))) );




    




        

        
    }
    
}
