import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Escritura en fichero");


        String nombreFichero = "fichero1.ppp";
        String path = "src/recursos/" ;
        FileWriter fileWriter = null;

        try 
        {
            fileWriter = new FileWriter(path + nombreFichero , false);

            fileWriter.append('X');
            fileWriter.append("\nAlfonso");
            fileWriter.close();
        } 
        catch (Exception ex) {
            // TODO: handle exception
        }

        finally
        {
             if (fileWriter != null) 
             {
                fileWriter.close();
             }
        }






        //Ahora con el bufferedWritter :

        nombreFichero = "fichero1.ppp";
        path = "src/recursos/" ;
        BufferedWriter bufferedWriter = null;
        try 
        {
            fileWriter = new FileWriter(path + nombreFichero );

            bufferedWriter =  new BufferedWriter(fileWriter);

            bufferedWriter.write("OTRA LINEA");
            bufferedWriter.newLine();
            
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }

        finally
        {
            if (bufferedWriter != null) 
            {
                bufferedWriter.close();
            }
            if (fileWriter != null) 
            {
               fileWriter.close();
            }
        }

       
    }
}
