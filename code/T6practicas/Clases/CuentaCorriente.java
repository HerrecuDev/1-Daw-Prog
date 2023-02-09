package code.T6practicas.Clases;

public class CuentaCorriente 
{
    //Atributos :
    String dni;
    String nombreTitular;
    double saldo;
    private Gestor gestor;

    //Constructores :
    public CuentaCorriente(String dni , String nombreTitular)
    {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }
    public CuentaCorriente(String dni , double saldoInicial)
    {
        this.dni = dni;
        this.saldo = saldoInicial;
    }
    public CuentaCorriente(String dni , String nombreTirular , double saldoInicial)
    {
        this(dni, nombreTirular);
        this.saldo = saldoInicial;
    }
    //Métodos :

    public void sacarDinero(double dineroAsacar)
    {
        //Comprobar que tenemos dinero suficente :
        if (this.saldo > dineroAsacar) 
        {
            this.saldo -= dineroAsacar;
        }
        else
        {
            System.out.println("no tiene dinero suficiente ");
        }
    }


    public void ingresarDinero (double dineAingresar)
    {
        if(dineAingresar >= 0)
        {
            this.saldo += dineAingresar;
        }
    }

    public String mostrarInformacion ()
    {
        String resultado = this.nombreTitular + "(" + this.dni + ")"+ this.saldo;
        return resultado;
    }


    @Override//Para sobre escribir el metodo to String:
    public String toString()
    {
        return mostrarInformacion();
    }



    public Gestor getGestor() {
        return gestor;
    }
    
    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }





    
}
