import java.util.Scanner;

import javax.script.ScriptEngine;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca numero");
        float num1 = sc.nextFloat();

        float resultado = (num1 *num1 *num1);
        System.out.println("El resultado es " + resultado);
        sc.close();

    }
    
}
