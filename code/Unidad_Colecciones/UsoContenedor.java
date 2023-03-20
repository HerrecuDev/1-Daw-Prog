package code.Unidad_Colecciones;

import code.Unidad9_Interfaces.interfaces.Perro;
import code.Unidad_Colecciones.Clases.Contenedor;

public class UsoContenedor 
{
    public static void main(String[] args) 
    {
        Perro[] listaPerros = new Perro[0];
        Contenedor<Perro> perrera =  new Contenedor<Perro>(listaPerros);

        Integer[] numerosArray = {};
        Contenedor<Integer> numeros =  new Contenedor<Integer>(numerosArray);

        Perro p1 = new Perro("ROKO", "Pitbull");
        Perro p2 = new Perro("SULTAN", "Pitbull");
        Perro p3 = new Perro("MILIKI", "Pitbull");



        perrera.InsertarAlFinal(p2);
        perrera.InsertarAlFinal(p1);

        System.out.println(perrera.toString());

        perrera.insertarAlPrincipio(p3);

        System.out.println(perrera.toString());

        perrera.ordenar();

        System.out.println(perrera.toString());


        Perro p4 = perrera.extraerDelFinal();
        System.out.println(p4.toString());

        Perro p5 = perrera.extraerDelPrincipio();
        System.out.println(p5.toString());

        System.out.println("-----------------------------------------");

        numeros.insertarAlPrincipio(1);
        numeros.insertarAlPrincipio(25);
        numeros.InsertarAlFinal(5);
        System.out.println(numeros.toString());

        
    }
}
