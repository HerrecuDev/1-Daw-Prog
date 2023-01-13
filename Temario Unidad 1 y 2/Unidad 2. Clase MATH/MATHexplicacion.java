
public class MATHexplicacion {
    public static void main(String[] args) {

        System.out.println( "PI = " + Math.PI);

        //Absoluto Los pone en positivo

        float decimal1 = 23.346f;
        float decimal2 = 25.7543f;
        float decimal3 = 20.022f;






        // Potencia -POW
        System.out.println(Math.pow(2, 4));
        double resultado = Math.pow(2, 4);
        System.out.println(Math.pow(156, 5000));
        double resultadogrande = Math.pow(156, 5000);

        System.out.println(resultado);



        double raizCuadrada = Math.sqrt(resultado);
        System.out.println( "Raiz de " + resultado);



        //Ramdom/Aleatorio
        double aleatorio = Math.random();
        System.out.println("Aleatorio : " + aleatorio);

        double aleatorio2 = Math.random();
         //Para que sea de0 a 100

        aleatorio2 = aleatorio2 *100;
        System.out.println("Aleatorio2: " +aleatorio2);

         //Para que sea entre 50 y 100
         double aleatorio3 = Math.random() * 50.0;
         System.out.println("Aleatorio3 (50 a 100)");

         

         //Redondear
         System.out.println(Math.round(decimal1));
         System.out.println(Math.round(decimal2));
         System.out.println(Math.round(decimal3));

         System.out.println(Math.floor(decimal1));
         System.out.println(Math.floor(decimal2));
         System.out.println(Math.floor(decimal3));

         System.out.println(Math.ceil(decimal1));
         System.out.println(Math.ceil(decimal2));
         System.out.println(Math.ceil(decimal3));
         
         int parteEntera1 = (int)decimal1;
         System.out.println(parteEntera1);


         //Maximo y minimo

         System.out.println("Minimo " + Math.min(decimal1, parteEntera1)); 
         System.out.println("Maximo " + Math.max(decimal1, parteEntera1));
         





        
    







        
    }
}



