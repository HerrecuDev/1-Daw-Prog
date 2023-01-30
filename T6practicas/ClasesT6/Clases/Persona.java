package ClasesT6.Clases;

class Persona 
{
    //Añadimos Atributos :
    String dni;
    String nombre;
    String apellidos;
    int edad;
    int altura;

    //Creamos contructores : Se definen entre los atributos y los métodos :
    public Persona()
    {
        this.nombre = "Desconocido";
    }
    public Persona(String nombre , int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    /* public Persona(String nombre, int edad) //ESTE NUEVO CONTRUCTOR NO SERIA POSIBLE DEBIDO A QUE TIENE LOS MISMOVALORES QUE EL CONTRUCTOR ANTERIOS
    //Y SUELE DAR ERRORES INECESARIOS.
    {

    }
    */
   

    public Persona(String nombre, String apellidos , int edad , int estatura)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = estatura;

    }

    

    //Métodos :
    void saludar()
    {
        System.out.println("Hola soy" + nombre);
    }

    void cumplirAÑo()
    {
        edad = edad +1;
        //Edad++;
    }



    //Ocultacion de Atributos :
    String cambiarNombre(String nombre)
    {
        //Al colocar This.nombre nos referimos al String nombre del objeto , es decir la variable general mencionada arriba.

        this.nombre = nombre;//Nombre definido en la funcion void
        return this.nombre;
    }

    void CopiarPersona(Persona p1)
    {
        this.nombre = p1.nombre;
        this.edad = p1.edad;

    }


    //Atributos y métodos estaticos :
    static String QuediaEs()
    {
        String resultado = "Lunes";
        return resultado;

    }

    static String comoEstan()
    {
        String resultado = "MAL";
        return resultado;
    }

}
