import java.util.Scanner;
/*PEDIR EDADES 
TERMINA AL PONER -1
MUESTRA SUMA DE EDADES, MEDIA , TOTAL ALUMNOS ALUMNOS +18 */





public class EjercicioEstadisticaIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una edad ");
        int edad = sc.nextInt();
        
        int CantidadAlumnos = 0;
        int sumadaEdades = 0;
        int alumnosMayorEdad =0;

        while (edad != -1) {
            //Conjunto de Intrucciones:
            if (edad >=11) {
                sumadaEdades += edad; // Sumaedades = sumaedades + edad
                CantidadAlumnos++;
            }
               
                if (edad >= 18) {
                    alumnosMayorEdad++;
                    }
                    else {
                        System.out.println("Edad no valida debe tener mas de 10 años");
                    }
                //Actualizar la condicion:
                System.out.println("Introduce una edad ");
                edad = sc.nextInt();
           
        }
        
        
        System.out.println("La suma de edades es = " + sumadaEdades);
        System.out.println("La media de edades = " + (sumadaEdades / (double)CantidadAlumnos));
        System.out.println("El total de alumnos son = " + CantidadAlumnos);
        System.out.println("Los Alumnos Mayores de edad son = " + alumnosMayorEdad);
        
        
    }
    
}
