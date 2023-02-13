package code.T6practicas.UsoClases;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import code.T6practicas.Clases.DiscoEj3Refuerzo;

/**
 * ColeccionDeDiscosPrincipal.java
 * Gestión de una colección de discos.
 * 
 * @author Luis José Sánchez
 */
public class ColeccionDeDiscosPrincipal {
  public static void main(String[] args) {
   

    //Crea el array de discos
    DiscoEj3Refuerzo[] discos = new DiscoEj3Refuerzo[0];

    

    // Carga varios discos
    DiscoEj3Refuerzo d1 = new DiscoEj3Refuerzo(
      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
      discos = insertarDiscos (discos,d1);
    DiscoEj3Refuerzo d2 = new DiscoEj3Refuerzo(
      "FGHQ64", "Metallica", "Black album", "hard rock", 46);
      discos = insertarDiscos (discos,d2);
    DiscoEj3Refuerzo d3 = new DiscoEj3Refuerzo(
      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
      discos = insertarDiscos (discos,d3);

    int opcion;
    Scanner s = new Scanner(System.in);
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");

        Menu();
        int listado = s.nextInt();
        
        
        switch (listado) 
        {
          case 1:
          for(DiscoEj3Refuerzo d : discos) {
            if (!d.getCodigo().equals("LIBRE")) 
            {
              System.out.println(d);
            }
          }
            break;

          case 2:
            
            break;
          case 3:
            
            break;
          case 4:
            
            break;
        
          default:
          System.out.println("Listado INEXISTENTE PRUEBE DE NUEVO");
          listado = s.nextInt();

            break;
        }

        for(DiscoEj3Refuerzo d : discos) {
          // if (!d.getCodigo().equals("LIBRE")) {
            System.out.println(d);
          //}
        }

        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");

        System.out.println("Por favor, introduzca los datos del disco.");  
        System.out.print("Código: ");
        codigoIntroducido = s.nextLine();
        
        // Codigo Unico
        //En el caso de que no xista dicho codigo lo introduce :

        if (buscarCodigo(discos, codigoIntroducido) == -1) 
        {

            System.out.print("Autor: ");
            autorIntroducido = s.nextLine();

            System.out.print("Título: ");
            tituloIntroducido = s.nextLine();

            System.out.print("Género: ");
            generoIntroducido = s.nextLine();

            System.out.print("Duración: ");
            duracionIntroducida = Integer.parseInt(s.nextLine());
            DiscoEj3Refuerzo discoNuevo = new DiscoEj3Refuerzo(
            codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);

              discos = insertarDiscos(discos, discoNuevo);
        }
        
          else
          {
            System.out.println("Error Codigo ya introducido");
          }
        
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = s.nextLine();
  
        

        //Buscar Código :
        int i = buscarCodigo(discos , codigoIntroducido);

        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + discos[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = s.nextLine();
        if (!codigoIntroducido.equals("")) {
          discos[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + discos[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = s.nextLine();
        if (!autorIntroducido.equals("")) {
          discos[i].setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + discos[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = s.nextLine();
        if (!tituloIntroducido.equals("")) {
          discos[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + discos[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = s.nextLine();
        if (!generoIntroducido.equals("")) {
          discos[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + discos[i].getDuracion());
        System.out.print("Duración: ");
        final String duracionIntroducidaString = s.nextLine();
        if (!duracionIntroducidaString.equals("")) {
          discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = s.nextLine();
        i = buscarCodigo(discos, codigoIntroducido);

        if ( i != -1) 
        {
          discos = borrarDisco (discos , i);
          System.out.println("Album Borrado");
        }
        else 
        {
          System.out.println("No existe el disco con el codigo " + codigoIntroducido);
        }
  
        // i = -1;
        // do {
        //   i++;
        // } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
        
        
        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
  }


  public static DiscoEj3Refuerzo[] insertarDiscos(DiscoEj3Refuerzo [] discos, DiscoEj3Refuerzo disco)
    {
        DiscoEj3Refuerzo [] NuevaColeccion = new DiscoEj3Refuerzo [discos.length +1];

        for (int i = 0; i < discos.length; i++) 
        {
          NuevaColeccion[i] = discos[i];
        }

        NuevaColeccion[NuevaColeccion.length-1] = disco;
        return NuevaColeccion;
    }


    
    /**
     * 
     * @param discos
     * @param codigoIntroducido
     * @return
     */
    public static int buscarCodigo (DiscoEj3Refuerzo[] discos , String codigoIntroducido)
    {
      int posicion = -1;

      for (int i = 0; i < discos.length; i++) 
      {
        DiscoEj3Refuerzo disco = discos [i];
        if (disco.getCodigo().equalsIgnoreCase(codigoIntroducido)) 
        {
          posicion = i;
        }

      }
      return posicion;
    }

    public static DiscoEj3Refuerzo [] borrarDisco(DiscoEj3Refuerzo[] discos , int posicion)
    {
      DiscoEj3Refuerzo [] NuevaColeccionDiscos = new DiscoEj3Refuerzo[discos.length - 1];
      for (int i = 0; i < NuevaColeccionDiscos.length; i++) 
      {
        if ( i< posicion)
        {
          NuevaColeccionDiscos[i] = discos[i];
        }
        else if(i > posicion)
        {
          NuevaColeccionDiscos[i] = discos [i+1];
        }
      }
      return NuevaColeccionDiscos;
    }



    public static void Menu()
    {
      
        
      System.out.println("1 - VER LISTADO COMPLETO");
      System.out.println("2 - VER LISTADO POr Autor");
      System.out.println("1 - VER LISTADO POR GENERO");
      System.out.println("1 - VER LISTADO X DURACION (RANGO)");

      System.out.println("¿Como quiere ver su listado?");

    }




}
