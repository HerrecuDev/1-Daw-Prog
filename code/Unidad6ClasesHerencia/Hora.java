package code.Unidad6ClasesHerencia;

public class Hora 
{
    //Atributos :
    protected int hora;
    protected int minuto;
    //protected int segundos;


    //Contructores :
     //CONSTRUYE UN OBJETO :
    public Hora(int hora,int minutos)
    {
        this.hora = hora;
        this.minuto = minutos;
        
    }



    //Metodos:
    
   
    //INCREMENTA  LA HORA EN +1 MIN
    public void inc() 
    {
        if (setMinuto(this.minuto+1)) 
        {
            //Si es valido entonces no tengo que hacer nada
        }
        else
        {
            setMinuto(0);
            if (!setHora(this.hora+1)) 
            {
                setHora(0);
            }
        }
        
    }
    //ASIGNA UN VALOR SI ES VALIDO A LOS MINUTOS dEVUELVE TRUE O FALSE.
   


    public boolean setMinuto(int valor)
    {
        boolean correcto = false;
        if (valor >= 0 &&  valor<= 59) 
        {
            this.minuto = valor;
            correcto = true;
        }
        else
        {
            correcto = false;
        }
        return false;
    }
    //ASIGNA UN VALOR SI ESTA COMPRENDIDO ENTRE 0 Y 23 A LA HORA. DEVUELVE TRUE O FALSE :
    public boolean setHora(int valor)
    {
        boolean correcto = false;
        if (valor >= 0 &&  valor<= 23) 
        {
            this.hora = valor;
            correcto = true;
        }
        else
        {
            correcto = false;
        }
        return correcto;
    }

    //Creamos los Getter y Setters :
    
    public int getHora() {
        return hora;
    }



    public int getMinuto() {
        return minuto;
    }
    


    //Generamos el @override
    @Override
    public String toString()
    {
        return this.hora + ":" + getMinuto();
    }



  
}