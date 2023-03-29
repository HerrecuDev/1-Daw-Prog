package code.Unidad_Colecciones.Ejercicio_AcademicoLengua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mainAcademico 
{


        public static void main(String[] args) 
        {
            HashMap<Character,Academico> academia = new HashMap<>();

            Academico academico1 = new Academico("PEPE", 1988);
            Academico academico2 = new Academico("Reverte", 1988);
            Academico academico3 = new Academico("Mario", 1978);
            Academico academico4 = new Academico("Ibai", 2020);
            Academico academico5 = new Academico("Mario", 1928);
            Academico academico6 = new Academico("Alberto", 1928);
            Academico academico7 = new Academico("Galdos", 1938);
            

            nuevoAcademico(academia, academico1, 'A');
            nuevoAcademico(academia, academico2, 'ñ');
            nuevoAcademico(academia, academico3, 'C');
            nuevoAcademico(academia, academico4, 'c');
            nuevoAcademico(academia, academico5, 'ñ');
            nuevoAcademico(academia, academico6, 'H');
            nuevoAcademico(academia, academico7, 'z');
            System.out.println(academia);

            //Listado 1 : Nombre + Año :
            // ArrayList<Academico> listaAcademicos = (ArrayList<Academico>) academia.values(); //Devuelve a todos los academicos.
            ArrayList<Academico> listaAcademicos = new ArrayList<>();
            listaAcademicos.addAll(academia.values());

            //Ordeno por su oren natural :
            Collections.sort(listaAcademicos);

            //Muestro la lista ya ordenada :
            System.out.println(listaAcademicos);



            System.out.println("-----------------------------------------");

            //Listado 2  Letra + Nombre + Año :

            TreeMap<Character, Academico> diccionarioOrdenado = new TreeMap<>();
            diccionarioOrdenado.putAll(academia);
            System.out.println(diccionarioOrdenado);

        }   

        public static boolean nuevoAcademico(Map<Character, Academico> academia , Academico academico , Character letra)
        {
            boolean correcto = true;

            if (Character.isLetter(letra))
            {
            //PRegunto si el sillon esta ocuado:
                if (academia.containsKey(letra)) 
                {
                    System.out.println("Sillon " + letra + " esta ocupado");
                }
                else
                {
                    academia.put(letra, academico);
                }

            }
            else 
            {
                System.out.println("La letra del sillon " + letra +  " no es valida");
                correcto = false;
            }

            
            return correcto;
        }
}

