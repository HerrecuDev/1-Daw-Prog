import java.util.ArrayList;

import clases.Municipio;
import utiles.LeerInformacion;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("El Listado es ");

        ArrayList<Municipio> municipios;

        municipios = new ArrayList<Municipio>();

        municipios = LeerInformacion.leerFicheroMunicipio(2015);

        //implementamos leer fichero municipio en un ArrayList de municipios.
        //Y decimos que x cada municipio que hay dentro de la lista municipio lo introduzca en el nuevo Arraylist municipios
        for (Municipio municipio : municipios) 
        {
            System.out.println(municipio);
        }

        


    }




}
