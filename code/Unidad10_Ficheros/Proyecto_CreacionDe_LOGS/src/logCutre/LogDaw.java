package logCutre;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogDaw 
{
    private static String nombreFihero = "log.txt";

    public enum Tipo {ERROR, INFORMACION};

    public static void NuevaentradaLog(String mensaje , Tipo tipo)
    {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/" + nombreFihero , true)))
        {
            //Montamos nuestro mensaje : 

            String horaMensaje = LocalDateTime.now().format(DateTimeFormatter.ofPattern("DD/mm/YYYY HH:mm:ss"));
            String mensajeTotal = horaMensaje + " " + tipo + " : " + mensaje;


            bufferedWriter.write(mensajeTotal);
            bufferedWriter.newLine();
            
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
        }
        
    }
}
