package code.EjercicioTrenes.maquinaria;

class Vagon 
{
    //Atributos
    private int numIndentificacion;
    private int cargaMaxima;
    private int cargaAct;
    private String tipoMercancia;


    //Contructores :
    private Vagon( int cargamax , int cargAct, String mercancia)
    {
        this.cargaMaxima = cargamax;
        this.cargaAct = cargAct;
        this.tipoMercancia = mercancia;
    }

    //Métdos :


    public int getNumIndentificacion() {
        return numIndentificacion;
    }


    public void setNumIndentificacion(int numIndentificacion) {
        this.numIndentificacion = numIndentificacion;
    }


    public int getCargaMaxima() {
        return cargaMaxima;
    }


    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }


    public int getCargaAct() {
        return cargaAct;
    }


    public void setCargaAct(int cargaAct) {
        this.cargaAct = cargaAct;
    }


    public String getTipoMercancia() {
        return tipoMercancia;
    }


    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }



    
    
    
}
