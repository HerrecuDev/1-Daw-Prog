package code.Unidad9_Interfaces;

import java.util.Arrays;

import code.Unidad9_Interfaces.Clases.Cliente;
import code.Unidad9_Interfaces.Clases.Supermercado;
import code.Unidad9_Interfaces.interfaces.Perro;
import code.Unidad9_Interfaces.interfaces.Sonido_I;

public class UsoInterfaz 
{
    public static void main(String[] args) 
    {
        // Perro perro1 = new Perro("Roko", "Labrador");

        // perro1.voz();
        // perro1.durmiendo();

        // Sonido_I.bostezo();

        Cliente c1 = new Cliente("PEPE", 100, 55);
        Cliente c2 = new Cliente("PEPE", 100, 55);
        Cliente c3 = new Cliente("PEPE", 100, 55);
        Cliente c4 = new Cliente("PEPE", 100, 55);
        Cliente c5 = new Cliente("PEPE", 100, 55);
        Cliente c6 = new Cliente("PEPE", 100, 55);


        Supermercado mercadona = new Supermercado("merca", "Hacendado", 1000);

        System.out.println(Arrays.toString(mercadona.colaClientes));
        Arrays.sort(mercadona.colaClientes);
        
    }
    
}
