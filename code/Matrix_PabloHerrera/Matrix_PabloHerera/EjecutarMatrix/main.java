package code.Matrix_PabloHerrera.Matrix_PabloHerera.EjecutarMatrix;

import java.util.ArrayList;

import code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes.Personaje;
import code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes.Personas_genericas;

public class main 
{
    public static void main(String[] args) 
    {
        //Generamos 200 PErsonas Genericas :
        Personas_genericas p = new Personas_genericas(null, null, 0);
        ArrayList<Personaje> listadoPersonas =  new ArrayList<>();

        listadoPersonas = p.factoriaPersonas(200);

        for (int index = 0; index < listadoPersonas.size(); index++) 
        {
            System.out.println(listadoPersonas.get(index).mostrarInformacion());
        }


       


        
        

    }


    
    
}
