public class Realizar8Bucles 
{
 public static void main(String[] args) 
    {
        int caracteres = 12 ;
        for (int j = 0; j < 2 ; j++) 
        {
            
        
            for (int i = 0; i < caracteres; i++) 
            {
                System.out.print("*");
                
            }
                System.out.println();
        }
       
        for (int j = 0; j < 2 ; j++) 
        {
            
        
            for (int i = 0; i < caracteres; i++) 
            {
                if (i <3 || i>=9) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print("_");
                }
                System.out.println();
            }
                
        }

        
       
       System.out.println("hacemos el 8");

    } 
}
