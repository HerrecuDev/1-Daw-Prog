package code.EjercicioTrenes.maquinaria;

import java.time.LocalDate;

import code.EjercicioTrenes.personal.Mecanico;

public class Locomotora 
{
    //Atributos : 
    private String matricula;
    private int potMotor;
    private int antiguedad;
    private Mecanico mecanico;


    //Contructores :
    public Locomotora(String mat, int pmotor)
    {
        this.matricula = mat;
        this.potMotor = pmotor;
    }

    public Locomotora(String mat, int motor,int ant)
    {
        this.matricula = mat;
        this.potMotor = motor;
        this.antiguedad = ant;
        
    }
    public Locomotora (Mecanico mecanico)
    {
        this.mecanico = mecanico;
    }

    //Métdos :

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotMotor() {
        return potMotor;
    }

    public void setPotMotor(int potMotor) {
        this.potMotor = potMotor;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }


   







}
