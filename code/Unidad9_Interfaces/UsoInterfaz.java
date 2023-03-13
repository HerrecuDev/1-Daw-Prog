package code.Unidad9_Interfaces;

import code.Unidad9_Interfaces.interfaces.Perro;
import code.Unidad9_Interfaces.interfaces.Sonido_I;

public class UsoInterfaz 
{
    public static void main(String[] args) 
    {
        Perro perro1 = new Perro("Roko", "Labrador");

        perro1.voz();
        perro1.durmiendo();

        Sonido_I.bostezo();
        
    }
    
}
