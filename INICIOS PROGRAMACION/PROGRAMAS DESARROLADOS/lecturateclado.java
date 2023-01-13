
import java.util.Scanner; 
public class lecturateclado
{
    public static void main(String[] args)
    
    {
    Scanner lector = new Scanner(System.in);
    System.out.println("introduce tu nombre y pulsa enter");
    String nombreUsuario = lector.nextLine(); //nextline  para cadena de caracteres.
    System.out.println("-----");
    System.out.println(nombreUsuario);

    System.out.println("introduce tu edad y pulsa enter");

    int edad = lector.nextInt();
    System.out.println("------");
    System.out.println(edad);

    System.out.println("introduce precio compra");
    float compra = lector.nextFloat();
    System.out.println("-----");
    System.out.println(compra);


    }
     
}
