import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        /*Escribe un programa que escriba los n primeros numeros de fibonachi */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero para calcuar");
        int numero =sc.nextInt();

        switch (numero){
            case 0 :
            System.out.println("0");
            break;
            case 1 :
            System.out.println("0 , 1");
            break;
            

            default : 
            //Bucle de calcular Finobachi:
            int num1 = 0;
            int num2= 1;

            System.out.println(num1 + "," + num2);

            int suma = num1 + num2;

            while (numero>=2) {
                System.out.println(","+ suma);
                numero--;
                num1 = num2;
                num2 = suma;

                suma = num1 + num2;
            }

                    break;
        
        }
        
    
}
}