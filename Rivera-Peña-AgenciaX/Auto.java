/**
*@author Juan Luis Rivera Ibarra
*@Version 1.4
*/
/**
*Clase Auto
*@since 1.0
*/
public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;

    /**Metodo constructor que genera un automovil con los datos proporcionados por el usuario
    *@since 1.0
    *@param marca             Tipo de datos String que especifica la marca que producel el automovil
    *@param modelo            Tipo de datos String que especifica el Modelo del automovil
    *@param año               Tipo de dato int que especifica el año en que se produjo el automovil
    *@param color             Tipo de datos String que especifica el color del automovil
    *@param precio            Tipo de dato double que especifica el precio del automovil
    */
    public Auto(String marca, String modelo, int anio, String color, double precio){
      this.marca = marca;
      this.modelo = modelo;
      this.anio = anio;
      this.color = color;
      this.precio = precio;
    }

    /**Cambia la marca del automovil por la marca en tipo de dato String que recibe el metodo
    *@since 1.2
    *@param marca    Tipo de dato String por la cual se remplazara la marca del automovil
    */
    public void setMarca(String marca){
      this.marca = marca;
    }

    /**Cambia el modelo del automovil por el modelo del tipo de dato String que recibe el metodo
    *@since 1.2
    *@param modelo    Tipo de dato String por el cual se remplazara el modelo del automovil
    */
    public void setModelo(String modelo){
      this.modelo = modelo;
    }

    /**Cambia el año del automovil por la año en tipo de dato int que recibe el metodo
    *@since 1.2
    *@param int    Tipo de dato int por la cual se remplazara el año del automovil
    */
    public void setAnio(int anio){
      this.anio = anio;
    }

    /**Cambia el color del automovil por el color del tipo de dato String que recibe el metodo
    *@since 1.2
    *@param color    Tipo de dato String por el cual se remplazara el color del automovil
    */
    public void setColor(String color){
      this.color = color;
    }

    /**Cambia el precio del automovil por el precio en tipo de dato double que recibe el metodo
    *@since 1.4
    *@param precio    Tipo de dato double por la cual se remplazara el precio del automovil
    */
    public void setPrecio(double precio){
      this.precio = precio;
    }

    /**Metodo que regresa la marca del automovil en un tipo de dato String
    *@since 1.1
    *@return Valor en tipo de dato String referente a la marca del automovil
    */
    public String getMarca(){
      return marca;
    }

    /**Metodo que regresa el modelo del automovil en tipo de dato String
    *@since 1.1
    *@return Valor en tipo de dato String referente al modelo del automovil
    */
    public String getModelo(){
      return modelo;
    }

    /**Metodo que regresa año de inicio de produccion del automovil en un dato tipo int
    *@since 1.1
    *@return Valor en tipo de dato int referente al año de inicio de produccion del automovil
    */
    public int getAnio(){
      return anio;
    }

    /**Metodo que regresa el color del automovil en tipo de dato String
    *@since 1.1
    *@return Valor en tipo de dato String referente al color del automovil
    */
    public String getColor(){
      return color;
    }

    /**Metodo que regresa el precio del automovil en tipo de dato double
    *@since 1.4
    *@return Valor en tipo de dato double referente al precio del automovil
    */
    public double getPrecio(){
      return precio;
    }

    /**Metodo que regresa la infomacion clave del automovil en tipo de dato String
    *@since 1.1
    *@return Tipo de dato String que resume la informacion clave del automovil
    */
    public String toString(){
      return "Automovil marca: " + getMarca() + "\nmodelo: " + getModelo() + "\nAño: " + getAnio() + "\ncolor: " + getColor() + "\nprecio: $" + getPrecio() + ".";
    }
}
