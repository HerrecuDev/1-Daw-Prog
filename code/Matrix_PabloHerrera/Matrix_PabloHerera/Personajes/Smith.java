package code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;

public class Smith extends Personaje
{

    //Atributos:
    private int poderInfeccion;


    //Contructores 
    public Smith(String nombre, String ciudad, LocalDateTime fecha, int edad, int poderInfeccion)
    {
        super(null, null, fecha, edad);
        this.poderInfeccion = (int)(Math.random()*11);
    }


    //Metodos :

    @Override
    public String mostrarInformacion() 
    {
        return this.nombre + " " + this.ciudad + " " + this.poderInfeccion;
    }

    
}
