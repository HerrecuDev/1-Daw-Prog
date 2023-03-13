package code.Unidad9_Interfaces.Clases;

public abstract class Negocio 
{
    //Atributo : 
    protected String nombreNegocio;
    protected double dineroEnCaja;
    protected Cliente[] colaClientes;
    protected boolean estado;

    public Negocio (String nombre)
    {
        this.nombreNegocio = nombre;
        dineroEnCaja = 0;
        colaClientes = new Cliente [0];
        estado = false;
    }

    //Método Abstracto :
    public abstract double PagarImpuestos();


    
}
