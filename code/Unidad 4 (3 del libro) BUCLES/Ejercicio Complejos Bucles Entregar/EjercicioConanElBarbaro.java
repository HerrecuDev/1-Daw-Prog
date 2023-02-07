import java.util.Scanner;

public class EjercicioConanElBarbaro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //VARIABLES FIJA DE MI JUEGO :
        final int VIDAS_CONAN = 4;
        final int NUMERO_ZOMBIE = (int)(Math.random()*6) + 5;

        final int ATAQUE_OPCION1 = 60;
        final int DEFENSA_OPCION1 = 40;

        final int ATAQUE_OPCION2 = 70;
        final int DEFENSA_OPCION2 = 30;

        
        final int ATAQUE_OPCION3 = 30;
        final int DEFENSA_OPCION3 = 70;

        final int ATAQUE_ZOMBIE = 50;
        final int DEFENSA_ZOMBIE = 70;
        
    //OPCION PARA CONTINUAR EN EL JUEGO:
        String continuarjuego = "";
        
        
       //INTRODUCIMOS UN CONTADOR DE PARTIDAS.
       int PartidasGanadas = 0;
       int PartidasPerdidas=0;

       
            
                

        do
        {
            
            //Primero creamos el Menu inicial:
            System.out.println("Elige el tipo de Arma que vas a utilizar en la Partida....");
            System.out.println("OPCION 1  : Espada a 2 Manos = Ataque 60 y Defensa 40");
            System.out.println("OPCION 2 : Hacha = Ataque 70 y Defensa 30");
            System.out.println("OPCION 3 : Espada Corta y  escudo = Ataque 30 y Defensa 70");
            
            int TipoArma = sc.nextInt();
            int ContadorVidas = VIDAS_CONAN;
            int ContadorZombie = NUMERO_ZOMBIE;


           
             

            int maxAtaqueConan =0;
            int maxDefConan = 0;
            

           
                //Especificamos las diferentes Opciones :
            switch (TipoArma) {
                case 1:
                maxAtaqueConan = ATAQUE_OPCION1;
                maxDefConan = DEFENSA_OPCION1;

                
                    break;
                case 2 :
                    maxAtaqueConan = ATAQUE_OPCION2;
                    maxDefConan = DEFENSA_OPCION2;   
                    
            
                    break;

                case 3 :
                    maxAtaqueConan = ATAQUE_OPCION3;
                    maxDefConan = DEFENSA_OPCION3;

                        break;
                
            
                default:
                System.out.println("OPCION NO VALIDA , Elige un Numero de Arma valido");

                TipoArma = sc.nextInt();
                    break;

                    
            }
                
            
        //COMIENZA LA BATALLA :
        
            
           while ( ContadorVidas > 0 && ContadorZombie > 0) 
           {

            
            //BATALLA SEGUN LA OPCION QUE ELEGIMOS :
            
            
                int resultadoAtaqueConan = (int)(Math.random()*maxAtaqueConan) +1;
                int resultadoDefensaZombie = (int)(Math.random()*DEFENSA_ZOMBIE) +1;

                int resultadoDefensaConan = (int)(Math.random()* maxDefConan) +1;
                int resultadoAtaqueZombie = (int)(Math.random()*ATAQUE_ZOMBIE) +1;
            //INTRODUCIMOS LA OPCION EXTRA DE QUE CUANDO CONAN USE ESCUDO SU DEFENSA SIEMPRE ES 30:
                if (TipoArma == 3) 
                {
                    resultadoDefensaConan = 30;
                }

                System.out.println("Conan Ataca con = " + resultadoAtaqueConan);
                System.out.println("Zombie " + ContadorZombie + " Defiende con = " + resultadoDefensaZombie);
                System.out.println("--------------------------------");
               
                // DIFERENTES CASOS QUE PUEDEN OCURRIR SEGUN LOS VALORES QUE NOS DE.


                if (resultadoAtaqueConan <= 5 ) 
                {
                System.out.println("CONAN LA HA PIFIADO , SE AUTOLESIONA");
                ContadorVidas--;
                System.out.println("Ha conan le Quedan " + ContadorVidas);  
                System.out.println("-----------");  
                }

                else if (resultadoAtaqueConan > resultadoDefensaZombie) 
                {
                    System.out.println("ZOMBIE "+ ContadorZombie +  " HA MUERTO");
                    ContadorZombie--;
                    System.out.println("Aun quedan " + ContadorZombie + "   zombies con vida");
                    System.out.println("----------------------------");
                } 



                //Selector de lo que puede ocurrir: pierde vida conan o se defiende bien
                else if ((resultadoAtaqueConan <= resultadoDefensaZombie)) 
                {
                    //Le toca al zombi atacar
                    //calculo de los numeros de ataque y defensa

                    System.out.println("LE TOCA AL ZOMBIE ATACAR");
                    System.out.println("Zombie " + ContadorZombie + " ataca con = " + resultadoAtaqueZombie);
                    System.out.println("Conan se Defiende con = " + resultadoDefensaConan);
                   
                    
                    
                    if (resultadoAtaqueZombie > resultadoDefensaConan)
                    { 
                        System.out.println("Conan Pierde 1 Vida");
                    ContadorVidas--;
                    System.out.println("Ha conan le Quedan " + ContadorVidas);
                    System.out.println("--------------------------------");
                    }

                    //vuelve a atacar conan  --> vuelvo al principio del bucle

                    else 
                    {
                        System.out.println("Conan vuelve a ATACAR ");
                        
                        
                    }


                 }

                 
                    

                   
                   
                    
                

                   

               //UNA VEZ TERMINADA LA BATALLA , IMPRIMIMOS POR PANTALLA LA VICTORIA O DERROTA.  
                if (ContadorVidas == 0) 
                {
                    System.out.println("CONAN HA MUERTO");
                    System.out.println("----------------------------------------------------");
                                          System.out.println("GAME OVER");
                    System.out.println("----------------------------------------------------");
                    
                    //CALCULAMOS LAS PARTIDAS PERDIDAS :
                    PartidasPerdidas++;
                    System.out.println("Llevas " + PartidasPerdidas + " PERDIDAS");
                }
               else if ( ContadorZombie == 0)
               {
                    System.out.println("NO QUEDAN MAS ZOMBIES");
                    System.out.println("ENHORABUENA HAS GANADO EL TESORO");

                    //CALCULAMOS LAS PARTIDAS GANADAS :
                    PartidasGanadas++;
                    System.out.println("Llevas " + PartidasGanadas + " GANADAS");
               }
                
                    
                    
                   
                }
             
                
                   
            
             
              //LIMPIAMOS EL BUFER
            sc.nextLine();


             //PREGUNTAMOS SI QUEREMOS CONTINUAR CON EL JUEGO O NO.
            System.out.println("¿QUIERES JUDAR OTRA VEZ ?  (s para si / otra para terminar)" );
             continuarjuego = sc.nextLine().toLowerCase();
           
            
            
            
           
           
        } 
       
        
        while (continuarjuego.equals("s"));

        if (!continuarjuego.equals(" ")) {
            System.out.println("EL JUEGO HA TERMINADO");
            System.out.println("HAS GANADO = " + PartidasGanadas +  " PARTIDAS");
            System.out.println("HAS PERDIDO  = " + PartidasPerdidas + " PARTIDAS");
        }

       
        
    
    
    
    
    }
    
}
          
        
        

        
        
    




        






 
 



/*if (continuarjuego.equals("s")) 
{
    NuevaPartida = true;
}
 
else 
{
    NuevaPartida = !true;
}
System.out.println("¿QUIERES JUDAR OTRA VEZ ?  (s para si / otra para terminar)" );
                      continuarjuego = sc.nextLine().toLowerCase();
                    }

*/