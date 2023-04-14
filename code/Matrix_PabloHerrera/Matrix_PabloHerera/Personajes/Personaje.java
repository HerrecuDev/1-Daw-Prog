package code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;

public abstract class Personaje
{
    //Atributos :
    protected int id;
    protected String nombre;
    protected String ciudad;
    protected LocalDateTime fecha;
    protected int edad;
   


    //Contructores :

    public Personaje(int id, String nombre , String ciudad , int edad)
    {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fecha = LocalDateTime.now();
        this.edad = edad;

    }



    //Metodos :
    public abstract String mostrarInformacion();
}