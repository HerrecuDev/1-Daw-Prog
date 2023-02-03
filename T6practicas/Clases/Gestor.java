package T6practicas.Clases;

import javax.lang.model.util.ElementScanner6;

public class Gestor 
{
    //Atributos:
    public String nombre;
    private String tlf;
    //Solo visible por clases vecinas 
    private double importeMAximo;


    //Constructores

    public Gestor(String nombre , String tlf)
    {
        this.nombre = nombre;
        this.tlf= tlf;
        this.importeMAximo = 100000;

    }

    public Gestor(String nombre , String tlf, double importe)
    {
        this(nombre,tlf);
        this.importeMAximo = importe;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporteMAximo() {
        return importeMAximo;
    }

    private void setImporteMAximo(double importeMAximo) {
        this.importeMAximo = importeMAximo;
    }

    public String getTlf() {
        return tlf;
    }

    public void CambiarImporte (String tlf , double importe)
    {
        if (this.tlf.equals(tlf))
        {
            this.setImporteMAximo(importe);
    
        }
        
        else
        {
            System.out.println("te has equivocado de tlf y no puedes cambiarlo");
        }
    }


    



    //Metodos :
}
