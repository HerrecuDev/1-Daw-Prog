package code.JuegoCartas;

import code.JuegoCartas.Carta.Palo;

public class Baraja 
{

    //Atributo :
    Carta [] mazo;



    //Contructores :
    public Baraja()
    {
        for (Palo palo : Palo.values()) 
        {
            for (int j = 0; j < 13; j++) 
            {
                Carta carta = new Carta(palo, j);
                push(carta);
            }
            
        }
    }


    //Metodo :
public push()
{

}


public pop()
{

}

public Barajar()
{

}


    
}
