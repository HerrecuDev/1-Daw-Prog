import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Nota del primer examen ?");
        float nota1= sc.nextFloat();

        System.out.println("¿Nota del segundo Examen?");
        float nota2 = sc.nextFloat();

        float Media = (nota1+nota2)/2;

       

        //limpiamos buffer
        sc.nextLine();

        
if (Media<5){
    System.out.println("¿Que has sacado en elexamn de recuperacion?  APTO/NOAPTO , Cualquiera otro resultado sera NO APTO");
    String AptonoApto = sc.nextLine();
    AptonoApto =AptonoApto.toLowerCase();

    if (AptonoApto.equals("apto")) //Si vamos a pasarlo a minuscula debemos poner el equals en minusculas.
    {
        Media = 5;
    }
}

        
            System.out.println("Tu nota Media es "+ Media);
        
       
    }
    
}
