/**
 *Clase que representa a un comprador en una agencia de autos
 *@author Isaac Alcántara y Eduardo Vargas
 *@version 1.1
 */

public class Comprador{
    // Nombre del comprador
    private String nombre;
    // Apellido del comprador
    private String apellido;
    // Número de la cuenta bancaria del comprador
    private int numCuenta;
    // Dinero disponible en la cuenta bancaria del comprador
    private double dinero;
    //Estado de ánimo del comprador
    private String estadoAnimo;

    /**
     *Método que devuelve el estado de ánimo del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String estadoAnimo
     */
     public String getEstadoAnimo(){
	return this.estadoAnimo;
    }
    /**
     *Método que modifica el atributo "estadoAnimo" del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param estadoAnimo Estado de ánimo del comprador
     */
    public void setEstadoAnimo(String estadoAnimo){
	this.estadoAnimo= estadoAnimo;
    }
    /**
     *Método que devuelve el nombre del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String nombre
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     *Método que modifica el atributo "nombre" del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param nombre Nombre del comprador
     */

    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     *Método que devuelve el apellido del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String apellido
     */
    
    public String getApellido(){
	return this.apellido;
    }

    /**
     *Método que modifica el atributo "apellido" del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param apellido Apellido del comprador
     */
      public void setApellido(String apellido){
	this.apellido = apellido;
    }

     /**
      *Método que devuelve el número de cuenta bancaria del comprador
      *@author Isaac Alcántara y Eduardo Vargas
      *@version 1.0
      *@return int numCuenta
      */
    
    public int getNumCuenta(){
	return this.numCuenta;
    }
    /**
     *Método que modifica el atributo "numCuenta" del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param numCuenta Número de la cuenta bancaria del comprador
     */
  public void setNumCuenta(int numCuenta){
	this.numCuenta = numCuenta;
    }

    /**
     *Método que devuelve el dindero disponible en la cuenta bancaria del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return double dinero
     */
    public double getDinero(){
	return this.dinero;
    }
    
    /**
     *Método que modifica el atributo "dinero" del comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param dinero Dinero disponible en la cuenta bancaria del comprador
     */
  public void setDinero(double dinero){
	this.dinero = dinero;
    }


    /**
     *COnstructor sin parámetros que crea un objeto de la clase comprador con valores pre-establecidos por los desarroladores
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     */
    public Comprador (){
  
     nombre= "Usuario";
     apellido= "Uno";
     numCuenta = 000;
     dinero= 0.00;
     estadoAnimo = "Feliz";
    }
    /**
     *Método constructor que crea un objeto de la clase comprador y recibe cinco parámetros
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param nombre Nombre del comprador
     *@param apellido Apellido del comprador
     *@param numCuenta Número de la cuenta bancaria del comprador
     *@param dinero Dinero disponible en la cuenta bancaria del comprador
     *@param estadoAnimo Estado de ánimo dle comprador
     */
    public Comprador (String nombre, String apellido, int numCuenta, double dinero, String estadoAnimo){
  
     this.nombre = nombre;
     this.apellido = apellido;
     this.numCuenta = numCuenta;
     this.dinero = dinero;
     this.estadoAnimo = estadoAnimo;
    }
    /**
     *Método toString que devuelve una cadena de String con los valores de los atributos de un objeto de la clase comprador
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String
     */
    public String toString(){
	return "Nombre: " + this.nombre + "\n Apellido: " + this.apellido + "\n Número de Cuenta: " + this.numCuenta + "\n Dinero en cuenta: " + this.dinero +  "\n Esta " + this.estadoAnimo; 
    }

