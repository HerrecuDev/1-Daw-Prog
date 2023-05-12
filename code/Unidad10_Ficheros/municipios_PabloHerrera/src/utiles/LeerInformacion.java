package utiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import clases.Municipio;

public class LeerInformacion 
{
    public Scanner sc = new Scanner(System.in);

    public static ArrayList<Municipio> leerFicheroMunicipio(Integer year) 
    {
        ArrayList<Municipio> listaMunicipios = new ArrayList<>();

        String nombreFichero = "/PoblacionMunicipiosMalaga.csv";
        String path = "src/recursos";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
       


        try
        {

            fileReader = new FileReader(path + nombreFichero);
            bufferedReader = new BufferedReader(fileReader);
            String linea = "";

            while ((linea = bufferedReader.readLine()) != null) 
            {

                if (!linea.isEmpty()) 
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
                                pueblo += " " + dividirPrimerCampo[i];
                            }
                        }
                        
                        int codigoPostal = Integer.valueOf(dividirPrimerCampo[0].trim());
                        int año = Integer.valueOf(trozosLinea[2].trim());
                        int poblacion = Integer.valueOf(trozosLinea[3].trim().replace(".", ""));
                        
                
                        String sexo = trozosLinea[1].trim();

                        if (year != null) 
                        {
                            if (!trozosLinea[0].equals("29 Málaga") && año == year && sexo.equals("Total"))
                            {
                                try 
                                {
                                // crear los objetos Municipio
                                Municipio municipio = new Municipio(codigoPostal, pueblo,año, poblacion);

                                // Insertarlos en la lista

                                listaMunicipios.add(municipio);

                                } catch (Exception e) {
                                System.out.println("Error hay algun dato invalido " );
                                }
                            
                            }
                        }

                        else
                        {
                            Municipio municipio = new Municipio(codigoPostal, pueblo, año, poblacion);
                            listaMunicipios.add(municipio);

                        }
                        
                    }
                    catch(Exception ex)
                    {
                        //System.out.println("ERROR " + linea + " " + "EL fichero no tiene los datos de la poblacion");
                        bufferedReader.readLine();
                    }
                

                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
           System.out.println(e.getMessage());
        }

        catch(IOException ioException)
        {
             // TODO Auto-generated catch block
            System.out.println(ioException.getMessage());
        }

        return listaMunicipios;
    
    }






    public static Municipio BuscarMunicipio( ArrayList<Municipio> coleccionMunicipios,String nombre , Integer año)
    {
        
        Municipio municipio = null;
        

        try 
        {
            

            for (Municipio pueblo : coleccionMunicipios) 
            {
                if (pueblo.getNombre().equals(nombre) && pueblo.getAño() == año) 
                {
                    municipio = pueblo;
                }
                
            }
            
    
            
        } catch (Exception e) 
        {
            System.out.println("Error : Municipio no encontrado"  );
        }
        return municipio;
    }




    public static void IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int year1, int year2) 
    {
        HashMap<String, Integer> diccionarioMunicipio;

        
    } 
}

    

