package code.Unidad6ClasesHerencia;

public class Persona 
{
    protected String nombre ;
    public int edad;
    private double altura;

    public Persona (String nombre , int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = 1.70;
    }

    public Persona(String nombre)
    {
        this.nombre = nombre;
        this.edad = 18;
        this.altura = 1.70;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String decirHola()
    {
        return "Hola Persona";
    }

   


    
}
