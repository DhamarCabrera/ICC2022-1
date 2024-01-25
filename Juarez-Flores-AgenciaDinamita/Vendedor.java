/**
 * Vendedor representa a un vendedor apartir de su nombre y factura.
 *@author Juarez Martinez && Flores Santillan
 *@version 1.0
 */
public class Vendedor{
    //atributos.
    private String name;
    private double numFactura;
    private double costoAuto;
    //Metodos constructores.
    /**
     * Constructor de un vendedor con valores inicales de 0.
     */
    public Vendedor(){
	  this.name = " ";
      this.numFactura = 0;
      this.costoAuto = 0;
    }

    public Vendedor(String name, double factura, double costo){
       setName(name);
       setNumFactura(factura);
       setCostoAuto(costo);

    }
    //Metodos de asignacion.
    /**
     * Metodo para modificar el numero de factura.
     * @param numeroVenta - numero de venta del auto.
     */ 
    public void setNumFactura(double numeroVenta){
      double aleatorio = numeroVenta * Math.random();  
	  this.numFactura =  aleatorio;
    }
    /**
     * Metodo para modificar el nombre del vendedor.
     * @param name - nombre del vendedor.
     */
    public void setName(String name){
	  this.name = name;
    }
    /**
     * Metodo para modificar el costo del auto..
     * @param costo - costo del auto.
     */
    public void setCostoAuto(double costo){
       this.costoAuto = costo;
    }
    //Metodos de acceso.
    /**
     * Metodo para obtener el numero de factura.
     * @return int - numero aleatorio de la factura.
     */
    public double getNumFactura(){
	  return this.numFactura;	
    } 
    /**
     * Metodo para obtener el nombre del vendero.
     * @return - nombre del vendedor.
     */     
    public String getName(){
	  return this.name;
    }
    /**
     * Metodo para obtener el numero de factura.
     * @return costoAuto - costo del auto.
     */
    public double getCostoAuto(){
      return this.costoAuto;
    }
    //Metodo toString.
    /**
     * Metodo para obtener los atributos del objeto vendedor.
     * @return String - datos del objeto vendedor en forma de cadena.
     */
    public String toString(){
      return "Nombre del vendedor: " + this.name + "\n"
      + "Numero de la factura : " + this.numFactura + "\n"
      + "Costo del auto: " + " $ " + this.costoAuto;
    }





    

}
