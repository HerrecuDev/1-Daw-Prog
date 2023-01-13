import java.util.Scanner;

import org.w3c.dom.Notation;

/* Dado nota numerica de 0 a 10
Imprimir su nota en letra
0 - 4.9 -> nota suspensa
5, 6, 9 -> aprobado
7,8,9 -> notable
10 -> Matricula
 * 
 * Controla que la nota seaun numero entre 0 y 10
 */

public class EjercicioNOTA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = Math.random()*10 ;
        nota = Math.round(nota * 100.0)/100.0;


        if (nota>=0 && nota <= 4.9f)
        {
            System.out.println("nota Suspensa");
        }
        else if (nota >= 5 && nota<=7) 
        {
            System.out.println("AProbado");
        }

        if (nota<= 9 && nota>=7) 
        {
            System.out.println("NOTABLE");
        }
        else if  (nota <= 10 && nota > 9)
        {
            System.out.println("SOBRESALIENTE");

        }
        if (nota==10)
        {
            System.out.println("MATRICULA");
        }
        else if (nota<0 && nota>10)
        {
            System.out.println("NOTA NO VALIDA");
        }

        System.out.println("La nota es " + nota);

        
    }
    
}
