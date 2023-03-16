import java.util.Comparator;

import code.Unidad9_Interfaces.Tarea_Interfaces_Fútbol.Jugador;

public class OrdenarJugadoresFaltas implements Comparator
{
    public int compare(Object arg0, Object arg1)
    {
        Jugador j1 = (Jugador)arg0;
        Jugador j2 = (Jugador)arg1;

        int comparador = j1.getNumFaltas() - j2.getNumFaltas();
        int resultado = 0;

        if (comparador == 0) 
        {
            resultado = j1.getNombeCompleto().compareTo(j2.getNombeCompleto());
        }
        else
        {
            resultado = comparador;
        }
        return resultado;

    }
    
}
