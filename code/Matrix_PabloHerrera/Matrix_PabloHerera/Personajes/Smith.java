package code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;

public class Smith extends Personaje
{

    //Atributos:
    private int poderInfeccion;


    //Contructores 
    public Smith(int id, String nombre, String ciudad, LocalDateTime fecha, int edad, int poderInfeccion)
    {
        super(id, nombre, ciudad, edad);
        this.fecha = LocalDateTime.now();
        this.poderInfeccion = (int)(Math.random()*11);
    }


    //Metodos :

    @Override
    public String mostrarInformacion() 
    {
        return this.id + " " + this.nombre + " " + this.ciudad + " " + this.poderInfeccion;
    }

    
}
