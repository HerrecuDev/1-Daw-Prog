package code.Unidad9_Interfaces.interfaces;

public class Perro implements Sonido_I ,Comparable<Perro>
{
    String nombre;
    String raza;


    public Perro(String nombre, String raza)
    {
        this.nombre = nombre;
        this.raza = raza;

    }
    //Metodod de la interfaz Sonido:
    public void voz()
    {
        System.out.println("GUAU!");
    }
    public void durmiendo()
    {
        System.out.println("Perro voz durmiendo");
    }

    @Override
    public int compareTo(Perro o)
    {
        return this.nombre.compareTo(nombre);
    }
    public String toString()
    {
        return this.nombre;
    }
}
