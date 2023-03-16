package code.EjercicioCajeroColas.Clases;

import java.util.Arrays;

import code.EjercicioCajeroColas.UsoCola.AccionesBanco;

public class Caja 
{
   
    //Atributo :
    private double saldoDisponible;
    private Clienteclases[] colaClientes;
    

    //Contructores :
    public Caja()
    {
        this.saldoDisponible = 1000;
        this.colaClientes = new Clienteclases[0];

    }

    

    //Metodos : 
    
    public void cogerTurno(Clienteclases cliente)
    {
        Clienteclases [] nuevaCola = new Clienteclases[this.colaClientes.length +1];

        for (int i = 0; i < this.colaClientes.length; i++) 
        {
            nuevaCola[i] = this.colaClientes[i];
        }

        //Añadimos el nuevo ELemento en la ultima posicion 
        nuevaCola[nuevaCola.length-1] = cliente;
        this.colaClientes = nuevaCola;

    }

    public void atender()
    {
        //Cogemos al cliente que le toca su turno
        Clienteclases clienteAtendido = desencolar();

        System.out.println("Atendiendo a : " + clienteAtendido.getNombre());

         //Atendemos al cliente
            //Ingresa dinero

            if (clienteAtendido.getAccionArealizar() == AccionesBanco.INGRESAR) 
            {
                this.saldoDisponible += clienteAtendido.getImporte();
            }

            //Retira dinero si hay saldo suficiente.

            else if (clienteAtendido.getAccionArealizar() == AccionesBanco.RETIRAR && clienteAtendido.getImporte() > 0) 
            {
                if (this.saldoDisponible - clienteAtendido.getImporte() >= 0) 
                {
                    this.saldoDisponible -= clienteAtendido.getImporte();
                }

                else
                {
                    System.out.println("Error no hay suficiente dinero para retirar vuelve mañana");
                }
            }

           
    }

    /**
     * Saca a un cliente de la cola clientes y devuelve ese cliente.
     * @return
     */

    private Clienteclases desencolar()
    {
        Clienteclases clienteAtendido = this.colaClientes[0];

        Clienteclases [] nuevaCola = new Clienteclases [this.colaClientes.length-1];

        for (int i = 0; i < nuevaCola.length; i++) 
        {
            nuevaCola[i] = colaClientes[i+1];
        }

        this.colaClientes = nuevaCola;
        return clienteAtendido;
    }

    public void estadoCola()
    {
        // Cliente [] colaClientes = new Cliente[this.colaClientes.length];
        for (int i = 0; i < colaClientes.length; i++) 
        {
            System.out.println(colaClientes[i]);
        }
    }



    public double saldo()
    {
        return this.saldoDisponible;
    }



    @Override
    public String toString() {
        return "Caja [saldoDisponible=" + saldoDisponible 
        + "\n colaClientes=" 
        
        
        
        + Arrays.toString(colaClientes) + "]";
        
    }

    
}
