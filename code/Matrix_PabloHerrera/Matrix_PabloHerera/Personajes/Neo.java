package code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;

public class Neo extends Personaje
{

    //ATRIBUTO :
    private boolean elegido;


    //Contructor :
    public Neo (String nombre , String ciudad , LocalDateTime fecha, int edad , boolean elegido)
    {
        super(nombre, ciudad, edad);
        this.elegido = elegido;


    }


    @Override
    public String mostrarInformacion() 
    {
        return this.nombre + " " + this.ciudad + " " + this.elegido;
    }
    
}
