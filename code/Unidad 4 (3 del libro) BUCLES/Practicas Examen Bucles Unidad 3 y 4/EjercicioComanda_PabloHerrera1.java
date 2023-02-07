import java.util.Scanner;

public class EjercicioComanda_PabloHerrera1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Variables String :
        String continuarPidiendo = "";
        
        String pedirCuenta = "";

        double cantidad = 0;

        //PRECIOS :
        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;

   
       
        
            //MENU :
            System.out.println(" *** RESTAURANTE VEGA DE MIJAS ****");
            System.out.println(" ----------------------------------");
            System.out.println("Primeros platos");
            System.out.println(" 1. Salmorejo (5€)");
            System.out.println(" 2. Sopa picadillo (4€)");
            System.out.println(" 3. Ensalada de atún (4.5€)");
            System.out.println("Segundos platos");
            System.out.println(" 4. Paella (6€)");
            System.out.println(" 5. Salmón (8€)");
            System.out.println(" 6. Codillo al horno (9€)");
            System.out.println(" 7. Lentejas (5€)");
            System.out.println("Postres");
            System.out.println(" 8. Fruta (1.5€)");
            System.out.println(" 9. Café (1.25€)");
            System.out.println("10. Helado (2€)");
            System.out.println("0. SALIR (Imprimir Ticket + FIN) ");

            System.out.println("¿Que desea pedir para comer ?");

            System.out.println("Selecciona la opción deseada por el cliente...");
            String opcion = sc.nextLine().toLowerCase();
        

          //Limpiamos el bufer
            sc.nextLine();
           
                
        do {
           
                switch (opcion) 
                {
                    case "1":
                        
                            System.out.println("¿Cuantos quiere de salmorejo?");
                            cantidad= sc.nextDouble();
                            double totalSalmorejo = cantidad * PLATO1;
                            System.out.println("SALMOREJO X " + cantidad);
                        
                        
                        break;
                    case "2":
                   
                        System.out.println("¿Cuantos quiere de sopa?");
                        cantidad= sc.nextDouble();
                        double totalSopa = cantidad * PLATO2;
                        System.out.println("SOPA X " + cantidad);
                    
                        break;
                    case "3":
                   
                        System.out.println("¿Cuantos quiere de ensalada?");
                        cantidad= sc.nextDouble();
                        double totalensalada = cantidad * PLATO3;
                        System.out.println("ENSALADA X " + cantidad);
                    
                    
                        break;
                
    
                    case "4":
                    System.out.println("¿Cuantos quiere de Paella ?");
                    cantidad= sc.nextDouble();
                    double totalpaella =cantidad * PLATO4;
                    System.out.println("PAELLA X " + cantidad);
                    
                        break;
                    case "5":
                    System.out.println("¿Cuantos quiere de Salmon ?");
                    cantidad= sc.nextDouble();
                    double totalsalmon = cantidad * PLATO5;
                    System.out.println("SALMON X " + cantidad);
    
                        break;
                    case "6":
                    System.out.println("¿Cuantos quiere de Codillo ?");
                    cantidad= sc.nextDouble();
                    double totalcodillo = cantidad * PLATO6;
                    System.out.println("CODILLO X " + cantidad);

                        break;
                    case "7":
                    System.out.println("¿Cuantos quiere de lentejas ?");
                    cantidad= sc.nextDouble();
                    double totallentejas = cantidad * PLATO7;
                    System.out.println("LENTEJAS X " + cantidad);

                        break;
                        

                        
                    case "8":
                    System.out.println("¿Cuantos quiere de fruta ?");
                    cantidad= sc.nextDouble();
                    double totalfruta = cantidad * PLATO8;
                    System.out.println("FRUTA X " + cantidad);

                        break;
                    case "9":
                    System.out.println("¿Cuantos quiere de cafe ?");
                    cantidad= sc.nextDouble();
                    double totalcafe = cantidad * PLATO8;
                    System.out.println("CAFE X " + cantidad);
                        break;
                    case "10":
                    System.out.println("¿Cuantos quiere de Helado?");
                    cantidad= sc.nextDouble();
                    double totalhelado = cantidad * PLATO10;
                    System.out.println("HELADO X " +cantidad);
                        break;
                    
                
                    default:
                    System.out.println("OPCION NO VALIDA");
                        break;


                
                }
                
                System.out.println("¿Desea pedir algo mas ?");
                continuarPidiendo = sc.nextLine();
                 
            } while (continuarPidiendo.equals("s"));




        }
       
       
    
    }
 