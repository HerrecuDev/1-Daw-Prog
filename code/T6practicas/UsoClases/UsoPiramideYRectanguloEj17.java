package code.T6practicas.UsoClases;

import code.T6practicas.Clases.PiramideEj17;
import code.T6practicas.Clases.RectanguloEj17;

public class UsoPiramideYRectanguloEj17 
{
    public static void main(String[] args) 
    {
        PiramideEj17 p = new PiramideEj17(4);
        RectanguloEj17 r1 = new RectanguloEj17(4, 3);
        RectanguloEj17 r2 = new RectanguloEj17(6, 2);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Pirámides creadas: " + PiramideEj17.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " + RectanguloEj17.getRectangulosCreados());
    }
}
