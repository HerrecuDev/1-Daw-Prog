public class BibliotecaNumeros 
{
    static boolean esCapicua (int numero)
    {
        boolean resultado = false;
        long numeroAlreves = esVoltea (numero);
        if (numero == numeroAlreves) 
        {
        resultado = true;    
        }


        return resultado;
    }


    static long esVoltea (long num)
    {
        boolean resultado = false;
        long numeroAlreves = 0;
        long nuevoNumero = num;

        while (nuevoNumero > 0) 
        {
        long resto = nuevoNumero%10;
        nuevoNumero = nuevoNumero /10;
        numeroAlreves = numeroAlreves *10 + resto;
        }
        return numeroAlreves;
        }

    static boolean esPrimo (int numero)
{   
    boolean esPrimo = true;
   
        int i = 2;
        while (esPrimo && i < numero) 
        {
            if (numero % i == 0) 
            {
                esPrimo = false;
            }
            i++;
            
        }
        return esPrimo;
    }

    static int siguientePrimo (int numero)
    {
        int resultado = numero++;
        while (!esPrimo(numero)) 
        {
            resultado++;
       
        }
        return resultado;
    }
    
    static long potencia (Long numero , long exponente)
    {
        long numeroElevado = 0;
        for (int multiplica = 1; multiplica <= exponente; multiplica++) 
        {
            
            long calculopotencia = numero * numero;
            numeroElevado = calculopotencia * numero;
            multiplica++;

        }
        return numeroElevado;

    }
    static long digito ( long numero)
    {
        long contadordigitos = 0;

       
        while (numero !=0) 
        {
            numero = numero/10;
            contadordigitos++;
            
        }

        return contadordigitos;

    }

    static long potenciaN ( long numero)
    {
        
    }

    static int posiciondigito (long numero , int digitoBuscado)
    {
        int resultado = -1;
        //23456 , se busca el numero 3 -> y nos dice en que posicion esta.
        long numeroAlreves = esVoltea(numero);

        int contador = 0;

        // while (numeroAlreves > 0) {
        //     int resto = (int) numeroAlreves % 10;
        //     if (resto == digitoBuscado) {
        //         resultado = contador;
        //     }
        //     numeroAlreves = numeroAlreves / 10;
        //     contador++;
        // }
        // return resultado;

        long cantidad = digito(numeroAlreves);
        for (int i = 0; i < cantidad; i++) 
        {
            int resto = (int) (numeroAlreves%10);
            if (resultado == -1 && resto==digitoBuscado) 
            {
                resultado = i;
            }
            numeroAlreves = numeroAlreves/10;
        }
        return resultado;
    }
}
 

