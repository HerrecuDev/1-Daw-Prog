package code.T6practicas.UsoClases;

import code.T6practicas.Clases.LineaEj16;
import code.T6practicas.Clases.PuntoEj16;

public class PuntoYLinea 
{
    public static void main(String[] args) 
    {
        PuntoEj16 p1 = new PuntoEj16(4.21, 7.3);
        PuntoEj16 p2 = new PuntoEj16(-2, 1.66);
        LineaEj16 l = new LineaEj16(p1, p2);
        System.out.println(l);
    }
}
