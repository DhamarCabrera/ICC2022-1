/**
 * Clase Cliente Clase que simula a un cliente
 * 
 * @author Melissa Fernández
 * @author Jose Pablo Granados
 * @version 1.0
 */
public class Cliente {
    private String nombre;// El nombre del cliente
    private String apellido1; // El apellido paterno
    private String apellido2; // El apellido materno
    private int noCliente; // El número de cliente
    private double importe; // El monto a pagar
    private int adquisicion; // Numero de adquisiciones hasta ahora en la agencia
    private String formaPago; // Forma de pago (crédito, contado)
    private Auto auto;// El auto comprado por el cliente

    /**
     * Metodo constructor que recibe el nombre y apellidos del cliente
     * 
     * @param nombre    El nombre del cliente
     * @param apellido1 El apellido paterno del cliente
     * @param apellido2 El apellido materno del cliente
     */
    public Cliente(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;

    }

    /**
     * Metodo getNombreComp regresa el nombre completo del cliente
     * 
     * @return El nombre completo del cliente
     */
    public String getNombreComp() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    /**
     * Metodo getNoCliente regresa el numero de cliente
     * 
     * @return El numero de cliente
     */
    public int getNoCliente() {
        return noCliente;
    }

    /**
     * Metodo getImporte regresa el importe a pagar
     * 
     * @return El importe a pagar
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Metodo getAdquisicion regresa el numero de adquisiciones en la agencia
     * 
     * @return El numero de adquisiciones hasta el momento
     */
    public int getAdquisicion() {
        return adquisicion;
    }

    /**
     * Metodo getFormaPago regresa la forma en que pagará el cliente
     * 
     * @return La forma de pago
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Metodo getAuto regresa el auto comprado por el cliente
     * 
     * @return El auto comprado
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * Metodo setNombreComp asigna el nombre completo del cliente
     * 
     * @param nombre    El nombre del cliente
     * @param apellido1 El apellido paterno
     * @param apellido2 El apellido materno
     */
    public void setNombreComp(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Metodo setNoCliente asigna el numero de cliente
     * 
     * @param noCliente El numero de cliente
     */
    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    /**
     * Metodo setImporte asigna el importe a pagar
     * 
     * @param importe El importe a pagar
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * Metodo setAdquisicion asigna el numero de adquisiciones en la agencia hasta
     * el momento
     * 
     * @param adquisicion El numero de adquisiciones hasta el momento
     */
    public void setAdquisicion(int adquisicion) {
        this.adquisicion = adquisicion;
    }

    /**
     * Metodo setFormaPago asigna la forma en que pagará el cliente
     * 
     * @param formaPago La forma de pago
     */
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * Metodo setAuto asigna el auto comprado por el cliente
     * 
     * @param auto El auto comprado
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * Metodo toString permite saber las características del cliente
     * @return Las características del cliente
     */
    public String toString(){
        return "No. Cliente: " + noCliente + "\nNombre: " + nombre + " " + apellido1 + " " + apellido2 + "\nImporte a pagar: " + importe + "\nForma de pago: " + formaPago;
    }
}