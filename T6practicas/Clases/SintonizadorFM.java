package T6practicas.Clases;

import javax.lang.model.util.ElementScanner6;

public class SintonizadorFM 
{
    //Atributos :
    private float frecuencia;
   
    //Contructores:
    public SintonizadorFM(float emisora)
    {
        setFrecuencia(emisora);
    }
    public SintonizadorFM()
    {

        setFrecuencia(80f);
    }

   
    

    //Metodos :

    private float getFrecuencia() {
        return frecuencia;
    }

    private void setFrecuencia(float frecuencia) {

        if (frecuencia > 108 ) 
        {
            this.frecuencia = 108;
        }

        else if (frecuencia < 80) 
        {
            this.frecuencia = 80;
        }

        else
        {
            this.frecuencia = frecuencia;
        }

    }

    public void display()
    {
        System.out.println(getFrecuencia());
    }
    public void up()
    {
        if (frecuencia + 0.5 > 108) 
        {
            setFrecuencia(80);
        }
        else
        {
            setFrecuencia(frecuencia + 0.5f);
        }

        
    }
    public void down()
    {
        if (frecuencia -0.5 < 80) 
        {
            setFrecuencia(108);
        }
        else
        {
            setFrecuencia(frecuencia + (-0.5f));
        }

        
    }

    


}
