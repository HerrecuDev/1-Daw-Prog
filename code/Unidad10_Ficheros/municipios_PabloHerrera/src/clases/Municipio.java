package clases;

public class Municipio 
{
    //Atributos :
    private int codigoPostal;
    private String nombre;
    private Integer año;
    private int poblacion;


    //Contructores :

    public Municipio(int codigoPostal , String nombre  , Integer year , int poblacion)
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



    //Generamos los GETTErs y SETTERS

    public int getCodigoPostal() {
        return codigoPostal;
    }





    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }





    public String getNombre() {
        return nombre;
    }





    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    


    public int getPoblacion() {
        return poblacion;
    }





    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }





    public Integer getAño() {
        return año;
    }





    public void setAño(Integer año) {
        this.año = año;
    }





    
}
