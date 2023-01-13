import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ejercicio4Seleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float preciogasolinacoche = 1.75f;
        final float DineroGastadoviaje = (550*8 /(100)) *preciogasolinacoche;
        
       
        final int PrecioBilleteAvion = 95;
        final int precioXEquipaje = 20;

        final int BilleteTren = 80;
        final float Descuento4Personas = (BilleteTren*4)* 0.25f;
        final float descuento3PErsonas = (BilleteTren*3)*0.10f;

        System.out.println("Introducir numero de personas");
        int NumeroPersonas = sc.nextInt();
       
       sc.nextLine();

        System.out.println("Introducir opcion de viaje");
        String Metodoviaje = sc.nextLine().toLowerCase();

       
       
        
        float precioXpersona = 0f;
        float PrecioCondescuento = 0f;
    
        
        sc.nextLine();
        if (NumeroPersonas > 1 && NumeroPersonas< 5) {
        
            
            
            switch (Metodoviaje) {
                case "coche":
                    
                     precioXpersona = (DineroGastadoviaje/NumeroPersonas);
                    
    
                    break;
                    
                        case "avion" :
                        if (Metodoviaje== "avion") {
                            System.out.println("¿Llevan equipaje?");
                            String Equipaje = sc.nextLine().toLowerCase();
                        switch (Equipaje) {
                            case "si":
                            precioXpersona = PrecioBilleteAvion + precioXEquipaje;
                                
                                break;
                            case "no":
                            precioXpersona = PrecioBilleteAvion;
                            break;
                        }
                    }
                        
                       
                            case "tren" :
                            
                            if (NumeroPersonas == 4) {
                            PrecioCondescuento = (4*BilleteTren) - Descuento4Personas;
                                precioXpersona = (PrecioCondescuento/NumeroPersonas);
                            }
                            else if (NumeroPersonas == 3) {
                                PrecioCondescuento = (3*BilleteTren) - descuento3PErsonas;
                                    precioXpersona = (PrecioCondescuento / NumeroPersonas);
                            }
                            else {
                               precioXpersona = BilleteTren;
                            }
                                 break;
    
                                
                default:
                            System.out.println("Transporte introducido NO ES POSIBLE " + precioXpersona);
                    break;
                    
                    
            }
        }
        else {
            System.out.println("ERROR precio por persona  = " + precioXpersona + " Numero de personas Introucido NO ES POSIBLE ");
        }
        
    
            System.out.println("Vais a viajar " + NumeroPersonas);
            System.out.println("Viajas en " + Metodoviaje);
            System.out.println( "Si viajamos en " + Metodoviaje + " El precio por persona es " + precioXpersona) ;
         
    
       
        
    }

}


       
        
    
    

