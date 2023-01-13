import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introducir altura de la piramide");
        int altura = sc.nextInt();
        
        sc.nextLine();

        System.out.println("Introducir Caracter para pintar la piramide");
        String caracter = sc.nextLine();

        //Pintamos cada una de las Filas:

        for (int fila = 0; fila < altura; fila++) 
        {
            if (fila < altura -1) 
            {
                for (int ContarEspacios = 0; ContarEspacios < altura - fila; ContarEspacios++) 
                {
                    if (ContarEspacios < (altura - fila ) -1 ) 
                    {
                        System.out.print(" ");
                    }
                    else
                     {
                        System.out.print(caracter);
                    }

                }
                //Bucle que muestra los espacios interiores de la piramide y el ultimo
                for (int ContarEspacios = 0; ContarEspacios < fila*2; ContarEspacios++) 
                {
                    if (ContarEspacios< (fila*2) -1) 
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(caracter);
                    }
                    
                }
               
                
            }
          
             //Salto de Linea:
             System.out.print("  ");
        }
        for (int asteriscos = 0; asteriscos <altura; asteriscos++) {
            
        }
            
        }
        
    }
    

