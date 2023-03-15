package code.Unidad9_Interfaces.Clases;

public class Cliente implements Comparable
{
    //Atributo :
    private String nombre;
    private double dinero;
    private int edad;

    public void Cliente(String nombre, double dinero)
    {
        this.nombre = nombre;
        this.dinero = dinero;
    }
    public void Cliente (String nombre , double dinero, int edad)
    {
        this.nombre = nombre;
        this.dinero = dinero;
        this. edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getDinero() {
        return dinero;
    }


    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    //Método
    @Override
    public int compareTo(Object o)
    {
        //compaamos por nombre 
        Cliente c = (Cliente)o;
        int resultado = 0; //Presuponemos
        if( this.nombre.compareTo(c.nombre) > 0)
        {
            resultado = 1;
        }
        else if (this.nombre.compareTo(c.nombre) < 0)
        {
            resultado = -1;
        }
        return resultado;


    }
    
}
