package modelo;

public class Coche 
{

    //Atributos :
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private Double precio;


    //Contructor :

    public Coche(){};

    public Coche(String marca , String modelo, int fabricacion, Double precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = fabricacion;
        this.precio = precio;
    }


    //MEtodos :

    public String toString()
    {
        return this.marca + " " + this.modelo + " " + this.añoFabricacion + " " + this.precio;
    }


    //GEneramos Getter and Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    


    
}
