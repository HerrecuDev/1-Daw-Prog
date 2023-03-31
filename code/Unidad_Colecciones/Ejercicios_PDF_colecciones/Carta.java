public class Carta 
{
    private String [] valoresCarta = {"AS" , "dos" , "tres" , "cuatro", "cinco", " seis"};
    public enum palos {BASTOS , COPAS , ESPADAS , OROS}


    //ATRIBUTOS DE CARTA :

    private String valor;
    private String palo;
    
    public carta ()
    {
        //contruye una carta al azar :
        this.valor = valoresCarta[(int)(Math.random()*valoresCarta.length)];


        Palos[] palo = Palos.values();
        this.palo = p[(int)(Math.random()*p.length)];

        @Override
    }
}
