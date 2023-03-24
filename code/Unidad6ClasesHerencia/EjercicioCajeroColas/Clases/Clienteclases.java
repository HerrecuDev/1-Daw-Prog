package code.Unidad6ClasesHerencia.EjercicioCajeroColas.Clases;

import code.Unidad6ClasesHerencia.EjercicioCajeroColas.UsoCola.AccionesBanco;

public class Clienteclases 
{
    //Atributo :
    private String nombre;
    private AccionesBanco accionArealizar;
    private double importe;

    //Contructores :

    public Clienteclases (String nombre, int i , double importe)
    {
        this.nombre = nombre;
        this.accionArealizar = i;
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
