import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";

        System.out.println("Dime a quien añadir");
        String nuevaPersona = sc.nextLine();
        sc.close();


        //Busco la Posicion donde insertar
        int PosicionInserccion = frase.indexOf("y");


        //1º Forma con StringBuffer

        StringBuffer sBuffer = new StringBuffer(frase);
        sBuffer.insert(PosicionInserccion-1, "," + nuevaPersona);
        System.out.println(sBuffer);

        //2º Forma con String.substring

        String ParteIzquierda = frase.substring(0, PosicionInserccion -1);
        String ParteDerecha = frase.substring(PosicionInserccion -1);
        String parteCentral =", " + nuevaPersona;
        
        System.out.println(ParteIzquierda + parteCentral +ParteDerecha);
    }
    
}
