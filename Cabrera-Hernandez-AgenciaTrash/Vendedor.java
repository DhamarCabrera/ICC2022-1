/**
* Clase que define los atributos y métodos de un Vendedor de Autos en la Agencia Trash.
* @author : Dhamar Cabrera.
* @author : Elizabeth Hernandez.
* @version : 1.0
*/

public class Vendedor {
  // Atributos del Vendedor.
    private String recibe; // se presenta con el cliente
    private String venta; // hace una venta
    private String noventa; // Muestra el catálogo y despide al cliente.
    private String ticket; // entrega un ticket
    private String bye; // acompaña al cliente a la salida y lo despide.
  
    /**
     * Constructor por omisión
     * @return : recibe
     * @return : venta
     * @return : noventa
     * @return : ticket
     * @return : bye
     */

    public Vendedor (){
	this.recibe = "Buenas tardes estimado cliente, sea usted bienvenido a la Agencia Trash, mi nombre es Nicolas Bourbaki pero puede llamarme Nico si así lo prefiere. Estoy aquí para cobrar el auto de sus sueños que ha encontrado en nuestra preciada Agencia Trash.";
	this.venta = "¡El auto que ha elegido es perfecto!, es uno de mis favoritos, lo felicito por su excelente elección. En un momento le entregaré su ticket de compra, ¿Desea pagar con tarjeta o en efectivo?";
	this.noventa = "Fue un placer antenderle, ojalá pueda regresar pronto a la Agencia Trash, la cual promete para usted nuevos modelos de autos que le facinen para adquirir en su siguiente visita." + "\n" + "Gracias por su tiempo ¡Esperamos verlo pronto!.";
	this.ticket = "¡Ya está todo listo!, hago entrega de su ticket de compra no sin antes recordarle que la agencia Trash agradece su preferencia, esperamos que disfrute de su auto tanto como nosotros disfrutamos su presencia.";
	this.bye = "Hasta luego, de parte de la Agencia Trash le deseo que pase excelentes días junto a su nuevo compañero de viaje.";
    }
  
    /**
     * Constructor con parámetros
     * @param : recibe
     * @param : venta
     * @param : noventa
     * @param : ticket
     * @param : bye
     */

    public Vendedor ( String recibe, String venta, String noventa, String ticket, String bye ){
	this.recibe = recibe;
	this.venta = venta;
	this.noventa = noventa;
	this.ticket = ticket;
	this.bye = bye;
    }

    /**
     * Acceso a características del vendedor.
     * @return : recibe
     * @return : venta
     * @return : noventa
     * @return : ticket
     * @return : bye
     */
    public String getRecibe ( String recibe ){
	return this.recibe = recibe;
    }

    public String getSi ( String venta ){
	return this.venta = venta;
    }

    public String getNo (String noventa){
	return this.noventa = noventa;
    }

    public String getTicket ( String ticket ){
	return this.ticket = ticket;
    }
    public String getDespedida ( String Bye ){
	return this.bye = bye;
    }

    /**
     * Modificación de las características del Vendedor.
     * @param : recibe
     * @param : venta
     * @param : noventa
     * @param : ticket
     * @param : bye
     */
    public void setRecibe ( String recibe ){
	this.recibe = recibe;
    }

    public void setSi ( String venta ){
	this.venta = venta;
    }

    public void setNo ( String noventa ){
	this.noventa = venta;
    }

    public void setTicket ( String ticket ){
	this.ticket = ticket;
    }
    public void setDespedida ( String bye ){
	this.bye = bye;
    }

    /**
     * Métodos de comportamiento para imprimir dialogos del Vendedor
     * @return : recibe
     * @return : venta
     * @return : noventa
     * @return : ticket
     * @return : despedida
     */
    public String toStringRecibe(){
	return this.recibe; 
    }
    public String toStringSi(){
	return this.venta; 
    }
    public String toStringNo(){
	return this.noventa; 
    }
    public String toStringTicket(){
	return this.ticket; 
    }
    public String toStringDespedida(){
	return this.bye; 
    }
}

/**
* Fin del programa.
*/
