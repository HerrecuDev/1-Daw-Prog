import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    boolean condition = true;

    
    int num = 0;



    do {
        if (num>=0) {
            int multiplos = 5*num;
           
            System.out.println("Es Multiplo de 5 * " + num +  " = " + multiplos);
            //Actualizamos la condicion:
            num++;
        }
        
    } while (num<=100);
    sc.close();
    }
}