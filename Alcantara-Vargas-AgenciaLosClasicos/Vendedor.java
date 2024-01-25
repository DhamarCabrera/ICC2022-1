//ENCABEZADO DE LA CLASE
/**
 * Clase que simula el comportamiento de un vendedor 
 * en una agencia de autos
 * 
 * @author Isaac Alcantara y Eduardo Vargas
 * @version 1.0
 **/
public class Vendedor{
    //CUERPO
    //Atributos
    //Representa el nombre del vendedor
    private String nombre;
    //Representa el humor del vendedor
    private boolean buenHumor;

    //Metodos
    //Metodos constructores
    /**
     * Constructor que recibe como parametros el nombre del vendedor
     * y su estado de humor (considerando true como buen humor)
     * 
     * @param nom El nombre del vendedor
     * @param h El estado de humor
     **/
    public Vendedor(String nom, boolean h){
	this.nombre = nom;
	this.buenHumor = h;
    }

    /**
     * Constructor sin parametros. Crea a un vendedor llamado Juan que 
     * esta de buenas
     *
     **/
    public Vendedor(){
	this.nombre = "Juan";
	this.buenHumor = true;
    }

    /**
     * Constructor copia. Crea un vendedor con el mismo nombre y 
     * estado de humor que otro
     *
     * @param v Un objeto de la clase vendedor
     **/
    public Vendedor(Vendedor v){
	this(v.nombre, v.buenHumor);
    }
    
    //Metodos obsevadores
    /**
     * Metodo que devuelve el nombre del vendedor
     *
     * @return El nombre del vendedor
     **/
    public String getNombre(){
	return this.nombre;
    }

    /**
     * Metodo que devuelve el humor del vendedor,
     * true si esta de buenas, false en otro caso
     *
     * @return El estado de humor del vendedor
     **/
    public boolean getHumor(){
	return this.buenHumor;
    }

    //Métodos modificadores
    /**
     * Metodo que permite modificar el nombre de un vendedor
     *
     * @param n El nuevo nombre
     **/
    public void setNombre(String n){
	this.nombre = n;
    }

    /**
     * Metodo que permite modificar el estado de humor de un 
     * vendedor, true si esta de buenas, false en otro caso
     *
     * @param h El nuevo estado de humor
     **/
    public void setBuenHumor(boolean h){
	this.buenHumor = h;
    }

    //Metodos calculadores
    /**
     * Metodo que simula la presentación de un vendedor ante 
     * un cliente
     * 
     * @return "Saludo, nombre, pregunta en que puede ayudar"
     **/
    public String presentarse(){
	//Variable para guardar el nombre
	String n = this.getNombre();
	//Pasa el nombre a mayusculas
	n = n.toUpperCase();
	return "Buen dia, mi nombre es " + n  + "\n" + "¿En que puedo ayudarle?";
    }
    
    /**
     * Metodo que simula la venta de un auto
     * 
     * @param p El precio del auto
     * @param ma La marca del auto 
     * @param mo El modelo del auto
     * @param a El año de fabricacion deseado
     * @param c El color deseado del auto
     * @return Un objeto de la clase auto
     **/
    public Auto vender(double p, String ma, String mo, int a, String c){
	Auto x = new Auto(ma, mo, a, p, c);
	return x;
    }

    //Metodos especiales
    /**
     * Metodo toString. 
     *
     * @return El nombre del vendedor y su humor
     **/
    public String toString(){
	//Variable para guardar el nombre
	String n = this.getNombre();
	//Pasa el nombre a mayusculas
	n = n.toUpperCase();
	if(this.buenHumor == true){
	    return "Mi nombre es " + n + " y estoy de buenas.";
	}else{
	    return "Mi nombre es " + n + " y no estoy de buenas.";
	}
    }

    /**
     * Metodo equals. Compara dos vendedores para saber si tienen el
     * mismo nombre y humor
     * 
     * @param v El vendedor contra el que se va a comparar
     * @return Un valor boolean dependiendo del nombre y humor
     **/
    public boolean equals(Vendedor v){
	//Pasa el nombre de los dos vendedores a minusculas
	String v1 = this.nombre;
	String v2 = v.nombre;
	v1 = v1.toLowerCase();
	v2 = v2.toLowerCase();
	//Regresa el boolean
	return v1.equals(v2) && this.buenHumor == v.buenHumor;
    }
}
