package code.Unidad6ClasesHerencia;

public class Persona 
{
    private String nombre ; //Al ser private no se pued eusar en clases vecinas.
    protected int edad; //Se puede usar debido a que es protected
    private double altura;
    protected int dni;

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

    @Override
    public String toString()
    {
        return this.nombre;
    }


    @Override
    public boolean equals(Object obejeto)
    {
        boolean resultado = false;
        //convertir objeto a la clase persona 
        Persona persona = (Persona)obejeto;
        if (persona.dni == this.dni) 
        {
            resultado =  true;
        }
        return resultado;
    }

   


    
}
