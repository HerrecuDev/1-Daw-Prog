package code.Unidad9_Interfaces.Tarea_Interfaces_Fútbol;

import java.util.Comparator;

public class OrdenarJugadoresGoles implements Comparator
{
    public int compare(Object arg0, Object arg1)
    {
        Jugador j1 = (Jugador)arg0;
        Jugador j2 = (Jugador)arg1;

        int comparador = j1.getNumGoles()- j2.getNumGoles();
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
