package Matrix.Personajes;

import java.sql.Date;
import java.text.DateFormat;

public class Personas_genericas extends Personajes
{

    //Atributos :
    private int probabilidadMorir;


    //Contructores :
    public Personas_genericas(String nombre , String ciudad, DateFormat fecha , Date hora, int edad , int probabilidadMorir)
    {
       super(nombre, ciudad, null, null, edad);
       this.probabilidadMorir = (int)(Math.random()*101);
        
        
    }

    //Metodos :

    @Override
    public String mostrarInformacion() 
    {
        return this.nombre + " " + this.ciudad + " " + this.probabilidadMorir;
    }



    



    
}
