/**
 *M�todo para crear vendedores de la agencia ElTopo y obtener sus datos
 *@author Kevin Antonio G�mez Cobos
 *@author Julio Maximiliano Ru�z Gonz�lez 
 *@version 1.0 21/11/17
 *@see String
 *@see Cliente
 */
public class Vendedor{

    //Atributos de la clase
    //Nombre del vendedor
    private String nombre;
    //Identificador �nico del vendedor
    private int identificador;
    //Contrase�a del vendedor
    private String contrasenia;
    //Estrellas que representan la calificaci�n del vendedor
    private int estrellas;

    /////////////////////////////////////////////
    
    //Constructores
    /**
     *M�todo constructor que no recibe par�metros, toma a un vendedor 
     *default para ayudar al cliente en la agencia
     */
    public Vendedor(){
	nombre = "Juan Diego Armando Muros Torres Mart\u00ednez";
	identificador = 4563;
	contrasenia = "SimplmenteJuan";
	estrellas = 5;
    }

    /**
     *M�todo constructor que recibe 3 par�metros, 2 Strings, uno ser�a el nombre del 
     *vendedor y el otro la contrase�a del vendedor y recibe tambi�n un int que ser�a
     *el identificador del vendedor, este constructor sirve para dar de alta vendedores
     *@param nombre String, nombre del vendedor
     *@param id Identificador del vendedor
     *@param contra String, contrase�a del vendedor
     */
    public Vendedor(String nombre,int id,String contra){
	this.nombre = nombre;
	this.identificador = id;
	this.contrasenia = contra;
	this. estrellas = 3;
    }

    /////////////////////////////////////////////

    //Getters
    /**
     *M�todo para obtener el nombre del vendedor
     *@return String Nombre del vendedor
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     *M�todo para obtener el identificador del vendedor
     *@return int Identificador del vendedor
     */
    public int getIdentificador(){
	return this.identificador;
    }

    /**
     *M�todo para obtener la contrase�a del vendedor
     *@return String Contrase�a del vendedor
     */
    public String getContrasenia(){
	return this.contrasenia;
    }

    /**
     *M�todo para obtener las estrellas del vendedor
     *@return int Estrellas del vendedor
     */
    public int getEstrellas(){
	return this.estrellas;
    }

    /////////////////////////////////////////////

    //Setters
    /**
     *M�todo setter para cambiar el nombre del vendedor
     *@param nombre Nombre del vendedor
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     *M�todo para modificar el identificador del vendedor
     *@param id N�mero identificador del vendedor
     */
    public void setIdentificador(int id){
	this.identificador = id;
    }

    /**
     *M�todo para modificar la contrase�a de la cuenta del vendedor
     *@param contra Contrase�a del vendedor
     */
    public void setContrasenia(String contra){
	this.contrasenia = contra;
    }

    /**
     *M�todo para modificar la calificaci�n en estrellas del vendedor
     *@param estrella Cantidad de estrellas
     */
    public void setEstrellas(int estrella){
	this.estrellas = estrella;
    }

    ///////////////////////////////////////////

    //M�todo toString
    /**
     *M�todo toString para imprimir el objeto y un mensaje de bienvenida
     *@param p Un objeto de la clase cliente para recibir su nombre
     *@return String Mensaje de bienvenida al cliente que haya iniciado sesi�n
     */
    public String toString(Cliente p){
	String s = "";
	s += "Bienvenido cliente "+p.getCliente()+" a la Agencia ElTopo, soy su vendedor "+this.nombre+" y estoy aqu\u00ed para ayudarle en lo que necesite,"+
	    " tranquilo puede confiar en mi al fin y al cabo soy un vendedor con "+this.estrellas+" estrellas de calificaci�n y estoy completamente capacitado para brindarle apoyo";
	return s;
    }

    ////////////////////////////////////////////
    
    //M�todo Adi�s
    /**
     *M�todo Adi�s para dar un mensaje de despedida al cliente que haya iniciado sesi�n
     *@param p Un objeto de la clase cliente para recibir su nombre
     *@return String Mensaje de despedida
     */
    public String Adios(Cliente p){
	String x = "";
	x += "Muchas gracias cliente "+p.getCliente()+" por utilizar nuestros servicio, esperemos verlo pronto pr�ximamente";
	return x;
    }
}
	
       
