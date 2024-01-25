/**
 * Clase que nos da los datos de un Comprador
 * @author MORE
 * @version 1.0
 **/
public class Comprador {

    //Atributos
    private String nombre;
    private int autocompra;
    private int añocompra;
    private String ultcompra;
    private String tipopago;
    private int historial;

    /**
     * Constructor que recibe 6 valores, 3 de tipo String y 3 de tipo int
     * @param nombre Representa el nombre del cliente
     * @param autocompra Representa el auto que se esta comprando
     * @param añocompra Representa el año en el que se hace la compra(año actual)
     * @param ultcompra Representa la fecha de la ultima compra
     * @param tipopago Representa como se pagara, en efectivo o tarjeta
     * @param historial Representa el numero de autos que ha comprado
     **/
    public Comprador(String nombre, int autocompra, int añocompra, String ultcompra, String tipopago, int historial){
    this.nombre = nombre;
    this.autocompra = autocompra;
    this.añocompra = añocompra;
    this.ultcompra = ultcompra;
    this.tipopago = tipopago;
    this.historial = historial;
    }

     /**
     * Constructor que recibe 4 valores, 2 de tipo String y 2 de tipo int(en ese orden)
     * @param nombre Representa el nombre del cliente
     * @param ultcompra Representa la fecha de la ultima compra
     * @param añocompra Representa el año en el que se hace la compra(año actual)
    * @param historial Representa el numero de autos que ha comprado
     **/
    public Comprador(String nombre, String ultcompra, int añocompra, int historial){
    this.nombre = nombre;
    this.añocompra = añocompra;
    this.ultcompra = ultcompra;
    this.historial = historial;
    }

    /**
     * Constructor que recibe 4 valores, 2 de tipo String y 2 de tipo int
     * @param nombre Representa el nombre del cliente
     * @param autocompra Representa el auto que se esta comprando
     * @param tipopago Representa como se pagara, en efectivo o tarjeta
     * @param historial Representa el numero de autos que ha comprado
     **/    
    public Comprador(String nombre, int autocompra, String tipopago, int historial){
    this.nombre = nombre;
    this.autocompra = autocompra;
    this.tipopago = tipopago;
    this.historial = historial;
    }

    /**
     *Metodo que devuelve el nombre
     *@return El nombre
     **/
    public String getNombre(){
    return this.nombre;
    }
    /**
    *Metodo que modifica el nombre
    *@param nombre String
    **/
    public void setNombre(String nombre){
    this.nombre = nombre;
    }


    /**
     *Metodo que devuelve el auto que se esta comprando
     *@return El auto que se esta comprando
     **/
    public int getAutoCompra(){
    return this.autocompra;
    }
    /**
    *Metodo que modifica el auto que se esta comprando
    *@param autocompra int
    **/
    public void setAutoCompra(int autocompra){
    this.autocompra = autocompra;
    }

    
     /**
     *Metodo que devuelve el año en el que se hace la compra
     *@return El año actual
     **/
    public int getAñoCompra(){
    return this.añocompra;
    }
    /**
    *Metodo que modifica el año en el que se hace la compra
    *@param añocompra int
    **/
    public void setAñoCompra(int AñoCompra){
    this.añocompra = añocompra;
    }

    
     /**
     *Metodo que devuelve la fecha de la ultima compra
     *@return La fecha de la ultima compra
     **/
    public String getUltCompra(){
    return this.ultcompra;
    }
    /**
    *Metodo que modifica la fecha de la ultima compra
    *@param ultcompra String
    **/
    public void setUltCompra(String ultcompra){
    this.ultcompra = ultcompra;
    }

     /**
     *Metodo que devuelve el tipo de pago
     *@return El tipo de pago
     **/
    public String getTipoPago(){
    return this.tipopago;
    }
    /**
    *Metodo que modifica el tipo de pago
    *@param tipopago String
    **/
    public void setTipoPago(String tipopago){
    this.tipopago = tipopago;
    }

    
     /**
     *Metodo que devuelve el numero de autos comprados
     *@return El "historial"
     **/
    public int getHistorial(){
    return this.historial;
    }
    /**
    *Metodo que modifica el historial
    *@param historial int
    **/
    public void setHistorial(int historial){
    this.historial = historial;
    }
    
}
