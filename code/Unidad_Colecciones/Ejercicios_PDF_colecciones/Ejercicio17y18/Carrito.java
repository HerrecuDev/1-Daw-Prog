package code.Unidad_Colecciones.Ejercicios_PDF_colecciones.Ejercicio17y18;

import java.util.ArrayList;
import java.util.HashSet;

public class Carrito
{

    //Atributos :

    HashSet<Elemento> carrito; //Tambien es posible hacerlo con Arraylist.

    //Contructor :
    public Carrito()
    {
        carrito = new HashSet<Elemento>();
    }

    public void agrega(Elemento elem)
    {
        if (!carrito.contains(elem)) 
        {
            carrito.add(elem);
        }
        else
        {
            for (Elemento elemento : carrito) 
            {
                if (elemento.equals(elem)) 
                {
                    elemento.setCantidad(elemento.getCantidad() + elem.getCantidad());
                }
            }
            
        }
        
    }

    public int numeroDeElementos()
    {
        return carrito.size();
    }

    public double cantidadTotalelementos()
    {
        double total = 0;
        for (Elemento elemento : carrito) 
        {
            int cantidad = elemento.getCantidad();
            double precio = elemento.getPrecio();
            total += cantidad*precio;
        }
        return total;
    }

    @Override
    public String toString()
    {
       return this.
    }

    public double importeTotal()
    {
    double precioTotal = 0;

        for ( Elemento elem: carrito) 
        {
            precioTotal += (elem.getPrecio() * elem.getCantidad());
        }
        return precioTotal;

        
    }

  

    
}
