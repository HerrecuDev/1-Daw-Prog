import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Para sacar solo a parte del libro.
        String texto = "Muchos años después,frente al pelotón de fusilamiento, el coronel Aureliano Buendia había derecordar aquella tarde remota en que su padre lo llevó a conocer el hielo.(Cien años de soledad. G. García Márquez).";

        String[] partirtexto = texto.split("\\(");
        String infoautor = partirtexto [1];
        System.out.println("LIBRO =  " + infoautor);
        //Busqueda de un numero al Azar.
        System.out.println("Buscamos un numero al Azar");
        int longitud = texto.length();
        int aleatorio = (int)(Math.random()*longitud);
        System.out.println("El numero aleatorio es " + aleatorio);
       
        char numeroAleatorio = texto.charAt(aleatorio);
        System.out.println("La letra a la que corresponde dicho numero al azar es = " + numeroAleatorio);

        //Trozeamos el texto
        



        
        

      

    }
    
}
