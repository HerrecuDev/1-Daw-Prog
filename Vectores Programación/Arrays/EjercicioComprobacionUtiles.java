import java.net.Socket;

public class EjercicioComprobacionUtiles {
    
    public static void main(String[] args) {
        
        int[] array = null;

        System.out.println("RELLENAR");
        array = UtilesArrayPablo.rellenar(array,10);
        UtilesArrayPablo.imprimir(array);
        
        System.out.println("RELLENAR CON VALOR");
        array = UtilesArrayPablo.rellenar(array, 10, 2);
        UtilesArrayPablo.imprimir(array);

        System.out.println("LIMPIAR ARRAY");
        array =UtilesArrayPablo.limpiar();
        UtilesArrayPablo.imprimir(array);


        System.out.println("INSERTAR ELEMENTO AL PRINCIPIO");
        array =UtilesArrayPablo.insertarAlPrincipio(array, 20);
        UtilesArrayPablo.imprimir(array);

        System.out.println("INSERTAR ELEMENTO AL FINAL");
        array =UtilesArrayPablo.insertarAlFinal(array,5);
        UtilesArrayPablo.imprimir(array);

        System.out.println("INSERTAR ELEMENTO EN LA POSICIN SOLICITADA");
        array=UtilesArrayPablo.insertarEnPosicion(array, 8, 4);
        UtilesArrayPablo.imprimir(array);

        System.out.println("INSERTAR ARAY ORDENADO");
        array=UtilesArrayPablo.insertarOrdenado(array,3);
        UtilesArrayPablo.imprimir(array);



        

        //array =UtilesArrayPablo.insertarAlPrincipio(array,20);
        

        // array =UtilesArrayPablo.insertarAlPrincipio(array, 30);

        // array =UtilesArrayPablo.insertarAlPrincipio(array, 40);

        // array =UtilesArrayPablo.insertarAlPrincipio(array, 50);

        // array =UtilesArrayPablo.insertarAlPrincipio(array, 7);

        // array =UtilesArrayPablo.insertarAlPrincipio(array, 9);

        // array =UtilesArrayPablo.insertarAlPrincipio(array, 98);

       
       

        
        

        //boolean ordenado = UtilesArrayPablo.estaOrdenado(array);

        // System.out.println("Esta ordenado: " + ordenado);

        //UtilesArrayPablo.imprimir(array);

        // array =UtilesArrayPablo.eliminarPrimero(array);

        // UtilesArrayPablo.imprimir(array);

        // array =UtilesArrayPablo.eliminar(array, 30);

        // UtilesArrayPablo.imprimir(array);

        // array =UtilesArrayPablo.ordenar(array);

        // UtilesArrayPablo.imprimir(array);

        // array =UtilesArrayPablo.insertarOrdenado(array, 15);

        // UtilesArrayPablo.imprimir(array);
        
        // int posicion15 =UtilesArrayPablo.buscar(array, 15);

        // System.out.println("El elemento 15 está en la posicion: " + posicion15);

        // int posicion99 =UtilesArrayPablo.buscar(array, 99);

        // System.out.println("El elemento 99 está en la posicion: " + posicion99);

        // array = UtilesArrayPablo.invertir(array);

        // System.out.print("Invierto el array:  ");
        // UtilesArrayPablo.imprimir(array);

        // array =UtilesArrayPablo.partirPor(array, 2,5);

        // System.out.println("Parto el array por 2 y 5");
        // UtilesArrayPablo.imprimir(array);

    }
}