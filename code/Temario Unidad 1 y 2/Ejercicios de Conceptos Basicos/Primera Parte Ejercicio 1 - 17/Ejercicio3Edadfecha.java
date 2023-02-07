import java.util.Scanner;

public class  Ejercicio3Edadfecha {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2022;

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce Tu ano de Nacimiento");
        int anoNacimiento = sc.nextInt();
        //System.out.println("Introduce ano atual");
        //int anoactual = sc.nextInt();

        int edadActual = (CURRENT_YEAR - anoNacimiento);

        System.out.println("Su edad Actual es " + edadActual);

        sc.close();




        
    }
}
