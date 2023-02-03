package T6practicas.UsoClases;

import T6practicas.Clases.CuentaCorriente;
import T6practicas.Clases.Gestor;

public class Banco 
{
    public static void main(String[] args) {
        
    

        CuentaCorriente cc_Andre = new CuentaCorriente("79797979", "Andres");
        cc_Andre.ingresarDinero(1000);
        cc_Andre.sacarDinero(524);


        System.out.println(cc_Andre.mostrarInformacion());

        System.out.println(cc_Andre);


        //2Da PArte del Ejercicio:

        CuentaCorriente cc_Sara = new CuentaCorriente("797979", "Sara", 500);
        System.out.println(cc_Sara);
        CuentaCorriente cc_Javi = new CuentaCorriente("373737", "javi", 1000);
        System.out.println(cc_Javi);




        //3º Ejercicio de los apuntes :


        Gestor luis_Gestor = new Gestor("Luis", "123");

        Gestor paco_Gestor =  new Gestor("PACO", "666");

        cc_Andre.setGestor(luis_Gestor);
        cc_Javi.setGestor(paco_Gestor);
        cc_Sara.setGestor(paco_Gestor);

        Gestor gestor1 = cc_Javi.getGestor();
        gestor1.setNombre("LUIS MARIA");

        System.out.println(cc_Sara.getGestor().getNombre()); 
        System.out.println(cc_Andre.getGestor().getNombre());
        



        //4º Ejercicio de la HORA
        
    }
    
}
