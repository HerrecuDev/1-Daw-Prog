package code.EjercicioTrenes.personal;

public class Mecanico 
{
    private enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};


    //Atributos
    private String nombre;
    private int telef;
    private Especialidad especialidad;

    //Contructores :
    public Mecanico(String nombre, int tlf, Especialidad especialidad)
    {
        this.nombre = nombre;
        this.telef = tlf;
        this.especialidad = especialidad;
    }


    //Métdos :
    
    
    
}
