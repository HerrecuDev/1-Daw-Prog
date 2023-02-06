package T6practicas.Clases;

public class hora 
{
    //Atributos
    public int hora;
    public int minutos;
    public int segundos;
    

    //Contructores :
    public int Hora(int hora) //Puede estar mal 
    {
        if (hora < 0 && hora > 23) 
        {
            this.hora = 0;
            
        }
        else
        {
            this.hora = hora;
            this.minutos = 0;
            this.segundos = 0;
        }
        return hora;
    }

    //Métodos :
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) 
    {
        if (hora <=23) {
            this.hora = hora;
        }

        else
        {
            setHora(0);
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos<60) {
            this.minutos = minutos;
        }

        else
        {
            this.minutos = 0;
            // this.hora = this.hora +1; NO ES CORRECTO DE ESTA FORMA
            setHora(getHora()+1);
        }
        
        
    }

    public int getSegundos(int segundos) {

        if (segundos<60) {
            this.segundos = segundos;
        }

        else
        {
            this.segundos = 0;
            // this.minutos = this.minutos +1; NO ESTA CORRESCTO DE ESTA FORMA 
            setMinutos(getMinutos()+1);
        }
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }



    public void sumarMinutos()
    {
        
    }

    @Override
    public String toString() {
        return "hora [hora=" + getHora() + ":" + ", minutos=" + getMinutos() + ":" + ", segundos=" + getSegundos(segundos) + "]";
    }
}
