package code.T6practicas.UsoClases;

import java.util.Scanner;

import code.T6practicas.Clases.zonaEjercicio7;

public class menuEjercicio7 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Creo las 3 Zonas :
        zonaEjercicio7 zPrincipal = new zonaEjercicio7(1000);
        zonaEjercicio7 zCompraVenta = new zonaEjercicio7(200);
        zonaEjercicio7 zVip = new zonaEjercicio7(25);


        //Bucle para el menu:
        boolean salir = false;
        do 
        {
            menu(); 
           
            System.out.println("¿ Que opcion desea realizar ?");
            int opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    imprimirLibres(zPrincipal,zCompraVenta,zVip);
                    
                    break;
                case 2:
                    menuZona();
                    System.out.println("¿Para que Zona quieres la entrada?");
                    int zonaEntrada = sc.nextInt();

                    System.out.println("¿Cuantas entadas quieres?");
                    int numEntradas = sc.nextInt();
                   

                    switch (zonaEntrada) 
                    {
                        case 1:
                            zPrincipal.vender(numEntradas);
                            break;
                        case 2:
                            zCompraVenta.vender(numEntradas);
                            break;
                        case 3:
                            zVip.vender(numEntradas);
                            break;
                    
                        default:
                        System.out.println("ZONA SELECCIONADA NO EXISTE");
                            break;
                    }

                    
                    
                    break;
                case 3:
                    System.out.println("SALIMOS DEL PROGRAMA");
                    salir = true;
                    break;
            
                default:
                System.out.println("Opcion no valida");
                    break;
            }

            
            
        } while (salir == false);
        
    }



    public static void menu()
    {

            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
    }

    public static void menuZona()
    {
        System.out.println("1- Zona Princial");
        System.out.println("2- Zona Compra/Venta");
        System.out.println("3- Zona Vip");
    }

    public static void imprimirLibres (zonaEjercicio7 z1, zonaEjercicio7 z2, zonaEjercicio7 z3)
    {
        System.out.println("zona Principal: " + z1.getEntradasPorVender);
        System.out.println("zona Compra/venta: " + z2.getEntradasPorVender);
        System.out.println("zona Vip : " + z3.getEntradasPorVender);
    }
}
