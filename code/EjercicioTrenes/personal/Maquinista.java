package code.EjercicioTrenes.personal;

public class Maquinista 
{
    //Atributos
    private String nombre;
    private String dni;
    private int sueldo;
    private String rango;


    //Contructores :
    public Maquinista(String nombre ,String dni, int sueldo,String rango)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = "Ayudante";
    }


    //Métdos :

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public int getSueldo() {
        return sueldo;
    }


    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


    public String getRango() {
        return rango;
    }


    public void setRango(String rango) {
        this.rango = rango;
    }

    



    
    
}
