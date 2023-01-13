public class Ejercicio4CLaseMath {
    public static void main(String[] args) {
        //Diferencias entre Round, ceil y floor.
        System.out.println("Introducimos un numero al AZAR ");
        double numero = Math.random() *100;
        System.out.println("numero introducido = " + numero);

        //Uso del round:
        System.out.println("Usando round seria = " +  Math.round(numero));

        //Uso Floor = 
        System.out.println("Usando Floor seria = " +  Math.floor(numero));

        //Uso  ceil  = 
        System.out.println("Usando Ceil seria = " +  Math.ceil(numero));

    }
    
}
