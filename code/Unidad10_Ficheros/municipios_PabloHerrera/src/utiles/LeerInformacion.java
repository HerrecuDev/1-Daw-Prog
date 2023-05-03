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

    public ArrayList<Municipio> leerFicheroMunicipio(Integer year) 
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

            while (year != null) 
            {
                try
                {
                    // procesar los campos y Dividimos los Datos que tenemos en el fichero de los Municipios por el ";" :
                    String [] trozosLinea = linea.split(";");


                    //Ahora procesamos el primer Trozo[1] y lo dividimos en codigo postal y Nombre , Dividiendolo a traves del espacio :
                    String [] dividirPrimerCampo = trozosLinea[0].split(" ");
                    String pueblo = dividirPrimerCampo[1];

                    if (dividirPrimerCampo.length > 2) 
                    {
                        for (int i = 2; i < dividirPrimerCampo.length; i++) 
                        {
                            pueblo += dividirPrimerCampo[i] + " ";
                            
                        }
                    }
                    
                    int codigo = Integer.valueOf(dividirPrimerCampo[0]);
                    int año = Integer.valueOf(trozosLinea[2]);
                    int poblacion = Integer.valueOf(trozosLinea[3]);

                    
                    

                    // crear los objetos Municipio

                    Municipio municipio = new Municipio(codigo, pueblo,año, poblacion);


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
