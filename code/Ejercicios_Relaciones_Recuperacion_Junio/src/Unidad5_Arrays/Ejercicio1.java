package Unidad5_Arrays;

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        int[] num = new int [12];

        System.out.println("Indice : " + num);
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
       


        for (int i = 0; i < num.length; i++) 
        {
            System.out.print("[" + num[i] + "]" );
        }
    }
}
