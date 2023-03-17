package code.Unidad9_Interfaces.Clases;

import java.util.Comparator;

public class ClienteComparatorEdad implements Comparator<Cliente>
{
    // public ClientecomparatorEdad()
    // {

    // }

    // @Override
    // public int compare(Object arg0, Object arg1) {
        
    //     // Cliente c1 = (Cliente)arg0;
    //     // Cliente c2 = (Cliente)arg1; //NO ES NECESARIO DEBIDO A QUE AGREGAMOS AL INICIO LOS DIAMANTES <>.

    //     return c2.getEdad() - c1.getEdad();

    // }

    @Override
    public int compare(Cliente c2, Cliente c1) 
    {
        
        return c2.getEdad() - c1.getEdad();
    }
}
