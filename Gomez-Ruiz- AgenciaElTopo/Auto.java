/**
 *Clase para crear clientes de la agencia y obtener sus datos
 *@author Kevin Antonio Gomez Cobos
 *@author Julio Maximiliano Ruiz Gonzalez
 *@version 1.0 21/11/16
 *@see String
 */
public class Auto{

    //Atributos de la clase
	//Marca del auto
    private String marca;
	//Modelo del auto
    private String modelo;
	//Color del auto
    private String color;
	//Año de fabricación del auto
    private int anio;
	//Caballos de fuerza del auto
    private int potencia;
	//El costo del auto
    private double precio;

    /////////////////////////////////////////

    //Metodos constructores
    /**
     *Metodo constructor que recibe seis parametros, tres Strings, donde uno 
     *seria el nombre de la marca, otro el tipo de modelo y otro seria el 
	 *color del auto. recibe dos Integers, uno marcando el anio de construccion, 
	 *y el otro los caballos de fuerza. Junto a un Double que indica el precio
	 *del vehiculo.
     *@param marca String que es el nombre de la marca.
     *@param modelo String que es el modelo de carro.
	 *@param color String que es el color del auto.
     *@param anio int que es el anio de fabricacion.
	 *@param potencia int que son los caballos de fuerza.
     *@param precio double que es el precio del auto.
     */
    public Auto(String marca,String modelo,String color,int anio,int potencia,double precio){
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.anio = anio;
	this.potencia = potencia;
	this.precio = precio;
    }

    /////////////////////////////////////////

    //Getters
	/**
     *Metodo getter para obtener la marca del auto
     *@return String Marca del auto
     */
    public String getMarca(){
	return this.marca;
    }
	/**
     *Metodo getter para obtener el modelo del auto
     *@return String Modelo del auto
     */
    public String getModelo(){
	return this.modelo;
    }
	/**
     *Metodo getter para obtener el color del auto
     *@return String Color del auto
     */
    public String getColor(){
	return this.color;
    }
	/**
     *Metodo getter para obtener el anio de fabricacion del auto
     *@return int Anio de fabricacion del auto
     */
    public int getAnio(){
	return this.anio;
    }
	/**
     *Metodo getter para obtener la potencia del auto
     *@return int Caballos de potencia del auto
     */
    public int getPotencia(){
	return this.potencia;
    }
	/**
     *Metodo getter para obtener el precio del auto
     *@return double Precio del auto
     */
    public double getPrecio(){
	return this.precio;
    }

    /////////////////////////////////////////

    //Setters
	/**
     *Metodo setter por si el cliente quiere cambiar a otra marca de vehiculo
     *@param marca String que es el nombre de la marca
     */
    public void setMarca(String marca){
	this.marca = marca;
    }
	/**
     *Metodo setter por si el cliente quiere cambiar a otro modelo de vehiculo
     *@param modelo String que es el modelo del auto
     */
    public void setModelo(String modelo){
	this.modelo = modelo;
    }
	/**
     *Metodo setter por si el cliente quiere cambiar el color del vehiculo
     *@param color String que es el color del auto
     */
    public void setColor(String color){
	this.color = color;
    }
	/**
     *Metodo setter por si el cliente quiere cambiar a un modelo de otro anio
     *@param anio int que es el anio de fabricacion del auto
     */
    public void setAnio (int anio){
	this.anio = anio;
    }
	/**
     *Metodo setter por si el cliente quiere aumentar o disminuir la potencia del auto
     *@param potencia int que es los caballos de fuerza del auto
     */
    public void setPotencia (int potencia){
	this.potencia = potencia;
    }
	/**
     *Metodo setter por si el cliente quiere ver otros precios del mercado
     *@param precio double que es el precio del auto
     */
    public void setPrecio (double precio){
	this.precio = precio;
    }

    ////////////////////////////////////////

	/**
     *Metodo toString, para imprimir el objeto
     *@return String "Auto y sus caracteristicas: 
	 *                Marca: (nombre de la marca)
	 *                Modelo: (tipo de modelo)
	 *                Color: (color del auto)
	 *                Año: (anio de fabricacion)
	 *                Potencia: (numero) caballos de potencia
	 *                Precio: (precio del auto)"
     */
    //Método toString
    public String toString(){
	String s = "";
	s += "\n Auto y sus caracter\u00edsiticas: \n-Marca: "+this.marca+"\n-Modelo: "+this.modelo+"\n-Color: "+this.color+"\n-A\u00f1o: "
	    +this.anio+"\nPotencia: "+this.potencia+" caballos de potencia \n Precio: "+this.precio;
	return s;
    }
	      
    }
