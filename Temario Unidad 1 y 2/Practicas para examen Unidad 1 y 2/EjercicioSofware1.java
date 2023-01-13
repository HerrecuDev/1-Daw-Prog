import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioSofware1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("¿Que fecha es el examen de programacion?");
        System.out.println("Introducir dia");
        int dia = sc.nextInt();

        System.out.println("Introducir mes");
        int mes = sc.nextInt();


        System.out.println("Introducir año");
        int ano = sc.nextInt();



        System.out.println("¿A que hora es el examen de programacion?");

        System.out.println("Introducir hora");
        int hora = sc.nextInt();

        System.out.println("Introducir minutos");
        int minutos = sc.nextInt();
        sc.close();

        System.out.println("El examen es el dia " + LocalDate.of(ano, mes, dia));
        LocalDate fechaExamen = LocalDate.of(ano, mes, dia);


       //Para calcular un formato propio para imprimir la fecha del examen. 
        DateTimeFormatter fechaExamenpropia = DateTimeFormatter.ofPattern( "'El examen es el dia' EEEE dd ',de' MMMM ',del' YYYY ");
        System.out.println("La fecha del Examen es = " + fechaExamen.format(fechaExamenpropia.withLocale(new Locale("es" , "ES"))));


        //Para indicar cuantas horas quedan para el examen :

        LocalDateTime horasdelEXamen = LocalDateTime.of(ano,mes,dia,hora,minutos);
        LocalDateTime fechaActual = LocalDateTime.now();



        float horasParaelExamen = (float)ChronoUnit.HOURS.between(fechaActual, horasdelEXamen);
        int diasParaelExamen = (int)ChronoUnit.DAYS.between(fechaActual, horasdelEXamen);

        System.out.println("Quedan alrededor de " + horasParaelExamen + " Horas para el examen " + " y " + 
        diasParaelExamen + " dias");
    }

    }

       