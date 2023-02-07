public class PagadelHijo 
{
    public static void main(String[] args) 
    {
        final float PAGA_INICIAL = 0.05f;
        float dineroTotal = PAGA_INICIAL;
        int contadoXSemana = 1;
        

        while (dineroTotal <= 2000) 
        {
            dineroTotal = 2*dineroTotal ;
            contadoXSemana++;
            
        }
        System.out.println("Numero de Semanas que tiene que Ahorrar es = " + contadoXSemana);
        System.out.println("EL dinero Ahorrado seria  = "  + dineroTotal);
    }
}
