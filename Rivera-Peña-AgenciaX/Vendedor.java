/**
 *Clase que simula a un vendedor de una agencia
*@author Mario Rosales
*@version 1.1
    */
public class Vendedor{
    private String nombre;
    private int entrada;
    private int salida;
    private double salario;

    /**
     *Constructor que genera un vendedor con el nombre, horario y salario que le asignemos
     *@param nombre El nombre del vendedor
     *@param entrada La hora de entrada del vendedor
     *@param salida La hora de salida del vendedor
     *@param salario El salario del vendedor
     */
    public Vendedor(String nombre, int entrada, int salida, double salario){
	this.nombre = nombre;
	this.entrada = entrada;
	this.salida = salida;
	this.salario = salario;
    }

    /**
     *Método para obtener el nombre del vendedor
     *@return El nombre del vendedor
     */
    public String getNombre(){
	return this.nombre;
    }
    /**
     *Método para cambiar el nombre del vendedor
     *@param nombre El nombre que le asignaremos al vendedor
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     *Método para obtener la hora de entrada
     *@return La hora de entrada del vendedor
     */
    public int getEntrada(){
	return this.entrada;
    }
    /**
     *Método para cambiar la hora de entrada del vendedor
     *@param entrada El horario de entrada que le asignaremos al vendedor
     */
    public void setEntrada(int entrada){
	this.entrada = entrada;
    }

    /**
     *Método para obtener la hora de salida del vendedor
     *@return El horario de salida del vendedor
     */
    public int getSalida(){
	return this.salida;
    }
    /**
     *Método para cambiar la hora de salida del vendedor
     *@param salida El horario de salida que le asignaremos al vendedor
     */
    public void setSalida(int salida){
	this.salida = salida;
    }

    /**
     *Método para obtener el salario del vendedor
     *@return El salario del vendedor
     */
    public double getSalario(){
	return this.salario;
    }
    /**
     *Método para cambiar el salario del vendedor
     *@param salario El salario que le asignaremos al vendedor
     */
    public void setSalario(double salario){
	this.salario = salario;
    }
    
    /**
     *Método para ver los datos del vendedor
     *@return Un String con el nombre, horario y salario del vendedor
     */
    public String toString(){
	return "Nombre: " + nombre + "\nHorario: De " + entrada + ":00 a " + salida + ":00\nSalario: $" + salario;
    }
}
