package code.JuegoCartas;

public class Carta 
{
public enum Palo {ORO, ESPADAS, BASTOS, COPAS}

    //Atributos :
    private Palo palo;
    private static int numero;


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


    public static int getNumero() {
        return numero;
    }


    public static void setNumero(int numero) {
        Carta.numero = numero;
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
