/*
 * Clase Auto 
 * @author Jesus Rivera
 * @author Rodrigo Campos
 * @version 1.0
 * */
publi class Auto{	
    private String marca;
    private String modelo;
    private String color;
    private String transmision;
    private String motor;	
    private int año;
    private double precio;
     	
    /*
     * Metodo constructor que nos proporciona: marca, modelo, color, transmision, motor, año y precio
     * @param marca marca
     * @param modelo modelo
     * @param color color
     * @param transmision transmision
     * @param motor motor
     * @param año año
     * @param precio precio
     * */
    public Auto(String marca, String modelo, String color, String transmision, String motor, int año, double precio){
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.transmision = transmision;
	this.motor = motor;    
	this.año = año;
	this.precio = precio;
    }
    /*
     * Metodo que modifica la marca del auto
     * @param marca Marca del auto
     * */
    public void setMarca(String marca) {
	    this.marca = marca;
    }
    /*
     * Metodo que devuelve la marca del auto
     * @return marca
     * */
    public String getMarca(){
	    return this.marca;
    }
    /*
     * Metodo que modifica em modelo del auto
     * @param modelo Modelo del auto
     * */
    public void setModelo(String modelo){
	    this.modelo = modelo;
    }	
    /*
     * Metodo que retorna el modelo del auto
     * @return modelo
     * */
    public String getModelo(){
	    return this.modelo;
    }
    /*
     * Metodo que modifica el color del auto
     * @param color Color del auto
     * */
    public void setColor(String color){
	    this.color = color;
    }
    /*
     * Metodo que regresa el color del auto
     * @return color
     * */
    public String getColor(){
            return this.color;
    }
    /*
     * Metodo que modifica la transmison del auto
     * @param transmision Transmision del auto
     * */
    public void setTransmision(String transmision){
            this.trasmision = transmision;
    }
    /*
     * Metodo que devuelve la transmision del auto
     * @return transmision
     * */
    public String getTransmison(){
            return this.transmision;
    }	
    /*
     * Metodo que modifica el motor del auto
     * @param motor Motor del auto
     * */
    public void setMotor(String motor){
            this.motor = motor;
    }
    /*
     * Metodo que devuelve el motor del auto
     * @return motor
     * */
    public String getMotor(){
            return this.motor;
    }	
    /*
     * Metodo que modifica el año del auto
     * @param año Año del auto
     * */
    public void setAño(int año){
            this.año = año;
    }
    /*
     * Metodo que devuelve el año del auto
     * @return año
     * */
    public int getAño(){
	    return this.año;
    } 	
    /*
     * Metodo que modifica el precio del auto
     * @param precio Precio del auto
     * */
    public void setPrecio(double precio){
            this.precio = precio;
    }
    /*
     * Metodo que devuelve el precio del auto
     * @return precio
     * */
    public double getPrecio(){
	    return this.precio;
    }	
}
