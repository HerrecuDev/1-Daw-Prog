public class UtilesParaNumeros 
{
    static boolean esCapicua (int numero) 
    {
        boolean resultado = false;
        int numeroAlreves = 0;
        int nuevoNumero = numero;
        while (nuevoNumero > 0) 
        {
            int resto = numero%10;
            nuevoNumero = nuevoNumero /10;
            numeroAlreves = numeroAlreves *10 + resto;
        }
        if (numeroAlreves == numero) 
        {
        resultado = true;    
        }


        return resultado;
    }

   
    
}
