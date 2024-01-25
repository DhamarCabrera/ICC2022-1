/**
 * Clase Auto para crear un menú con los autos
 *
 * @author Daniela Pereyra - Alan Bellon
 * @version 1.0
 * */
import java.util.Scanner;

public class Vendedor{
    /**
     * Método principal main para ejecutar los paramétros de los autos
     *
     * @param args - Los argumentos
     */
    public static void main(String[] args){

	// Imprimimos bienvenida para el usuario
	System.out.println("\n*Bienvenido a Ferrary");

	// Utilzamos Scanner para obtener datos del usuario
	Scanner sc = new Scanner(System.in); 

	boolean salir = false;
	int opcion;

	
	while (!salir){
	    System.out.println("\n*Menú de autos de la agencia Ferrari* \n [1] Deportivos \n [2] Camionetas \n [3] SuperSports");
	    System.out.println("Ingrese el número de acuerdo a la opción");
	    opcion = sc.nextInt();

	    // Swith
	    switch (opcion){
	    case 1:
		
		System.out.println("Bienvenido a la sección de autos deportivos\nEn está sección encontrará los mejores autos deportivos del año");

		/**
		 * Creación de objetos 1
		 */
		Cliente cliente1 = new Cliente();
		Agencia agencia1 = new Agencia();
		Auto auto1 = new Auto();
		
		System.out.println("\n*Autos Deportivos Menú*");
		// Uso del método get para devolver un valor del objeto agencia1
		System.out.println("Los colores disponibles por el momento son: ");
		System.out.println(""+agencia1.getColores());

	        String Tipo = "Deportivo";
		
		Scanner so = new Scanner(System.in);
		System.out.println("Ingresa el color que desees para tu auto");
		auto1.setColor(so.nextLine());
		// Uso del método get para devolver un valor del objeto agencia1
		System.out.println("Los modelos con los que contamos son los siguientes: ");
		System.out.println(agencia1.getModelosau());
		System.out.println("Ingresa el Modelo");
		String modelo = so.nextLine();
		// Uso del método set para cambiar un valor del objeto auto1
		auto1.setModelo(modelo);
		System.out.println("\n\nEl Tipo de auto es " + Tipo);
		// Uso del método get para devolver un valor del objeto auto1
		System.out.println("De color " + auto1.getColor());	        
		System.out.println("Modelo " +auto1.getModelo());

		if (modelo == "Berlinetta"){
		    System.out.println("Seria un total de $123412123");
		} else if (modelo == "Enzo") {
		    System.out.println("Seria un total de $21232456" );
		} else if (modelo == "LaFerrary"){
		    System.out.println("Seria un total de $1000000");
		}
		// Uso del método toString
		System.out.println(auto1.toString());

		Scanner sa = new Scanner(System.in);
	    
	    System.out.println("¿Cómo deseas pagar, con efectivo-(1) o con targeta-(2)?");
	    int z = sa.nextInt();
	    if (z == 2){
		//usamos la clase cliente
		System.out.println(""+cliente1.getCuenta());
		cliente1.setNoDeCuenta(sa.nextInt());
	        System.out.println("Tu numero de cuenta es " + cliente1.getNoDeCuenta() + "   1(si)   2(no)? ");
		int j = sa.nextInt();
		if (j == 1){
		    System.out.println("Listo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		} else if (j == 2){
		    System.out.println("\nLlama al 58556457 y te ayudaremos");
		}
        
	    } else if (z == 1){
		System.out.println("Ingrese el valor del auto en efectivo...");
		int prc = sa.nextInt();
		if (prc == 123412123){
		    System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		} else if (prc == 21232456){
		    System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		} else if (prc == 1000000){
		    System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		} else{
		    System.out.println("Nop eso no cuesta el auto, pa su casa niño apesto, vaya a hacer dinerito");
		}
		}
	    
		    
		break;
	    }
	
	    salir = true;
	    switch (opcion){
	    case 2:
		
		System.out.println("Bienvenido a la sección de autos camionetas\nEn esta sección encontrará las mejores camionetas del año");

		/**
		 * Creación de objetos 2
		 */
		Cliente cliente2 = new Cliente();
		Agencia agencia2 = new Agencia();
		Auto auto2 = new Auto();
		
		System.out.println("\n*Camionetas Menú*");
		// Uso del método get para devolver un valor del objeto agencia2
		System.out.println("Los colores disponibles por el momento son: ");
		System.out.println(""+agencia2.getColores());
		
	        String Tipo = "Camioneta";
		
		Scanner so = new Scanner(System.in);
		System.out.println("Ingresa el color que desees para tu camioneta");
		auto2.setColor(so.nextLine());
		// Uso del método get para devolver un valor del objeto agencia2
		System.out.println("Los modelos con los que contamos son los siguientes: ");
		System.out.println(agencia2.getModelosca());	
		System.out.println("Ingresa el Modelo");
		String modelo = so.nextLine();
		// Uso del método set para cambiar un valor del objeto auto2
		auto2.setModelo(modelo);
		System.out.println("\n\nEl Tipo de auto es " + Tipo);
		// Uso del método get para devolver un valor del objeto auto2
		System.out.println("De color " + auto2.getColor());	        
		System.out.println("Modelo " +auto2.getModelo());

		if (modelo == "Purosangre"){
		    System.out.println("Seria un total de $565656");
		} else if (modelo == "Hurus"){
		    System.out.println("Seria un total de $343434");
		} else if (modelo == "Trocona"){
		    System.out.println("Seria un total de $989898");
		}
		
		// Uso del método toString
		System.out.println(auto2.toString());


		Scanner sa = new Scanner(System.in);
	    
		System.out.println("¿Cómo deseas pagar, con efectivo-(1) o con targeta-(2)?");
		int z = sa.nextInt();
		if (z == 2){
		    System.out.println(""+cliente2.getCuenta());
		cliente2.setNoDeCuenta(sa.nextInt());
	        System.out.println("Tu numero de cuenta es " + cliente2.getNoDeCuenta() + "   1(si)   2(no)? ");
		int j = sa.nextInt();
		if (j == 1){
		    System.out.println("Listo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		} else if (j == 2){
		    System.out.println("\nLlama al 58556457 y te ayudaremos");
		}
		} else if (z == 1){
		    System.out.println("Ingrese el valor del auto en efectivo...");
		    int prc = sa.nextInt();
		    if (prc == 565656){
			System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		    } else if (prc == 343434){
			System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		    } else if (prc == 989898){
			System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
		    } else{
			System.out.println("Nop eso no cuesta el auto, pa su casa niño apesto, vaya a hacer dinerito");
		    }
		}
		    break;
		}

		salir = true;    
		switch (opcion){
		case 3:
		
		    System.out.println("Bienvenido a la sección de autos SuperSport\nEn esta sección encontrará las mejores autos SuperSport del año");

		    /**
		     * Creación de objetos 2
		     */
		    Cliente cliente3 = new Cliente();
		    Agencia agencia3 = new Agencia();
		    Auto auto3 = new Auto();		

		    System.out.println("\n*SuperSport Menú*");
		    // Uso del método get para devolver un valor del objeto agencia3
		    System.out.println("Los colores disponibles por el momento son: ");
		    System.out.println(""+agencia3.getColores());

		    String Tipo1 = "SuperSport";		

		    Scanner sk = new Scanner(System.in);
		    System.out.println("Ingresa el color que desees para tu auto");
		    auto3.setColor(sk.nextLine());
		    // Uso del método get para devolver un valor del objeto agencia3
		    System.out.println("Los modelos con los que contamos son los siguientes: ");
		    System.out.println(agencia3.getModelossp());
		    System.out.println("Ingresa el Modelo");
		    String modelo1 = sk.nextLine();
		    // Uso del método set para cambiar un valor del objeto auto3
		    auto3.setModelo(modelo1);
		    System.out.println("\n\nEl Tipo de auto es " + Tipo1);
		    // Uso del método get para devolver un valor del objeto auto3
		    System.out.println("De color " + auto3.getColor());	        
		    System.out.println("Modelo " +auto3.getModelo());

		    if (modelo1 == "Tributo"){
			System.out.println("Seria un total de $121212");
		    } else if (modelo1 == "Chidorris"){
			System.out.println("Seria un total de $676767");
		    } else if (modelo1 == "LaVestia"){
			System.out.println("Seria un total de $909090");
		    }
		
		    // Uso del método toString
		    System.out.println(auto3.toString());

		    Scanner sl = new Scanner(System.in);       
		    System.out.println("¿Cómo deseas pagar, con efectivo-(1) o con targeta-(2)?");
		    int s = sl.nextInt();
		    if (s == 2){
			System.out.println(""+cliente3.getCuenta());
			cliente3.setNoDeCuenta(sl.nextInt());
			System.out.println("Tu numero de cuenta es " + cliente3.getNoDeCuenta() + "   1(si)   2(no)? ");
			int j = sl.nextInt();
			if (j == 1){
			    System.out.println("Listo, tu compra fue un exito, te contactaremos para enviar tu paquete");
			} else if (j == 2){
			    System.out.println("\nLlama al 58556457 y te ayudaremos");
		}
		    } else if (s == 1){
			System.out.println("Ingrese el valor del auto en efectivo...");
			int prc = sl.nextInt();
			if (prc == 121212){
			    System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
			} else if (prc == 676767){
			    System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
			} else if (prc == 909090){
			    System.out.println("\nListo, tu compra fue un exito, te contactaremos para enviar tu paquete");
			} else{
			    System.out.println("Nop eso no cuesta el auto, pa su casa niño apesto, vaya a hacer dinerito");
			}
		    
		    break;
		}
	    }
	}
    }
}
