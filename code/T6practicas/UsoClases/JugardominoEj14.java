package code.T6practicas.UsoClases;

import code.T6practicas.Clases.FichaDominoEj14;

public class JugardominoEj14 
{
    public static void main(String[] args) 
    {
        FichaDominoEj14 f1 = new FichaDominoEj14(6, 1);
        FichaDominoEj14 f2 = new FichaDominoEj14(0, 4);
        FichaDominoEj14 f3 = new FichaDominoEj14(3, 3);
        FichaDominoEj14 f4 = new FichaDominoEj14(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f2);
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
    }
}
