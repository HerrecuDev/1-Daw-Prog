package code.Unidad_Colecciones.Clases;

public class Persona 
{
    private String nombre;
    private String dni;
    private int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    @Override
    public String toString()
    {
        return this.getNombre();
    }
}
