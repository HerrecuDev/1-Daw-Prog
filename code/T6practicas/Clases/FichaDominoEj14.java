package code.T6practicas.Clases;

public class FichaDominoEj14 
{
    //Atributos : 
    public int izq;
    public int der;



    //contructores :
    public FichaDominoEj14(int izq, int der)
    {
        this.izq = izq;
        this.der = der;

    }

    //Metodos :
    public FichaDominoEj14 voltea() 
    {
        int auxiliar = this.izq;
        this.izq = this.der;
        this.der = auxiliar;
        return this;
    }

    public boolean encaja (FichaDominoEj14 ficha)
    {
        if (this.izq == ficha.izq || this.izq == ficha.der || this.der == ficha.der ||this.der == ficha.izq) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override //Modifica los metodos predeterminados de la clase -> imprimir
    public String toString() //Esto simplemente pone clase, paquete y espacio de memoria y asi la imprime
    {
        return "[" + (this.izq == 0 ? " " : this.izq) + "]" + "[" + (this.der == 0 ? " " : this.der) + "]";
    }




    
}
