/**
 * Clase Auto
 * Clase que muestra los datos de un Auto
 * @author Brenda Paola Resendiz Mendoza 
 * @author Dulce Julieta Mora Hernandez 
 * @version 1.0
 */

public class Auto{
    
    //Atributos
    private String color;
    private String marca;
    private int fabricacion;
    private int pasajeros;
    private String tipodeauto;
    private String tipodeenergia;
    private int puertas;
    private int modelo;
    private int precio;
    private int matricula;
    private String descuento;

     /**
     * Constructor que recibe 11 valores, 5 de tipo string y 6 de tipo int 
     *
     * @param color Representa el color del auto
     * @param marca Representa la marca del auto
     * @param tipodeauto Representa el tipo de auto (estandar o automatico)
     * @param tipodeenergia Representa el tipo de energia del auto (hibrido o electrico)
     * @param descuento Representa el valor del descuento que tiene
     *
     * @param fabricacion Representa el año de fabricacion del auto
     * @param pasajeros Representa el numero de pasajero que puede llevar el auto 
     * @param puertas Representa el numero de puertas del auto
     * @param modelo Representa el modelo del auto
     * @param precio Representa su precio
     * @param matricula Representa su matricula
     **/
    
    public Auto(String color, String marca, int fabricacion, int pasajeros, String tipodeauto, String tipodeenergia, int puertas, int modelo, int precio, int matricula, String descuento)
    {
	this.color = color;
	this.marca = marca;
	this.fabricacion = fabricacion;
	this.pasajeros = pasajeros;
	this.tipodeauto = tipodeauto;
	this.tipodeenergia = tipodeenergia
	this.puertas = puertas;
	this.modelo = modelo;
	this.precio = precio;
	this.matricula = matricula;
	this.descuento = descuento;	
    }

    /**
    *Metodo que devuelve el color del auto
    *@return El color del auto
    **/
    public String getColor() {
	return color;
    }
    
    /**
    *Metodo que modifica el color del auto
    *@param color string
    **/
    public void setColor(String color){
	this.color = color;
    }

    /**
    *Metodo que devuelve la marca del auto
    *@return La marca del auto
    **/
    public String getMarca() {
	return marca;
    }
    
    /**
    *Metodo que modifica la marca del auto
    *@param marca string
    **/
    public void setMarca(String marca){
	this.marca = marca;
    }

    /**
    *Metodo que devuelve el año de fabricacion del auto
    *@return El año de fabricacion del auto
    **/
    public int getFabricacion() {
	return fabricacion;
    }

    /**
    *Metodo que modifica el año de fabricacion del auto
    *@param añodefabricacion int
    **/
    public void setFabricacion(int fabricacion){
	this.fabricacion = fabricacion;
    }

    /**
    *Metodo que devuelve el numero de pasajeros del auto
    *@return El numero de pasajeros del auto
    **/
    public int getPasajeros() {
	return pasajeros;
    }
    
    /**
    *Metodo que modifica el numero de pasajeros del auto
    *@param numerodepasajeros int
    **/
    public void setPasajeros(int pasajeros){
	this.pasajeros = pasajeros;
    }

    /**
    *Metodo que devuelve el tipo que es el auto
    *@return El tipo del auto
    **/

    public String getTipodeauto() {
	return tipodeauto;
    }
    /**
    *Metodo que modifica el tipo del auto
    *@param tipodeauto string
    **/
    public void setTipodeauto(String tipodeauto){
	this.tipodeauto = tipodeauto;
    }

    /**
    *Metodo que devuelve el tipo de energia que utiliza el auto
    *@return El tipo de energia del auto
    **/

    public String getTipodeenergia() {
	return tipodeenergia;
    }
    /**
    *Metodo que modifica el tipo de energia del auto
    *@param tipodeenergia string
    **/
    public void setTipodeenergia(String tipodeenergia){
	this.tipodeenergia = tipodeenergia;
    }

    /**
    *Metodo que devuelve el numero de puertas
    *@return El numero de puertas
    **/
    public int getPuertas(){
    return this.puertas;
    }
    
    /**
    *Metodo que modifica el numero de puertas
    *@param puertas int
    **/
    public void setNombre(int puertas){
    this.puertas = puertas;
    }

    /**
    *Metodo que devuelve el modelo del auto
    *@return El modelo del auto
    **/    
    public int getModelo(){
    return this.modelo;
    }
    
    /**
    *Metodo que modifica el modelo del auto
    *@param modelo int
    **/
    public void setModelo(int modelo){
    this.modelo = modelo;
    }

    /**
    *Metodo que devuelve el precio del auto
    *@return El precio del auto
    **/    
    public int getPrecio(){
    return this.precio;
    }
    
    /**
    *Metodo que modifica el precio del auto
    *@param precio int
    **/
    public void setPrecio(int precio){
    this.precio = precio;
    }

    /**
    *Metodo que devuelve la matricula
    *@return La matricula
    **/    
    public int getMatricula(){
    return this.matricula;
    }
    
    /**
    *Metodo que modifica la matricula
    *@param matricula int
    **/
    public void setMatricula(int matricula){
    this.matricula = matricula;
    }
    
    /**
    *Metodo que devuelve el descuento
    *@return El descuento
    **/    
    public String getDescuento(){
    return this.descuento;
    }
    
    /**
    *Metodo que modifica el descuento
    *@param descuento String
    **/
    public void setDescuento(String descuento){
    this.descuento = descuento;
    }

}
