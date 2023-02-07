import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
    float decimal = 100.04f;
    float entero = 1;


    //decimal = entero

    entero = (int)decimal; // pierde algo de informacion al imprimir por pantalla
    System.out.println(entero);
    System.out.println(decimal);
    }
    
}
