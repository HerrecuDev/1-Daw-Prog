import java.util.Scanner;

public class Ejercicio3Seleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        int num1 = (int)(Math.random()*100);
        System.out.println("El Primer numero es = " + num1);

        
        int num2 = (int) (Math.random()*100);
        System.out.println("El segundo numero es = "+ num2);

        
        int operacion = (int) (Math.random()*3);
        System.out.println("La operacion es = " + operacion);
       
        String resultado = " ";

        int resultadosegunOperacion = 0;

        //Para mostrar operacion al Azar:
        switch (operacion) {
            case 0 :
                resultado = "suma";
            
                 resultadosegunOperacion = num1 + num2;
                
                break;

                case 1 :
                resultado = "resta";
                 resultadosegunOperacion = num1 - num2;
                break;

                case 2 :
                resultado = "Multiplicacion";
                resultadosegunOperacion = num1 * num2;
                break;
        
            default:
                break;
        }

       

        System.out.println("introducir Resultado posible al Hacer la  " + resultado);
        int resultadoOperacion = sc.nextInt();

                if (resultadoOperacion == resultadosegunOperacion) {
                    System.out.println("Resultado Correcto");
                }
                 else {
                    System.out.println("Ese no es el resultado");
                }
    }
}
        

       