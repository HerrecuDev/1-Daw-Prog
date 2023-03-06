package code.T6practicas.Clases;

/*EJEMPLO DE CLASES ABSTRACTAS */

public abstract class Instrumento 
{
    public enum Notas { DO , RE , MI , FA , SOL , LA , SI};

    //ATRIBUTOS :
    protected Notas [] melodia;

    //Contructor :
    public Instrumento()
    {
        this.melodia = new Notas [0];
    }

    public void add(Notas nota)
    {
        Notas[] nuevaMelodia = new Notas [this.melodia.length+1];
        for (int i = 0; i < this.melodia.length; i++) //La longitud debe de ser this.melodia , si pone hasta nuevaMelodia nos da error de la longitud debido a que nuevaMelodia esta vacio.
        {
            nuevaMelodia[i] = melodia[i];
        }
        nuevaMelodia[nuevaMelodia.length-1] = nota;

        this.melodia = nuevaMelodia;
    }


    public abstract void interpretar();

}
