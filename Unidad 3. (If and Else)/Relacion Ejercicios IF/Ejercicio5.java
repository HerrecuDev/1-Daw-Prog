import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir valor de A");
        double parametroA= sc.nextDouble();
        System.out.println("Introducir valor de B");
        double parametroB = sc.nextDouble();
        double resultadoX = (-parametroB / parametroA);

        if (parametroA!=0)
        {
            System.out.println("SI Hay Solucion " + (resultadoX)) ;
        }
        else if (parametroA ==0)
        {
            System.out.println("NO HAY SOLUCION");
        }
    }
    
}
