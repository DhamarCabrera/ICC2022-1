/**
 *Método para crear vendedores de la agencia ElTopo y obtener sus datos
 *@author Kevin Antonio Gómez Cobos
 *@author Julio Maximiliano Ruíz González 
 *@version 1.0 21/11/17
 *@see String
 *@see Cliente
 */
public class Vendedor{

    //Atributos de la clase
    //Nombre del vendedor
    private String nombre;
    //Identificador único del vendedor
    private int identificador;
    //Contraseña del vendedor
    private String contrasenia;
    //Estrellas que representan la calificación del vendedor
    private int estrellas;

    /////////////////////////////////////////////
    
    //Constructores
    /**
     *Método constructor que no recibe parámetros, toma a un vendedor 
     *default para ayudar al cliente en la agencia
     */
    public Vendedor(){
	nombre = "Juan Diego Armando Muros Torres Mart\u00ednez";
	identificador = 4563;
	contrasenia = "SimplmenteJuan";
	estrellas = 5;
    }

    /**
     *Método constructor que recibe 3 parámetros, 2 Strings, uno sería el nombre del 
     *vendedor y el otro la contraseña del vendedor y recibe también un int que sería
     *el identificador del vendedor, este constructor sirve para dar de alta vendedores
     *@param nombre String, nombre del vendedor
     *@param id Identificador del vendedor
     *@param contra String, contraseña del vendedor
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
     *Método para obtener el nombre del vendedor
     *@return String Nombre del vendedor
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     *Método para obtener el identificador del vendedor
     *@return int Identificador del vendedor
     */
    public int getIdentificador(){
	return this.identificador;
    }

    /**
     *Método para obtener la contraseña del vendedor
     *@return String Contraseña del vendedor
     */
    public String getContrasenia(){
	return this.contrasenia;
    }

    /**
     *Método para obtener las estrellas del vendedor
     *@return int Estrellas del vendedor
     */
    public int getEstrellas(){
	return this.estrellas;
    }

    /////////////////////////////////////////////

    //Setters
    /**
     *Método setter para cambiar el nombre del vendedor
     *@param nombre Nombre del vendedor
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     *Método para modificar el identificador del vendedor
     *@param id Número identificador del vendedor
     */
    public void setIdentificador(int id){
	this.identificador = id;
    }

    /**
     *Método para modificar la contraseña de la cuenta del vendedor
     *@param contra Contraseña del vendedor
     */
    public void setContrasenia(String contra){
	this.contrasenia = contra;
    }

    /**
     *Método para modificar la calificación en estrellas del vendedor
     *@param estrella Cantidad de estrellas
     */
    public void setEstrellas(int estrella){
	this.estrellas = estrella;
    }

    ///////////////////////////////////////////

    //Método toString
    /**
     *Método toString para imprimir el objeto y un mensaje de bienvenida
     *@param p Un objeto de la clase cliente para recibir su nombre
     *@return String Mensaje de bienvenida al cliente que haya iniciado sesión
     */
    public String toString(Cliente p){
	String s = "";
	s += "Bienvenido cliente "+p.getCliente()+" a la Agencia ElTopo, soy su vendedor "+this.nombre+" y estoy aqu\u00ed para ayudarle en lo que necesite,"+
	    " tranquilo puede confiar en mi al fin y al cabo soy un vendedor con "+this.estrellas+" estrellas de calificación y estoy completamente capacitado para brindarle apoyo";
	return s;
    }

    ////////////////////////////////////////////
    
    //Método Adiós
    /**
     *Método Adiós para dar un mensaje de despedida al cliente que haya iniciado sesión
     *@param p Un objeto de la clase cliente para recibir su nombre
     *@return String Mensaje de despedida
     */
    public String Adios(Cliente p){
	String x = "";
	x += "Muchas gracias cliente "+p.getCliente()+" por utilizar nuestros servicio, esperemos verlo pronto próximamente";
	return x;
    }
}
	
       
