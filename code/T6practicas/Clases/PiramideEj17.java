package code.T6practicas.Clases;

public class PiramideEj17 
{
    //Atributos:
    private int altura;

    public static int NumPiramidesCreados;

    //Costructores:
    public PiramideEj17(int altura)
    {
        this.altura= altura;
        NumPiramidesCreados++;
    }

    

    

    //Metodos:
    public static int getPiramidesCreadas()
    {
        return NumPiramidesCreados;
    }

    @Override
    public String toString()
    {
        String resultado = "";

        for (int i = 0; i < altura; i++) 
        {
            //Pinto los espacios
            for (int j = 0; j < altura -1 -i; j++) 
            {
                resultado += "_";
            }

            //Pinto lado izquiero de la piramide
            for (int j = 0; j <=i; j++) 
            {
                resultado+= "*";
            }

            //Pinto lado derecho de la piramide

            for (int j = 0; j < i; j++) 
            {
                resultado+= "X";
            }

            //Salto de linea 
            resultado += "\n";
            
        }
        return resultado;

    }

}
