package code.Matrix_PabloHerrera.Matrix_PabloHerera.EjecutarMatrix;

import java.util.ArrayList;
import java.util.Collections;

import code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes.Neo;
import code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes.Personaje;
import code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes.Personas_genericas;
import code.Matrix_PabloHerrera.Matrix_PabloHerera.Personajes.Smith;

public class main 
{
    public static void main(String[] args) 
    {
        //Generamos 200 PErsonas Genericas :
        Personas_genericas p = new Personas_genericas(1,null, null, 0);
        ArrayList<Personaje> listadoPersonas =  new ArrayList<>();

        listadoPersonas = p.factoriaPersonas(200);

        for (int i = 0; i < listadoPersonas.size(); i++) 
        {
            System.out.println(listadoPersonas.get(i).mostrarInformacion());
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        //Ahora genero las 23 Personas Genericas Junto a Smith y Neo :

        Smith agente = new Smith(2,"Agente Smith","Leganes" , null, 0, 65);

        Neo personaje  = new Neo(3,"Pablo","Madrid", 0, true,80);

       listadoPersonas = p.factoriaPersonas(23);



        //Añadimos al nuevo ArrayList de 23 Personas Genericas los personajes Neo y Smith
    
       listadoPersonas.add(personaje);
       listadoPersonas.add(agente);

       

        //Desordenamos el ArrayList con los 25 Personajes:
       Collections.shuffle(listadoPersonas);

       //Imprimimos el nuevo Array con los "25" Personajes:

       for (int i = 0; i < listadoPersonas.size(); i++) 
       {
            if (listadoPersonas.get(i) == personaje) 
            {
                System.out.print("[N]");
            }
            else if(listadoPersonas.get(i) == agente)
            {
                System.out.print("[S]");
            }
            else{
                System.out.print("[P]");
            }

            // System.out.println(listadoPersonas.get(i).mostrarInformacion());
       }



       //Comparamos el % de morir de Cada PERSONAJE :
       

       
       
    
       

       
       

       
      
    

      
       
       
       
       


        
        

    }


    
    
}
