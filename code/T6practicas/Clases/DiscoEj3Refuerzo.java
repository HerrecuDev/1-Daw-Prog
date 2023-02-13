package code.T6practicas.Clases;

public class DiscoEj3Refuerzo
{
    //Atributos:
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;


    //Contructores: //Coge todos los parametros y atributos de nuestro disco.
    public DiscoEj3Refuerzo(String codigo , String autor , String titulo , String genero, int duracion)
    {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }



     //Metodos :


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getDuracion() {
        return duracion;
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }



    @Override
    public String toString()
    {
        String resultado = "";
        

        resultado += "======================";
        resultado += ("Autor" + this.autor);
        resultado += ("Código" + this.codigo);
        resultado += ("Título" + this.titulo);
        resultado += ("Género" + this.genero);
        resultado += "Duración" + this.duracion;

        return resultado;


    }
    

    


}