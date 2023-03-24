package code.JuegoCartas.UsoJuego;

import code.JuegoCartas.Clases.Baraja;
import code.JuegoCartas.Clases.Carta;

public class JuegoDeCartas 
{
    public static void main(String[] args) 
    {
        int contador = 1;

        Baraja baraja = new Baraja();
        baraja.Barajar();
        System.out.println(baraja);
        

        Carta carta1 = baraja.pop();

        System.out.println(carta1);

        Carta carta2;

        boolean fin = false;
       
        do {
            carta2 = baraja.pop();
            System.out.println(carta2);
            contador++;
            fin = carta2.esMenor(carta1);
            if (fin) 
            {
                fin =  true;
                System.out.println("Es mas pequeña la nueva Carta y FIN");
                System.out.println("Cartas sacadas = " + contador);
                
            }
            else
            {
                carta1 = carta2;
            }
        } while (!fin );

        
    }
}
