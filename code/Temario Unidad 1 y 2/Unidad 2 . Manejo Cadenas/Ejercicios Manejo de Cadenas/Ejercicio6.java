import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        System.out.println("¿Quien estaba en casa de Juan?");
        String palabraBuscada = sc.nextLine();

        String textoMinuscula = texto.toLowerCase();
        String palabraBuscadaMin = texto.toLowerCase();

        int personatexto = (textoMinuscula.indexOf(palabraBuscadaMin));
        

        System.out.println((personatexto > 0 ) ? palabraBuscadaMin + " SI" : palabraBuscadaMin + " NO " + "  Esta  ");

        
 

        
       
        
    }
    
}
