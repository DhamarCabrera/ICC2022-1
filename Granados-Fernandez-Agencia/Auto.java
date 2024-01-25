/**
 * Clase Auto Clase que simula un auto
 * 
 * @author Melissa Fernandez
 * @author Jose Pablo Granados
 * @version 1.0
 */
public class Auto {

    private String marca; // La marca del auto
    private String modelo; // El modelo del auto
    private String tipoAuto;// Tipo de auto (de lujo, deportivo, mediano)
    private String color;// El color del auto
    private boolean nuevo;// Auto nuevo o seminuevo
    private double costo;// costo del auto

    /**
     * Metodo constructor sin parametros
     */
    public Auto() {
        marca = "";
        modelo = "";
        tipoAuto = "";
        color = "";
        nuevo = true;
        costo = 300000;

    }

    /**
     * Metodo constructor que recibe la marca
     * 
     * @param marca La marca de la agencia
     */
    public Auto(String marca) {
        this.marca = marca;
        modelo = "";
        tipoAuto = "";
        color = "";
        nuevo = true;
        costo = 300000;
    }

    /**
     * Metodo constructor que recibe marca, modelo, tipo y color de auto
     * 
     * @param marca  La marca del auto
     * @param modelo El modelo del auto
     * @param tipo   El tipo de auto (de lujo, deportivo, mediano)
     * @param color  El color del auto
     */
    public Auto(String marca, String modelo, String tipo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        tipoAuto = tipo;
        nuevo = true;
        costo = 300000;
    }

    /**
     * Metodo getMarca Metodo que devuelve la marca del auto
     * 
     * @return La marca del auto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo getModelo Metodo que devuelve el modelodel auto
     * 
     * @return El modelo del auto
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo getTipoAuto Metodo que devuelve el tipo de auto
     * 
     * @return El tipo de auto
     */
    public String getTipoAuto() {
        return tipoAuto;
    }

    /**
     * Metodo getcolor Metodo que devuelve el color del auto
     * 
     * @return El color del auto
     */
    public String getcolor() {
        return color;
    }

    /**
     * Metodo getNuevo Metodo que node deja saber si el auto es nuevo o seminuevo
     * 
     * @return Auto nuevo o seminuevo
     */
    public boolean getNuevo() {
        return nuevo;
    }

    /**
     * Metodo getCosto Metodo que devuelve el precio del auto
     * 
     * @return El costo del auto
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Metodo setMarca Metodo asigna la marca del auto
     * 
     * @param La marca del auto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo setModelo Metodo que asigna el modelo del auto
     * 
     * @param El modelo del auto
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo setTipoAuto Metodo que asigna el tipo de auto (de lujo, deportivo,
     * mediano)
     * 
     * @param El tipo de auto
     */
    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    /**
     * Metodo setColor Metodo asigna el color del auto
     * 
     * @param El color del auto
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo setNuevo Metodo asigna si el auto es nuevo o seminuevo
     * 
     * @param boolean auto nuevo(true) o seminuevo (false)
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    /**
     * Metodo setCosto Metodo asigna el costo del auto
     * 
     * @param El costo del auto
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Metodo toString Método que representa a un auto
     * 
     * @return La representación del auto en forma de cadena
     */
    public String toString() {
        return "\nEl auto es " + tipoAuto + " de la marca \"" + marca + "\", modelo " + modelo + ", color " + color
                + " y su precio es de $" + costo;
    }

}