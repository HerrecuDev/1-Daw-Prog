package code.Unidad_Colecciones;

import java.util.HashMap;
import java.util.HashSet;

import code.Unidad6ClasesHerencia.UsoHerencia.EjemploClaseAbstractaInstituto.ProfesorTitular;

public class EjemploMap 
{
    public static void main(String[] args) 
    {
        HashMap<Integer , String> alumnos = new HashMap<>();

        //Insertamos Alumnos :

        alumnos.put(1, " Paco");
        alumnos.put(2, " Alfredo");
        alumnos.put(3, " David");

        alumnos.put(2, "JOSE"); //CUIDADO  QUE MACHACA LO QUE HABIA

        System.out.println(alumnos);

        //Buscar por Clave :

        String alumnoBuscado = alumnos.get(2);
        System.out.println("Alumno Buscado  " + alumnoBuscado);

        if (alumnos.containsKey(4)) 
        {
         System.out.println("Esta la clave : 4");   
        }
        else
        {
            System.out.println("No esta la clave 4");
        }

        boolean estaJose = alumnos.containsValue("JOSE");

        System.out.println("Esta Jose " + estaJose);



        alumnos.remove(2);
        System.out.println(alumnos);


        HashSet<Integer> conjuntoClaves = new HashSet<>(alumnos.keySet());//Devuelve una coleccion de todas las claves que tenemos.
        System.out.println("Las claves son  " + conjuntoClaves);//Imprimimos los elementos de la coleccion.

        for (Integer clave : conjuntoClaves) 
        {
         System.out.println(clave + " - " + alumnos.get(clave));   
        }





        HashMap<Integer , ProfesorTitular> claustro = new HashMap<>();//Diccionario que contiene la clase ProfesorTitutlar.
        ProfesorTitular p1 = new ProfesorTitular("Nombre", "555", "pape", 1000, "j", "d", 10);
        claustro.put(1, p1);

        System.out.println(claustro);

        ProfesorTitular pt = claustro.get(1);
        System.out.println(pt.salario());



    }
    
}