    /**
     *Método que simula una compra y devuelve el dinero disponible en la cuenta bancaria del comprador después de realizar la compra. Modifica el estado de animo del comprador según el resultado de la compra
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param precio Precio del objeto a comprar 
     *@return String
     */
    public String comprar(double precio){
	//Se declara una variable para modificar el atributo "estadoAnimo" del objeto de la clase comprador
        String estadoaAnimo = "Feliz";
	//Abrimos una condicional donde preguntamos si el parámetro precio es menor o igual que el dinero disponible en la cuenta bancaria del comprador
	if(precio <= this.dinero){
	    //Si la condición se cumple se realiza la compra y se resta el precio al dinero en la cuenta bancaria 
	    this.dinero-= precio;
	    //Se modifica el atributo "estadoAnimo" del comprador
            setEstadoAnimo(estadoAnimo);
	    // Se duelve un String con un mensaje y el nuevo saldo en la cuenta bancaria
	    return "Gracias por su compra, ahora el dinero en su cuenta es de " + this.dinero + " pesos"; 
	} else {
	    //Si no se cumple, el valor de la variable estadoAnimo se modifica
	    estadoAnimo = "Triste";
	    //Se modifica el valor del atributo "estadoAnimo" del objeto de la clase comprador
	    setEstadoAnimo(estadoAnimo);
	    //Se devuelve un String con un mensaje y el valor del atributo "dinero" del objeto de la clase comprador
	 	return "No cuenta con el dinero disponible para realizar esa compra, su saldo es de " + this.dinero + " pesos";  
   
	}

    }

    /**
     *Método que simula una renta y devuelve el dinero disponible en la cuenta bancaria del comprador después de realizar la compra. Modifica el estado de animo del comprador según el resultado de la compra
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@param tiempo Tiempo en días durante los cuales se rentará el auto
     *@param precio Precio del objeto a comprar 
     *@return String
     */
    public String rentar(int tiempo, double precio){
	//Se crea una variable String para modificar el atributo "estadoAnimo" del objeto de la clase comprador
        String estadoaAnimo = "Feliz";
	//Se crea una variable tipo double para guardar el total del costo de la renta del auto
	double total;
	//Se le asigna a la variable total el valor de multiplicar el precio del auto por el tiempo de renta
	total = (precio*tiempo);
	//Se abre una condicional donde se pregunta si el valor de la variable total es menor o igual al valor del atributo "dinero" del objeto de la clase comprador
	if(total <= this.dinero){
	    // Si la conndición se cumple, se resta el valor de la variable total a el valor del atributo "dinero" 
	    this.dinero-= total;
	    //Se modifica el valor del atributo "estadoAnimo" del ejemplar de la clase comprador
            setEstadoAnimo(estadoAnimo);
	    //Se devuelve un mensaje junto con el valor del atributo "dinero"
	    return "Gracias por su renta, ahora el dinero en su cuenta es de " + this.dinero + " pesos"; 
	} else {
	    //Se asigna un nuevo valor a la varibale estadoAnimo
	    estadoAnimo = "Enojado";
	    //Se modifica el valor del atributo "estadoAnimo" del ejemplar de la clase comprador
	    setEstadoAnimo(estadoAnimo);
	    //Se devuelve un mensaje junto con el valor actual del atributo "dinero" del objeto de la clase comprador
	 	return "No cuenta con el dinero disponible para realizar esa renta, pues su saldo es de " + this.dinero + " pesos" + "\n Puede intentar rentar otro auto o cambiar el tiempo de renta";  
	 	
   
	}

    }


    /**
     *Método de comportamiento que devuelve un mensaje de despedida alegre
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String
     */
    public String feliz(){

	return "Muchas gracias, que tenga excelente día";

    }
    /**
     *Método de comportamiento que devuelve un mensaje de despedida triste
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String
     */
     public String triste(){

	return "Rayos, supongo que aún no podré comprar ese auto, bueno, gracias";

    }
    /**
     *Método de comportamiento que devuelve un mensaje de despedida molesta
     *@author Isaac Alcántara y Eduardo Vargas
     *@version 1.0
     *@return String
     */
     public String enojado(){

	return "Pero qué tontería, esto debe ser un error, no vuelvo a este lugar";

    }
}
