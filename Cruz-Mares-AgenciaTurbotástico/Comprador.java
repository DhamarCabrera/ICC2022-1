/*
 * Clase comprador que muestra el nombre del cliente y el total a pagar
 *
 * @author Cruz Cruz Alan Josue
 * @version 1
 */
public class Comprador{

	//Atributos de la clase
	//Nombre del comprador
	private String nombreC;
	//Total que pagó
	private double total_pago;

	/*
	 * Método construstor en el que los datos por default serán 
	 * "VACÍO" o "0.00" en caso de no introducir algún dato en 
	 * la clase ejecutable
	 */
	public 	Comprador(){
		this.nombreC = "VACÍO";
	        this.total_pago = 0.00;	
	}

	/*
	 * Método para obtner nombre
	 * @return nombre - NOmbre del comprador
	 */
	public String getNombreC(){
	 return nombreC;
	}
	/*
	 * Método para asignar el nombre;
	 * @param nuevoNombreC - nuevo nombre del comprador
	 */
	public void setNombreC(String nombreC){
	 this.nombreC = nombreC;
	}
	 /*
	  * Método para asignar el valor del pago
	  *@param nuevoPago - la cantidad que pagó
	  */
	 public void setTotal_pago(double total_pago){
	  this.total_pago = total_pago; 
	 }
	/*
	 * Método toString de la clase
	 */
	
	public String toString(){
		return "COMPRADOR: \n Nombre:" +nombreC+ "\n Total Pago:"+total_pago;
		
	  }	
}
