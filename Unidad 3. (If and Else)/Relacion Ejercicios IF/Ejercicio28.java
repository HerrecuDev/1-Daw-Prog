import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(introduzca Tirada jugador 1: piedra, papel o tijera):");
        String jugadajugador1 = sc.nextLine().toLowerCase();

        System.out.println("(introduzca Tirada jugador 2 : piedra, papel o tijera):");
        String jugadajugador2 = sc.nextLine().toLowerCase();

        String respuesta = " ";


       switch (jugadajugador1) {
        case "piedra":
            if (jugadajugador2.equals("papel")) {
                respuesta = "Gana jugador 2";
                
                
            }
            else if (jugadajugador2.equals("tijera")) {
                respuesta = "Gana Jugador 1";
                    
            }
            else if (jugadajugador2.equals("Piedra")) {
                respuesta = "Empate";
                
                
            }
            System.out.println(respuesta);
           break;
            
           case "tijera" :
            if (jugadajugador2.equals("papel")) {
                respuesta = "Gana jugador 1";
                
                
            }
            else if (jugadajugador2.equals("tijera")) {
                respuesta = "Empate";
              
                
            }
            else if (jugadajugador2.equals("Piedra")) {
                respuesta = "Gana jugador 2";
                
                
            }
            System.out.println(respuesta);
            break;
           
           
            
           
            case "papel":
            if (jugadajugador2.equals("papel")) {
                respuesta = "Empate";
                
            }
            else if (jugadajugador2.equals("tijera")) {
                respuesta = "Gana Jugador 2";
               
            }
            else if (jugadajugador2.equals("Piedra")) {
                respuesta = "Gana jugador 1";
               
            }
            System.out.println(respuesta);
            break;
           
            
                
        default:
            break;

            
       }
    }
    }
    

