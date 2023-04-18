package code.Unidad_Colecciones.Ejercicio_EquipoFútbol;

public class Jugador 
{
    enum Posicion{PORTERO, DEFENSA,CENTROCAMPISTA, DELANTERO};
    //Atributos :
    protected String dni;
    protected String nombre;
    protected Posicion posicionCampo;
    protected int estatura;
    

    //Contructores :
    public Jugador(String dni, String nombre , String posicion, int estatura)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.posicionCampo = Posicion.valueOf(posicion.toUpperCase());
        this.estatura = estatura;
    }

    public Jugador(String dni , String nombre , Posicion posicion , int estatura)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.posicionCampo = posicion;
        this.estatura = estatura;
    }

    //Metodos :
    @Override
    public String toString()
    {
        return this.dni + " " + this.nombre + " " + this.posicionCampo + " " + this.estatura; 
    }

    //GETTER AND SETTER GENERADOS:

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(Posicion posicionCampo) {
        this.posicionCampo = posicionCampo;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    



}
