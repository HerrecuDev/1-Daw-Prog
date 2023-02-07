import java.util.Scanner;
public class Ejercicioconanadido {
    public static void main(String[] args) {
        final int SUELDO_BASE = 950;
        final float HORA_EXTRA = 21.40f;
        final float DINERO_FORMACION = 0.05f;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("¿cuantos años lleva en la empresa?");
        int anosEnlaempresa = sc.nextInt();
        anosEnlaempresa = 150*anosEnlaempresa;

        System.out.println("¿Cuantos hijos tiene?");
        int Hijos = sc.nextInt();
        float importeXHijos = 10*Hijos;

        System.out.println("¿Cuantas horas extras ha realizado este mes?");
        float horasExtras = sc.nextFloat();
        horasExtras = horasExtras*HORA_EXTRA;
        //Si tienes 3 hijos o mas
         
        //Calculos

         float resultadonomina = (anosEnlaempresa +  (SUELDO_BASE) + importeXHijos + horasExtras);
         float dineroParaformacion = resultadonomina *DINERO_FORMACION;
         float NominaFinal = (resultadonomina - dineroParaformacion );

         //Mostrar por pantalla

        System.out.println(" Su Nomina Final es " + NominaFinal);
        System.out.println("De los cuales " + resultadonomina + "Es de sueldo base, antiguedad y bonificacion por año ");
        System.out.println("Las horas extras realiadas son " + horasExtras);
        System.out.println("El dinero que quedaria para la formacion es " + dineroParaformacion);


        sc.close();


    
    

    }
}
        
        
