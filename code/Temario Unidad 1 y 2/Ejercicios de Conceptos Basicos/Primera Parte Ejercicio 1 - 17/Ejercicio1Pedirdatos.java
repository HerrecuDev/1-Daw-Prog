import java.util.Scanner;

public class Ejercicio1Pedirdatos {
public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce nombre");
    String nombre = sc.nextLine();

    System.out.println("Introduce tu edad");
    int edad = sc.nextInt();

    System.out.println("Introduce decimal");
    float decimal = sc.nextFloat();

    System.out.println("Hola");

    System.out.println("Introduce Hora");
    float Hora = sc.nextFloat();
    //CON ESTA LECTURA DE TECLADO LIMPIO EL BUFFER DE TECLADO
    sc.nextLine();
    System.out.println("\"Su nombre es " + nombre +"\"Su edad es " + edad +"\"Decimal es " + decimal+ "\"La hora es " + Hora);
    sc.close();



    System.out.println("Introducido " + decimal + "");





}


}
