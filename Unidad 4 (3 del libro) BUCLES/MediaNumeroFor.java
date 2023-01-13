import java.util.Scanner;

public class MediaNumeroFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidadPeticiones = 10;
        int sumaTotal = 0;
        
        for (int aux = 0; aux < cantidadPeticiones; aux++) {
            System.out.println("Dime un numero");
            int numero = sc.nextInt();

            sumaTotal += numero;
        }
        System.out.println("Media " + (sumaTotal/cantidadPeticiones));
        sc.close();
    }
    
}
