/**
 *Clase para crear clientes de la agencia y obtener sus datos
 *@author Kevin Antonio G�mez Cobos
 *@author Julio Maximiliano Ru�z Gonz�lez
 *@version 1.0 21/11/16
 *@see String
 */
public class Cliente{

    //Atributos de la clase
    //Nombre del cliente
    private String cliente;
    //Dinero del cliente
    private double dinero;
    //Contrase�a que usa el cliente
    private String contrasenia;
	
    //////////////////////////////////////////

    //M�todos constructores
    /**
     *M�todo constructor que recibe dos par�metros, recibe dos Strings,
     *uno ser�a el nombre del cliente y otro ser�a la contrse�a de la cuenta.
     *No recibe un par�metro de dinero porque este constructor sirve para que 
     *el cliente se registre con sus datos e ingrese el dinero que desea.
     *@param cliente String que es el nombre del cliente.
     *@param contra String que es la contrase�a de la cuenta del cliente.
     */
    public Cliente(String cliente, String contra){
	this.cliente = cliente;
	this.dinero = 70000.00;
	this.contrasenia = contra;
    }

    /**
     *M�todo constructor que no recibe par�metros, es una cuenta default
     *para que el cliente sea an�nimo y tenga dinero base que utilizar
     */
    public Cliente(){
	cliente = "Cliente default 1";
	dinero = 52000.00;
	contrasenia = "kokoko";
    }

    /**
     *M�todo constructor que s�lo recibe un par�metro, un double que vendr�a 
     *a ser la cantidad de dinero que quiere utilizar el usuario, mientras que
     *la cuenta es an�nima
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
     *M�todo getter para obetener el nombre del cliente
     *@return String Nombre del cliente
     */
    public String getCliente(){
	return this.cliente;
    }

    /**
     *M�todo setter por si el cliente quiere cambiar el nombre de su cuente
     *@param cliente String que es el nombre del cliente
     */
    public void setCliente(String cliente){
	this.cliente = cliente;
    }

    /**
     *M�todo getter para obetener la cantidad de dinero de la cuenta del cliente
     *@return double Dinero de la cuenta del cliente
     */
    public double getDinero(){
	return this.dinero;
    }

    /**
     *M�todo setter para modificar la cantidad de dinero de la cuenta del cliente
     *@param dinero Dinero a ingresar de la cuenta del usuario
     */
    public void setDinero(double dinero){
	this.dinero = dinero;
    }

    /**
     *M�todo getter para obtener la contrase�a del cliente
     *@return String Contrase�a del usuario
     */
    public String getContra(){
	return this.contrasenia;
    }

    /**
     *M�todo setter para reemplzara la contrase�a del cliente
     *@param contra String que es la contrase�a del cliente
     */
    public void setContra(String contra){
	this.contrasenia = contra;
    }

    ///////////////////////////////////////////

    /**
     *M�todo toString, para imprimir el objeto
     *@return String "Usted accedi� como el usuario: (nombre del cliente), Su capital disponible: (dinero cuenta)"
     */
    //M�todo toString	
    public String toString(){
	String s = "";
	s += "\n *Usted accedi\u00f3 como el usuario: "+this.cliente+"*"+"\n *Su capital disponible: \u0024"+this.dinero+"*";
	return s;
    }
	
}
