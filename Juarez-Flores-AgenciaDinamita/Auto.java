/** 
 * Auto representa un automovil  el cual podemos crear mediante los metodos de esta clase.
 * @author Dylan Enrique Juarez Martinez, Yoshua Isai Flores Santillán.
 * @version 1.0
 */
public class Auto{
    //Atributos.
	private int numero_llantas;
	private String color_del_auto;
	private int numero_puertas;
	private int ano_del_auto;
	private String modelo_del_auto;
	private double potencia_del_auto;
	private String tamano_del_auto;
    private double precio_auto;
    //Metodos constructores
    /** 
     *constructor de un auto apartir de su modelo, ano, color, numeros de llantas, y numero de puertas.
     * @param modelo -  el modelo del auto es de tipo String.
     * @param ano - el ano del auto es de tipo int.
     * @param llantas - el numero de llantas del auto es de tipo int.
     * @param puertas - el numero de puertas del auto es de tipo int.
     * @param color - el color del auto es de tipo string.
     * @param potencia - la velocidad del auto es de tipo double.
     * @param tamaño - el tamano del auto es de tipo String.
     */
    public Auto(String modelo, int ano, int llantas, int puertas, String color, double potencia, String tamano, double precio){
       asignarModelo(modelo);
       asignarAno(ano);
       asignarLlantas(llantas);
       asignarPuertas(puertas);
       asignarColor(color);
       asignarPotencia(potencia);
       asignarTamano(tamano);
       asignarPrecio(precio);
    }
    /** 
     * constructor crea un auto apartir de un auto.
     * @param a - auto apartir del cual se creara el auto.
     */
    public Auto(Auto a){
      this.modelo_del_auto = a.obtenerModelo();
      this.ano_del_auto = a.obtenerAno();
      this.numero_llantas = a.obtenerLlantas();
      this.numero_puertas = a.obtenerPuertas();
      this.color_del_auto = a.obtenerColor();
      this.potencia_del_auto = a.obtenerPotencia();
      this.tamano_del_auto = a.obtenerTamano();
      this.precio_auto = a.obtenerPrecio();
    }
    /** 
     * Constructor de un auto, crea una auto sin valores.
     */
    public Auto(){
      this.modelo_del_auto = " ";
      this.ano_del_auto = 0;
      this.numero_llantas = 0;
      this.numero_puertas = 0;
      this.color_del_auto = " ";
      this.potencia_del_auto = 0;
      this.tamano_del_auto = " ";
      this.precio_auto = 0;
    }
    //Metodos de acceso.
    /** 
     * Metodo para obtener el modelo del auto. 
     * @return String - el modelo del auto.
     */
    public String obtenerModelo(){
    	return this.modelo_del_auto;
    }
    /** 
     * Metodo para obtener el año del auto. 
     * @return int - el ano del auto.
     */
    public int obtenerAno(){
    	return this.ano_del_auto;
    }
    /** 
     * Metodo para obtener el numero de llantas del auto. 
     * @return int - el numero de llantas del auto.
     */
    public int obtenerLlantas(){
    	return this.numero_llantas;
    }
    /** 
     * Metodo para obtener el numero de puertas del auto. 
     * @return int - el numero de puertas del auto.
     */
    public int obtenerPuertas(){
    	return this.numero_puertas;
    }
    /** 
     * Metodo para obtener el color del auto. 
     * @return String - el color  del auto.
     */
    public String obtenerColor(){
    	return this.color_del_auto;
    }
    /** 
     * Metodo para obtener la velocidad del auto. 
     * @return double - la velocidad  del auto.
     */
    public double obtenerPotencia(){
    	return this.potencia_del_auto;
    }
    /** 
     * Metodo para obtener el tamano del auto. 
     * @return String  - el tamano del auto.
     */
    public String obtenerTamano(){
    	return this.tamano_del_auto;
    }
    /**
     * Metodo para obtener el precio del auto.
     * @return double - el precio del auto.
     */
    public double obtenerPrecio(){
	    return this.precio_auto;
    }
    //Metodos modificadores.
    /** 
     * Metodo para asignar valor al modelo del auto. 
     * @param nuevoModelo - nuevo valor para el modelo del auto.
     */
    public void asignarModelo(String nuevoModelo){
    	this.modelo_del_auto = nuevoModelo;
    }
    /** 
     * Metodo para asignar valor al año del auto. 
     * @param nuevoAno - nuevo valor para el año del auto.
     */
    public void asignarAno(int nuevoAno){
       this.ano_del_auto = nuevoAno;
    }
    /** 
     * Metodo para asignar valor numero de llantas al modelo del auto. 
     * @param nuevasLlantas  - nuevo valor para el numero de llantas del auto.
     */
    public void asignarLlantas(int nuevasLlantas){
    	this.numero_llantas = nuevasLlantas;
    }
    /**
     * Metodo para asignar valor al numero de puertas del auto. 
     * @param nuevasPuertas  - nuevo valor para el numero de puertas  del auto.
     */
    public void asignarPuertas(int nuevasPuertas){
        this.numero_puertas = nuevasPuertas;
    }
    /** 
     * Metodo para asignar valor al color del auto. 
     * @param nuevoColor - nuevo valor para el color  del auto.
     */
    public void asignarColor(String nuevoColor){
        this.color_del_auto = nuevoColor;
    }
    /** 
     * Metodo para asignar valor a la velocidad del auto. 
     * @param nuevaVelocidad - nuevo valor para la velocidad del auto.
     */
    public void asignarPotencia(double nuevaPotencia){
        this.potencia_del_auto = nuevaPotencia ;
    }
     /** 
     * Metodo para asignar valor al tamano del auto. 
     * @param nuevoTamano  - nuevo valor para el tamano  del auto.
     */
    public void asignarTamano(String nuevoTamano){
        this.tamano_del_auto = nuevoTamano;
    }
    /**
     * Metodo para asignar valor al precio del auto.
     * @param nuevoPrecio - nuevo valor para precio del auto.
     */
    public void asignarPrecio(double nuevoPrecio){
	  this.precio_auto = nuevoPrecio;
    }
    //Metodo toString
    /** 
     * Metodo para convertir el auto a una cadena de caracteres.
     * @return String - el auto en formato de cadena.
     */
    public String toString(){  
       return "Modelo del automovil: " +  this.modelo_del_auto + "\n" 
       +  "Ano del automovil: " + this.ano_del_auto + "\n" 
       + "Numero de puertas: " + this.numero_puertas + " puertas" +  "\n" 
       +  "Numero de llantas: " + this.numero_llantas + " llantas" +"\n" 
       + "Color del automovil: " + this.color_del_auto + "\n" 
       +  "Potencia del auto movil: " + this.potencia_del_auto + " kW" +  "\n" 
       + "Tamano del auto: " + this.tamano_del_auto + "\n"
	   + "Precio esperado del auto: "  + " $ " + this.precio_auto;   
    }



}
