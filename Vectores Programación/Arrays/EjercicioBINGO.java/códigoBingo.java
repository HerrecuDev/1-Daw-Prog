import java.util.Arrays;
import java.util.Scanner;

public class códigoBingo 
{
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) 
    {
        // int[] col0 = new int[3];
        // int[] col1 = new int[3];
        // int[] col2 = new int[3];
        // int[] col3 = new int[3];
        // int[] col4 = new int[3];
        // int[] col5 = new int[3];
        // int[] col6 = new int[3];
        // int[] col7 = new int[3];
        // int[] col8 = new int[3];

        int [] col0 = {2,5,8};
        int [] col1 = {12,15,18};
        int [] col2 = {22,25,28};
        int [] col3 = {32,35,38};
        int [] col4 = {42,45,48};
        int [] col5 = {52,55,58};
        int [] col6 = {62,65,68};
        int [] col7 = {72,75,78};
        int [] col8 = {82,85,88};
        
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        
        int[] numerosGenerados = new int[0];


        System.out.println(Arrays.deepToString(carton));

        //variable para controlar si salimos del programa o jugamos otro cartón
        boolean salir = true;

        do {
            
            //Crear/restaurar carton vacio y vaciado de los numeros generados en eljuego anterior
            
            
            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            //ponerBlancos(carton);

            //introduzco los numeros de cada columna
            //rellenarNumerosCarton(carton);

            //pinto el cartón ;
            //pintarCarton(carton, numerosGenerados);

            //pregunto si quiero sacar otra bola o terminar este juego
            boolean jugar = false;














            while(jugar)
            {

                //saco numero aleatorio - no se debe repetir
                
                //pinto el carton con numeros sacados
                // int numeroAciertos = pintarCarton(carton, numerosGenerados);


                // //Eres ganador??
                // if (numeroAciertos >= 15)
                // {
                //     System.out.println("-----------------------------");
                //     System.out.println("--------  BINGO -------------");
                //     System.out.println("-----------------------------");
                // }

                //pregunto si quiero sacar otra bola o terminar este juego
                

               
            }

            //Pregunto si quiero jugar otro cartón o salir definitivamente del programa


















        } while (!salir);
    }
    


   // static int pintarCarton (int[] carton)
    {

    }
}
