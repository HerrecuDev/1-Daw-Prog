import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = null;

        try 
        {
            fr = new FileReader("src/recursos/fichero1.txt");
            int caracterLeido = fr.read();

            while (caracterLeido != -1) 
            {
                System.out.println((char)caracterLeido);
                caracterLeido = fr.read();
            }
        } 
        catch (FileNotFoundException fileNotFoundException) 
        {
            System.out.println(fileNotFoundException.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if (fr != null) 
            {
                fr.close();;
            }
        }








        System.out.println("-----------------------------------------");

        System.out.println("Leo con BufferReader");

        BufferedReader bf = null;



        try {
            fr =  new FileReader("src/recursos/fichero1.txt");
            bf = new BufferedReader(fr);


            //Es equivalente a : fr =  new BufferReader(new FileReader("src/recursos/fichero1.txt"));
            String linea = bf.readLine();

            while (linea != null) 
            {
                System.out.println(linea);
                linea = bf.readLine();
            }

            
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if (bf != null) 
            {
                bf.close();;
            }
            if (fr != null) 
            {
                fr.close();
            }
        }
    }





    
}
