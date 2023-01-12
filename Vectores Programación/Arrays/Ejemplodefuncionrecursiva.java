public class Ejemplodefuncionrecursiva 
{
    public static void main(String[] args) 
    {
        static int factorial (int n) 
        {
            if (n==1) 
        {
            int resultado = 1;
            return resultado;
        }
        else 
        {
            resultado = n *factorial (n -1);
            return resultado;
        }

        
        }
    }
}