package utiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import modelos.Alumno;

public class LecturaAlumnos 
{
    public static ArrayList<Alumno> leerFichero()
    {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;



        try {
            
            fileReader = new FileReader("src/ficheros/ficherisAlumnos.txt");
            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();
            //La 1ª Linea es la cabecera y nos la saltamos
            linea =  bufferedReader.readLine();

            while (linea != null) 
            {
                try
                {
                    String [] trozosLinea = linea.split(" ");

                    //System.out.println(Arrays.toString(trozosLinea));

                    Alumno alumnoNuevo = new Alumno(trozosLinea[0].trim(),
                                                    Integer.valueOf(trozosLinea[1].trim()),
                                                    Double.valueOf(trozosLinea[2].trim()), 
                                                    Integer.valueOf(trozosLinea[3].trim()),
                                                    Integer.valueOf(trozosLinea[4].trim()),
                                                    trozosLinea[5].trim());
                }
                catch(Exception ex)
                {
                    System.out.println("Error en la linea : " + linea);
                }
                linea = bufferedReader.readLine();
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        finally
        {
            try {

                if (bufferedReader != null) 
                {
                    bufferedReader.close();
                }
                if (fileReader != null) 
                {
                    fileReader.close();
                }
                
            } catch (IOException ioException) {
                System.out.println("Error de ioException");
            }
        }

        return listadoAlumnos;
    }
    

    
}
