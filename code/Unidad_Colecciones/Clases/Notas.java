package code.Unidad_Colecciones.Clases;

public class Notas <T extends Alumno>
{
    private T objeto;



    //Contructor:
    public Notas (T nuevo)
    {
        objeto = nuevo;
    }



    public void escribirNota()
    {
        System.out.println( objeto.toString() + " SOBRESALIENTE ");
    }





    public T getObjeto() {
        return objeto;
    }
    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    
    
}
