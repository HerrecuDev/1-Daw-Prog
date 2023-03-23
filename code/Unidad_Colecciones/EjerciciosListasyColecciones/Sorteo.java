package code.Unidad_Colecciones.EjerciciosListasyColecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo<T extends Comparable<T>>
{
    //Atributo:
    private HashSet<T> bolsa;


    //Contructor :
    public Sorteo()
    {
        bolsa = new HashSet<T>();
    }



    //Métodos :

    public boolean add(T elemento)
    {
        return bolsa.add(elemento);
    }

    public Set<T> premiados(int numerosPremiados)
    {
        ArrayList<T> ordenar = new ArrayList<>(bolsa);
        //Voy a ordenar los Elementos
        Collections.sort(ordenar);


        //Los desordenamos de forma aletorio:
        Collections.shuffle(ordenar);



        //Devolvemos los X primeros numeros:
        Set<T> BolsaPremiados = new HashSet<>();

        for (int index = 0; index < numerosPremiados; index++) 
        {
            //Faltas coger los x Primeros y mterlo en la bolsa Premiada.
        }

        return new HashSet<>();

    }
    
}
