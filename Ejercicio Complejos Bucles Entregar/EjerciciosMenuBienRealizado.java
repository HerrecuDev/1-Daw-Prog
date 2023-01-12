import java.util.Scanner;

public class EjerciciosMenuBienRealizado 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        String enter = " ";
        
        
        do 
        {
            System.out.println("Opción a - Añadir a la frase (añadiendo al final de la frase ya existente)");
            System.out.println(" Opción b - Indicar la frase completa que se está creando ");
            System.out.println("* Opción c - Indicar el número de palabras que tiene la frase");
            System.out.println("* Opción d - Indicar cuantas veces a aparece un carácter en la frase (deberá preguntar por el carácter a buscar,");
            System.out.println(" Opción e - Limpiar frase");
            System.out.println("Opción s - Salir");

            System.out.println("Dime una Opcion ...");
            char opcion = sc.ne();
           


            switch (opcion) {
                case "a":
                //Añadir a la Frase
                    
                    break;
                case "b":
                //Indicar la frase completa que se esta creando
                    
                    break;
                case "c":
                //Indicar el numero depalabras que tiene la frase
                    
                    break;
                case "d":
                //Limpiar frase
                    
                    break;
                case "e":
                    
                    break;
                case "s" :
                salir = true;
                System.out.println("Adios");
                    break;

            
                default:
                System.out.println("Opcion NO VALIDA");
                    break;
            }
            if (opcion != 's') 
            {
                System.out.println("Pulsa Enter para Continuar...");
            enter = sc.nextLine();
                
            }
            
            
        } 
        while (!salir);

        sc.close();


    }
}
