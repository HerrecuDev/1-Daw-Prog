import java.net.Socket;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class NuevoEjercicioPenaltis 
{
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);

        //Variables ACCIONES VARIAS :
        String jugadorElige = "";
        String porteroJugadorSetira = "";
        String cpuRealiza = "";


        //Sumatorio Aciertos jugador y fallos
        int aciertosJugador = 0;
        int fallosjugador =0;
        //Sumatorio Aciertos CPU
        int aciertosCPU = 0;
        int fallosCPU = 0;
        //variables String paa aciertos y fallos.
        String acierto = "A";
        String fallo = "X";
        String cadenaJugador = "_ _ _ _ _";
        String cadenaCPU = "_ _ _ _ _";


        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        //Comienzo de la tanda de Penaltis :
        System.out.println("EMPIEZA LA TANDA DE PENALTIS");

        //Contador Penaltis:
        int penalti = 1;

        //Contador Penaltis de cada jugador :
        int penaltiJugador = 1;
        int penaltiCPU = 1;


        do {
            
            while ( (penalti < 10)) 
            {
                //Menu Eleccion de la CPU (AL AZAR):
                int cpuElige = (int)(Math.random()*3 +1);

                switch (cpuElige) 
                {
                    case 1:
                    
                        cpuRealiza = "i";
                        
                        break;
                    case 2 :
                        
                        cpuRealiza = "d";
                        
                        break;
                    case 3 :
                    
                    cpuRealiza = "c";
                    
                        break;
                
                    default:
                    

                        break;
                }
            

                //Variable Porcentaje Tiro FUera
                int lanzaFuera = (int)(Math.random()*10 +1);
                System.out.println(lanzaFuera);

                //PENALTIS IMPARES LANZADOS POR EL JUGADOR:
                if (penalti%2 == 1) 
                {
                    
                    //Menu Eleccion del jugador :
                    System.out.println("Pulse I para (lanzar el penalti/Intento de Parada) a la (Izquierda)");
                    System.out.println("Pulse D para (lanzar el penalti/Intento de Parada) a la (Derecha)");
                    System.out.println("Pulse C para (lanzar el penalti/Intento de Parada) al (Centro)");
                    System.out.println("¿Donde quieres lanzar el penalti?");
                    jugadorElige = sc.nextLine().toLowerCase();

                    switch (jugadorElige) 
                    {
                        case "c":
                            System.out.println("El jugador lanza el penalti al CENTRO");
                            break;
                        case "d" :
                        System.out.println("El jugador lanza el penalti a la DERECHA");  
                            break;
                        case "i" :
                        System.out.println("El jugador lanza el penalti a la IZQUIERDA");
                            break;
                    
                        default:
                        while (!jugadorElige.equals("c") && !jugadorElige.equals("d") && !jugadorElige.equals("i") ) 
                        {
                            System.out.println("---ERROR---");
                        System.out.println("OPCION NO VALIDA , INTRODUZCA UNA OPCION VALIDA");
                        jugadorElige = sc.nextLine().toLowerCase();
                        }
                        
                            break;
                    }

                    


                    System.out.println("El jugador " + nombre + " Lanza el penalti a la " + jugadorElige);
                    System.out.println("El portero de la cpu se tira a la " + cpuRealiza);

                    if (jugadorElige.equals(cpuRealiza)) 
                    {
                        System.out.println(" El jugador FALLA EL PENALTI ");
                        cadenaJugador = cadenaJugador.replaceFirst("_", "X");
                    
                        fallosjugador++;

                    }
                    else if ((lanzaFuera<=2)) 
                    {
                        System.out.println("EL JUGADOR LANZA EL PENALTI FUERA");
                        cadenaJugador = cadenaJugador.replaceFirst("_", "X");
                        
                        fallosjugador++;
                    }
                    else
                    {
                        System.out.println("---GOL---");
                        cadenaJugador = cadenaJugador.replaceFirst("_", "A");
                        
                        aciertosJugador++;
                    }

                    System.out.println("El resultado es , El jugador ha marcado " + aciertosJugador + " de " + penaltiJugador + " lanzados");
                    System.out.println(cadenaJugador);
                    penalti++;
                    penaltiJugador++;

            
                }

                //PENALTIS PARES LANZADOS POR LA CPU:
                else if (penalti%2 == 0) 
                {
                    System.out.println("Pulse I para (lanzar el penalti/Intento de Parada) a la (Izquierda)");
                    System.out.println("Pulse D para (lanzar el penalti/Intento de Parada) a la (Derecha)");
                    System.out.println("Pulse C para (lanzar el penalti/Intento de Parada) al (Centro)");
                    System.out.println("¿Donde quieres que se tire tu portero?");
                    porteroJugadorSetira = sc.nextLine().toLowerCase();
                    switch (porteroJugadorSetira) 
                    {
                        case "c":
                            System.out.println("El Portero se tira al CENTRO");
                            break;
                        case "d" :
                        System.out.println("El Portero se tira a la DERECHA");  
                            break;
                        case "i" :
                        System.out.println("El Portero se tira a la IZQUIERDA");
                            break;
                    
                        default:
                        while (!porteroJugadorSetira.equals("c") && !porteroJugadorSetira.equals("d") && !porteroJugadorSetira.equals("i"))
                        
                        {
                        System.out.println("---ERROR---");
                        System.out.println("OPCION NO VALIDA , INTRODUZCA UNA OPCION VALIDA");
                        porteroJugadorSetira = sc.nextLine().toLowerCase();
                        }
                            break;
                    }
                    
                    System.out.println(" La CPU lanza el penalti " + cpuRealiza);
                    System.out.println(" El portero del jugador se tira " + porteroJugadorSetira );
            
                            
                    if (cpuRealiza.equals(porteroJugadorSetira)) 
                    {
                        System.out.println("---La CPU FALLA---");
                        cadenaCPU = cadenaCPU.replaceFirst("_", "X");
                        
                        fallosCPU++;
                    }
                    else if ((lanzaFuera<=2)) 
                    {
                        System.out.println("La CPU LANZA EL PENALTI FUERA");
                        cadenaCPU = cadenaCPU.replaceFirst("_", "X");
                        
                        fallosCPU++;
                    }
                    else  
                    {
                        System.out.println("---GOL DE LA CPU---");
                        cadenaCPU = cadenaCPU.replaceFirst("_", "A");
                        
                        aciertosCPU++;
                    }
            
                    System.out.println("El resultado es , La CPU ha marcado " + aciertosCPU + " de " + penaltiCPU + " lanzados");
                    System.out.println(cadenaCPU);
                    penalti++;
                    penaltiCPU++;
                                

                }

                if (penalti >= 10 && aciertosCPU == aciertosJugador)
                {
                    System.out.println("EMPATE --- 2 tiros mas");
                    penalti = penalti -2;
                }
                    
                
            } //end While (penalti < 10)) 



        } while ((penalti<10) || (aciertosJugador == aciertosCPU));
        
            
        if (aciertosJugador > aciertosCPU) 
        {
            System.out.println("El jugador -- HA GANADO -- , JUGADOR = " + aciertosJugador + " CPU  = " + aciertosCPU);
        }
        else 
        {
            System.out.println("LA CPU -- HA GANADO -- , CPU = " + aciertosCPU + " JUGADOR  = " + aciertosJugador);
        }
                        
        System.out.println("LA TANDA DE PENALTIS HA TERMINADO");
        
 
 
 
      }
 
}




