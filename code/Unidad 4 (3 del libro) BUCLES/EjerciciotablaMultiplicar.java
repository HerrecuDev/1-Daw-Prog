import java.util.Scanner;

public class EjerciciotablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿De que numero necesitas la tabla de Multiplicar");
        int tablaDel = sc.nextInt();

        System.out.println("Tabla del " + tablaDel);
        for (int aux = 0; aux <= 10 ; aux++) {
            System.out.println( aux + "x" + tablaDel + "=" + aux*tablaDel);
            
        }
        

        //Repetimos el ejercicio anterior pero que nos de n tablas que pidamos por pantalla.
        
        
       

        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Tabla del " + tabla);
            System.out.println("--------------------");
            for (int numero = 1; numero <= 10 ; numero++) {
                System.out.println( numero + "x" + tabla + "=" + numero*tabla);
                
            }
            
        }
       

      



    }

    
}
