package code.Unidad9_Interfaces.Tarea_Interfaces_Fútbol;

public class Jugador implements Comparable
{
    //Atributos :

    private String nombeCompleto;
    private String apodo;
    private int num_Licencia;
    private int numGoles;
    private int numFaltas;

    private static int asignacion_licencias = 1000; //Aunque crees a otros jugadores se autoincementa el codigo de la licencia a medida que añades jugadores.

    //Contructores :

    public Jugador(String nombre , String mote )
    {
        this.nombeCompleto =  nombre;
        this.apodo = mote;
        this.num_Licencia = asignacion_licencias;
        asignacion_licencias++;
        
        
    }


    //Metodos : 
   
    @Override
    public String toString()
    {
        return "El jugador " + nombeCompleto +  "Alias " + apodo + "El numero de goles = " + "(" + numGoles + ")" + "Y el numero de faltas realizadas es = " + "(" + numFaltas + ")";
    }

    @Override
    public boolean equals(Object object)
    {
        Jugador jugador = (Jugador)object;
        return this.num_Licencia == jugador.num_Licencia;
    }

    @Override
    public int compareTo(Object o)
    {
        Jugador jugador = (Jugador)o;
        int resultado = 0;

        if (this.num_Licencia > jugador.num_Licencia) 
        {
            resultado = 1;
        }
        else if(this.num_Licencia < jugador.num_Licencia)
        {
            resultado = -1;
        }

        return (int)(this.num_Licencia - jugador.num_Licencia);


    }

     //Genenramos los gets and sets

    public String getNombeCompleto() {
        return nombeCompleto;
    }


    public String getApodo() {
        return apodo;
    }


    public int getNumGoles() {
        return numGoles;
    }


    public int getNumFaltas() {
        return numFaltas;
    }

   

    
}
