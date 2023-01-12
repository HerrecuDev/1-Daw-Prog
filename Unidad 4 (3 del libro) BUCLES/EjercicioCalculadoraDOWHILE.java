import java.util.Scanner;

// calculadora ,menu con opciones : 1)suma, 2)Resta, 3)Multi,4)DIv, 5) salir

public class EjercicioCalculadoraDOWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        boolean continuar = true;

        do {
            //Menu
            System.out.println("1 = Suma");
            System.out.println("2 = Resta");
            System.out.println("3 = Multiplicacion");
            System.out.println("4 = Division");
            System.out.println("0 = salir");
            //Segun la opcion que elegimos :
            int operacion = 0;
            int operador1 = 0;
            int operador2 = 0;


            switch (operacion) {
                case 1:
                    operacion = operador1 + operador2;
                    break;
                case 2 :
                    operacion = operador1 - operador2;
                    break;
                case 3 :
                    operacion = operador1 * operador2;
                    break;
                case 4 :
                    operacion = operador1 / operador2;
                    break;
                case 0 :


            
                default:
                    System.out.println("Resultado incorrecto");
                    break;
            }
           

            
                
            

           
        } while (continuar);
        sc.close();
        
    }
    
}
