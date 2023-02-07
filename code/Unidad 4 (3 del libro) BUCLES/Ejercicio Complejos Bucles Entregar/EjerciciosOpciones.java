import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class EjerciciosOpciones 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String Menu = 
        "* Opción a - Añadir a la frase (añadiendo al final de la frase ya existente)" + "\n" +
        
        "* Opción b - Indicar la ultima frase introducida (el programa escribirá la frase que el usuario está creando y analizando, si la frase está vacía indicarlo)" + "\n"  +
        
        "* Opción c - Indicar el número de palabras que tiene la frase" +"\n" + 
        
        "* Opción d - Indicar cuantas veces a aparece un carácter en la frase (deberá preguntar por el carácter a buscar, mostrar el número de veces que se repite dicho carácter y sus posiciones en la frase, da igual si está escrito en mayúscula o minúscula)" + "\n" +
       
        "* Opción e - Limpiar frase" + "\n" +
        
        "* Opción s - Salir" + "\n" +
        "Indique la opcion  que quiere realizar";
        
        System.out.println("Pulse Enter para continuar");
       
        String enter = " ";
        String opcion = " ";

        
       
       //Escribimos las distintas opciones : 
       String frase = sc.nextLine();
       String FraseNueva = sc.nextLine();
       String FrasesAcumulador = " ";
       
       
        
       
       
        //PEDIMOS LA OPCION A REALIZAR. y REALIZAMOS EL BUCLE PRINCIPAL :
        while (opcion != "s") 
        {
        System.out.println(Menu);
        opcion = sc.nextLine().toLowerCase();
        
        //Limpiamos el Buffer
        sc.nextLine();


         //String AcumuladorFrase = " ";
         switch (opcion) {
            case "a":
           frase= sc.nextLine();
           if (frase.equals("") || (frase.equals(" "))) 
           {
            System.out.println("La frase esta vacia");
           }
           else 
           {
            FrasesAcumulador = frase + FraseNueva;

           }
            FrasesAcumulador = frase + FraseNueva;

            
            break;
            

            case "b":
                System.out.println("La ultima Frase introducida ha sido = " + FrasesAcumulador );
                

            break;
            case "c":
            int numeroPalabras = frase.length();
            System.out.println("La frase actual tiene " + numeroPalabras + "Palabras");
            
            System.out.println("Pulse Enter para continuar...");
            enter = " ";

            break;

            case "d" :
            System.out.println("¿Que caracter buscas?");
            String caracter = sc.nextLine();
            int posiconCaracter = frase.indexOf(caracter);
            System.out.println("El caracter " + caracter + "esta en la posicion " + posiconCaracter);

            break;

            case "e":
            sc.nextLine();
            break;

            case "s" :
                System.out.println("CERRAMOS el PROGRAMA");
                System.out.println(enter);
            break;
         
            default:
                break;
         
        }
        sc.nextLine();
        if (!opcion.equals("s")) 
        {
        System.out.println(Menu);
        opcion = sc.nextLine().toLowerCase();
            
        }
        else if (opcion.equals("s")) 
        {
            System.out.println("CERRAMOS EL PROGRAMA");
            System.out.println(enter);
            
        }
        
        
               
            
        }
       
      
       
        


        





    }
}
