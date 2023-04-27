package utiles;

import java.util.ArrayList;
import java.util.Collections;

import modelos.Alumno;

public class ManejoAlumnos 
{
    public String OrdenarPorEad(ArrayList<Alumno> listaAlumno)
    {
        String cadena = " ";
        Collections.sort(listaAlumno);

        for (Alumno alumno : listaAlumno) 
        {
            cadena+= alumno.toString();
        }
        return cadena;
    }


    public double MediaEdades(ArrayList<Alumno> listaAlumnos)
    {
        double media = 0;
        int suma = 0;

        for (Alumno alumno : listaAlumnos) 
        {
            
        }


    }
}
