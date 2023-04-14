package code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;

public class Neo extends Personaje
{

    //ATRIBUTO :
    private boolean elegido;
    private int poder;


    //Contructor :
    public Neo (int id ,String nombre , String ciudad ,int edad, boolean elegido, int poder)
    {
        super(id, nombre, ciudad, edad);
        this.fecha = LocalDateTime.now();
        this.elegido = elegido;
        this.poder = poder;


    }


    @Override
    public String mostrarInformacion() 
    {
        return this.id + " " + this.nombre + " " + this.ciudad + " " + this.elegido;
    }
    
}
