package code.T6practicas.Clases;

public class Movil extends Terminal
{
    enum Tarifa {RATA, MONO , BISONTE};

    //Atributos :
    private Tarifa tarifa;
    private int tiempoTarifado;


    //Construcotres :
    public Movil(String telf , String tarifa)
    {
        super(numero);
        this.tarifa = Tarifa.valueOf(tarifa.toUpperCase());
        this.tiempoTarifado = 0;
    }
}
