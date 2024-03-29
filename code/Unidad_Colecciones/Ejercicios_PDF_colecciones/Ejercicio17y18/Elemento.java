package code.Unidad_Colecciones.Ejercicios_PDF_colecciones.Ejercicio17y18;

public class Elemento 
{
    //Atributos :

    protected String producto;
    protected double precio;
    protected int cantidad;

    //Contructores:
    public Elemento(String producto , double precio , int cantidad)
    {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    //Metodos :

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



   @Override
   public String toString()
   {
    return this.producto + " " + this.precio + " " + this.cantidad;
   }
   
    

   @Override
   public int  hashcode()
   {
    return 0;
   }
    

    
}
