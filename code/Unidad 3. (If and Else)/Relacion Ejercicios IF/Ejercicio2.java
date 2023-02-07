import java.text.BreakIterator;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir hora");
        int hora = sc.nextInt();



        if(hora>= 6 && hora<=12)
        {
            System.out.println("Buenos Días");
        
        }
        else if (hora >12 && hora<=20)
        {
            System.out.println("Buenas Tardes");
        }
        else if ((hora> 21 && hora<=24) || (hora>=1 && hora<=5))
        {
            System.out.println("Buenas Noches");
        }

        
    }

}
