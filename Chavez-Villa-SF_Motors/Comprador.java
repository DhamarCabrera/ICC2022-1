/*
Clase Comprador que representa ul cliente
@author Villa Briseño Fabián
@version 1.0
*/
public class Comprador{

  //representa el nombre del cliente
  private String nombre;
  //representa la edad del cliente
  private int edad;
  //representa la cuenta del cliente
  private String cuenta;
  //representa la direccion del cliente
  private String direccion;
  //representa el telefono del Cliente
  private int telefono;

//-----------------------------------------------------------------------------

  /*
    Constructor que representa los datos del cliente
    @param nombre Representación del nombre del cliente
    @param edad Representación de la edad del cliente
    @param cuenta Representación del la cuenta del cliente
    @param direccion Representación de la direccion del cliente
  */
  public Comprador(String nombre, int edad, String cuenta, String direccion, int telefono){
    this.nombre = nombre;
    this.edad = edad;
    this.cuenta = cuenta;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  //Constructor que reprensenta error de entrada de datos
  public Comprador(){
    nombre = "Desconocido";
    edad = 0;
    cuenta = " ";
    direccion = " ";
    telefono = 0;
  }

//-----------------------------------------------------------------------------

  /*
    Método que devuelve el nombre del cliente
    @return El nombre del usuario
  */
  public String getNombre(){
    return nombre;
  }
  /*
    Método que cambia el nombre del cliente
    @param nombre El nuevo valor de nombre
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }


  /*
    Método que devuelve la edad del cliente
    @return La edad del usuario
  */
  public int getEdad(){
    return edad;
  }
  /*
    Método que cambia la edad del cliente
    @param edad El nuevo valor de edad
  */
  public void setEdad(int edad){
    this.edad = edad;
  }


  /*
    Método que devuelve la cuenta del cliente
    @return La cuenta del cliente
  */
  public String getCuenta(){
    return cuenta;
  }
  /*
    Método que cambia la cuenta del cliente
    @param cuenta El nuevo valor de cuenta
  */
  public void setCuenta(String cuenta){
    this.cuenta = cuenta;
  }


  /*
    Método que devuelve la direccion del usuario
    @return La direccion del cliente
  */
  public String getDireccion(){
    return direccion;
  }
  /*
    Método que cambia la direccion del cliente
    @param direccion EL nuevo valor de direccion
  */
  public void setDireccion(String direccion){
    this.direccion = direccion;
  }


  /*
    Método que devuelve el telefono del cliente
    @return El telefono del cliente
  */
  public int getTelefono(){
    return telefono;
  }
  /*
    Método que cambia el telefono del cliente
    @param telefono El nuevo valor de telefono
  */
  public void setTelefono(int telefono){
    this.telefono = telefono;
  }

//-----------------------------------------------------------------------------

  /*
    Método que muestra los valores de nombre, edad, cuenta, direccion y telefono
    @return El nombre
    @return La edad
    @return La cuenta
    @return La direccion
    @return El telefono
  */
  public String toString(){
    return nombre + ", " + edad + ", " + cuenta + ", " + direccion + ", " + telefono;
  }
}
