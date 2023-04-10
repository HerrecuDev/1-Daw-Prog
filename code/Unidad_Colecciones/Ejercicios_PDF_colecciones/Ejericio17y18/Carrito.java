package code.Unidad_Colecciones.Ejercicios_PDF_colecciones.Ejericio17y18;

import java.util.ArrayList;

public class Carrito
{

    //Atributos :

    ArrayList<Elemento> carrito;

    //Contructor :
    public Carrito()
    {
        carrito = new ArrayList<Elemento>();
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
       return this
    }

    @Override

    public boolean equals(Object obj) {
        // dos elementos son iguales si tienen el mismo nombre y mismo precio
        Elemento elem = (Elemento)obj;
        return this.producto.equals(elem.getProducto()) && this.precio == elem.getPrecio();
    }


    
}
