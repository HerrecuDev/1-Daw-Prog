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

        Municipio municipioBuscado = LeerInformacion.BuscarMunicipio(municipios, "Yunquera",2020);

        System.out.println( "El municipio es : " + municipioBuscado);


        System.out.println("=====================================================================================");




       


        //Imprimimos los Municipios por orden ascendestes de año y nombre :



        //Informacion de Mijas en 2022 :

        Municipio mijas = LeerInformacion.BuscarMunicipio(municipios, "Mijas", 2022);
        System.out.println( " EL municipio : " + mijas + "  habitantes");


        //Años para el Incremento :

        int year1 = 2016;
        int year2 = 2022;
        //Incremento Fuengirola del año 2016 al 2022 :

        HashMap<String ,Integer> diccionarioMunicipios = LeerInformacion.IncrementoPoblacion(municipios,year1,year2);

        String mensaje = LeerInformacion.mostrarIncremento(diccionarioMunicipios, "Fuengirola",year1, year2);
        System.out.println(mensaje);

        //Incremento Mijas del año 2016 al 2022 :

        mensaje = LeerInformacion.mostrarIncremento(diccionarioMunicipios, "Mijas",year1, year2);
        System.out.println(mensaje);

        //Municipio menos Poblado :


         
        


    }




}
