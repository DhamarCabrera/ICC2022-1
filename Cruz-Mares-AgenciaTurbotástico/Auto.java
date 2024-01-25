/**
 *clase auto
 *@author Mares Horacio
 *@version 1
 */
public class Auto{
    //asignamos los parametros que tendra nuestro auto
    private String modelo;
    private String color;
    private String tipo;
    private double costo;
    //metodo constructor donde todo sera no asignado de momento
    public Auto(){
	this.modelo = "vacio";
	this.color = "vacio";
	this.tipo = "vacio";
	this.costo = 0.00;
    }
	/**
	 *metodos para obtener y establecer los valores
	 *@param modelo
	 *@param color
	 *@param tipo
	 *@param costo
	 */
	public String getModelo(){
	    return modelo;
	}
	public void setModelo(String modelo){
	    this.modelo = modelo; 
	}
       	public String getColor(){
	    return color;
	}
	public void setColor(String color){
	    this.color = color; 
	}
	public String getTipo(){
	    return tipo;
	}
	public void setTipo(String tipo){
	    this.tipo = tipo; 
	}
       	public double getCosto(){
	    return costo;
	}
	public void setCosto(double costo){
	    this.costo = costo; 
	}
	
	
}
