package code.T6practicas.Clases;

public class Guitarra extends Instrumento
{
    public Guitarra()
    {
        super();
    }
    public void interpretar()
    {
        for (Notas notas : melodia) 
        {
            switch (notas) 
            {
                case DO:
                    System.out.println("DOOOO");
                    break;
                case RE:
                    System.out.println("REEEEEEE");
                    break;
                case MI:
                    System.out.println("MIIIII");
                    break;
                case FA:
                    System.out.println("FAaaaaa");
                    break;
                case SOL:
                    System.out.println("SOLllll");
                    break;
                case LA:
                    System.out.println("LAaaaa");
                    break;
                case SI:
                    System.out.println("SIiiiiiii");
                    break;
            
                default:
                    break;
            }
            
        }
    }
    
}
