/*
 * Clase Vendedor que muestra el nombre, sexo y número de autos vendidos de un 
 * empleado
 * @author Cruz Cruz Alan Josue 
 * @version 1
public class Vendedor{
	//Atributos de la clase
	private String nombre;
	private String sexo;
	private int ventas;

	 /*
	  * Método constructor en el que asignaremos 
	  * valores "vacíos", por así decirlo. En caso 
	  * de no intruducir nada en la clase ejecutabke
	  * esto nos indica que los datos están
	  * sin llenar
	  */
	public Vendedor(){
		this.nombre = "VACÍO";
		this.sexo = "VACÍO";
		this.ventas = 0;
	}

	/*
         * Método para obtener el nombre
         * @return nombre - NOmbre del vendedor
         */
        public String getNombre(){
         return nombre;
        }
	
	/*
         * Método para asignar el nombre;
         * @param nuevoNombreC - nuevo nombre del vendedor
         */
        public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
        }

	/*
         * Método para obtener el sexo
         * @return sexo
         */
        public String getSexo(){
         return sexo;
        }

        /*
         * Método para asignar el sexo;
         * @param nuevoNombreC - nuevo nombre del vendedor
         */
        public void setSexo(String sexo){
         this.sexo = sexo;
        }
	
	/*
         * Método para obtener las ventas, o sea, la cantidad de autos
	 * vendido
         * @return ventas
         */
        public int getVentas(){
         return ventas;
        }

        /*
         * Método para asignar la cantidad de autos vendido;
         * @param ventas - Autos vendidos
         */
        public void setVentas(int ventas){
         this.ventas = ventas;
        }

}
