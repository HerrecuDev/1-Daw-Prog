package code.Unidad6ClasesHerencia.UsoHerencia.EjemploClaseAbstractaInstituto;

public class Persona 
{
    //Atributos :
    String nombre;
    String telf;
    String email;

    //Constructores : 

    public Persona(String nombre, String tlf , String email)
    {
        this.nombre = nombre;
        this.telf = tlf;
        this.email = email;
    }

    //Metodos :
    @Override
    public boolean equals(Object obj)
    {
        Persona pt = (Persona)obj;
        return this.nombre.equals(pt.nombre) && this.email.equals(pt.email);
    }
    
}
