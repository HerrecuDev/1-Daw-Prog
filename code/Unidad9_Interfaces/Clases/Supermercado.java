package code.Unidad9_Interfaces.Clases;

import java.util.Arrays;

import code.Unidad9_Interfaces.interfaces.Tienda_I;

public class Supermercado extends Negocio implements Tienda_I
{
    //Atributo
    String nombreMarcaBlanca;


    public Supermercado (String nombre , String nombreMarcaBlanca, double dineroEnCaja)
    {
        super(nombre);
        this.nombreMarcaBlanca = nombreMarcaBlanca;
        this.dineroEnCaja = dineroEnCaja;
    }
    //Metodo abstracto de negocio :
    public double PagarImpuestos()
    {
        return dineroEnCaja* 0.10;
    }

    @Override
    public void abrir()
    {
        this.estado = true;
    }

    @Override
    public Cliente cobrar()
    {
        if (colaClientes.length > 0) 
        {
            //Atendemeos al primero de la cola :
            Cliente ClienteAtendido = colaClientes[0];


            //quitamos el primer cliente de la cola :
            Cliente [] nuevacola = new Cliente[this.colaClientes.length-1];
            
            for (int i = 0; i < nuevacola.length; i++) 
            {
                nuevacola[i] = colaClientes[i+1];
            }
            this.colaClientes = nuevacola;
            return ClienteAtendido;
        }

        else
        {
            //No hay cliente en cola
            return null;
        }
        
    }




    
    @Override
    public void nuevoCliente(Cliente cliente)
    {
        Arrays.sort(colaClientes);

        
    }
    @Override
    public void nuevoCliente(code.EjercicioCajeroColas.Clases.Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevoCliente'");
    }

    //Implemento los métodos de la interfaz Tienda_I



    
    
}
