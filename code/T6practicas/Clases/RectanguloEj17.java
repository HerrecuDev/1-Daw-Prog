package code.T6practicas.Clases;

public class RectanguloEj17 
{
    //Atributos :
    private int altura;
    public int base;
    public static int NumRectangulosCreados;
    


    //contructores :
    public RectanguloEj17(int base , int altura)
    {
        this.altura = altura;
        this.base = base;
        NumRectangulosCreados++;
    }

      //Metodos :

    public static int getRectangulosCreados()
    {
        return NumRectangulosCreados;
    }

  


    @Override
    public String toString()
    {
        String resultado = "";
        for (int i = 0; i < this.altura; i++) 
        {
            for (int j = 0; j < this.base; j++) 
            {
                resultado += "*";
            }
            resultado += "\n";
            
        }
        return resultado;
    }
    
    
}
