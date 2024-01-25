/**
 * Cliente representa un cliente apartir de su nombre, edad, direccion, y dinero.
 *@author Juarez Martinez && Flores Santillan
 *@version 1.0
 */
public class Cliente{
    //atributos.
    private String name_cliente;
    private String direccion_cliente;
    private double dineroDisponible;
    private int edad;
    // Metodos constructores.
    /**
     *Constructor cliente crea un cliente sin valores iniciales.
     */    
    public Cliente(){
	this.name_cliente = " ";
	this.direccion_cliente = " ";
	this.dineroDisponible = 0;
	this.edad = 0;

    }
    /**
     * Constructor cliente crea un cliente apartir de los valores de nombre, direccion, dinero, edad.
     * @param name - nombre del cliente. 
     * @param direccion - direccion del cliente.
     * @param dinero - dinero del cliente.
     * @param eda - edad del cliente.
     */
    public Cliente(String name, String direccion, double dinero, int edad){
      setNameCliente(name);
      setDireccionCliente(direccion);
      setEdad(edad);
      setDineroDisponible(dinero);
    }

    //Metodos de asignacion.
    /**
     * Metodo setName para modificar el nombre del cliente.
     * @param name - nombre del cliente. 
     */    
    public void setNameCliente(String name){
	  this.name_cliente = name;
    }
    /**
     * Metodo setDireccionCliente para modificar la direccion del cliente.
     * @param txt - direccion del cliente. 
     */
    public void setDireccionCliente(String txt){
	   this.direccion_cliente = txt;
    }
    /**
     * Metodo setDineroDisponible para modificar el dinero del cliente
     * @param masdinero - dinero del cliente. 
     */
    public void setDineroDisponible(double masdinero){
	   this.dineroDisponible = masdinero;
    }
    /**
     * Metodo setEdad para modificar la edad del cliente.
     * @param edad - edad del cliente.
     * */
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Metodos de acceso.
    /**
     * Metodo getDireccionCliente para obtener la direccion del cliente.
     * @return String - direccion del cliente.
     */ 
    public String getDireccionCliente(){
	return this.direccion_cliente;
    }
    /**
     * Metodo getNameCliente para obtener el nombre del cliente.
     * @return String - nombre del cliente.
     */     
    public String getNameCliente(){
	  return this.name_cliente;
    }
    /**
     * Metodo getDineroDisponible para obtener el dinero  del cliente.
     * @return String - dinero del cliente.
     */ 
    public double getDineroDisponible(){
	  return this.dineroDisponible;
    }
     /**
     * Metodo getEdad para obtener la direccion del cliente.
     * @return int - edad del cliente.
     */ 
     public int getEdad(){
        return this.edad;
     }

    /**
     * Metodo toString devuelve el objeto cliente en forma de cadena.
     * @return String - valores de los atributos del objeto cliente.
     */
    public String toString(){
       String dinerocliente = String.valueOf(this.dineroDisponible);
       String edadCliente = String.valueOf(this.edad); 
	   return "El nombre del cliene es : " + this.name_cliente + "\n"
       + "Edad del cliene : " + edadCliente + "\n"
       + "La direccion del cliente es : " + this.direccion_cliente + "\n"
       + "Dinero disponible del cliene: " + " $ " + dinerocliente;


    }

    
}
