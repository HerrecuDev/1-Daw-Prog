package code.Unidad6ClasesHerencia.UsoHerencia.EjemploClaseAbstractaInstituto;

public class ProfesorTitular extends Profesor
{

    //Atributo :

    private int antiguead;

    //Contructor:
    public ProfesorTitular(String nombre , String tlf,String email,double salarioBase , String materia , boolean esTutor , int antiguead)
    {
        super(salarioBase, materia, esTutor)

    }

   

    //Metodo:
    @Override
    public double salario()
    {
        double total = salarioBase +10
    }

    
}
