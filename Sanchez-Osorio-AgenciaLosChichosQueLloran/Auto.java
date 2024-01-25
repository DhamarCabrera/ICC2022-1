/**
 * Clase que representa un Auto
 * @author Ethan Damian
 * @version version 1.0// 8-nov-2021
*/

public class Auto{
    //El modelo del auto
    private String modelo;
    
    //El color del auto
    private String color;

    //el modelo del auto
    private String noPuertas;

    //El año del modelo
    private String año;

    //El auto es electrico o no
    private boolean electrico;

    //El precio del auto
    private String precio;

    //CONSTRUCTORES

    /**
     * Constructor que recibe cinco paramteros
     * @param modelo El modelo del auto 
     * @param color El color del auto
     * @param noPuertas El numero de puertas del auto 
     * @param año EL año del auto
     * @param electrico Si el auto es electrico o no 
     */

    public Auto(String modelo, String color, String noPuertas, String año, boolean electrico, String precio){
	this.modelo = modelo;
	this.color = color;
	this.noPuertas = noPuertas;
	this.año = año; 
	this.electrico = electrico;
	this.precio = precio;
    } 

    /**
     * Constructor que recibe el color del auto -- El auto es un aveo, con color a elegir 
     * @param color EL color del auto
     */       

    public Auto(String color){
	this.modelo = "Chevrolet Aveo";
	this.color = color;
	this.noPuertas = "4";
	this.año = "2022";
	this.electrico = false;
	this.precio = "229,200";
	
    }

    /**
     * Constructor sin parametros-- representa a un Chevrolet Groove 2022
     */

    public Auto(){
	this.modelo = "Chevrolet Groove";
	this.color = "rojo";
	this.noPuertas = "4";
	this.año = "2022";
	this.electrico = false;
	this.precio = "332,900";

    }

    /**
     * Constructor que recibe dos parametro y que representa a un Chevrolet Volt EUV 2020
     * @param electrico Si el auto es electrico o no.
     * @param precio El nuevo precio del auto
     */
    public Auto(boolean electrico, String precio){
	this.modelo = "Chevrolet Bolt EUV";
	this.color = "blanco";
	this.noPuertas = "4";
	this.año = "2020";
	this.electrico = electrico;
	this.precio = precio;
	    

    }

    
    //METODOS
    
    //GETTERS

    /**
     * Metodo que devuelve el modelo del auto 
     * @return El modelo del auto 
     */

    public String getModelo(){
	return this.modelo; 

    }

    
    /**
     * Metodo que devuelve el color del auto 
     * @return El color del auto 
     */

    public String getColor(){
	return this.color; 

    }

    
    /**
     * Metodo que devuelve el numero de puertas del auto 
     * @return El numero de puertas del auto 
     */

    public String getNoPuertas(){
	return this.noPuertas; 

    }

    
    /**
     * Metodo que devuelve el año del auto 
     * @return El año del auto 
     */

    public String getAño(){
	return this.año; 

    }

        /**
     * Metodo que devuelve si el auto es electrico o no  
     * @return Si el auto es electrico o no  
     */

    public boolean getElectrico(){
	return this.electrico; 

    }

    
        /**
     * Metodo que devuelve el precio del auto  
     * @return El precio del auto 
     */

    public String getPrecio(){
	return this.precio; 

    }


    //SETTERS
    /**
     * Metodo que cambia el modelo del auto
     * @param modelo El nuevo modelo del auto  
     */

    public void setModelo(String modelo){
	this.modelo = modelo;
    }

    
   
    /**
     * Metodo que cambia el color del auto
     * @param color El nuevo color del auto  
     */

    public void setColor(String color){
	this.color = color;
    }

    
   
    /**
     * Metodo que cambia el numero de puertas del auto
     * @param noPuertas El nuevo numero de puertas del auto  
     */

    public void setNoPuertas(String noPuertas){
	this.noPuertas = noPuertas;
    }

    
    /**
     * Metodo que cambia el año del auto
     * @param año El nuevo año del auto  
     */

    public void setAño(String año){
	this.año = año;
    }

    /**
     * Metodo que cambia si el auto es electrico o no 
     * @param modelo El nuevo valor de si es electrico o no   
     */

    public void setElectrico(boolean electrico){
	this.electrico = electrico;
    }

    /**
     * Metodo que cambia el precio del auto
     * @param precio El nuevo precio del auto  
     */

    public void setPrecio(String precio){
	this.precio = precio;
    }
    


    //METODOS ESPECIALES

    /**
     * Metodo toString que regresa el objeto en forma de cadena 
     * @return El objeto en forma de cadena
     */

    public String toString(){
	
	return "Modelo : " + this.modelo +"\n"
	    + "Color : " + this.color + "\n" +
	    "No. de puertas : " + this.noPuertas + "\n"
	    + "Año: " + this.año + "\n"
	    + "Electrico: " + this.electrico + "\n"
	    + "Precio: $" + this.precio;
	
    }


    



    
    


}//fin de la clase autos
