package utiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import clases.Municipio;

public class LeerInformacion
{
    public static  ArrayList<Municipio> leerFicheroMunicipio(Integer año) 
    {
        String nombreFichero = "PoblacionMunicipiosMalaga.csv";
        String path = "src/recursos";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
       


        try {

            fileReader = new FileReader(path + nombreFichero);
        } 
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }




    
    
}
