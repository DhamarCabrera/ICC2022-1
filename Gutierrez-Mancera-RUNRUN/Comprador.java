/**
 * Clase Comprador que representa a un cliente automotriz
 * @author Gil Axel GUtierrez Lara / Javier Alejandro Mancera Quiroz
 * @version 1.0
 * */
public class Comprador{

    // Atributos
    // Representa el nombre del cliente
    private String nombre;
    // Representa la calificacion dada por el cliente por el servicio realizado
    private int calificacion;

    /**
     * Constructor sin parametros que representa un perfil de un cliente automotriz
     * ya con datos iniciales 
     * */
    public Comprador(){
	nombre = "Comprador1";
	calificacion = 10;
    }

    /**
     * Constructor que recibe un perfil de un cliente automotriz
     * con datos dados por el usuario
     * */
    public Comprador(String nombre,int calificacion){
	this.nombre = nombre;
	this.calificacion = calificacion;
    }

    /**
     * Metodo que devuelve el nombre del cliente
     * @return El nombre del cliente
     * */
    public String getNombre(){
	return this.nombre;
    }
    /**
     * Metodo que devuelve la calificacion proporcionada por el cliente 
     * @return La calificacion proporcionada
     * */
    public int getCalificacion(){
	return this.calificacion;
    }
    
    /**
     * Metodo que cambia el nombre del cliente
     * @param nombre El nombre del cliente
     * */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    /**
     * Metodo que cambia la calificacion proporcionada por el cliente
     * @param calificacion La calificacion proporcionada
     * */
    public void setCalificacion(int calificacion){
	this.calificacion = calificacion;
    }
}
