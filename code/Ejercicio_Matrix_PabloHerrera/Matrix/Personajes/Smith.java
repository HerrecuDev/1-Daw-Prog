package Matrix.Personajes;

import java.sql.Date;
import java.text.DateFormat;

public class Smith extends Personajes
{

    //Atributos:
    private int poderInfeccion;


    //Contructores 
    public Smith(String nombre, String ciudad, DateFormat fecha, Date hora, int edad, int poderInfeccion)
    {
        super(nombre, ciudad, fecha, hora, edad);
        this.poderInfeccion = (int)(Math.random()*11);
    }


    //Metodos :

    @Override
    public String mostrarInformacion() 
    {
        return this.nombre + " " + this.ciudad + " " + this.poderInfeccion;
    }

    
}
