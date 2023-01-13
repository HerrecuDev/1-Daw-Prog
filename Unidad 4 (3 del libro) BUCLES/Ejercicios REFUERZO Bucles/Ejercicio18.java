import java.util.Scanner;

public class Ejercicio18 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Introducir primer numero entero");
    int entero1 = sc.nextInt();

    System.out.println("Introducir segundo numero entero");
    int entero2 = sc.nextInt();

    int resultado = 0;
    int minimo = 0;

    
        if (entero1<entero2) {
            minimo = Math.min(entero1, entero2);
        }
        else {
             minimo = Math.min(entero1, entero2);
        }
       
        
        while ((minimo<=entero1) || (minimo<=entero2)) {
            
            
            System.out.println(minimo + "  Es entero");
            minimo+=7;
            
        }

        
    

}
}