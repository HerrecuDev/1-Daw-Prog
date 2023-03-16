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


        Jugador j1 = new Jugador("Juan García", "De oro" );
        Jugador j2 = new Jugador("Pedro Marínez", "Pulga");
        Jugador j3 = new Jugador("Lucía Ruiz", "de Mijas");
        Jugador j4 = new Jugador("Carlos Pérez", "De titanio");
        Jugador j5 = new Jugador("Miguel Hernández", "loca");
        Jugador j6 = new Jugador("Pedro Sánchez", "El negro mierda");


        j1.cometerFalta();
        j3.hacerGol();
        j6.cometerFalta();


        System.out.println(j1);
    }
    
}
