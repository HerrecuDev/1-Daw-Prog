package code.Unidad_Colecciones.Ejercicio_EquipoFútbol;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        HashMap<Integer, Jugador> plantilla = new HashMap<>();
    }

    /**
     * AÑADIMOS LOS DATOS DEL JUGADOR QUE QUEREMOS QUE LLEVE EL DORSAL INDICADO
     * @param plantilla
     * @param dorsal
     */
    static void altaJugador(Map<Integer , Jugador> plantilla , Integer dorsal) //Al introducir dorsal el priemro se trata del KEY y el Jugado del VALUES
    {
        if (!plantilla.containsKey(dorsal)) 
        {
            
        
            System.out.println("Introducir dni :");
            String dni = sc.nextLine();

            System.out.println("introducir nombre : ");
            String nombre = sc.nextLine();

            System.out.println("intoducir Posicion en el campo");
            String posicion = sc.nextLine();

            System.out.println("introducir altura del jugador :");
            int estatura = sc.nextInt();

            Jugador jugador = new Jugador(dni, nombre, posicion, estatura);
            plantilla.put(dorsal, jugador);
        }

       
        else{
            System.out.println("Error el DORSAL introducido ya existe");
        }
        
    }


    /**
     * COMPROBAMOS QUE EL DORSAL YA CREADO NO ESTE DENTRO DE NUESTRO HASHMAP
     * @param plantilla
     * @param dorsal
     * @param jugador
     */
    static void altaJugador(Map<Integer , Jugador> plantilla , Integer dorsal , Jugador jugador)
    {

        if (!plantilla.containsKey(dorsal)) 
        {
            plantilla.put(dorsal, jugador);
        }
        else
        {
            System.out.println("El jugador que desea Introducir ya existe");
        }
    }

    /**
     * CON EL METODO REMOVE RECOGEMOS AL JUGADOR QUE ELIMINAMOS Y LO DEVLVEMOS POR PANTALLA
     * EL PROPIO METODO REMOVE BORRA DICHO JUGADOR Y LO DEVUELVE
     * @param plantilla
     * @param dorsal
     * @return
     */
    static Jugador eliminarJugador(Map<Integer , Jugador> plantilla , Integer dorsal)
    {
        return plantilla.remove(dorsal);
    }


    static void mostrar(Map<Integer, Jugador> plantilla)
    {
        Set<Integer> numeros = plantilla.keySet();

        for (Integer numero : numeros) 
        {
            System.out.println(numero);
            plantilla.get(numeros).toString();
        }
    }


    static void mostrar(Map<Integer , Jugador> plantilla, String posicion)
    {
        Set<> tipoJugador = plantilla.entrySet();

    }
    
}
