package code.EjercicioTrenes.personal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JefeEstacion 
{
    //Atributos : 
    private String nombre;
    private int dni;
    private String fechaJefe;

    //Contructores :
    public JefeEstacion (String nombre , int dni)
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

    
}
