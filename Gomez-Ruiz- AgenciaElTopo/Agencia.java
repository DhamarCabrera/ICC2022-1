import java.util.Scanner;

public class Agencia{
    public static void main(String args[]){
	//Da la bienvenida y pide inciar sesión
	Scanner scan = new Scanner(System.in);
	Cliente clientoso = new Cliente();
	System.out.println("*****Bienvenido a la Agencia ElTopo*******\nPorfavor seleccione una cuenta para ingresar");
	System.out.println("1-Cuenta default 1           2-Cuenta default 2             3-Ingresar con sus propios datos");
	int manin = scan.nextInt();

	//Crea el objeto del cliente dependiendo de la opción
	switch(manin){
	    case 1:
		System.out.println("Usted escogi\u00f3 la opci\u00f3n 1");
		System.out.println("Cliente default 1, con nombre, contraseña y dinero default");
		break;
	    
	    case 2:
		System.out.println("Usted escogi\u00f3 la opci\u00f3n 2");
		Scanner dinero2 = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de dinero que desea utilizar");
		double moni2 = dinero2.nextDouble();
		clientoso.setDinero(moni2);
		System.out.println("Cliente default 2, con nombre y contraseña default pero con la cantidad de dinero deseada");
		break;
	    
	    case 3:
		System.out.println("Usted escogi\u00f3 la opci\u00f3n 3");
		Scanner datos = new Scanner(System.in);
	        System.out.println("Ingrese su nombre");
		String cliente = datos.nextLine();
		System.out.println("Ingrese una contrase\u00f1a para su cuenta");
		String contra = datos.nextLine();
		Scanner dinero = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de dinero que desea utilizar");
		double moni = dinero.nextDouble();
	        clientoso.setCliente(cliente);
		clientoso.setContra(contra);
		clientoso.setDinero(moni);
		System.out.println("Cuenta creada con sus datos elegidos");
		break;
	    
	    default:
		System.out.println("\n Ingresó una opción que no era válida, intente de nuevo");
	        System.exit(1);
	    
	}

	//Vendedor
	Vendedor mano = new Vendedor();
	System.out.println("\n"+mano.toString(clientoso));


	//Autos
	 String marca, modelo,color;
	 int anio, potencia;
	 double precio;
	 marca = "Nissan";
	 modelo = "Versa";
         color = "Rojo Escarlata";
	 anio = 2021;
	 potencia = 118;
	 precio = 25000.00;
	 Auto autin = new Auto(marca,modelo,color,anio,potencia,precio);
	 marca = "Nissan";
	 modelo = "Tsuru";
	 color = "Naranja";
	 anio = 2013;
	 potencia = 115;
	 precio = 30000.00;
	 Auto auton = new Auto(marca,modelo,color,anio,potencia,precio);
	 

	//Menú
	System.out.println("*****Menú de opciones******");
	System.out.println("1-Catálogo de autos \n2-Comprar auto \n3-Ver datos de la cuenta \n4-Salir");
	int opcion = scan.nextInt();
	switch(opcion){
	    //Catálogo de autos
	   case 1:
	       System.out.println("\nUsted escogió ver el catálogo de autos");
	       System.out.println("Primer auto del catálogo:");
	       System.out.println(autin.toString());
	       System.out.println("\nSegundo auto del catálogo:");
	       System.out.println(auton.toString());

	       System.out.println("\nFin del catálogo de autos");
	       System.out.println(mano.Adios(clientoso));
	       break;
	   
	   //Comprar auto
	   case 2:
	       System.out.println("\nUsted escogió comprar un auto");
	       System.out.println("Autos disponibles:");
	       System.out.println("Primer auto: \n"+autin.getMarca()+" "+autin.getModelo()+" .Con un precio de "+autin.getPrecio()+" pesos");
	       System.out.println("Segundo auto: \n"+auton.getMarca()+" "+auton.getModelo()+" .Con un precio de "+auton.getPrecio()+" pesos");

	       System.out.println("\n¿Qué auto desea comprar?: 1 o 2");
	       int opcion2 = scan.nextInt();
	       if(opcion2 == 1){
		   System.out.println("Seleccionó el "+autin.getModelo());
		   if(clientoso.getDinero()<autin.getPrecio()){
		       System.out.println("Lo lamentamos pero no cuenta con los fondos suficientes para comprar el auto");
		       System.out.println("\n"+mano.Adios(clientoso));
		       break;
		   }
		   else{
		       System.out.println("Felicidades usted pudo adquirir su nuevo auto "+autin.getModelo());
		       System.out.println("\n"+mano.Adios(clientoso));
		       break;
		   }
	       }
	       else if(opcion2 == 2){
		   System.out.println("Seleccionó el "+auton.getModelo());
		   if(clientoso.getDinero()<auton.getPrecio()){
		       System.out.println("Lo lamentamos pero no cuenta con los fondos suficientes para comprar el auto");
		       System.out.println("\n"+mano.Adios(clientoso));
		       break;
		   }
		   else{
		       System.out.println("Felicidades usted pudo adquirir su nuevo auto "+auton.getModelo());
		       System.out.println("\n"+mano.Adios(clientoso));
		       break;
		   }
	       }
	       else{
		   System.out.println("Usted seleccionó una opción inválida, intente de nuevo");
		   break;
	       }
	   
	   case 3:
	       System.out.println("\nUsted seleccionó ver los datos de su cuenta");
	       System.out.println(clientoso.toString());
	       System.out.println("Su contraseña es: "+clientoso.getContra());

	       System.out.println(mano.Adios(clientoso));
	       break;

	   
	   case 4:
	       System.out.println(mano.Adios(clientoso));;
	       break;
       
	   default:
	       System.out.println("Ingresó una opción que no es válida, intente de nuevo");
	       break;	    
	}

    }	
}
