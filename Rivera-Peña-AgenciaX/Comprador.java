/**
 *Clase que simula a un comprador de una agencia
 *@author Mario Rosales
 *@version 1.0
 */
public class Comprador{
    private String nombre;
    private double dinero;
    private Auto[] autos = new Auto[5];
	
    /**
     *Constructor que genere un comprador con el nombre y la cantidad de dinero que le asignemos
     *@param nombre El nombre del comprador
     *@param dinero La cantidad de dinero que tenga el comprador
     */
    public Comprador(String nombre, double dinero){
	this.nombre = nombre;
	this.dinero = dinero;
    }

    /**
     *Método para obtener la cantidad de dinero que tiene el comprador
     *@return La cantidad de dinero que tiene el comprador
     */
    public double getDinero(){
	return this.dinero;
    }
    /**
     *Método para cambiar la cantidad de dinero que tiene el comprador
     *@param dinero El dinero que le asignaremos al comprador
     */
    public void setDinero(double dinero){
	this.dinero = dinero;
    }

     /**
     *Método para obtener el nombre del comprador
     *@return El nombre del comprador
     */
    public String getNombre(){
	return this.nombre;
    }
    /**
     *Método para cambiar el nombre del comprador
     *@param nombre El nombre que le asignaremos al comprador
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     *Método para obtener el auto que tiene el comprador en una posición del arreglo
     *@param posicion La posición del arreglo que queremos obtener
     *@return El auto en la posición específicada
     */
    public Auto getAuto(int posicion){
	return this.autos[posicion];
    }
    /**
     *Método para modificar los autos que tiene el comprador
     *@param auto El auto que le asignaremos al comprador
     *@param posicion La posición del arreglo en la que le asignaremos el auto
     */
    public void setAuto(Auto auto, int posicion){
	this.autos[posicion] = auto;
    }
    
    /**
     *Método para ver los datos del comprador
     *@return Un String con el nombre, el dinero y todos los autos que tenga el comprador
     */
    public String toString(){
	//Asigno los autos del arreglo a un String
	String auto = "";
	for(int i=0; i < 5; i++){
	    if(autos[i] != null){
	    auto += "\n\n" + autos[i];
	    }
	}
	return "Nombre: " + nombre + "\nDinero: $" + dinero + "\nAutos adquiridos:" + auto + "\n------------------";
    }
    
    /**
     *Método para comprar un auto
     *@param auto El auto que se va a comprar
     *return True si la operación fue exitosa, false si no se pudo realizar la operación
     */
    public boolean comprar(Auto auto){
	if(auto.getPrecio() > this.dinero){
	    return false; //No tiene suficiente dinero
	}
	for(int i=0; i < this.autos.length; i++){
	    //Reviso si hay un espacio libre en el arreglo
	    if(this.autos[i] == null){
		//Asigno el auto al espacio libre
		this.autos[i] = auto;
		//Descuento el precio del auto al dinero del comprador
		this.dinero -= auto.getPrecio();
		return true;
	    }
	}
	return false; //No hay espacio disponible en el arreglo
    }
}
