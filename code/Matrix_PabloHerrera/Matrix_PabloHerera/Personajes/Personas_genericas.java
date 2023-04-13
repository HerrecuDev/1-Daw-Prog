package code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Personas_genericas extends Personaje
{

    //Atributos :
    private int probabilidadMorir;


    //Contructores :
    public Personas_genericas(String nombre , String ciudad, int edad )
    {
       super(nombre, ciudad, edad);
       this.probabilidadMorir = (int)(Math.random()*101);
        
    }

    //Metodos :

    @Override
    public String mostrarInformacion() 
    {
        return this.nombre + " " + this.ciudad + " " + this.probabilidadMorir;
    }

    //Generamos las 200 Personas Genericas 
    public ArrayList factoriaPersonas(int cantidad)
    {
        String[] nombre = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía","Lucía", "Elena", "Miguel"};
        String[] ciudad = {"Madrid", "New York", "Pekin", "Leganés", "Londres", "Paris"};

        ArrayList<Personaje> listadoPersonas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) 
        {
            //nombre al azar
            int posicionNombreAlAzar = (int)(Math.random()* nombre.length);
            String nuevoNombre = nombre[posicionNombreAlAzar];

            //Ciudad al Azar
            int ciudadalAzar = (int)(Math.random() * ciudad.length);
            String ciudadNueva = ciudad[ciudadalAzar];

            Personas_genericas pg = new Personas_genericas(nuevoNombre, ciudadNueva, edad);

            listadoPersonas.add(pg);
        }

        return listadoPersonas;
        
    }



    



    
}
