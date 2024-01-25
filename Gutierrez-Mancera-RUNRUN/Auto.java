/**
*Clase que representa a un auto
*@author Gil Axel Gutierrez Lara/Javier Alejandro Mancera Quiroz
*@version 1.0
**/
public class Auto{
  //Atributos
  private String color;
  private int modelo;
  private String transmision;
  private String nombreA;
  private double precio;
  //Constructor con args
  public Auto(String nombreA,String color,int modelo, String transmision,double precio){
    this.nombreA=nombreA;
    this.color=color;
    this.modelo=modelo;
    this.transmision=transmision;
   
    this.precio=precio;
  }
  //Metodos Guetters
  /**
  *Metodo que devuelve el nombre el auto
  *@return El nombre del auto
  **/
  public String getNombreA(){
    return this.nombreA;
  }
  /**
  *Metodo que devuelve el color del auto
  *@return El color del auto
  **/
  public String getColor(){
    return this.color;
  }
  /**
  *Metodo que devuelve el modelo del auto
  **/
  public int getModelo(){
    return this.modelo;
  }
  /**
  *Metodo que devuelve el tipo de transmision del auto
  *@return El tipo de transmision del auto
  **/
  public String getTransmision(){
    return this.transmision;
  }
  /**
  *Metodo que devuelve el precio del auto
  *@return El precio del auto
  **/
  public double getPrecio(){
    return this.precio;
  }
  
  //Metdodos set
  public void setPrecio(double precio){
    this.precio=precio;
  }
  public void setNombre(String nombreA){
    this.nombreA=nombreA;
  }
  public void setColor(String color){
    this.color=color;
  }
  public void setModelo(int modelo){
    this.modelo=modelo;
  }
  public void setTransmision(String transmision){
    this.transmision=transmision;
  }
 
   
  
  //Metodo toStriing
  
  public String toString(){
    return "El auto "+nombreA+", es de color "+color+", modelo "+modelo+", transmision tipo "+transmision+", y tiene un precio de "+precio+" pesos.";
    }
}
