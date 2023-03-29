package code.Unidad_Colecciones.Ejercicio_AcademicoLengua;

public class Academico implements Comparable<Academico>
{
    //Atributos :
    private String nombre;
    private int añoIngreso;

    //Contructores :

    public Academico(String nombre , int añoIngreso)
    {
        this.nombre =  nombre;
        this.añoIngreso = añoIngreso;

    }

   


    //Metodos :
    
    public String getNombre() {
        return nombre;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }


    @Override
    public String toString()
    {
        return this.nombre + " " + this.añoIngreso;
    }


/**
 * Se comparara por nombre y año de ingreso
 * @param acad
 * @return
 */

    @Override
    public int compareTo(Academico acad) 
    {
       if (this.nombre.compareTo(acad.getNombre()) == 0) 
       {
        return this.añoIngreso - acad.getAñoIngreso();
       } 
       else
       {
        return this.nombre.compareTo(acad.getNombre());
       }
    }

    

    
}
