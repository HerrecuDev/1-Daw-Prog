package modelos;

import javax.annotation.processing.Generated;

public class Alumno implements Comparable<Alumno>
{
    private String sexo;
    private int edad;
    private double altura;
    private int punt1;
    private int punt2;
    private String calificacion;



public Alumno(String sexo , int edad , double altura, int p1 , int p2, String calificacion)
{
    this.sexo =  sexo;
    this.edad = edad;
    this.altura = altura;
    this.punt1 = p1;
    this.punt2 = p2;
    this.calificacion = calificacion;


}

@Override
public String toString()
{
    return sexo + " " + edad + " " + altura + " " + calificacion;
}

//Metodos GETTERS :

@Override
public int compareTo(Alumno o) {
   return this.edad - o.edad;
}

public String getSexo() {
    return sexo;
}

public int getEdad() {
    return edad;
}

public double getAltura() {
    return altura;
}

public int getPunt1() {
    return punt1;
}

public int getPunt2() {
    return punt2;
}

public String getCalificacion() {
    return calificacion;
}





}



