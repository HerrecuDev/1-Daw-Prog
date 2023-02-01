package ClasesT6.UsoClases;

import ClasesT6.Clases.CuentaCorriente;

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

        
    }
    
}
