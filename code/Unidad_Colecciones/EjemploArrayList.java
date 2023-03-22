package code.Unidad_Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import javax.sound.midi.Soundbank;

public class EjemploArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> listaNombres = new ArrayList<>();
        
        listaNombres.add("David");
        listaNombres.add("David");
        listaNombres.add("Jose");
        listaNombres.add("Alfonso");
        listaNombres.add("Juan");
        System.out.println(listaNombres.toString());

        boolean contiene = listaNombres.contains("JOSE");

        System.out.println(contiene);

        contiene = listaNombres.contains("Jose");
        System.out.println(contiene);

        System.out.println(listaNombres.lastIndexOf("David"));

        for (int i = 0; i < listaNombres.size(); i++) 
        {
            System.out.println(listaNombres.get(i));
        }

        System.out.println("----------------------------------");

        Iterator<String> iterator = listaNombres.iterator();

        //iterator.next() //nos da el siguiente elemento.
        iterator.hasNext();  // nos dice si hay otro mas
        while(iterator.hasNext())
        {
            String nombreLeido = iterator.next();
            System.out.println("*" + nombreLeido);
        }

        System.out.println("----------- LINKEDLIST----------------");

        LinkedList<String> listaLincada = new LinkedList<>(listaNombres);

        System.out.println(" Listalincada : " + listaLincada.toString());
        listaLincada.addAll(listaLincada);
        System.out.println(" Listalincada : " + listaLincada.toString());

        String primero = listaLincada.getFirst();
        String ultimo =listaLincada.getLast();
        System.out.println("Primero " + primero + "Ultimo " + ultimo);




        System.out.println("-------------------Stack--------------------");

        Stack<String> pila = new Stack<>();
        pila.addAll(listaLincada);
        System.out.println(pila);

        String nombreSacado = pila.pop();

        System.out.println("Saco " + nombreSacado);
        System.out.println(pila);
        
        //Pila = (stack)listanombres ;//NO SE PUEDE.

        System.out.println("-------------------HASHET------------------");

        HashSet<String> bolsa = new HashSet<>(listaLincada);
        //me ha quitado los duplicados.

        System.out.println(bolsa);
        bolsa.add("LOLO");
        System.out.println(bolsa);

        bolsa.contains("Pepe");
        bolsa.remove("Pepe");


        Iterator<String> iteratorBolsa = bolsa.iterator();

        while (iterator.hasNext()) 
        {
            String nombre = iteratorBolsa.next();
            System.out.println(nombre + " - ");
        }
        System.out.println("\n -------------------ORDENAR---------------");
        //Collection.sort(bolsa);   NO ES POSIBLE DE EJECUTARLO DE ESTA FORMA.
        System.out.println(listaLincada);
        Collections.sort(listaLincada);
        System.out.println(listaLincada);


        //Para desordnar de manera aleatorio : 

        Collections.shuffle(listaLincada);
        System.out.println(listaLincada);

        //Para invertir el orden a la lista :
        Collections.reverse(listaLincada);
        System.out.println(listaLincada);




    }
}
