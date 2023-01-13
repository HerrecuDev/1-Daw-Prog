import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de a es ");
        float a = sc.nextFloat();

        System.out.println("valor de b es ");
        float b = sc.nextFloat();

        System.out.println("valor de c es ");
        float c = sc.nextFloat();

        System.out.println("valor de X es");
        float X = sc.nextFloat();


        float y = (a*(X*X)) + (b*X) + c;
        System.out.println("El valor de y es " + y) ;
        
        
        sc.close();
    }
    
}
