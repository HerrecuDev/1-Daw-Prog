package ClasesT6.Clases;

class Persona 
{
    //Añadimos Atributos :
    String dni;
    String nombre;
    String apellidos;
    int edad;
    int altura;
    CuentaCorriente cc;

    static boolean vivo = true;

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
        this(nombre,edad);//Llama al contructor anterior de edad y nombre. Y siempre se tiene que declarar al principio debido a que de esta forma el this nos crea el Objeto.
        this.apellidos = apellidos;
        this.altura = estatura;
        this.dni = dni;

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
    static void matarAtodos()
    {
        vivo = false;
       
    }

    public void crearCuentaCorriente ()
    {
        CuentaCorriente cc = new CuentaCorriente("00000", this.nombre);
        this.cc = cc;
        //cc.dni = "7777";
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
