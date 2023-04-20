import java.io.IOException;

import utiles.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Try-Catch");

        Calculadora calc = new Calculadora();

        int resultadoDiv = calc.division(10, 2);
        System.out.println(resultadoDiv);

        Integer resultadoDiv2  = calc.division(10, 0);
        if (resultadoDiv2 != null) 
        {
            System.out.println(resultadoDiv2);
        }
        else
        {
            System.out.println("No se ha realizado la division");
        }

        System.out.println("------------------------------------");

        try
        {
            int resultadoOpcion2 = calc.division2(50,0);
            System.out.println(resultadoOpcion2);

        }

        catch(ArithmeticException atitException){
            System.out.println(atitException.getMessage());
        }
        catch(Exception atitException)
        {
            System.out.println(atitException.getMessage());
        }

        System.out.println();

    }
}
