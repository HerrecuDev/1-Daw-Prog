import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        int numero = sc.nextInt();

        String pares = "";
        
        int sumatoriopares = 0;
        int numeroOperativo = numero;

        while (numeroOperativo > 0) 
        {
            int resto = numeroOperativo % 10;

            //Vemos si es Par
            if (resto % 2 == 0) 
            {
                sumatoriopares += resto;
                pares = resto + "" + pares;
                
            }
            numeroOperativo = numeroOperativo / 10;

            
        }
        System.out.println("El digito de los pares es = " + pares );
        System.out.println("La suma total de los numeros pares = " + sumatoriopares);
    }
    
}
