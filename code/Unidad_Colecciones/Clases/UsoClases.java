package code.Unidad_Colecciones.Clases;

public class UsoClases 
{
    public static void main(String[] args) 
    {
        Profesor profe = new Profesor();
        profe.setNombre("Frasco");

        Alumno_NEAEE alumno = new Alumno_NEAEE();
        alumno.setNombre("Kike");
        

        Notas<Alumno> notas = new Notas<Alumno>(alumno);
        notas.escribirNota();

        Notas<Alumno> notas2 = new Notas<Alumno>(alumno);
        notas2.escribirNota();

        // Notas<Persona> notas2 = new Notas<Persona>(alumno);// Falla al haber realizado en notas<T extends Alumnos>
    }
}
