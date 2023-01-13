import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir numero");
        int numero = sc.nextInt();

        System.out.println("¿Que digito buscas?");
        int digito = sc.nextInt();

        int n = 0 ;
        int invertido = 0 , 
        resto = 0;
        

        if (digito > 10) 
        {
            System.out.println("El digito solo puede ser del 1 al 10 ");
            System.exit(0);
            
        }
        
        else
        {
            
        while (numero > 0) 
        {
            resto = numero % 10;
            invertido = invertido *10 + resto;
            numero /= 10;
            
        }

         
        String posicion = " ";
        int contadorApariciones = 0;
        int posicionAparicion = 1;


        while (invertido > 0) 
        {
            if (invertido % 10 == digito) 
            {
                posicion += " " + posicionAparicion;
                contadorApariciones++;
            }
            posicionAparicion++;
        

            invertido = invertido / 10;
        }
        System.out.println("El numero  " + digito + " Aparece " + contadorApariciones);
        System.out.println("La posicion es " + posicion);
    }
        }
       

      
       
    
}
