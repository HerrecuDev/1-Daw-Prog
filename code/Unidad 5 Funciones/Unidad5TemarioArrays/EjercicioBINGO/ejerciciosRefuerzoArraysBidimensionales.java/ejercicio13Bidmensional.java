import java.util.Arrays;

public class ejercicio13Bidmensional 
{
    public static void main(String[] args) 
    {
        String [] pais = {"ES","RU","JA","AUS"};
        int [][] alturas = new int [4][10];

        System.out.println(Arrays.deepToString(alturas));

        //Imprimimos las alturas :
        imprimimosAltura(pais,alturas);
        //Imprimimos todo junto :
        //paisYaltura(pais , alturas);

        
    }

    static void imprimimosAltura(String[] pais,int[][] arrayBid)
    {
        for (int i = 0; i < arrayBid.length; i++) 
        {
            
           System.out.print(pais[i] + "\t");
           


            for (int j = 0; j < arrayBid[0].length; j++) //Recorro cada elemento
            {
                int alturaAleatorio = (int)((Math.random()*(210-139)+140));

                arrayBid[i][j] = alturaAleatorio;
                //O tmbien puede ser arayBid[j];
                System.out.print( + arrayBid[i][j] + "\t" );
            }
            //Hacemos la media :
            int media = mediasAltura(arrayBid[i]);
            System.out.println("Media" + "\t"+ media );
            

            //Calculamos el maximo y minimo:
            int [] maximo = calcularMAximoMinimo(arrayBid[i]);
            // int minimo = calcularMAximoMinimo(arrayBid[i]);
            System.out.println("Maximo" + "\t" + maximo);

            System.out.println("|");
        }

    }

    static int mediasAltura(int[] fila)
    {
        int media = 0;
        for (int i = 0; i < fila.length; i++) 
        {
            media += fila[i];
            
        }
        if (fila.length > 0) 
        {
            media = media / fila.length;
        }
        
        return media;
    }

    /**
     * 
     * @param fila
     * @return
     */


    static int[] calcularMAximoMinimo (int[] filas)
    {
        int [] resultado = new int [2];

        int maximo = filas[0];
        int minimo = filas[0];


        for (int i = 0; i < filas.length; i++) 
        {
            if (filas[i] > maximo) 
            {
                maximo = filas[i];
            }
            if (filas[i] < minimo) 
            {
                minimo = filas[i];
            }

            
        }
        return resultado;
    }
   

    
}
