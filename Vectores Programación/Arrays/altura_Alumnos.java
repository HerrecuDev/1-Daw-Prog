import java.util.Scanner;

public class altura_Alumnos 
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


        //Declaramos los ARRAYS
        String [] alumnos = new String [0];
        double [] alturas = new double [0];





        boolean salir = false;
        //Bucle del Menu :
        do 
        {
            int opcion = menu();
            switch (opcion) 
            {
                case 1:
                    alumnos = addAlumno(alumnos);
                    alturas = addAltura(alturas , 1.5);
                    
                    break;
                case 2:
                    //alturas = modificarALtura(alumnos, alturas);
                    break;
                case 3 :
                    //mostrarTodo(alumnos, alturas);
                    break;
                case 4 :
                    //alturas = incrementarAltura(alturas);
                    break;
                case 0 :
                    salir = true;
                    break;
            
                default:
                    System.out.println("Opcion incorecta");
                    break;
            }
            
        } while (salir);
        
    
     
        
    }



    static int menu()
    {
        System.out.println("1 Añadir ALumno");
        System.out.println("2 - Modificar Altura alumno");
        System.out.println("3 - Mostrar Todo");
        System.out.println("4 - Insertar ALumno");

        System.out.println();

        System.out.print("opcion");
        int opcion = sc.nextInt();
        sc.nextLine();

        return opcion;

    }
    
    static String[] addAlumno(String[] array)
    {
        //Creamos al nuevo ALumno.
        System.out.println("¿Nombre del ALumno?");
        String nuevoAlumno = sc.nextLine();

        //Creamos un nuevo Array con 1 posicion mas:
        String[] nuevoArray = new String[array.length +1];

        //Copio el contenido del array original al nuevo array

        for (int i = 0; i < array.length; i++) 
        {
            nuevoArray[i] = array[i];
        }
        //Añade en la ultima posicion del nuevo array el nuevo valor :
        nuevoArray[nuevoArray.length -1] = nuevoAlumno;

        
        return nuevoArray;
       
    }

    static double [] addAltura(double [] array , double nuevaAltura)
    {
        //Creamos una nueva altura :
        System.out.println("Introducir nueva altura");
        double nuevoAlt = sc.nextDouble();

        //Creamos un nuevo Array con 1 posicion mas:
        double[] nuevoArray = new double[array.length +1];

        //Copio el contenido del array original al nuevo array

        for (int i = 0; i < array.length; i++) 
        {
            nuevoArray[i] = array[i];
        }
        //Añade en la ultima posicion del nuevo array el nuevo valor :
        nuevoArray[nuevoArray.length -1] = nuevoAlt;

        
        return nuevoArray;
    }
        
       

    

        // static double [] modificarAltura (String [] arrayNombre , double[] arrayAlturas)
        // {

        //     //Buscamos al ALumno y decimos la altura que queremos modificar:

        //     System.out.println("Dime el nombre del Alumno que voy a modificar");
        //     String nombreBuscado = sc.nextLine();

        //     System.out.println("Dime la nueva altura");
        //     double nuevaAltura = sc.nextDouble();

        //     //Buscar un nombe en el arrayNombre :
        //     int posicion = -1;
        //     for (int i = 0; i < arrayNombre.length; i++) 
        //     {
        //         if (arrayNombre[i].equalsIgnoreCase(nombreBuscado)) 
        //         {
        //             posicion = i;
                    
        //         }
                
        //     }

        //     if (posicion >= 0) 
        //     {
        //         System.out.println("dime la nueva altura");
        //         nuevaAltura = sc.nextDouble();


                
        //     }

        // }

    
}
    

