package code.Unidad6ClasesHerencia.UsoHerencia.EjemploClaseAbstractaInstituto;

public class UsoInstituto 
{
    public static void main(String[] args) 
    {
        Persona [] asistentes = new Persona [0];

        //Profesor p = new Profesor("PEPE");
        ProfesorTitular pt1 = new ProfesorTitular("PEPE", "99000+", "@hotmail.com", 1000, "Latin", false, 2);

        ProfesorTitular pt2 = new ProfesorTitular("PEPE", "99000+", "@hotmail.com", 1000, "Latin", false, 3);

        System.out.println(pt1.equals(pt2));
            
        

        
    }
    
}
