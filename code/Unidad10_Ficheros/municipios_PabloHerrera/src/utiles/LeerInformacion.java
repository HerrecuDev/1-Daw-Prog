package utiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import clases.Municipio;

public class LeerInformacion
{
    public Scanner sc = new Scanner(System.in);

    public ArrayList<Municipio> leerFicheroMunicipio(Integer año) 
    {
        ArrayList<Municipio> listaMunicipios = new ArrayList<>();

        String nombreFichero = "PoblacionMunicipiosMalaga.csv";
        String path = "src/recursos";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
       


        try
        {

            fileReader = new FileReader(path + nombreFichero);
            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            while (año != null) 
            {
                try
                {
                    String [] trozosLinea = linea.split(" ");

        
                    // procesar los campos

                    String nombre = trozosLinea[1];
                    String year = trozosLinea[3];
                    String poblacion = trozosLinea[4];
                  
                    if (nombre != null) {
                        
                    }

                    // crear los objetos Municipio

                    Municipio municipio = new Municipio(0, nombre,year, poblacion);


                    // Insertarlos en la lista

                    listaMunicipios.add(municipio);







                }
                catch(Exception ex)
                {
                    System.out.println("ERROR : " + linea);
                }
            

            } 
        }
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        catch(IOException ioException)
        {
             // TODO Auto-generated catch block
             ioException.printStackTrace();
        }

        return listaMunicipios;
    }

    
}
