package code.T6practicas.UsoClases;

import code.T6practicas.Clases.Guitarra;
import code.T6practicas.Clases.Piano;
import code.T6practicas.Clases.Instrumento.Notas;

public class UsoIntrumento 
{
    public static void main(String[] args) {
        //Intrumento il = new Intrumento(); //Al ser abstracta no se implementa.


        Piano piano = new Piano();

        piano.add(Notas.LA);
        piano.add(Notas.LA);
        piano.add(Notas.FA);
        piano.add(Notas.SOL);
        piano.add(Notas.SOL);
        piano.add(Notas.DO);
        

        piano.interpretar();

        System.out.println();


        Guitarra guitarra = new Guitarra();

        guitarra.add(Notas.LA);
        guitarra.add(Notas.LA);
        guitarra.add(Notas.FA);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.SOL);
        guitarra.add(Notas.DO);
        
        guitarra.interpretar();

        System.out.println();

    }
    
}
