import java.security.Principal;

/*Ejemplos de uso de los metodos de  la clase String
 * 
 */
public class ManejodeCadenas {
public static void main(String[] args) {
    String cadena = "En un lugar de la mancha";
    
    
    /*char caracter = cadena.charAt(3);
    System.out.println(caracter);*/

    //charArt
    int indice = 2;
    char caracter = cadena.charAt(indice);
    System.out.println(caracter);

    //Comparacion
    String cadena1 = "Hola";
    String cadena2 = "HolA";

    System.out.println((cadena1 == cadena2) ? "IGUALES" : "DISTINTOS");
    //System.out.println((cadena1 == "HOLA" ) ? "IGUALES" : "DISTINTOS" );

    System.out.println(cadena1.compareTo(cadena2) == 0 ? "IGUALES" : "DISTINTOS");


    System.out.println("Ignore case : " + (cadena1.compareToIgnoreCase(cadena2) == 0 ? "IGUALES" : "DISTINTOS")); 




    String apellido1 = "Lopez";
    String apellido2 ="Garcia";
    //Comparamos el apellido 1 con el 2 , te dice el numero de espacios que hay entre G y L en la tabla ASCII
    System.out.println(((apellido1.compareTo(apellido2)>0 ? apellido1 : "va despues que" + apellido2)));

    System.out.println(apellido2.compareTo(apellido1));




    //Longitud de una cadena

    int longitud = cadena.length();
    System.out.println("Cadena tiene longitud ="  + longitud);


    //Puedo sacar el  ultimo caracter

    //Se coloca el -1 debido a que los caracteres empiezan por el valor 0,1,2,3 etc)
    //Entonces te da un caracter menos que el total que da la cadena "23"
    char ultimo = cadena.charAt(longitud -1);
   // System.out.println("El primer caracter es " + primer);
    System.out.println("el ultimo caracter es " + ultimo);



    //Cadena indexof = Buscar un caracter.

    int posicionD = cadena.indexOf("d");
    System.out.println("La letra D esta en la posicion " + posicionD);


    char letraA = 'a';
    int posicionA = cadena.indexOf(letraA);
    int poscicionAA = cadena.indexOf(letraA, posicionA+1);

    System.out.println("  La letra a esta en " + posicionA + " y en " + poscicionAA);



    String lugar = "Mancha";
    int posicionlugar = cadena.indexOf(lugar);
    System.out.println(((posicionlugar >= 0) ? lugar + " Si" :lugar + " NO ") + " esta en la cadena") ;



    //Convertir a mayusculas o minisculas
    //String cadenaMiniscula = cadena.toLowerCase(); //pasar a miuscula
    //String cadenaMayuscula = cadena.toUpperCase();//Pasar a mayuscula

    String lugarMinuscula = lugar.toLowerCase();
    String cadenaMayuscula = cadena.toLowerCase();

    posicionlugar = cadenaMayuscula.indexOf(lugarMinuscula); //Discrimina si lapalabra mancha esta en minuscula o no.
    System.out.println((posicionlugar >=0 ) ? lugar + " SI " : lugar + " NO ");




    //REEMPLAZAR

    String cadenaModificada = cadena.replace("a'", "X");
    System.out.println(cadenaModificada);

    cadenaModificada = cadena.replaceAll("un", "otro");
    System.out.println(cadenaModificada);


    cadenaModificada = cadena.replaceFirst("a", "X");
    cadenaModificada = cadenaModificada.replaceAll("e", "X");
    System.out.println(cadenaModificada);



    //Eliminar espacios delante y detras
    String saludo = "       Hola y adios";
    System.out.println("-" + saludo+"- " );
    System.out.println("-" + saludo.trim()+ "-");  //Elimina los espacios de delante y de detras





    //Cortar una CADENA
     String[]trozos = cadena.split("de");
     int cantidadDetrozos = trozos.length;
     System.out.println("Partiendo de la cadena desde \"de\" me sale");

     String trozo0 = trozos [0];
     String trozo1 = trozos[1];
     System.out.println("El trozo 0 es " + trozo0);
     System.out.println("El trozo 1 es " + trozo1);


     //Cortar cadenas SubString

     String cadenaDesde5 = cadena.substring(5);
     System.out.println(cadenaDesde5);

     String cadenaDesde5Hasta20 = cadena.substring(5,20);
     System.out.println(cadenaDesde5Hasta20);


     //Concatenar 
     String saludo1 = " hola";
     String saludo2 = " Pepe";
     String saludoCompleto = saludo1 + saludo2; //Se coloca asi para cosas menos complejas.
     System.out.println(saludoCompleto);

     System.out.println(saludo1.concat(saludo2));//De esta forma para cosas mas complejas.



     float pi = 3.141334f;
     String PI = String.valueOf(pi);
     System.out.println(PI);




     // CLASE = SatringBuffer


     StringBuffer sBuffer = new StringBuffer(cadena);  //PARA DECLARAR LA CLASE STRING BUFFER
     sBuffer.setCharAt(1, 'M'); //MODIFICA LA POSICION DE UNA CADENA.
     System.out.println(sBuffer);


     sBuffer.insert(10, "DON QUIJOTE"); //INSERTA UN CARACTER DONDE DIGAMOS
     System.out.println(sBuffer); 

     boolean esDigito = Character.isDigit('3');
     boolean esEspacio = Character.isSpaceChar(' ');
     boolean esMayuscula = Character.isUpperCase('V');



    





     



}

}