import java.util.Scanner;

import javax.tools.OptionChecker;

public class NuevoIntentoCaracterCifrado 
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Introducir Frase");
     String frase = sc.nextLine();

     System.out.println("Introduce factor Cifrado");
     int cifrado = sc.nextInt();

      int longitudFrase = frase.length();
      String[] palabras = frase.split(" ");
      
      String nuevaFrase = "";
      String palabraCifrada = "";

      String opcionElegida = "";
      sc.nextLine();
      do 
      { 
         
         System.out.println("*PULSE 1 PARA CIFRAR*");
         System.out.println("*PULSE 2 PARA DESCIFRAR*");
         System.out.println("*PULSE 3 PARA SALIR*");
         System.out.println("Que deseas realizar?");
         opcionElegida = sc.nextLine();

         /*System.out.println("¿Desea introducir nueva frase?");
         String respuesta = sc.nextLine().toLowerCase();

         if (respuesta.equals("si")) 
         {
          System.out.println("Introducir nueva frase"); 
          String nuevaFraseCifrar = sc.nextLine();
         }
         else 
         {
            System.out.println(frase);
         }*/


         switch (opcionElegida) 
         {
         case "1":
            
         
         for (int contadorPalabra = 0; contadorPalabra < palabras.length; contadorPalabra++) 
       {
        String palabra = palabras[contadorPalabra];
        int longitudPalabra = palabra.length();
        System.out.println(contadorPalabra + " " + palabras[contadorPalabra] );
        palabraCifrada ="";
        for (int Puntero = 0; Puntero <longitudPalabra ; Puntero++) 
        {
           char caracterPuntero = palabra.charAt(Puntero);

           int numeroCaracterCifrado = (int)(caracterPuntero) + cifrado;
           char caracterCifrado = (char)(numeroCaracterCifrado);

           System.out.println(caracterPuntero + "--" + (int)(caracterPuntero) + " " +  numeroCaracterCifrado + "-- " + caracterCifrado);
           
           palabraCifrada = palabraCifrada + caracterCifrado;
           
           
        }

        nuevaFrase = nuevaFrase + palabraCifrada ;
   
    }
    System.out.println(nuevaFrase);
               
               break;
               case "2" :
                  System.out.println(frase);
                  break;
         
            default:
            System.out.println("CERRAMOS EL PROGRAMA");
               break;
         }
         
      

     

   } while (!opcionElegida.equals("3"));




    }
    
}
