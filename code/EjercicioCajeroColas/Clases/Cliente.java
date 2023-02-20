package code.EjercicioCajeroColas.Clases;

import code.EjercicioCajeroColas.UsoCola.AccionesBanco;

public class Cliente 
{
    //Atributo :
    private String nombre;
    private AccionesBanco accionArealizar;
    private double importe;

    //Contructores :

    public Cliente (String nombre, AccionesBanco accion , double importe)
    {
        this.nombre = nombre;
        this.accionArealizar = accion;
        this.importe = importe;
    }


    //Metodos : 
   
   



    public String getNombre() {
        return nombre;
    }


    public AccionesBanco getAccionArealizar() {
        return accionArealizar;
    }


    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Cliente [nombre = " + nombre + ", accionArealizar = "   + accionArealizar + ", importe = " + importe + "]";
    }

    
    
}
