public class EjercicioBuclesREPASOEXAMEN 

{
    public static void main(String[] args) 
    {
        int altura = 4;
        for (int i = altura; i > 0; i-- ) 
        {
            System.out.print(" Altura " + i + "-");
            for (int j = 0; j <i; j++) 
            {
                System.out.print(j);
            }
            //Cuando termino de pintar la linea hago un salto de linea
            System.out.println();
            
        }







        //Manejo de Caracteres :

            char inicio = 'A';

            int codigoInicio = (int)inicio;
            System.out.println(inicio + " - " + codigoInicio);
            for (int i = 0; i <5; i++) 
            {
                char imprimir = (char)(codigoInicio +i);
                System.out.print(imprimir);
            }
                System.out.println();


            //DIferencias entre split y substring :
            String frase = " HOLA QUE TAL ESTAS";
            String [] palabras = frase.split(" ");
            String [] letra = frase.split("A");

            for (int i = 0; i < letra.length; i++) 
            {
                System.out.println(letra[i]);
            }
            System.out.println();
    }



    
    
    
}
