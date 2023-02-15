package code.EjercicioTrenes.maquinaria;

import java.time.LocalDate;

import code.EjercicioTrenes.personal.Mecanico;

public class Locomotora 
{
    //Atributos : 
    private int matricula;
    private int potMotor;
    private int antiguedad;
    private Mecanico mecanico;


    //Contructores :
    private Locomotora(int mat, int pmotor, int antiguedad, Mecanico mecanico)
    {
        this.matricula = mat;
        this.potMotor = pmotor;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }


    //Métdos :
    
    
}
