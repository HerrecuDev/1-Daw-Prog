package Matrix.Personajes;

import java.sql.Date;
import java.text.DateFormat;

public abstract class Personajes
{
    //Atributos :
    protected String nombre;
    protected String ciudad;
    protected DateFormat fecha;
    protected Date hora;
    protected int edad;
   


    //Contructores :

    public Personajes(String nombre , String ciudad , DateFormat fecha , Date hora ,int edad)
    {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.hora = hora;
        this.edad = edad;

    }



    //Metodos :
    public abstract String mostrarInformacion();
}