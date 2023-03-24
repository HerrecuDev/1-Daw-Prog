package code.JuegoCartas.Clases;

import java.util.Arrays;

import code.JuegoCartas.Clases.Carta.Palo;

public class Baraja 
{

    //Atributo :
    Carta [] mazo;



    //Contructores :
    public  Baraja()
    {
        this.mazo = new Carta[0];
        for (Palo palo : Palo.values()) 
        {
            for (int j = 1; j < 13; j++) 
            {
                Carta carta = new Carta(palo, j);
                push(carta);
            }
            
        }
    }


    //Metodo :

    public void Barajar()
    {
        for (int i = 0; i < mazo.length; i++) 
        {
            int posicionNueva = (int)(Math.random()*this.mazo.length);
            Carta cartaAux = this.mazo[posicionNueva];
            mazo[posicionNueva] = this.mazo[i];
            mazo[i] = cartaAux;
            
        }


    }


    public void push(Carta carta)
    {
        Carta[] mazoNuevo = new Carta[this.mazo.length+1];

        for (int i = 0; i < this.mazo.length; i++) // SIempre metemos en el bucle FOR el array de menor tamaño para que de esta forma no se nos salga del ARRAY
        {
            mazoNuevo[i] =  this.mazo[i];
        }
        mazoNuevo[mazoNuevo.length-1] = carta;

        this.mazo = mazoNuevo;

    }


    public Carta pop()
    {
        Carta cartaExtraida = null;
        if (this.mazo.length > 0) 
        {
            Carta[] mazoNuevo = new Carta[this.mazo.length-1];

            for (int i = 0; i < mazoNuevo.length; i++) // SIempre metemos en el bucle FOR el array de menor tamaño para que de esta forma no se nos salga del ARRAY
            {
                mazoNuevo[i] =  this.mazo[i];
            }
            cartaExtraida = this.mazo[this.mazo.length-1];
    
            this.mazo = mazoNuevo;
    
        }

        else
        {
            System.out.println("no hay carta suficientes");
        }

        return cartaExtraida;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(this.mazo);
    }

   
    
}
