import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.text.DateFormatter;

public class Ejercicio1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introducir fecha del Examen");
   
    System.out.println("DIA");
    int dia = sc.nextInt();
    
    System.out.println("MES");
    int mes = sc.nextInt();
    
    
    System.out.println("AÑO");
    int ano = sc.nextInt();

    System.out.println("Introducir hora del examen");
    int hora = sc.nextInt();

    System.out.println("Introducir Minutos");
    int Minutos = sc.nextInt();
    
    

    sc.close();

    System.out.println("El Examen es el dia  " + LocalDate.of(ano, mes, dia));
    LocalDate fechaExamen = LocalDate.of(ano, mes, dia);
    

    DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("'El examen sera el ' EEEE dd ',de' MMMM ',del' YYYY ");
    System.out.println( "La fecha de examen es = " + fechaExamen.format(formatoMio.withLocale(new Locale("es" , "ES"))) );




    //Para definir horas hasta el examen
    LocalDateTime HorasparaExamen = LocalDateTime.of(ano, mes, dia, hora, Minutos);
    LocalDateTime fechaActual = LocalDateTime.now();


    float HorasParaElExamen = (float)ChronoUnit.HOURS.between(fechaActual,HorasparaExamen);
    System.out.println(" QUEDAN " + HorasParaElExamen + " Para el Examen");

    



    
    
}

}