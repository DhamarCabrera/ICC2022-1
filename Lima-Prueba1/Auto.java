/**
 *Clase Auto
 */

public class Auto{
    //Atributos
    String marca,modelo,motor;
    int km,year,precio,numer;
    
    //Metodo constructor
    public Auto(int numer,String marca,String motor, String modelo, int km, int year, int precio){
	this.numer = numer;
	this.marca = marca;
	this.motor = motor;
	this.modelo = modelo;
	this.km = km;
	this.year = year;
	this.precio = precio;
    }

    
    //Método para mostrar los datos de cada coche
    public void mostrarDatos(){
	//return "Marca: " + marca+ "\nModelo: " + modelo + "\nMotor: " + motor + "\nKilometraje: " + km + "\nAño: " + year + "\nPrecio: " + precio + "\n";
	System.out.println("\nNumero: " + numer);
	System.out.println("Marca: " + marca);
	System.out.println("Modelo: " + modelo);
	System.out.println("Motor: " + motor);
	System.out.println("Kilometraje: " + km + " km");
	System.out.println("Año: " + year);
	System.out.println("Precio: " + precio + " Dolares");
    }
    //Método para obtener el valor del coche
    public int Price(){
	return precio;
    }
}
