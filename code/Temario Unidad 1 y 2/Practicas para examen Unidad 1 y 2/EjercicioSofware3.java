import java.util.Scanner;

public class EjercicioSofware3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "Muchos años después,frente al pelotón de fusilamiento, el coronel Aureliano Buendia había derecordar aquella tarde remota en que su padre lo llevó a conocer elhielo. (Cien años de soledad. G. García Márquez).";
        //Pide Frase con la info del autor
        int InicioFrase = texto.indexOf("(");
        int FinalFrase = texto.indexOf(")");
        String autor = texto.substring(InicioFrase, FinalFrase);
        System.out.println("La informacion del autor es = " + autor);

        //Pide buscar un carater al azar
        int totalCaracteres = texto.length();
        System.out.println("El total de caracteres es = " + totalCaracteres);

        int posicion = (int)(Math.random()*totalCaracteres -1);
        char CaracterBuscado = texto.charAt(posicion);
    
        System.out.println("El caracter perteneciente al  numero  " + posicion + " " + "es " + CaracterBuscado );

        // Trozear texto en Palabras:
        String [] palabras = texto.split(" ");
        int totalpalabras = palabras.length;
        int PosicionPalabra = (int)((Math.random()  ) * (totalpalabras -1));
        String PalabraBuscada = palabras[PosicionPalabra];

        System.out.println("En la posicion " + PosicionPalabra + " " + " La palabra es " + PalabraBuscada);
        
        




    }
      

        
    
}
