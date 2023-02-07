

import java.util.Scanner;



public class FrasePalindrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
       //Introducimos la Frase que Queremos Leer :
                
        System.out.println("Introducir Frase ");
        String frase = "";

        
        


        
            while (!frase.equals("SALIR") ) 
            {
                System.out.println("Dime una Frase y te diere si es Palindrama o NO ");
                frase = sc.nextLine();

                //Quitamos los espacios :
                frase = frase.replace(" ", " ");
                boolean EsPalindro = true;
                int InicioPalabra = 0;
                int FinalPalabra = frase.length() -1;

                //Comparar ltras desde el inicio al Final
                //Opcion 1 Darle la vuelta a la frase y ver si son iguales
            
                
            
                 
                //Opcin 2 comparar letra a letra.

                while (InicioPalabra <= FinalPalabra) 
                {
                    char CaracterInicio = frase.charAt(InicioPalabra);
                    char CaracterFinal = frase.charAt(FinalPalabra);

                    if (CaracterInicio != CaracterFinal) 
                    {
                        EsPalindro = false;
                    }
                    InicioPalabra++;
                    FinalPalabra--;
                    if (CaracterInicio == CaracterFinal) 
                    {
                        System.out.println("La frase es Palindroma");
                        EsPalindro = true;
                    }
                    else 
                    {
                        System.out.println("NO ES PALINDROMA");
                    }
                }
    
               
    
             }
            
            
            
            

           }
    
}
