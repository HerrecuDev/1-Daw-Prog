package code.T6practicas.Clases;

public class LineaEj16 
{
    //Atributos
    private PuntoEj16 x;
    private PuntoEj16 y;

    //Constructores
    public LineaEj16 (PuntoEj16 x , PuntoEj16 y)
    {
        this.x = x;
        this.y = y;
    }

    //Metodos :

    @Override // modifica los metodos predeterminados de la clase - > imprimir
    public String toString() // esto solo pone paquete, clase y espacio de memoria y asi la imprime
    {
        return "Linea formada por los puntos" + x + "y" + y;
    }

    
}
