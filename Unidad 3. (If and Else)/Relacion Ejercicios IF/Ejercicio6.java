import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float g = 9.81f;
        System.out.println("Introducir Altura");
        double altura = sc.nextDouble();
        double tiempo = Math.sqrt((2*altura)/(g));

        if (altura <=0)
        {
            System.out.println("NO SE PUEDE CALCULAR");
        }
        else if (altura >= 0)
        {
            System.out.println("El tiempo es = " +tiempo);
        }

    }
    
}
