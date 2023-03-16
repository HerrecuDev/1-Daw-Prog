import code.Unidad9_Interfaces.Tarea_Interfaces_Fútbol.Jugador;

public class JugadoresSpain 
{
    public static void main(String[] args) 
    {
        //Nombres y APodos a elegir :
        // String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
        // String[] apellidos = {"García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez"};


        // y para los apodos: 

        // String[] apodo1 = {"Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera"};
        // String[] apodo2 = {"de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro"}


        Jugador j1 = new Jugador("Juan García", "De oro", 5, 20);
        Jugador j2 = new Jugador("Pedro Marínez", "Pulga", 9, 15);
        Jugador j3 = new Jugador("Lucía Ruiz", "de Mijas", 20, 12);
        Jugador j4 = new Jugador("Carlos Pérez", "De titanio", 5, 9);
        Jugador j5 = new Jugador("Miguel Hernández", "loca", 19, 12);
        Jugador j6 = new Jugador("Pedro Sánchez", "El negro mierda", 6, 8);
    }
    
}
