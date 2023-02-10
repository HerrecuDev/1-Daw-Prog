package code.T6practicas.Clases;

public class IncidenciaEj18 
{
    public enum estadoIncidencia {PENDIENTE, RESUELTA , ENPROCESO,CERRADA};
    //Atributos :

    private int codigo;
    private estadoIncidencia estado; //Para que sea siempre un tipo enum se le añade la variable de nuestro ENUM creado.
    private String descripcionFallo;
    private int numPuesto;
    private String solucionIncidencia;

    private static int numIncidenciasTotal;
    private static int IncidenciaaPendientes;




    //Contructores :

    public IncidenciaEj18 (int puesto, String descripcionError)
    {
        this.numPuesto = puesto;
        this.descripcionFallo = descripcionError;

        this.estado = estadoIncidencia.PENDIENTE;

        numIncidenciasTotal++;
        IncidenciaaPendientes++;
        this.codigo = numIncidenciasTotal;

    }

    //Metodos :
    public void resuelve (String descripcionSolucion)
    {
        this.solucionIncidencia = descripcionSolucion;
        this.estado = estadoIncidencia.RESUELTA;

        IncidenciaaPendientes--;
    }
    public void cerrarIncidencia()
    {
        this.estado = estado.CERRADA;
    }

    public static int getPendientes()
    {
        return IncidenciaaPendientes;
    }

    public void setEstado (estadoIncidencia estado)
    {
        this.estado = estado;
    }

    @Override
    public String toString()
    {
        String resultado = "";
        resultado = "Incidencia " + this.codigo +
        " - Puesto " + this.numPuesto + " - " + this.descripcionFallo + " - " +  this.estado + (this.estado == estadoIncidencia.RESUELTA ?  this.solucionIncidencia : "");
        return resultado;
    }
    
}
