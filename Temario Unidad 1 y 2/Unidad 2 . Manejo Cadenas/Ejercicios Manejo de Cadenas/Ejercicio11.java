import java.util.Scanner;

//1º Leer un caracter entre el 0 y el 9
//2º Comprobar que es un digito
//3º Convertir caracter en int
//4º Ver si esta dentro de lalongitud de la cadena
//5º Mostrar caracter (ver si es espacio) y (Mostrarlo)




public class Ejercicio11 {
    public static void main(String[] args) {
       String cadena = "Mi nombre es Pablo";
                //LEO EL CARACTER
      
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter del 0 al 9");
        String posicioncaracterString = sc.nextLine();
        
        char digitoLeido = sc.nextLine().charAt(0);
        
        sc.close();


        //Comprobaciones
        boolean  esDigito = Character.isDigit(digitoLeido);
        int longitudCadena = cadena.length();
        int digitoleido_int= Character.getNumericValue(digitoLeido);
        boolean esDentro = longitudCadena > digitoleido_int;

        //Leer caracter de la cadena

       
        char caracterLeido = (esDigito && esDentro) ? cadena.charAt(digitoleido_int) : ' ';

        //Leer si es un espacio
        boolean esEspacio = Character.isSpaceChar(caracterLeido);

        String ResultadoFinal = (!esEspacio) ? caracterLeido + " " : "-ESPACIO-";

        //Muestro el caracter de la posicion Leida

        System.out.println((esDigito && esDentro) ? "El caracter es " + ResultadoFinal :  " --ERROR-- ");




        




    }
    
}
