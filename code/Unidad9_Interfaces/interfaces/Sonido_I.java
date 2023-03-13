package code.Unidad9_Interfaces.interfaces;

public interface Sonido_I 
{
    public void voz();
    //Puede haber metdos con implementacion por defecto.
    default void durmiendo()
    {
        System.out.println("ZZZZZZ");
    }


    static void bostezo()
    {
        System.out.println("Auhhhhh!   - Metodo estatico de interfaz");
    }
}
