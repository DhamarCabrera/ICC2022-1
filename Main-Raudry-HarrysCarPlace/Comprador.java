/**
 * Clase Comprador en donde se modela a un comprador de vehículos
 * @author Asahel Main, Arsenio Raudry
 * @version 1.0
 */
public class Comprador{
    //El nombre del comprador
    private String nombre;

    //El dinero que el comprador tiene disponible
    private double dinero;

    //Los autos que tiene el comprador en su garaje
    private Auto autos[];

    //La cantidad de autos que caben en el garaje del comprador
    private int cantidadDeAutos;

    //Debí nombrar a esta variable "cantidadDeAutos", pero ya es muy tarde para pensar en ello
    private int autoActual;

    
    //Constructores

    /**
     * Constructor que recibe tres parametros
     * @param nombre El nombre del comprador
     * @param dinero El dinero disponible del comprador
     * @param cantidadDeAutos La cantidad de autos que caben en el garaje
     */
    public Comprador(String nombre, double dinero, int cantidadDeAutos){
	this.nombre = nombre;
	this.dinero = dinero;
	this.cantidadDeAutos = cantidadDeAutos;
	autos = new Auto[cantidadDeAutos];
	this.autoActual = 0;
    }

    /**
     * Constructor con un parametro
     * @param dinero El dinero disponible del comprador
     * A nombre se le asigna "Desconocido"
     * A cantidadDeAutos se le asigna 10
     */
    public Comprador(double dinero){
	this("Desconocido", dinero, 10);
    }

    //Getters

    /**
     * Metodo que devuelve el nombre del comprador
     * @return El nombre del comprador
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     *Metodo que devuelve el dinero del comprador
     * @return El dinero del comprador
     */
    public double getDinero(){
	return this.dinero;
    }

    /**
     * Metodo que devuelve la cantidad de autos que caben en el garaje del comprador
     * @return La cantidad de autos que caben en el garaje del comprador
     */
    public int getCantidadGaraje(){
	return this.cantidadDeAutos;
    }
    
    //Setters

    /**
     * Metodo que modifica el nombre del comprador
     * @param nombre El nuevo nombre del comprador
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    /**
     * Metodo que modifica la cantidad de dinero disponible 
     * @param dinero El nuevo dinero disponible
     */
    public void setDinero(double dinero){
	this.dinero = dinero;
    }

   
    //Más métodos

    /**
     * Metodo que le permite al usuario comprar un auto
     * @param autoNuevo El auto que el comprador quiere adquirir
     */
    public void comprarAuto(Auto autoNuevo){
	if(this.autoActual < this.cantidadDeAutos){
	    System.out.println("Auto que " + this.nombre + " quiere comprar: " + autoNuevo.getModelo());
	    System.out.println("Precio del automovil: $" + autoNuevo.getPrecio());
	    System.out.println("Vendido por: " + autoNuevo.getVendedor().getNombre() + "\n ...");
	    System.out.println("Transacción en progreso...\n...");
	
	    if(this.getDinero() >= autoNuevo.getPrecio() && autoNuevo.getDisponibilidad()){
	        this.setDinero(this.getDinero() - autoNuevo.getPrecio());
		autoNuevo.setDisponibilidad(false);
		autos[this.autoActual] = autoNuevo;
		this.autoActual++;
		autoNuevo.getVendedor().setSueldo(autoNuevo.getVendedor().getSueldo() + (autoNuevo.getPrecio()/250)); //Incrementa el sueldo del vendedor del auto
		autoNuevo.getVendedor().setAutosVendidos(autoNuevo.getVendedor().getAutosVendidos()+1); //Aumenta por 1 el contador de autos vendidos por el vendedor del auto.			
		System.out.println("Transaccion completada exitosamente!!! :)");
	    }
	    else{
		System.out.println("El auto " + autoNuevo.getModelo() + " ya no esta disponible o " + this.nombre + " no tiene el dinero suficiente como para comprarlo. :(");
	    }
	}
	else{
	    System.out.println(this.nombre + " tiene demasiados vehiculos en su garaje!");
	    System.out.println("No puede comprar mas. :(");
	}
    }


    /**
     * Metodo que muestra los autos que la persona tiene en posesion
     */
    public void mostrarAutosEnPosesion(){
	System.out.println("Los autos que tiene " + this.getNombre() + " son:");
	for(int i = 0; i<autoActual; i++){
	    System.out.println("&&&&&&&&&&&&&&");
	    System.out.println("Auto: " +(i+1) +": \n"  + autos[i]);
	    System.out.println("&&&&&&&&&&&&&&");
	}

    }

   
    
}
