import java.util.Scanner;

public class Ejercicio3_PabloHerrera 
{
    public static void main(String[] args)  
    {    
        Scanner sc = new Scanner(System.in);

        //Variables :
       
        String opcion = "";
        String cadenaNueva = "";
        


        do 
        {

            System.out.println(" A) Introducir una cadena de caracteres (elimina la frase que hubiera y almacena la nueva)"); 
            System.out.println(" B) Mostrar la cadena actual.");
            System.out.println(" C) Pregunta por una cadena de caracteres y devuelve el número de apariciones de dicha cadena en la cadena principal y las posiciones que ocupa en la cadena principal.");
            System.out.println("D) Recorrer cada una de la palabras de la cadena principal en orden inverso y devolver por cada palabra: Si posición + la palabra + longitud la palabra.");
            System.out.println(" E) Invertir las palabras de la cadena principal utilizando un bucle."); 
            System.out.println(" F) Salir");

            System.out.println("¿Que opcion quieres Realizar?");
             opcion = sc.nextLine().toLowerCase();

            switch (opcion) 
            {
                
                case "a":
                    System.out.println("Introducir nueva cadena");
                    cadenaNueva = sc.nextLine();
                    
                    break;
                case "b":
                    if (cadenaNueva.equals(""))
                    {
                        System.out.println("La cadena esta vacia");
                    }
                    else
                    {
                        System.out.println(cadenaNueva);
                    }
                    System.out.println("La cadena Actual es = " + cadenaNueva);
                    break;

                case "c":
                    System.out.println("¿Que palabra desea buscar de la cadena?");
                    String cadenaAbuscar = sc.nextLine().toLowerCase();

                    
                    int posicionLugar = cadenaNueva.indexOf(cadenaAbuscar);
                    System.out.println("La palabra " + cadenaAbuscar + " aparece en la posicion : " + posicionLugar);

                    break;
                case "d":
                String [] palabras = cadenaNueva.split(" ");
                System.out.println(palabras.length);

                for (int contadorpalabras = 0 ;  contadorpalabras < palabras.length ; contadorpalabras++) 
                {
                String palabra = palabras[contadorpalabras];
                int longitudPalabra = palabra.length();
                System.out.println( contadorpalabras + " - " + palabra + " " +  ((longitudPalabra) + " letras"));
                }
                
                    break;
                case "e" :
                     palabras = cadenaNueva.split(" ");
                     int longitudPalabras = palabras.length;
                     

                    for (int palabra = longitudPalabras ;  palabra >= 0 ; palabra--) 
                    {
                         
                        System.out.println(palabras);
                    }
                    break;
                case "f" :
                System.out.println("Salimos del PROGRAMA");
                    break;    

            
                default:
                    break;
            }
            
        
        
        
        
        
        
        
        
        
        
        
        } while (!opcion.equals("f"));






        
    }
    
}
