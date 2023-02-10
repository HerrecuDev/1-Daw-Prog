package code.T6practicas.UsoClases;

import code.T6practicas.Clases.IncidenciaEj18;

public class ProgramaIncidenciasEj18 
{
    public static void main(String[] args) 
    {
        IncidenciaEj18 inc1 = new IncidenciaEj18(105, "No tiene acceso a internet");
        IncidenciaEj18 inc2 = new IncidenciaEj18(14, "No arranca");
        IncidenciaEj18 inc3 = new IncidenciaEj18(5, "La pantalla se ve rosa");
        IncidenciaEj18 inc4 = new IncidenciaEj18(237, "Hace un ruido extraño");
        IncidenciaEj18 inc5 = new IncidenciaEj18(111, "Se cuelga al abrir 3 ventanas");
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        inc3.cerrarIncidencia();
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("Incidencias pendientes: " + IncidenciaEj18.getPendientes());
            }
}
