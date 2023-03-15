package code.Unidad9_Interfaces.Clases;

import java.util.Comparator;

public class ClienteOrdenaDineroEdad implements Comparator
{
    @Override
    public int compare(Object arg0, Object arg1)
    {
        //Ordeno por dinero y con dinero igual ordeno por edad

        Cliente c1 = (Cliente)arg0;
        Cliente c2 = (Cliente)arg1;


        int resultado = 0;

        if (c1.getDinero() > c2.getDinero()) 
        {
            resultado = 1;
        }
        else if(c1.getDinero() < c2.getDinero())
        {
            resultado = -1;
        }
        else
        {
            if (c1.getEdad() > c2.getEdad()) 
            {
                resultado = 1;
            }
            else if (c1.getEdad() < c2.getEdad())
            {
                resultado = -1;
            }
        }
        return resultado;
    }
}
