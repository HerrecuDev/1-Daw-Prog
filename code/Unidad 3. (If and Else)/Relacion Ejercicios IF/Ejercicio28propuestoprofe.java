import java.util.Scanner;

public class Ejercicio28propuestoprofe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Al Azar jugada del tirador 1 : piedra, papel o tijera");
        String Tiradajugador = sc.nextLine();
        
        String TiradaMaquina = "";
        int jugadaMaquina = (int)(Math.random()*3 +1);
        System.out.println(jugadaMaquina);
        String resultado = " ";


        if (jugadaMaquina == 1) {
            resultado = "piedra";
        }
        else if (jugadaMaquina == 2) {
            resultado = "papel";
            
        }
        else if (jugadaMaquina == 3) {
            resultado = "tijera";
        }
        System.out.println("El jugador 2 a sacado = " + resultado);
    

    switch (Tiradajugador) {
        case "piedra":
            if (TiradaMaquina.equals("papel")) {
                resultado = "Gana jugador 2";
                
                
            }
            else if (TiradaMaquina.equals("tijera")) {
                resultado = "Gana Jugador 1";
                    
            }
            else if (TiradaMaquina.equals("Piedra")) {
                resultado = "Empate";
                
                
            }
            System.out.println(resultado);
           break;
            
           case "tijera" :
            if (TiradaMaquina.equals("papel")) {
                resultado = "Gana jugador 1";
                
                
            }
            else if (TiradaMaquina.equals("tijera")) {
                resultado= "Empate";
              
                
            }
            else if (TiradaMaquina.equals("Piedra")) {
                resultado = "Gana jugador 2";
                
                
            }
            System.out.println(resultado);
            break;
           
           
            
           
            case "papel":
            if (TiradaMaquina.equals("papel")) {
                resultado= "Empate";
                
            }
            else if (TiradaMaquina.equals("tijera")) {
                resultado = "Gana Jugador 2";
               
            }
            else if (TiradaMaquina.equals("Piedra")) {
                resultado = "Gana jugador 1";
               
            }
            System.out.println(resultado);
            break;
           
            
                
        default:
            break;
        }
    }
}


        
    
    
   
            
