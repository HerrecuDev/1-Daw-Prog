import java.util.Scanner;

/* -1 = Rendirse
¿Quieres jugar otra vez?
s/N = diga partidas totales, ganadas y partida mas rapida en x intentos.


*/ 

public class SegundoEjercicionumeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TotalPartidas = 0;
        int totalGanadas = 0;
        int intentosMenor =0;

        boolean terminar = false;
        while (!terminar) {
            //PARTIDA
            int contadorIntentopartidas = 0;
            int numeroAdivinar = (int) (Math.random()*100 +1);
       
        System.out.println("Introducir un numero");
            int NumeroIntroducido = sc.nextInt();

            while (NumeroIntroducido != -1 && NumeroIntroducido != numeroAdivinar) {
                
                if (NumeroIntroducido > numeroAdivinar) {

                    System.out.println(" EL NUMERO INTRODUCIDO es Mayor");
                }
                else{
                    System.out.println("EL NUMERO INTRODUCIDO  es menor");
                }
               contadorIntentopartidas++;
                //Actualizamos la condicion 
            System.out.println("Introducir un numero");
                NumeroIntroducido = sc.nextInt();
            }
            TotalPartidas++;

            if (NumeroIntroducido == numeroAdivinar) {
                System.out.println("HAS GANADO");
                totalGanadas++;
                if (TotalPartidas == 1) 
                {
                    intentosMenor = contadorIntentopartidas;
                }
                else
                {
                    intentosMenor = Math.min(intentosMenor, contadorIntentopartidas);
                }
                
                intentosMenor = Math.min(intentosMenor, contadorIntentopartidas);
            }
            else if(NumeroIntroducido == -1) {
                System.out.println("ME RINDO");
                
            }
            sc.nextLine(); //PARA LIMPIAR EL BOUFET
            
            System.out.println("¿Quieres jugar otra vez ?");
            String respuesta = sc.nextLine();
            terminar = !respuesta.equals("s");

            //END JUEGO
            System.out.println("Has jugado " + TotalPartidas);
            System.out.println("Has ganado " + totalGanadas);
            System.out.println("La partida mas rapida es " + intentosMenor + "INTENTOS");
        }
    }
}
            
        
        