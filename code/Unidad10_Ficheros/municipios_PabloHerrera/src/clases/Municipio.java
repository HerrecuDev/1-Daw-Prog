package clases;

public class Municipio 
{
    //Atributos :
    private int codigoPostal;
    private String nombre;
    private int año;
    private int poblacion;


    //Contructores :

    public Municipio(int codigoPostal , String nombre  , int year , int poblacion)
    {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.año = year;
        this.poblacion = poblacion;


    }




    //Metodos :
    @Override
    public boolean equals(Object o) 
    {
        Municipio m = (Municipio)o;
       
        return this.nombre == m.nombre && this.año == m.año;
    }

    public String toString()
    {
        return this.nombre + " ( " + this.año +" ) " + " : " + this.poblacion;
    }
}
