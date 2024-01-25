//ENCABEZADO
/**
 * Clase que representa a un automóvil
 *
 * @author Isaac Alcantara y Eduardo Vargas
 * @version 1.0
 * */

public class Auto{
    //CUERPO
    //Atributos

    //Marca del auto
    private String marca;
    //Modelo (nombre) del auto
    private String modelo;
    //Año de fabricación
    private int ano;
    //Precio del auto
    private double precio;
    //Color del auto
    private String color;

    //Métodos
    //Métodos Constructores
    /**
     * Constructor que permite crear un automóvil especificando cada una
     * de sus características
     *
     * @param marca La marca del auto
     * @param modelo El modelo (nombre)
     * @param ano El año de fabricación
     * @param precio El precio del auto
     * @param color El color del auto
     **/
    public Auto(String marca, String modelo, int ano, double precio, String color){
	this.marca = marca;
	this.modelo = modelo;
	//Para asegurar un año positivo
	ano = Math.abs(ano);
	this.ano = ano;
	this.precio = precio;
	this.color = color; 
    }
    
    /**
     * Constructor sin parametros, crea un automóvil de la marca Toyota, 
     * modelo Prius, del año 2021 y color rojo, con un valor de 
     * 380000 pesos
     * 
     **/
    public Auto(){
	this("Toyota", "Prius", 2021, 380000, "Rojo");
    }

    /**
     * Constructor copia. Crea un automovil identico a otro
     *
     * @param a Un objeto de la clase auto
     **/
    public Auto(Auto a){
	this(a.marca, a.modelo, a.ano, a.precio, a.color);
    }
    
    //Métodos Observadores
    /**
     * Método que devuelve la marca del automóvil
     *
     * @return La marca del auto
     * */
    public String getMarca(){
	return this.marca;
    }

    /**
     * Método que devuelve el modelo del auto (nombre)
     *
     * @return El nombre del modelo del auto
     * */
    public String getModelo(){
	return this.modelo;
    }

    /**
     * Método que devuelve el año de fabricación del automóvil
     *
     * @return El año de fabricación del auto.
     * */
    public int getAno(){
	return this.ano;
    }

    /**
     * Método que devuelve el precio del automóvil
     *
     * @return El precio del auto
     * */
    public double getPrecio(){
	return this.precio;
    }

    /**
     * Método que devuelve el color del automóvil
     *
     * @return El color del auto.
     * */
    public String getColor(){
	return this.color;
    }

    //Métodos modificadores
    /**
     * Método que permite cambiar la marca de un auto
     *
     * @param ma La nueva marca
     **/
    public void setMarca(String ma){
	this.marca = ma;
    }

    /**
     * Método que permite modificar el modelo de un auto
     *
     * @param mo El nuevo modelo
     **/
    public void setModelo(String mo){
	this.modelo = mo;
    }

    /**
     * Método que permite cambiar el año de fabricación de 
     * un auto
     *
     * @param a El nuevo año de fabricación
     **/
    public void setAno(int a){
	//Para asegurar a positivo
	a = Math.abs(a);
	this.ano = a;
    }

    /**
     * Método que permite cambiar el precio del auto
     *
     * @param p El nuevo precio
     **/
    public void setPrecio(double p){
	this.precio = p;
    }

    /**
     * Método que permite cambiar el color de un auto
     *
     * @param c El nuevo color
     **/
    public void setColor(String c){
	this.color = c;
    }

    //Métodos calculadores
    /**
     * Método que permite saber si un auto es 
     * considerado como clásico
     * 
     * @return Un valor boolean dependiendo de la respuesta
     **/
    public boolean clasico(){
	//Un auto se considera clásico en la CDMX si tiene 30 años o más
	boolean clasico;
	int a = this.getAno(); //Variable para guardar el año del auto
	//Calcula la antiguedad
	int antiguedad = 2021 - a;
	//Si es mayor a 30 es clásico
	if (antiguedad >= 30 ){
	    clasico = true;
	    return clasico;
	}else{//Si no es mayor a 30 no es clásico
	    clasico = false;
	    return clasico;
	}
    }

    //Métodos especiales
    /**
     * Método toString
     *
     * @return Las características básicas del automóvil
     **/
    public String toString(){
	return "Automóvil: " + this.marca + " " + this.modelo + "\n" + "Año " + this.ano + "\n" + "Color: " + this.color + "\n" + "Con un precio actual de: " + this.precio + " pesos."; 
    }

    /**
     * Método equals. Sirve para ver si dos autos son iguales
     *
     * @param a Auto contra el que se va a comparar
     * @return un valor boolean dependiendo la respuesta
     **/
    public boolean equals(Auto a){
	String ma =this.marca; //Variable para la marca
	String mo = this.modelo; //Variable para modelo
	int n = this.ano; //Variable para Año
	String c = this.color; //Variable para color
	double p = this.precio; //Variable para precio
	return ma.equals(a.marca) && mo.equals(a.modelo) && n == a.ano && c.equals(a.color) && p == precio;
    }

}
