/**
*@author Gil Axel Gutierrez Lara/Javier Alejandro Mancera Quiroz
*@version 1.0
**/
public class Vendedor{

    //Atributos
    private String nombreV;
    private int autosDisponibles;
    private int autosVendidos;
    private String numerocel;
    private String correo;
  
    //Constructor con Args
    public Vendedor(String nombreV,int autosDisponibles,int autosVendidos,String numerocel,String correo){
    this.nombreV=nombreV;
    this.autosDisponibles=autosDisponibles;
    this.autosVendidos=autosVendidos;
    this.numerocel=numerocel;
    this.correo=correo;  }  
  /**
  *Metodo que devuelve el nombre del vendedor
  *
  *@return El nombre del vendedor
  **/
  public String getNombreV(){
    return this.nombreV;
  }
  /**
  *Metodo que devuelve el numero de autos disponibles
  *
  *@return El numero de autos disponibles
  **/
  public int getAutosDisponibles(){
    return this.autosDisponibles;
  }
  /**
  *Metodo que devuelve el numero de autos vendidos
  *
  *@return El numero de autos vendidos
  **/
  public int getAutosVendidos(){
    return this.autosVendidos;  
  }
  /**
  *Metodo que devuelve el numero telefonico del vendedor
  *
  *@return El numero telefonico 
  **/  
  public String getNumeroCel(){
    return this.numerocel;
  }
  /**
  *Metodo que devuelve el correo electronico del vendedor
  *
  *@return El correo electronico
  **/  
  public String getCorreo(){  
    return this.correo;
  }
   /**
  *Metodo que cambia el nombre el vendedor
  *
  *@param nombreV El parametro que representa el nombre del vendedor
  **/
  public void setNombreV(String nombreV){
    this.nombreV=nombreV;  
  }
  /**
  *Metodo que cambia el numero de autos disponibles del vendedor
  *
  *@param nombreV El parametro que representa el numero de autos disponibles del vendedor
  **/
  public void setAutosDisponibles(int autosDisponibles){
    this.autosDisponibles=autosDisponibles;
  }
  /**
  *Metodo que cambia el numero de autos vendidos del vendedor
  *
  *@param nombreV El parametro que representa el numero de autos vendidos del vendedor
  **/
  public void setAutosVendidos(int autosVendidos){
    this.autosVendidos=autosVendidos;
  }
  /**
  *Metodo que cambia el numero telefonico del vendedor
  *
  *@param nombreV El numero telefonico del vendedor
  **/  
  public void setNumeroCel(String numerocel){
    this.numerocel=numerocel;
  }
  /**
  *Metodo que cambia el numero de autos vendidos del vendedor
  *
  *@param nombreV El correo electronico del vendedor
  **/  
  public void setContacto(String correo){
    this.correo=correo;
  }
}
