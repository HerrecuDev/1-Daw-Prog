package code.EjercicioTrenes.personal;



public class Mecanico 
{
    public enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};


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
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    
    
    
    
    
}
