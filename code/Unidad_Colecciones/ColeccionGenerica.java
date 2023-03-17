package code.Unidad_Colecciones;

public class ColeccionGenerica<T>
{
    //Atributo :

    private T objeto;


    //Metodos:

    public void insertar(T nuevo)
    {
        objeto = nuevo;
    }
    public T extraer()
    {
        T resultado = this.objeto;
        objeto = null;

        return resultado;
    }
}
