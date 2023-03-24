package code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes;

import code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes.maquinaria.Locomotora;
import code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes.maquinaria.Tren;
import code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes.personal.JefeEstacion;
import code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes.personal.Maquinista;
import code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes.personal.Mecanico;
import code.Ejercicios_Clases_EntregaYPracticos.EjercicioTrenes.personal.Mecanico.Especialidad;

public class PracticaTrenes 
{
    public static void main(String[] args) 
    { 	 
   	 
    	// CREACIÓN DE OBJETOS
    	JefeEstacion jefe1 = new JefeEstacion("jefe1","1111111A");
    	JefeEstacion jefe2 = new JefeEstacion("jefe2","2222222B");

        jefe1.modificarFechaCargo(1999, 10, 25);
        System.out.println("Jefe Estacion 1:" + jefe1);
        System.out.println("Jefe Estacion 2:"  + jefe2);

   	 
    	Maquinista maquinista1 = new Maquinista("Maquinista 1","3333333C",2000, "Ayudante");
    	Maquinista maquinista2 = new Maquinista("Maquinista 2","4444444D",2000, "Senior");
    	Maquinista maquinista3 = new Maquinista("Maquinista 3","5555555E",2000, "Ayudante");
	    maquinista1.setRango("Senior");

	
   	 
    	Locomotora locomotora1 = new Locomotora("AAAA1",120);
    	Locomotora locomotora2 = new Locomotora("BBBB2",100);
    	Locomotora locomotora3 = new Locomotora("CCCC3",150, 2020);
   	 
    	Tren tren1 = new Tren(locomotora1,maquinista1);
    	tren1.enganchaVagon(100,50,"Madera");
        tren1.enganchaVagon(100,150,"Madera"); //vagon supera carga maxima, no se engancha
    	tren1.enganchaVagon(120,30,"Acero");
    	Tren tren2 = new Tren(locomotora2,maquinista2);
    	tren2.enganchaVagon(60,60,"Alimentos");
    	tren2.enganchaVagon(50,12,"Madera");
    	tren2.enganchaVagon(100,50,"Madera");
        tren2.enganchaVagon(200,50,"Madera");
        tren2.enganchaVagon(200,50,"Madera");
        tren2.enganchaVagon(200,50,"Agua"); //Tren lleno, no se puede enganchar otro vagon
    	Tren tren3 = new Tren(locomotora3,maquinista3);
    	tren3.enganchaVagon(50,60,"Acero");  //vagon supera carga maxima, no se engancha
    	tren3.enganchaVagon(150,140,"Madera");
   	 
	    //Crea el mecánico mecánico 1 con tlf 555 y especialidad frenos
		Mecanico mecanico1 = new Mecanico("Mecanico1", 555, Especialidad.FRENOS);

      	//Un vez creado asignalo a la locomotora2.

	   locomotora2 = new Locomotora(mecanico1);


        //mostrar trenes
        System.out.println("Tren 1: " + tren1);
        System.out.println("Tren 2: " + tren2);
        System.out.println("Tren 3: " + tren3);
            
	 
	}

}
