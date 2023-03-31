import java.util.ArrayList;

public class Ejercicio8 
{
    public static void main(String[] args) 
    {
        ArraysList<Carta> mazo = new ArrayList<>();

        while (mazo.size() < 10) 
        {
            Carta newCarta = new Carta();

            if (!mazo.contains(newCarta)) 
            {
                mazo.add(newCarta);
            }
        }
            System.out.println(mazo);
        
    }
}
