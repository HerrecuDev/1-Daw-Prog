package code.Unidad6ClasesHerencia;

public class EjemploUsoHerencia 
{
    public static void main(String[] args) 
    {
        Persona p1 = new Persona("Alfonso");

        Empleado emp1 = new Empleado("MAria", 19, 2000);

        System.out.println(p1.decirHola());
        System.out.println(emp1.decirHola());

        p1 = emp1;
        System.out.println(p1.decirHola() + p1.getClass());

        Persona[] elementos = {p1,emp1};
    }
    
}
