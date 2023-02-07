package T6practicas.Clases;

import javax.lang.model.util.ElementScanner6;

public class Gestor 
{
    //Ejemplo ENumerados :
    public enum PuestodeTrabajo { BECARIO , AYUDANTE , SENIOR}

    //Atributos:
    public String nombre;
    private String tlf;
    //Solo visible por clases vecinas 
    private double importeMAximo;

    //Cramos la clase puesto de trabajo : 

    private PuestodeTrabajo puesto;


    //Constructores

    public Gestor(String nombre , String tlf)
    {
        this.nombre = nombre;
        this.tlf= tlf;
        this.importeMAximo = 100000;
        this.puesto = PuestodeTrabajo.BECARIO;

    }

    public Gestor(String nombre , String tlf, double importe)
    {
        this(nombre,tlf);
        //this.importeMAximo = importe;
        setImporteMAximo(importe);
        
    }

    /**
     * CREAMOS EL GESTOR 
     * EL IMPOTE MAXIMO SE LO DAMOS SEGUN EL PUESTO. LE DAMOS EL MAXIMO POSIBLE
     * 
     * @param nombre
     * @param tlf
     * @param puesto
     */
    public Gestor ( String nombre , String tlf , PuestodeTrabajo puesto)
    {
        this(nombre,tlf);
        this.puesto = puesto;

        //Actualizo el importe maximo segun su puesto :
        switch (puesto) 
        {
            case BECARIO:
            setImporteMAximo(10000);
                
                break;
            case AYUDANTE:
            setImporteMAximo(50000);

                break;
            case SENIOR :
            setImporteMAximo(200000);
                break;
        
            default:
            setImporteMAximo(10000);
                break;
        }
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

    public void setImporteMAximo(double importeMAximo) {

        if (this.puesto == PuestodeTrabajo.BECARIO && importeMAximo > 10000) 
        {
            this.importeMAximo = 10000;
            System.out.println("El importe maximo para este gestor es 10000");
        }
        else if (this.puesto == PuestodeTrabajo.AYUDANTE && importeMAximo > 50000)
        {
            this.importeMAximo = 50000;
            System.out.println("El importe maximo para este gestor es 50000");
        }
        else if (this.puesto == PuestodeTrabajo.SENIOR && importeMAximo > 20000)
        {
            this.importeMAximo = 20000;
            System.out.println("El importe maximo para ste gestor es 200000");

        }

        this.importeMAximo = importeMAximo;
    }

    public String getTlf() {
        return tlf;
    }

    public PuestodeTrabajo getPuesto() {
        return puesto;
    }


    public void setPuesto(PuestodeTrabajo puesto) {
        this.puesto = puesto;
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
