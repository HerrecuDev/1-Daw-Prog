import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.Locale;

import javax.print.attribute.standard.PresentationDirection;

public class pruebashora {
    public static void main(String[] args) {
    
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha es : "  + fechaActual);

        LocalTime horaActual = LocalTime.now();
        System.out.println("La hora es : " +  horaActual);

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println( "Fecha y Hora Actual : " + fechaHoraActual);




        //Para crar una fecha y Hora determinada(Off) :

        LocalDate fechacumple = LocalDate.of(1996, 05, 28);
        LocalTime horaExamen = LocalTime.of(12, 45, 30);
        LocalDateTime FechayHoraConcierto = LocalDateTime.of(2022, 11, 30, 20, 30, 59);

        Instant instante =Instant.now();

        System.out.println(" Mi Cumpleaños es el dia " + fechacumple + " Y el examen sera a las " + horaExamen);
        System.out.println(" EL CONCIERTO ES EL DIA " + FechayHoraConcierto);
        System.out.println("Instante " + instante);


        //Partes de una Fecha

        System.out.println("Dia concierto " + FechayHoraConcierto.getDayOfMonth()); 
        System.out.println("Hora del concierto " + FechayHoraConcierto.getHour());


        //Añadir/Quitar tiempo plus/minus

        System.out.println("En dos semanas " + fechaActual.plusWeeks(2));
        System.out.println("En dos semanas " + fechaActual.plusWeeks(-2)); //Tambien se puede quitar semanas.
        System.out.println(" Hace doce horas " + fechaHoraActual.minusHours(12));


        //AJUSTES TEMPORALES
        System.out.println("Primer dia del mes " );

        System.out.println(fechaActual.with(TemporalAdjusters.firstDayOfYear()));

        //Dar formato a una fecha
        DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("dd/MM/yyyy 'dia' EEEE  " );
        System.out.println("Fecha con Formato " + fechaActual.format(formatoMio.withLocale(new Locale("es" , "ES"))));



        //Diferencias Entre Fechas PERIOD Y CHRONOUNIT

        int diasVividos = (int)ChronoUnit.DAYS.between(fechacumple, LocalDate.now());



        System.out.println("Tengo la  edad de " +  ChronoUnit.YEARS.between(fechacumple, LocalDate.now()));
        System.out.println("Dias Vividos " +  diasVividos);

        LocalDate finAno = LocalDate.of(2022, 12, 31);
        Period hastaFinAno = fechaActual.until(finAno);
        System.out.println("Hasta Final de año " + hastaFinAno);
        
        System.out.println("Quedan hasta final de año " + hastaFinAno.getMonths() + " meses " + 
        hastaFinAno.getDays() + " Dias");


        



        






      


    }
}
