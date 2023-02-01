package ClasesT6.Clases;

public class DentrodeClase 
{
    public static void main(String[] args) 
    {

        //Creamos la clase persona1
        Persona persona1 = new Persona();
        //persona1.nombre = "Alfonso";
        persona1.edad = 100;

        System.out.println("Edad persona1 =" + "\t" + persona1.edad);
        System.out.println("-----------------------------------------------------------");

        System.out.println("Nombre persona1 =" + "\t" + persona1.nombre);
        persona1.cambiarNombre("Pablo");//Definimos el nuevo nombre del objeto.
        System.out.println("Nombre persona1 =" + "\t" + persona1.nombre);

        System.out.println("-----------------------------------------------------------");

        System.out.println("PERSONA 1 DNI = " + persona1.dni); //Al no definir el valor de dni nos aparece como NULL.


        //CREAMOS LA FUNCION CUMPLRAÑOS EN PERSONA.JAVA Y SACAMOS SU VALOR POR PANTALLA DEFINIENDOLO ASI :
        System.out.println("-----------------------------------------------------------");

        System.out.println("EDAD persona 1 = " + persona1.edad);
        persona1.cumplirAÑo();
        System.out.println("EDAD persona 1 = " + persona1.edad);

        
        System.out.println("-----------------------------------------------------------");

        //Creamos Otra clase persona2
        Persona persona2 = new Persona();
        persona2.edad = 26;
        persona2.nombre = "Javi";
        persona2.altura = 180;
        //Imprimimos por pantalla la definicion de la clase creada :

        System.out.println("Edad persona 2 =" + "\t" + persona2.edad);
        System.out.println("Nombre Persona 2 ="+"\t" +  persona2.nombre);
        System.out.println("Altura de la Persona 2 ="+ "\t"  + persona2.altura);
        System.out.println("-----------------------------------------------------------");

        System.out.println(persona2.toString());

        System.out.println("-----------------------------------------------------------");

        //De esta forma copiamos los valores de persona2 en p3.
        Persona p3 = new Persona();
        p3.CopiarPersona(persona2);
        System.out.println("Edad persona 3 =" + "\t" + p3.edad);
        System.out.println("Nombre Persona 3 ="+"\t" +  p3.nombre);

        System.out.println("-----------------------------------------------------------");

        String QuediaEs = p3.QuediaEs();
        String comoEstanLasPErsonas = Persona.comoEstan();
        System.out.println( "HOy es " + QuediaEs);
        System.out.println("Todo el mundo esta " + comoEstanLasPErsonas);





        //Coge los valores Creados en el contructor PErsonas(String , int)
        Persona p4 = new Persona("Andres", 20);

        Persona p5 = new Persona();
        Persona p6 = new Persona("PEPE", null,20,180);


        //Cambiamos de esta forma el valor de una variable ESTATICA:
        System.out.println(p5.vivo);
        System.out.println(Persona.vivo);
        Persona.vivo = false;
        System.out.println(p5.vivo);
        System.out.println(Persona.vivo);


        //Para declarar un conductor de una PErsona aun sin definir.
        if (p5.dni != null) 
        {
            System.out.println("nombre de p4" + p5.dni);

        }
        else
        {
            System.out.println("Aun no tiene DNI");
        }
        
        persona1.crearCuentaCorriente();
        CuentaCorriente cc_alfonso = persona1.cc;
        System.out.println(cc_alfonso);
        cc_alfonso.saldo = 20;
        
        double saldoActual = cc_alfonso.saldo;
        cc_alfonso.ingresarDinero(20);
        System.out.println(cc_alfonso);
        
        
    }
}
