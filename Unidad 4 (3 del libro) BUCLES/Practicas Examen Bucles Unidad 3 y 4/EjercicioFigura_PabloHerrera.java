import java.util.Scanner;

public class EjercicioFigura_PabloHerrera 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        final int anchuraCaracteres = 4;
        String cadenaFilaPAr = "H";
        String cadenaFilaImpar = "A";
        String lineaCentral = "XX";
        
        
        System.out.println("Introduce la altura que va a tener la figura");
        int altura = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la cadena que desea insertar en la figura");
        String cadena = sc.nextLine();

        int longitudCadena = cadena.length();
        System.out.println(longitudCadena);

            for (int Figura = 1; Figura <= 2 ; Figura++) 
            {
               
            
                for (int linea = 1; linea <= altura; linea++) 
                {
                  
                        if ( linea%2 == 0) 
                        {
                            for (int h = 0; h < (4 + longitudCadena); h++) 
                            {
                                System.out.print(cadenaFilaPAr);
                            }
                            
                            
                        }

                        if (linea%2 == 1) 
                        {
                            for (int a = 0; a <(4 + longitudCadena) ; a++) 
                            {
                                System.out.print(cadenaFilaImpar);
                            }
                           
                            
                        }


                        System.out.println(" ");
                    
                }
                if (Figura < 2) 
                {
                    System.out.println(lineaCentral + cadena + lineaCentral);
                }
               

               
            
            }       
            
    }
}
