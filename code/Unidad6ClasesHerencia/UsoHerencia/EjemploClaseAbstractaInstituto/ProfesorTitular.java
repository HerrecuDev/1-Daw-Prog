package code.Unidad6ClasesHerencia.UsoHerencia.EjemploClaseAbstractaInstituto;

public class ProfesorTitular extends Profesor
{

    //Atributo :

    private int antiguead;

    //Contructor:
    public ProfesorTitular(String nombre , String tlf,String email,double salarioBase , String materia , String string , int antiguead)
    {
        super(nombre,tlf,email, salarioBase, materia, string);
        this.antiguead = antiguead;

    }

   

    //Metodo:
    @Override
    public double salario()
    {
        double total = salarioBase +10 * this.antiguead;
        if(this.esTutor)
        {
            total+= 30;
        }
        return total;
    }

    public boolean equals(Object obj)
    {
        ProfesorTitular pt = (ProfesorTitular)obj;

        return super.equals(obj) && this.antiguead == pt.antiguead;
    }

    
}
