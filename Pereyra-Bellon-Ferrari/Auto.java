/**
 * Clase Auto para crear un menú con los autos
 *
 * @author Daniela Pereyra - Alan Bellon
 * @version 1.0
 * */

public class Auto{
    //Atributos
    private String tipo; // Tipo de auto (ejemplo: Deportivos, Familiares...etc) 
    private String color; // Color del auto
    private String modelo; // Modelo del auto

    // Métodos constructores
    /**
     * Método constructor que representa
     * los datos del auto
     *
     * @param tipo El tipo de auto 
     * @param color El color del auto
     * @param modelo El modelo del auto
     * */
    public Auto(String tipo, String color, String modelo){
	this.tipo = tipo; // Sustituir el valor del tipo
	this.color = color; // Sustituir el valor del color
	this.modelo = modelo; // Sustituir el valor del modelo
    }

    public Auto(){
    }
    
    // Metodos get y set

    /**
     * Método que devuelve el tipo de auto
     *
     * @return tipo - El tipo de auto
     * */
    public String getTipo(){
	return this.tipo;
    }

    /**
     * Método que devuelve el color del auto
     *
     * @return color - El color del auto
     * */
    public String getColor(){
	return this.color;
    }

    /**
     * Método que devuelve el modelo del auto
     *
     * @return moddelo - El modelo del auto
     * */
    public String getModelo(){
	return this.modelo;
    }

    /**
     * Método que cambia el valor de tipo del auto
     *
     * @param tipo - El valor tipo de auto
     * */
    public void setTipo(String tipo){
	this.tipo = tipo;
    }
    /**
     * Método que cambia el valor del color del auto
     *
     * @param color - El valor del color del auto
     * */
    public void setColor(String color){
	this.color = color;
    }

    /**
     * Método que cambia el valor del modelo del auto
     *
     * @param modelo - El valor del modelo del auto
     * */
    public void setModelo(String modelo){
	this.modelo = modelo;
    }
    
    // Método toString
    /**
     * Método que hace conexión con el main 
     * para imprimir datos
     *
     * @return toString
     * */
    public String toString(){
	return "";
    }
}
