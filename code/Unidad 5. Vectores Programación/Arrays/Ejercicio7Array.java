import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7Array 
{
    public static void main(String[] args) 
    {
        int [] array = new int [100];
        rellenarAleatorio(array);

        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Que numero quiere sustituir?");
        int numeroAcambiar = sc.nextInt();
        System.out.println("¿por cual numero lo quiere cambiar?");
        int sustituto = sc.nextInt();

        System.out.println(array);

        
    }

    /**
     * 
     * @param array
     */
    static void rellenarAleatorio ( int [] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)Math.random()*21;
            array[i] = aleatorio;


            
        }

    }
}
