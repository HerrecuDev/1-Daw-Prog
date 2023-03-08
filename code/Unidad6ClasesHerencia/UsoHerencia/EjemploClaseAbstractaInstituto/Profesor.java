package code.Unidad6ClasesHerencia.UsoHerencia.EjemploClaseAbstractaInstituto;

public abstract class Profesor extends Persona
{
    //Atributos :
    protected double salarioBase;
    protected String materia;
    protected boolean esTutor;
    


    //Constructores : 
    public Profesor(double salarioBase, String materia , boolean esTutor)
    {
        super(nombre,telf,email);
        this.salarioBase = salarioBase;
        this.materia = materia;
        this.esTutor = esTutor;
    }

    //Metodos :
    public abstract void salario();
}
