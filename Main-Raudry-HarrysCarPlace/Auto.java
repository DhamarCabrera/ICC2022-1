/**
 * Clase que modela un auto
 * @author Asahel Main, Arsenio Raudry
 * @version version 1.1
 */

public class Auto{

    //El modelo del automovil
    private String modelo;
    
    //El color del automovil
    private String color;
    
    //La fecha de fabricacion del automovil
    private String fechaDeFabricacion;

    //El precio del automovil
    private double precio;

    //Si el auto está disponible
    private boolean disponibilidad;

    //El nombre del vendedor del auto
    private Vendedor vendedor;

    //Constructores

    /**
     * Constructor que recibe cuatro parametros
     * @param modelo El modelo del automovil
     * @param color El color del automovil
     * @param fechaDeFabricacion La fecha de fabricacion del auto
     * @param precio El precio del automovil
     * A disponibilidad se le asigna el valor de true
     */
    public Auto(String modelo, String color, String fechaDeFabricacion, double precio){
	this.modelo = modelo;
	this.color = color;
	this.fechaDeFabricacion = fechaDeFabricacion;
	this.precio = precio;
	this.disponibilidad = true;
    }

    /**
     * Constructor sin parametros
     * A modelo se le asigna "Tsuru"
     * A color se le asigna "Arcoiris"
     * A fechaDeFabricacion se le asigna "1988"
     * A precio se le asigna 100000
     * A disponibilidad se le asigna el valor de true
     */
    public Auto(){
	this("Tsuru", "Arcoiris", "1988", 100000);
    }

    public Auto(Auto auto){
	this.modelo = auto.modelo;
	this.color = auto.color;
	this.fechaDeFabricacion = auto.fechaDeFabricacion;
	this.precio = auto.precio;
    }

    /**
     * Metodo que regresa el modelo del automovil
     * @return El modelo del automovil
     */
    public String getModelo(){
	return this.modelo;
    }

    /**
     * Metodo que modifica el modelo del automovil
     * @param modelo El nuevo modelo
     */
    public void setModelo(String modelo){
	this.modelo = modelo;
    }

    /**
     * Metodo que regresa el color del automovil
     * @return El color del automovil
     */
    public String getColor(){
	return this.color;
    }

    /**
     * Metodo que modifica el color del automovil
     * @param color El nuevo color del automovil
     */
    public void setColor(String color){
	this.color = color;
    }

    /**
     * Metodo que regresa la fecha de fabricacion del auto
     * @return La fecha de fabriacion del auto
     */
    public String getFecha(){
	return this.fechaDeFabricacion;
    }

    /**
     * Metodo que modifica la fecha de fabricacion del auto
     * @param fechaDeFabricacion La nueva fecha de fabriacion del auto
     */
    public void setFecha(String fechaDeFabricacion){
	this.fechaDeFabricacion = fechaDeFabricacion;
    }

    
    /**
     * Metodo que regresa el precio del automovil 
     * @return El precio del automovil
     */
    public double getPrecio(){
	return this.precio;
    }


    /**
     * Metodo que modifica el precio del automovil
     * @param precio El nuevo precio del automovil 
     */
    public void setPrecio(double precio){
	this.precio = precio;
    }

    /**
     * Metodo que regresa la disponibilidad del automovil
     * @return La disponibilidad del automovil
     */
    public boolean getDisponibilidad(){
	return this.disponibilidad;
    }

    /**
     * Metodo que modifica la disponibilidad del automovil
     * @param disponibilidad El nuevo valor de disponibilidad del automovil
     */
    public void setDisponibilidad(boolean disponibilidad){
	this.disponibilidad = disponibilidad;
    }
    /**
     * Metodo que devuelve el nombre del vendedor del auto
     * @return El nombre del vendedor del auto
     */
    public Vendedor getVendedor(){
	return this.vendedor;
    }
    /**
     * Metodo que modifica el nombre del vendedor actual del auto
     * @param nombre El nuevo nombre del nuevo vendedor
     */
    public void setVendedor(Vendedor vendedor){
	this.vendedor = vendedor;
    }
    /**
     * Metodo toString que muestra al objeto de la clase Auto en forma de String
     * @return El objeto de la clase Auto en forma de String
     */
    public String toString(){
	return "Modelo: " + this.modelo + "\n Color: " + this.color + "\n Fecha de fabriacion: " + this.fechaDeFabricacion + "\n Precio: " + this.precio;
    }
    
}
