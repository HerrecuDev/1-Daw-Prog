package utiles;

import java.util.Arrays;

public class Calculadora 
{
    

    public int suma (int x , int y)
    {
        return x+y;
    }
    public int multiplicacion(int x , int y)
    {
        return x*y;
    }
    public Integer division (int x , int y)
    {
        Integer resultado = null;

        try 
        {
            System.out.println("Vamos a por la division");
            resultado = x/y;
        } 
        catch (ArithmeticException aritException) 
        {
            System.out.println("Estas diviendo por 0 ");
            System.out.println(aritException);

            System.out.println(aritException.getMessage());
            System.out.println(Arrays.toString(aritException.getStackTrace()));
        }

        return resultado;
    }

    public Integer division2(int x , int y) throws ArithmeticException
    {
        Integer resultado = x/y;
        return resultado;
    }
    
}
