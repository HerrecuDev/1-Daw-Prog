package Clases.Utiles;

import java.util.Scanner;

public class Lectura_Teclado 
{
    //Atributo :
    private Scanner sc;
    public int nextLine;



    //Contructor : 
    public Lectura_Teclado()
    {
        sc = new Scanner(System.in);
    }


    //Metodos :

    public void leerCadena(String cadena)
    {
        try 
        {
            
        } 
        catch (Exception e) 
        {
            // TODO: handle exception
        }

    }

    public int leerInteger(Integer numero)
    {
        Integer resultado = null;

        boolean correcto = false;
        do 
        {
            try 
            {
                String cadenaLeida = sc.nextLine();
                resultado = Integer.valueOf(cadenaLeida);
               
            } 
            catch (NumberFormatException excepcion1) 
            {
                System.out.println("Dato no valido introduzca un dato valido Por favor");
            }
            catch(IllegalAccessException ex2)
            {
                System.out.println("Dato no valido , introduzca un dato valido");
            }
            catch(Exception ex)
            {
                System.out.println("Dato no valido , introduzca un dato valido");
            }
            
        } 
        while (!correcto);
        return resultado;
    }
    

    public void leerFloat(float numero)
    {

    }


    public void leerDouble(double numero)
    {

    }



    public void finalizarLectura()
}
