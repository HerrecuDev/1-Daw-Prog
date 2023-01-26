import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_alturaAlumnoPractico 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
        /*  1 - Añadir Alumno :
            Pide el nombre y pone 1.50 de altura.


            2- Modificar altura alumno :
            Pide nombre.
            Pide nueva altura.


            3- Mostrar todo :

            PEPE -1.60
            Juan - 1.95
            Maria - 1.80

            4 - Incrementar Altura:
            Pide incremento.

        */
        //Declaramos el array del alumno
        String [] alumno = new String[0];

        //Declaramos el array de la altura :
        double [] altura = new double [0];

        
        //Declaramos un booleano para crear el menu de nuestro porograma :
        boolean salir = false;

        do {
            //Generamos el menu
            int opcion = menu();
           //Generamos un buclee para las diferentes Opciones del menu:
           switch (opcion) {
            case 1:
                alumno = addAlumno(alumno);
                altura = addAltura(altura,1.5);
                
                    break;
            case 2:
               altura = modificarAltura(alumno,altura);
                
                break;
            case 3:
                mostrarTodo(alumno, altura);
                
                break;
            case 4:
                altura = incrementarAltura(altura);
        
                break;
            case 0:
                salir = true;
        
           
            default:
            System.out.println("Opcion Incorrecta");
                break;
           }








            
        } while (salir = !true);
        
    }



    static int menu()
    {
        System.out.println(" 1 - Añadir Alumno");
        System.out.println(" 2 - Modificar altura alumno ");
        System.out.println(" 3 - Mostrar todo el Array");
        System.out.println(" 4 - Incrementar altura");

        

        System.out.print();
       
        System.out.println("¿Que opcion quiere Realizar ?");

        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;
        

    }

    static String [] addAlumno (String []arrayNombre)
    {
        //Preguntamois nombre a introducir :
        System.out.println("Introducir nombre");
        String nuevoAlumno = sc.nextLine();


        //Creamos un nuevo Array con una posicion mas :
        String []nuevoArray = new String [array.length+1];
        //Copiamos el nuevo array en el anterior
        for (int i = 0; i < nuevoArray.length; i++) 
        {
            nuevoArray[i] = array[i];
        }
        //Metemos en la ultima posicion el nuevo Array :
        
        nuevoArray[nuevoArray.length-1] = nuevoAlumno;


    }

    static double [] addAltura(double[]array, double nuevaALtura)
    {
         //Creamos un nuevo Array con una posicion mas :
         double []nuevoArray = new double [array.length+1];
         //Copiamos el nuevo array en el anterior
         for (int i = 0; i < nuevoArray.length; i++) 
         {
             array[i] = array[i];
         }
         //Metemos en la ultima posicion el nuevo Array :
         
         array[nuevoArray.length-1] = nuevoArray;
    }

    static double [] modificarAltura (String [] arrayNombre, double [] arrayAltura)
    {
        //Preguntamos el nombre del Alumno
        System.out.println("Introducir nombre del alumno");
        String alumno = sc.nextLine();
        //Introducimos la nueva altura:
        System.out.println("Introducir nueva altura");
        double nuevaALtura = sc.nextDouble();

        //Buscamos nombre en el Array nombre :
        int posicion = -1;
        for (int i = 0; i < arrayAltura.length; i++) 
        {
            if (arrayNombre[i].equalsIgnoreCase(alumno)) 
            {
                posicion = i;
            }

            if (posicion >=0) 
            {
                System.out.println("Dime la nueva altura");
                double alturanew = sc.nextDouble();
                arrayAltura[i] = nuevaALtura;
                
                
            }
            return nuevaALtura;

        }
       


    }

    static void  mostrarTodo(String[] arrayNombre, double[] arrayAltura)
    {
        System.out.println(Arrays.deepToString(arrayNombre, arrayAltura));

    }

    static double [] incrementarAltura(double [] arrayAltura)
    {
        System.out.println("¿Cuanto quiere incrementar la altura?");
        double aumentarAltura = sc.nextDouble();

        arrayAltura[arrayAltura.length -1] = aumentarAltura;

        return aumentarAltura;


    }
    
}
