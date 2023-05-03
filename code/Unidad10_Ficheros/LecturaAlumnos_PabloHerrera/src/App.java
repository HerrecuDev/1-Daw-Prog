import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import modelos.Alumno;
import utiles.LecturaAlumnos;
import utiles.ManejoAlumnos;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello , ALumnos");
        ArrayList<Alumno> listaAlumnos = LecturaAlumnos.leerFichero();


        ManejoAlumnos manejo = new ManejoAlumnos();
        String alumno = manejo.OrdenarPorEad(listaAlumnos);


        //PAra ELiminar los espacion en las lineas 

        // String[] lineaTroceada = lineaLeida.split();
        // String[] lineaTroceada = lineaLeida.trim();



        //Collections :

        Collections.sort(listaAlumnos);

        //Collections.sort(listalumnos);

        int posicionEncontrada =  Collections.binarySearch(listaAlumnos, new Alumno("", 31, 0, 0, 0, ""));

        Alumno alumnoBuscado = listaAlumnos.get(posicionEncontrada);
        System.out.println(alumnoBuscado);


        
    }
}
