package code.EjercicioTrenes.personal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JefeEstacion 
{
    //Atributos : 
    private String nombre;
    private String dni;
    private String fechaJefe;

    //Contructores :
    public JefeEstacion (String nombre , String dni)
    {
        this.nombre = nombre;
        this.dni = dni;

    }

    //Métdos :
    public void modificarFechaCargo(int ano, int mes , int dia)
    {
       LocalDate fechaJefe = LocalDate.of(ano, mes, dia);
       DateTimeFormatter fechaModificada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       this.fechaJefe = fechaJefe.format(fechaModificada);

    }

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

    public String getFechaJefe() {
        return fechaJefe;
    }

    public void setFechaJefe(String fechaJefe) {
        this.fechaJefe = fechaJefe;
    }



    
}
