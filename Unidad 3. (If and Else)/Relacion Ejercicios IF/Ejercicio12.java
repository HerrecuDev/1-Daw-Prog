import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        double nota = 0;
        int respuesACertada = 0;
        int respuestaFallada = 0;
        Scanner sc = new Scanner(System.in);



        System.out.println("¿Has acertado la pregunta 1 T/F?");
        String respuesta = sc.nextLine();

        if(respuesta.equals("T"))
        {
            nota +=2;
            respuesACertada++;
        }
        else 
        {
            nota = nota -0.5;
            respuestaFallada++;
            
        }
        if (nota <=0)
        {
            nota = 0;
        }
        System.out.println("¿Has acertado la pregunta 2 T/F?");
         respuesta = sc.nextLine();

        if(respuesta.equals("T"))
        {
            nota +=2;
            respuesACertada++;
        }
        else 
        {
            nota = nota -0.5;
            respuestaFallada++;
        }
        if (nota <=0)
        {
            nota = 0;
        }

        System.out.println("¿Has acertado la pregunta 3 T/F?");
        respuesta = sc.nextLine();

       if(respuesta.equals("T"))
       {
           nota +=2;
           respuesACertada++;
       }
       else 
       {
           nota = nota -0.5;
           respuestaFallada++;
       }
       if (nota <=0)
       {
           nota = 0;
       }
       System.out.println("¿Has acertado la pregunta 4 T/F?");
       respuesta = sc.nextLine();

      if(respuesta.equals("T"))
      {
          nota +=2;
          respuesACertada++;
      }
      else 
      {
          nota = nota -0.5;
          respuestaFallada++;
      }
      if (nota <=0)
      {
          nota = 0;
      }
      System.out.println("¿Has acertado la pregunta 5 T/F?");
      respuesta = sc.nextLine();

     if(respuesta.equals("T"))
     {
         nota +=2;
         respuesACertada++;
     }
     else 
     {
         nota = nota -0.5;
         respuestaFallada++;
     }
     if (nota <=0)
     {
         nota = 0;
     }

       System.out.println("La nota final seria " + nota);
       System.out.println("Aciertos: " + respuesACertada);
       System.out.println("Fallos : " + respuestaFallada);

    }
    
}
