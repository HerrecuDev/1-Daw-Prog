package code.Unidad_Colecciones.Clases;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>>
{

    //Atributos :
     T[] tabla;


    //Contructores :

    public Contenedor(T [] objeto)
    {
        this.tabla = objeto;
    }


    ///Metodos : 

    public void insertarAlPrincipio (T objetoNuevo)
    {
        T[] nuevoArray = Arrays.copyOf(tabla, tabla.length+1);
        System.arraycopy(tabla, 0, nuevoArray, 1, tabla.length); //Copio los elementos de la lista en nueva lista desde la posicion 1 , dejando libre la posicion 0.
        nuevoArray[0] = objetoNuevo;
        this.tabla = nuevoArray;
    }

    public void InsertarAlFinal(T ObjetoFinal)
    {
        T[] nuevoArray = Arrays.copyOf(tabla, tabla.length+1);
        nuevoArray[nuevoArray.length-1] = ObjetoFinal;
        this.tabla = nuevoArray;
    }

    public T extraerDelPrincipio()
    {
        T elemento = this.tabla[0];
        T[] nuevoArray = Arrays.copyOf(tabla, tabla.length-1);
        System.arraycopy(tabla, 1, nuevoArray, 0, nuevoArray.length);
        this.tabla = nuevoArray;

        return elemento;

    }

    public T extraerDelFinal()
    {
        T[] nuevoArray = Arrays.copyOf(tabla, tabla.length-1);
        T elemento = this.tabla[tabla.length-1];

        this.tabla = nuevoArray;
        return elemento;
    }

    public void ordenar()
    {
        Arrays.sort(tabla);
    }



    public String toString()
    {
        return Arrays.toString(tabla); //Ya se encargra segun de lo que este definido de pasarnos el valos que obtenga.
    }


    
}
