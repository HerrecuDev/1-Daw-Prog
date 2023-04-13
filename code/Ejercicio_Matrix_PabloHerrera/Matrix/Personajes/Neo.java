package Matrix.Personajes;

import java.sql.Date;
import java.text.DateFormat;

public class Neo extends Personajes
{

    //ATRIBUTO :
    private boolean elegido;


    //Contructor :
    public Neo (String nombre , String ciudad , DateFormat fecha , Date hora , int edad , boolean elegido)
    {
        super(nombre, ciudad, fecha, hora, edad);
        this.elegido = elegido;


    }


    @Override
    public String mostrarInformacion() 
    {
        return this.nombre + " " + this.ciudad + " " + this.elegido;
    }
    
}
