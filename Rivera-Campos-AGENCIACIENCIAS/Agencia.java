/*
 * Clase Agencia
 * @author Jesus Rivera
 * @author Rodrigo Campos
 * @version 1.0
 * */
import java.util.Scanner;
public class Agencia{
    /*
     * Metodo mian donde asignamos las condicionales que se que tiene que
     * cumplir para ejecutar las clases Auto, Vendedor y Comprador
     * @param Argumentos 
     * */
    public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
        String marca,modelo,color,transmision,motor,nombre,meses;
	double precio,interes,enganche;
	int año;

	System.out.println("Bienvenid@ a -AGENCIACIENCIAS-");
	System.out.println("En esta agencia solo vendemos autos Tesla y Porshe");
	System.out.println("Ingrese a nuestro concesionario \n s: SI n: NO");
	
	System.out.print("Auto por seleccionar: ");
	seleccionar = sc.netxLine();
	
	if(seleccionar.equals("Tesla")){

	        
        	Auto auto1 = new Auto("Tesla");
		Vendedor vendedor1 = new Vendedor();
		
	        System.out.println("Marca del auto:"+auto1.getMarca());
       	        System.out.println("Modelo del auto:"+auto1.setModelo("Model S"));
         	System.out.println("Color del auto:"+auto1.setColor("Rojo"));
        	System.out.println("Transmision del auto:"+auto1.setTransmision("Automatica"));
        	System.out.println("Motor del auto:"+auto1.setMotor("Electrico"));
        	System.out.println("Año:"+auto1.setAño("2022"));
        	System.out.println("Precio:"+auto1.setPrecio("1500000"));
		System.out.println("Enganche de:"+vendedor1.setEnganche("$200000.00"));
		System.out.println("Meses:"+vendedor1.setMeses("72"));
		System.out.println("Interes:"+vendedor1.setInteres("10 %"));
	
	} else if(seleccionar.equals("Porshe")){
	    
        	Auto auto2 = new Auto("Porshe");
		Vendedor vendedor2 = new Vendedor();
		
         	System.out.println("Marca del auto":+auto2.getMarca());
        	System.out.println("Modelo del auto":+auto2.setModelo("Porshe Taycan"));
        	System.out.println("Color del auto":+auto2.setColor("Verde"));
        	System.out.println("Transmison del auto":+auto2.setTransmison("Automatica"));
        	System.out.println("Motor del auto:"+auto2.setMotor("Electrico"));
        	System.out.println("Año:"+auto2.setAño("2022"));
        	System.out.println("Precio:"+auto2.setPrecio("1850050"));
		System.out.println("Enganche de:"+vendedor2.setEnganche("$250000.00"));
		System.out.println("Meses:"+vendedor2.setMeses("60"));
		System.out.println("Interes:"+vendedor2.setInteres("8 %"));
	}
	       
    }
}
