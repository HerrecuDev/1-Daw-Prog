import java.util.Scanner;

public class EjercicioTrabajar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introducir Dia de la semana");
    String DiadelaSemana = sc.nextLine().toUpperCase(); //LO Pasamos a Mayusculas.

    int diasHastafinDesemana= 0;
    switch(DiadelaSemana)
   {
    case "LUNES":
    diasHastafinDesemana =diasHastafinDesemana +1;
    case "MARTES":
    diasHastafinDesemana +=1;
    case "MIERCOLES":
    diasHastafinDesemana++;

    case "JUEVES":
    diasHastafinDesemana++;
    case "VIERNES":
    diasHastafinDesemana++;
    System.out.println("Tienes que trabajar");
    break;
    case "SABADO" :
    case "DOMINGO" :
    System.out.println("TE TOCA GUARDIA");
    break;
    default: 
    System.out.println("ERROR");
    break;

   } 
   if (diasHastafinDesemana>0){
    System.out.println("faltan " + diasHastafinDesemana);
   }
    }
    
    
}
