/**
 * Clase que modela a un vendedor de autos
 * @author Asahel Main, Arsenio Raudry
 * @version 1.0
 */
public class Vendedor{

    //El nombre del vendedor
    private String nombre;

    //Los autos que vende el vendedor
    private Auto autos[];

    //Sueldo del vendedor deacuerdo a los autos vendidos
    private double sueldo;

    //Contador de los autos vendidos
    private int autosVendidos;
    /**
     * Metodo constructor que recibe dos parametros
     * @param nombre El nombre del vendedor
     * @param autos Los autos que vende el vendedor
     * Llama al metodo asignarCoches para asignar el vendedor a cada auto
     */
    public Vendedor(String nombre, Auto autos[]){
	this.autos = autos;
	this.nombre = nombre;
	this.asignarCoches();
	this.sueldo = 10000.0;
	this.autosVendidos = 0;
    }
    /**
     * Metodo que asigna un nuevo nombre al vendedor
     * @param nombre El nuevo nombre del vendedor
     * Llama al metodo asignarCoches para reasignar el vendedor a cada auto
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
	this.asignarCoches();
    }

    /**
     * Metodo que devuelve el nombre del vendedor
     * @return El nombre del vendedor
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     Metodo que devuelve la cantidad del sueldo del vendedor.
     @return double Cantidad del sueldo del vendedor. 
     */
    public double getSueldo(){
	return this.sueldo;
    }

    /**
     Metodo que altera el valor del sueldo del vendedor.
     @param sueldo Nuevo sueldo del vendedor.
     */
    public void setSueldo(double sueldo){
	this.sueldo = sueldo;
    }

    /**
     Metodo que devuelve la cantidad de autos vendidos por el vendedor.
     @return int con la cantidad de autos vendidos 
     */
    public int getAutosVendidos(){
	return this.autosVendidos;
    }
    /**
     Metodo que permite alterar el valor de autosVendidos.
     @param autosVendidos Nueva cantidad de autos vendidos por el vendedor.
     */
    public void setAutosVendidos(int autosVendidos){
	this.autosVendidos = autosVendidos;
    }

    
    /**
     * Metodo que asigna el nombre del vendedor a cada lote de autos
     */
    public void asignarCoches(){
	for(int i = 0; i<this.autos.length; i++){
	    this.autos[i].setVendedor(this);
	    //System.out.println(this.autos[i].getVendedor());
	}
    }
    /**
     Metodo toString con la informacion del vendedor.
     return String devuele en una cadena el nombre, autos vendidos y sueldos del vendedor.
     */
    public String toString(){
	return "\n#################\n" + "Vendedor: " + this.nombre + "\nCantidad de Autos vendidos: " + this.autosVendidos + "\nSueldo: $" + this.sueldo + "\n#################\n";
    }

    /**
     Metodo para determinar el empleado del mes, aquel con mas ventas.
     @param v1 Primer objeto vendedor.
     @param v2 Segundo objeto vendedor.
     @param v3 Tercer objeto vendedor.
     @return String con el nombre del vendedor con más ventas.
     */
    public String empleadoDelMes(Vendedor v1, Vendedor v2, Vendedor v3){
	if (v1.getAutosVendidos() > v2.getAutosVendidos()){
	    if(v1.getAutosVendidos() > v3.getAutosVendidos()){
		return v1.getNombre();
	    }
	    else
		{
		    return v3.getNombre();
		}
	}
	else{
	    if(v2.getAutosVendidos() > v3.getAutosVendidos())
		{
		    return v2.getNombre();
		}
	    else{
		return v3.getNombre();
	    }
	}
    }

    /**
     Metodo el cual determina al siguiente vendedor a despedir, aquel con menos ventas.
     @param v1 Primer objeto vendedor.
     @param v2 Segundo objeto vendedor.
     @param v3 Tercer objeto vendedor.
     @return String con el nombre del vendedor con menos ventas.     
     */
    
    public String proximoDespido(Vendedor v1, Vendedor v2, Vendedor v3){
	if (v1.getAutosVendidos() < v2.getAutosVendidos()){
	    if(v1.getAutosVendidos() < v3.getAutosVendidos()){
		return v1.getNombre();
	    }
	    else
		{
		    return v3.getNombre();
		}
	}
	else{
	    if(v2.getAutosVendidos() < v3.getAutosVendidos())
		{
		    return v2.getNombre();
		}
	    else{
		return v3.getNombre();
	    }
	}
    }

}
