package code.T6practicas.Clases;

public class TarjetaRegalo 
{
    //Atributos : 
    private double saldo;
    private int codigo;



    //Contructores:
    
    



    //Metodos :
    public TarjetaRegalo fusionaCon(TarjetaRegalo t)
    {
        //sumas importes de las 2 tarjetas :
        double total = this.saldo + t.saldo;

        //Creamos la tarjeta :

        //Vaciar las dos tarjetas originales:
        this.saldo = 0;
        t.saldo = 0;

    }
    public (int cantidad)
    {
        this.saldo = cantidad;
    }

    // public double getSaldo() {
    //     return saldo;
    // }
    // public void setSaldo(double saldo) {
    //     this.saldo = saldo;
    // }
    // public int getCodigo() {
    //     return codigo;
    // }
    // public void setCodigo(int codigo) {
    //     this.codigo = codigo;
    // }


}
