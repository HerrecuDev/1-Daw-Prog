public class EjercicioEjemploFunciones
{
public static void main(String[] args) 
{
    System.out.println("Ejercicio de Ejemplo");
    imprimir();
    System.out.println("PARte de en medio");
    imprimir();
    System.out.println("Parte Final");
    imprimir();
    System.out.println("-------------------------------------------------");


    int numero1 = 8;
    int numero2 = 5;
    int numero3 = 3;
    int resultadosuma = suma(numero2, numero3)
}
public static void funcion(String[] saludo) 
{
    System.out.println("HOLA QUE TAL");
}
//Declaramos la funcion fuera del MAIN : 
//Existen dos tipos de Funciones las que devuelven y hacen cosas / y las que no devuelven nada y hacen cosas.


static void imprimir ()
{
    int numero = 0;
for (int i = 0; i <=2; i++) 
{
 System.out.println("HOLA");   
}
}
static void imprimir (String texto) 
{
    
    for (int i = 0; i <=2; i++) 
    {
        texto = texto + "Adios";
     System.out.println(texto);   
    }
}
static void imprimir(String texto , int repeticiones) 
{

}

static int suma (int a , int b) 
{
    int resultado = a + b;
    System.out.println();
    return resultado;
    
}
static int suma ( int a, int b , int c) 
{
    return suma(a, b , c);
}

}