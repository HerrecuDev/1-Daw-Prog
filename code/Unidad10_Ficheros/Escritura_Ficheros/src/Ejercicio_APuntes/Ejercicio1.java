package Ejercicio_APuntes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        String nombreFichero = "ficheroTexto.txt";
        String path = "src/recursos/";

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        

        try  
        {
            
            bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Dime la 1ª Linea...");
            String linea = sc.nextLine();

            while (!linea.equals("fin")) 
            {
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
                System.out.println("Dime otra linea ....");
                linea = sc.nextLine();
            }
        } 
        catch (Exception e) {
            System.out.println(e);
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
