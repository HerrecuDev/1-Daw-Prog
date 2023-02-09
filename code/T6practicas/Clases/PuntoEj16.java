package code.T6practicas.Clases;

public class PuntoEj16 
{
    //Atributos :

    private double y;
    private double x;

    //Contructores :

    public PuntoEj16(double x , double y)
    {
        this.y = x;
        this.x = y;
    }


    //Metodos:

    @Override
    public String toString()
    {
       return "(" + this.x + "," + this.y + ")";
    }
    
       
    
}
