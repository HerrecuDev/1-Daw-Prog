import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HoraNormal = 12;
        final int HoraExtra = 16;
        System.out.println("Introducir Horastrabajadas");
        int HorasComunes = sc.nextInt();
        int horasOdinarias = (HorasComunes -40);
        
        if (HorasComunes<=40)
        {
            int sueldo = HorasComunes*HoraNormal;
            System.out.println("EL sueldo semanal serian + " + sueldo );

        }
        else if(HorasComunes>40)
        {
            int sueldo = HorasComunes*HoraNormal;
            int sueldoconExtra = (horasOdinarias * (HoraExtra));
            int sueldototal = sueldo + sueldoconExtra;
            System.out.println("Sueldo semanal con horas extra seria " + sueldototal);
        }
    }
    
}
