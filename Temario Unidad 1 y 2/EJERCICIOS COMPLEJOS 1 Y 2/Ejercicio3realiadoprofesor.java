import java.util.Scanner;

public class Ejercicio3realiadoprofesor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String texto = "Muchos años después,frente al pelotón de fusilamiento, el coronel Aureliano Buendia había derecordar aquella tarde remota en que su padre lo llevó a conocer el hielo.(Cien años de soledad. G. García Márquez).";
        
        //Para sacar informacion del autor
        int indiceInicial = texto.indexOf("(");
        int indiceFinal = texto.indexOf(")");
        String infoTexto = texto.substring(indiceInicial +1, indiceFinal);
        System.out.println("Libro " + infoTexto);


        //Busqueda del  numero ramdon
        int longitud = texto.length();
        int posicion = (int)(Math.random() *(longitud-1));
        char caracterBuscado = texto.charAt(posicion);
        System.out.println("El carcter en la posicion  " + posicion + " es " + caracterBuscado);

        //Trozear por Palabras
        String [] palabras = texto.split(" ");
        int numeroPalabras = palabras.length;
        int PalabraBuscada = (int)(Math.random() * (numeroPalabras -1 ));
        String palabra = palabras[PalabraBuscada];
        System.out.println("La palabra en la posicion " + PalabraBuscada + " es " + palabra );

        //Preguntar como se llama coronel

        String textoMinuscula = texto.toLowerCase();
        String respuesta = "Aureliano Buendia";
        respuesta = respuesta.toLowerCase();
        int posicionRespusta = textoMinuscula.indexOf(respuesta);
        System.out.println((posicionRespusta>=0) ? "BIEN"  : "MAL");
    }
    
}
