/*
 * Clase Vendedor
 * @author Jesus Rivera
 * @author Rodrigo Campos
 * @version 1.0
 * */
public class Vendedor{
    private String nombre;
    private int meses;
    private double interes;
    private double enganche;
   
    
    /*
     * Metodo constructor que nos indica: nombre, meses, interes, enganche, añosExperiencia
     * @param nombre nombre
     * @param meses meses
     * @param interes interes
     * @param enganche enganche
     * */
    public Vendedor(String nombre, int meses, double interes, double enganche){
	this.nombre = nombre;
	this.meses = meses;
	this.interes = interes;
	this.enganche = enganche;
	
    }
    /*
     * Metodo que cambia el nombre del vendedor
     * @param nombre Nombre del vendedor
     * */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    /*
     * Metodo que regresa el nombre del vendedor
     * @return nombre
     * */
    public String getNombre(){
	return this.nombre;
    }
    /*
     * Metodo que cambia el valor de meses
     * @param meses Valor de meses que propone el vendedor
     * */
    public void setMeses(int meses){
	this.meses = meses;
    }
    /*
     * Metodo que regresa el valor meses
     * @return meses 
     * */
    public int getMeses(){
	return this.meses;
    }
    /*
     * Metodo que cambia el valor interes
     * @param interes Valor de interes que proporciona el vendedor
     * */
    public void setInteres(double interes){
	this.interes = interes;
    }
    /*
     * Metodo que regresa el valor interes 
     * @return interes
     * */
    public dobuble getInteres(){
	return this.interes;
    }
    /*
     * Metodo que cambia el valor de enganche  
     * @param enganche Enganche que proporciona el vendedor
     * */
    public void setEnganche(double enganche){
	this.enganche = enganche;
    }
    /*
     * Metodo que regresa el valor enganche
     * @return enganche
     * */
    public double getEnganche(){
	return enganche;
   
    }
	
}
