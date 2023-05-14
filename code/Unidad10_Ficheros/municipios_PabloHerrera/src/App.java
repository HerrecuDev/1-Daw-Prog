import java.util.ArrayList;
import java.util.HashMap;

import clases.Municipio;
import utiles.LeerInformacion;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("El Listado es ");

        ArrayList<Municipio> municipios;

        municipios = new ArrayList<Municipio>();

        
        //Debemos de poner el año a NULL para poder realizar bien la busqueda del Municipio
        municipios = LeerInformacion.leerFicheroMunicipio(null);

        //implementamos leer fichero municipio en un ArrayList de municipios.
        //Y decimos que x cada municipio que hay dentro de la lista municipio lo introduzca en el nuevo Arraylist municipios
        for (Municipio municipio : municipios) 
        {
            System.out.println(municipio);
        }




        //Realizamos la Busqueda de los Municipios segun el parametro y el año que le pasamos :

        Municipio municipioBuscado = LeerInformacion.BuscarMunicipio(municipios, "Viñuela",2020);

        System.out.println( "El municipio es : " + municipioBuscado);


        System.out.println("=====================================================================================");

        //Calculamos el incremento de Poblacion en un Municpio:

         HashMap<String ,Integer> diccionarioMunicipios = new HashMap<>();

         diccionarioMunicipios = LeerInformacion.IncrementoPoblacion(municipios, 2021, 2020);
         
        

        System.out.println("La poblacion a incrementado " + diccionarioMunicipios);
        

         
        


    }




}
