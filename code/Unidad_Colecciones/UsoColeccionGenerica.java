package code.Unidad_Colecciones;

import code.EjercicioCajeroColas.Clases.Clienteclases;
import code.Unidad9_Interfaces.Clases.Cliente;
import code.Unidad9_Interfaces.interfaces.Perro;

public class UsoColeccionGenerica 
{
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("KIKO", 100);
        Perro perro =  new Perro("Roko", "chucho");


        //RECOMIENDA EL PROFESOR : <> = Operador Diamante.

        ColeccionGenerica<Cliente> coleccionCliente = new ColeccionGenerica<Cliente>(); // Y es similar a == ColeccionGenerica<Cliente> coleccionCliente = new ColeccionGenerica<>();
        coleccionCliente.insertar(cliente);

        ColeccionGenerica<Perro> ColeccionPerro =  new ColeccionGenerica<Perro>();
        ColeccionPerro.insertar(perro);




        //No se debe implementar una coleccion con un tipo primitivo como int 
        // == ColeccionGenerica<int> ColeccionPerro =  new ColeccionGenerica<int>();  == NOS DA ERROR DE COMPILACION.


        //LA FORMA CORRECTA ES :
        ColeccionGenerica<Integer> ColeccionEntero =  new ColeccionGenerica<Integer>();

    }
}
