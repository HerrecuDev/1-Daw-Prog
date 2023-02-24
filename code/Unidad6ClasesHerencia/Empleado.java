package code.Unidad6ClasesHerencia;

    public class Empleado extends Persona
    {
        double sueldo;
        public Empleado (String nombre , int edad, double sueldo)
    {
        super(nombre);
        // super(nombre,edad);
        // this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        //setAltura(sueldo);
        
    }



    @Override
    public String decirHola()
    {
        return  super.decirHola() + "  Hola Empleado ";
    }
    }

