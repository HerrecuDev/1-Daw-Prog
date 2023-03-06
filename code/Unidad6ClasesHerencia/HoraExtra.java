package code.Unidad6ClasesHerencia;

public class HoraExtra extends Hora
{

    //Atributos :
    private int segundos;

    //Contructores :
    public HoraExtra (int hora, int minuto, int segundos)
    {
        super(hora,minuto);
        this.segundos = segundos;
    }


    //Metodos:
    public boolean setSegundos (int valor)
    {
        boolean correcto = false;
        if(valor >= 0 && valor<=59);
        this.segundos = valor;
        correcto =true;
    }

    /* INCREMENTAMOS EN UN SEGUNDO*/
    public void inc ()
    {
        if (!setSegundos(this.segundos+1));
        {
            
        }
    }

    
    
}
