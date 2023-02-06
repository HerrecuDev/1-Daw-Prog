package T6practicas.UsoClases;

import T6practicas.Clases.CuentaCorriente;
import T6practicas.Clases.Gestor;
import T6practicas.Clases.Gestor.PuestodeTrabajo;

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

        //Gestor paco_Gestor =  new Gestor("PACO", "666");

        

        //luis_Gestor sera senior con 55000€ de importe maximo

        luis_Gestor.setPuesto(PuestodeTrabajo.SENIOR);
        luis_Gestor.setImporteMAximo(55000);

        Gestor paco_Gestor = new Gestor("PACO", "666-123", PuestodeTrabajo.AYUDANTE);
        System.out.println("El puesto de PAco es " + paco_Gestor.getPuesto() +
        " y su importe maximo es " + paco_Gestor.getImporteMAximo() );

        cc_Andre.setGestor(luis_Gestor);
        cc_Javi.setGestor(paco_Gestor);
        cc_Sara.setGestor(paco_Gestor);


       
    }
    
}
