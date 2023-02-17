package code.JuegoCartas.Clases;

public class Carta 
{
public enum Palo {ORO, ESPADAS, BASTOS, COPAS}

    //Atributos :
    private Palo palo;
    private int numero;


    //Contructores:
    public Carta(Palo palo, int numero)
    {
        this.palo = palo;
        this.numero = numero;
    }


   


    //Metodo : 
    
    public Palo getPalo() {
        return palo;
    }


    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }
    

   

    /**
     * Devuelve true si la carta que hace la llamada es menor a la carta que se pasa
     * @param carta
     * @return
     */

    public boolean esMenor(Carta carta)
    {
        boolean resultado = false;
        if (this.numero < carta.getNumero()) 
        {
            resultado = true;
        }
        return resultado;
    }


    @Override
    public String toString()
    {
        return this.numero + " de " + this.palo;
    }


    
}
