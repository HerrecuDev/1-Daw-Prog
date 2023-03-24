package code.Unidad6ClasesHerencia.EjercicioCajeroColas;

import code.Unidad6ClasesHerencia.EjercicioCajeroColas.Clases.Caja;
import code.Unidad6ClasesHerencia.EjercicioCajeroColas.Clases.Clienteclases;

public class UsoCola 
{
    public enum AccionesBanco {INGRESAR , RETIRAR};

    public static void main(String[] args) 
    {
    
        Caja caja = new Caja();
        

        Clienteclases cliente1 = new Clienteclases("Andres", AccionesBanco.RETIRAR, 100);
        caja.cogerTurno(cliente1);

        Clienteclases cliente2 = new Clienteclases("Javier", AccionesBanco.RETIRAR, 540.5);
        caja.cogerTurno(cliente2);

        Clienteclases cliente3 = new Clienteclases("Sara", AccionesBanco.RETIRAR, 1500);
        caja.cogerTurno(cliente3);

        caja.estadoCola();
        caja.atender();//Antendemos a Andres.
        System.out.println(caja.saldo());
       
        Clienteclases cliente4 = new Clienteclases("Miguel", AccionesBanco.INGRESAR, 2000);

        caja.cogerTurno(cliente4);
        caja.atender(); //Atendemos a Javier

        System.out.println(caja.saldo());
        caja.estadoCola();
        caja.atender();//Atendemos a SARA
        caja.atender();//Atendemos a Miguel
        System.out.println(caja.saldo());
 
 
 
    }

 


}
