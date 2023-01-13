import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          final float NUMERO_PI =3.14f;

        System.out.println("Si el Radio es ");
        Float radio = sc.nextFloat();

        float resultadoLongitud = ((2*NUMERO_PI)*(radio));
        System.out.println("Su Longitud es " + resultadoLongitud);


        float resultadoArea = ((NUMERO_PI)* (radio*radio));
        System.out.println("Su radio es " + resultadoArea);
        
        
        
        sc.close();



    


    }
    
}
