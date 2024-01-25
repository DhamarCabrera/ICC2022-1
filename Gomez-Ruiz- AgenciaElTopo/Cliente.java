/**
 *Clase para crear clientes de la agencia y obtener sus datos
 *@author Kevin Antonio Gómez Cobos
 *@author Julio Maximiliano Ruíz González
 *@version 1.0 21/11/16
 *@see String
 */
public class Cliente{

    //Atributos de la clase
    //Nombre del cliente
    private String cliente;
    //Dinero del cliente
    private double dinero;
    //Contraseña que usa el cliente
    private String contrasenia;
	
    //////////////////////////////////////////

    //Métodos constructores
    /**
     *Método constructor que recibe dos parámetros, recibe dos Strings,
     *uno sería el nombre del cliente y otro sería la contrseña de la cuenta.
     *No recibe un parámetro de dinero porque este constructor sirve para que 
     *el cliente se registre con sus datos e ingrese el dinero que desea.
     *@param cliente String que es el nombre del cliente.
     *@param contra String que es la contraseña de la cuenta del cliente.
     */
    public Cliente(String cliente, String contra){
	this.cliente = cliente;
	this.dinero = 70000.00;
	this.contrasenia = contra;
    }

    /**
     *Método constructor que no recibe parámetros, es una cuenta default
     *para que el cliente sea anónimo y tenga dinero base que utilizar
     */
    public Cliente(){
	cliente = "Cliente default 1";
	dinero = 52000.00;
	contrasenia = "kokoko";
    }

    /**
     *Método constructor que sólo recibe un parámetro, un double que vendría 
     *a ser la cantidad de dinero que quiere utilizar el usuario, mientras que
     *la cuenta es anónima
     *@param dinero Cantidad de dinero a ingresar en la cuenta.
     */
    public Cliente(double dinero){
	cliente = "Cliente defualt 2";
	this.dinero = dinero;
	contrasenia = "kekeke";
    }
	
    ////////////////////////////////////////////

    //Getters y Setters
    /**
     *Método getter para obetener el nombre del cliente
     *@return String Nombre del cliente
     */
    public String getCliente(){
	return this.cliente;
    }

    /**
     *Método setter por si el cliente quiere cambiar el nombre de su cuente
     *@param cliente String que es el nombre del cliente
     */
    public void setCliente(String cliente){
	this.cliente = cliente;
    }

    /**
     *Método getter para obetener la cantidad de dinero de la cuenta del cliente
     *@return double Dinero de la cuenta del cliente
     */
    public double getDinero(){
	return this.dinero;
    }

    /**
     *Método setter para modificar la cantidad de dinero de la cuenta del cliente
     *@param dinero Dinero a ingresar de la cuenta del usuario
     */
    public void setDinero(double dinero){
	this.dinero = dinero;
    }

    /**
     *Método getter para obtener la contraseña del cliente
     *@return String Contraseña del usuario
     */
    public String getContra(){
	return this.contrasenia;
    }

    /**
     *Método setter para reemplzara la contraseña del cliente
     *@param contra String que es la contraseña del cliente
     */
    public void setContra(String contra){
	this.contrasenia = contra;
    }

    ///////////////////////////////////////////

    /**
     *Método toString, para imprimir el objeto
     *@return String "Usted accedió como el usuario: (nombre del cliente), Su capital disponible: (dinero cuenta)"
     */
    //Método toString	
    public String toString(){
	String s = "";
	s += "\n *Usted accedi\u00f3 como el usuario: "+this.cliente+"*"+"\n *Su capital disponible: \u0024"+this.dinero+"*";
	return s;
    }
	
}
