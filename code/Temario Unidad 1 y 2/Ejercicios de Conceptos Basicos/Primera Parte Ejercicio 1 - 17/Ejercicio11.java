import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nota del primer examen ");
        float nota1 = sc.nextFloat();

    
        System.out.println("¿Que nota quieres sacar en el Trimestre" );
        float Notafinal = sc.nextFloat();

        
        float nota2 = ((Notafinal - (0.4f* nota1)) / 0.6f);
        
        System.out.println("Para obtener un " + Notafinal  + "tienes que sacar un " + nota2  +"en el segundo examen");

    }
    
}
