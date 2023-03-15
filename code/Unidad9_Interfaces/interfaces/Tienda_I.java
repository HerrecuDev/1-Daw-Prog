package code.Unidad9_Interfaces.interfaces;

import code.EjercicioCajeroColas.Clases.Cliente;

public interface Tienda_I 
{
    public void abrir();
    public code.Unidad9_Interfaces.Clases.Cliente cobrar();
    public void nuevoCliente(Cliente cliente);
    
}
