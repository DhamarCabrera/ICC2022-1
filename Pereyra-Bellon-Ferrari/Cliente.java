/**
 *Clase cliente
 *Para que pueda pagar con su targeta el cliente
 *
 *@author Daniela Pereyra - Alan Bellon
 *@version 1.0
 */
public class Cliente{
    //Atributo
    private String cuenta;
    private int noDeCuenta;
    /**
     * Metodos
     *Constructores
     */
    public Cliente(String cuenta, int noDeCuenta){
	this.cuenta = cuenta;
	this.noDeCuenta = noDeCuenta;
    }

    public Cliente(){
	this.cuenta = "Ingresa tu numero de cuenta";
    }
    //metodos getters and setters
    public String getCuenta(){
	return this.cuenta;
    }
    public int getNoDeCuenta(){
	return this.noDeCuenta;
    }
    public void setCuenta(String cuenta){
	this.cuenta = cuenta;
    }
    public void setNoDeCuenta(int noDeCuenta){
	this.noDeCuenta = noDeCuenta;
    }
}
