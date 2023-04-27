package clases;

public class Municipio 
{
    //Atributos :
    private int codigoPostal;
    private String nombre;
    private int año;
    private String poblacion;


    //Contructores :

    public Municipio(int codigoPostal , String nombre  , int año , String poblacion)
    {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.año = año;
        this.poblacion = poblacion;
    }




    //Metodos :

    public String toString()
    {
        return this.nombre + " ( " + this.año +" ) " + " : " + this.poblacion;
    }
}
