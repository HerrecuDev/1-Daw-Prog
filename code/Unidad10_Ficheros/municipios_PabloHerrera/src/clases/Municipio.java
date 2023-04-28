package clases;

public class Municipio 
{
    //Atributos :
    private int codigoPostal;
    private String nombre;
    private int año;
    private String poblacion;


    //Contructores :

    public Municipio(int codigoPostal , String nombre  , String year , String poblacion)
    {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.año = year;
        this.poblacion = poblacion;
    }




    //Metodos :

    public String toString()
    {
        return this.nombre + " ( " + this.año +" ) " + " : " + this.poblacion;
    }
}
