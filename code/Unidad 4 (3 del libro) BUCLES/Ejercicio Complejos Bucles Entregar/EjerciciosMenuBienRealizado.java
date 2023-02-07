import java.util.Scanner;

public class EjerciciosMenuBienRealizado 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        String enter = "";
        String frase = "";

        
         
        
        
        do 
        {
            System.out.println("Opción a - Añadir a la frase (añadiendo al final de la frase ya existente)");
            System.out.println(" Opción b - Indicar la frase completa que se está creando ");
            System.out.println("* Opción c - Indicar el número de palabras que tiene la frase");
            System.out.println("* Opción d - Indicar cuantas veces a aparece un carácter en la frase (deberá preguntar por el carácter a buscar,");
            System.out.println(" Opción e - Limpiar frase");
            System.out.println("Opción s - Salir");

            System.out.println("Dime una Opcion");
            char opcion = sc.nextLine().charAt(0);
            
           


            switch (opcion) {
                case 'a':
                //Añadir a la Frase
                    System.out.println("introducir frase");
                    String fraseIntroducida = sc.nextLine();
                    frase+= " " + fraseIntroducida.trim();
                    frase=frase.trim();

                    
                    break;
                case 'b':
                //Indicar la frase completa que se esta creando
                System.out.println(frase.equals("")? "La frase esta vacia" : "La frase Actual es  \"" +frase+ "\""  );
                    
                    break;
                case 'c':
                //Indicar el numero depalabras que tiene la frase
                String [] palabra = frase.split(" ");
                int cantidadPalabras = !frase.equals("") ? palabra.length:0;
                System.out.println("El numero de palabras es = " + cantidadPalabras);
                    
                    break;
                case 'd':
                System.out.println("introduce un caracter");
                String caracter = sc.nextLine();
                
                int Aparece = 0;
                String Posicion = "";
                
                for (int i = 0; i < frase.length(); i++) 
                {
                    if (caracter.compareToIgnoreCase(frase.charAt(i) +"")==0);
                     {
                        Aparece++;
                        Posicion = Posicion + " " + (i+1);
                    }
                    
                }
                System.out.println((Aparece==0) ? "No existe dicho caracter" : "El caracter " + (caracter) + " aparece  " + Aparece + " veces" + (Aparece==1? " Y esta en la posicion" + " " + Posicion : " y esta en la posicion" +" " + Posicion));

                

                
                
                while (caracter.length()!=1) 
                
                    
                    break;
                case 'e':
                //Limpiar frase
                frase = "";
                System.out.println("La frase esta limpia " + frase);
                    
                    break;
                case 's' :
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
