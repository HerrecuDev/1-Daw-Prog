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
                        int poblacion = Integer.valueOf(trozosLinea[3].replace(".", "").trim());
                        
                
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






     /**
      * Buscamos el Municipio que coincida con el nombre y año Introducido en el main para que nos de el numero de habitantes que tiene en dicho año.
      * @param coleccionMunicipios
      * @param nombre
      * @param año
      * @return
      */
    public static Municipio BuscarMunicipio( ArrayList<Municipio> coleccionMunicipios,String nombre , int año)
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



    /**
     * Mediante el ArrayList anterior creamos un Hashmap para añadir en el nombre(idMunicipio y la diferencia entre la poblacion de un año a otro)
     * @param coleccionMunicipios
     * @param year1
     * @param year2
     * @return
     */

    public static HashMap<String, Integer> IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int year1, int year2) 
    {
        HashMap<String, Integer> diccionarioMunicipios = new HashMap<>();
        int incrementoPoblacion = 0;
        Municipio año1 = null;
        Municipio año2 = null;

       
    
        //Usando la funcion Busqueda municipios calculamos la diferencia entre ambos Municipios
        //Y se loañadimos a nuestro hashmap los datos necesarios
    
        try 
        {
            for (Municipio pueblo : coleccionMunicipios) 
            {
               
                año1 = BuscarMunicipio(coleccionMunicipios, pueblo.getNombre(), year1);
                año2 = BuscarMunicipio(coleccionMunicipios, pueblo.getNombre(), year2);
                incrementoPoblacion = año2.getPoblacion() - año1.getPoblacion();
                diccionarioMunicipios.put(pueblo.getNombre(), incrementoPoblacion);
                
            }
            
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        return diccionarioMunicipios;

        
    } 

    /**
     * Mostramos la diferencia de la poblacion entre los dos años introducidos por el main
     * @param diccionario
     * @param municipio
     * @param year1
     * @param year2
     * @return
     */

    public static String mostrarIncremento(HashMap<String, Integer> diccionario,String municipio , int year1 , int year2)
    {

        String mensaje = "";
        String resultado = "";

        for (String  pueblo : diccionario.keySet()) 
        {
            if (pueblo.equals(municipio)) 
            {
                if (diccionario.get(pueblo) < 0) 
                {
                    mensaje = diccionario.get(pueblo) + " DECREMENTO";
                }
                else 
                {
                    mensaje = diccionario.get(pueblo) + " INCREMENTO ";
                }

                resultado = "El municipio " + pueblo + " : " + mensaje;
            }

            
        }
            return resultado;

    }
}

    

