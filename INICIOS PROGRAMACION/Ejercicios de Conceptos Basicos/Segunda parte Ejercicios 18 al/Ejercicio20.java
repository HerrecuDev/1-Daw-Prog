import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NOTA_ALTA = 8;
        final int NOTA_BAJA = 5;

        final float RENTA_ALTA =20000f;
        final float RENTA_BAJA = 4000f;

        

        System.out.println("¿Nota del Primer trimestre");
        float Nota1 = sc.nextFloat();

        System.out.println("¿Nota del Segundo trimestre");
        float Nota2 = sc.nextFloat();

        System.out.println("¿Nota del tercer trimestre");
        float Nota3 = sc.nextFloat();

        float notafinal = (Nota1+Nota2+Nota3) /3;
        float obtieneBeca = (notafinal > NOTA_ALTA) &&

        System.out.println(" La nota final es " + notafinal + obtieneBeca);



        

        






    }
}
