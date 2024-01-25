import java.util.Scanner;

/**
 *Clase principal (Agencia)
 */


public class Main{
    public static void main(String[] args){
	Scanner sh = new Scanner(System.in);

	//Coches
	Auto coche1 = new Auto(1,"LAMBORGHINI","V10","Huracán",1545,2017,200000);
	Auto coche2 = new Auto(2,"Ford","EcoBoost V6","F-150 Raptor",0,2021,65000);
	Auto coche3 = new Auto(3,"Dodge","Hemi V8","Challenger",1999,2015,15000);
	Auto coche4 = new Auto(4,"Volkswagen","4 Cilindros","Vocho",170000,2003,12500);
	Auto coche5 = new Auto(5,"Chevrolet","Turbo 1.4L","TRAX",0,2022,10000);
	

	//Vendedores
	Vendedor Badbunny = new Vendedor("Bad Bunny (1)","Estoy pa darte lo que tu me ordenes!");
	Vendedor Leon = new Vendedor("León Larregui (2)","Todas las naves con fantasticas, geométricas, multicolor!");
	Vendedor Maluma = new Vendedor("Maluma (3)","Con tu nuevo coche te podras ir a Hawái de vacaciones!");
	Vendedor Axl = new Vendedor("Axl Rose (4)","Loaded like a freight train, Flyin' like an aeroplane!");
	
	

	//Da las opciones del programa
	System.out.println("Agencia de coches bonitos para impresionar a tu crush");
	System.out.println("Si usted es un comprador, digite 1");
	System.out.println("Si usted es un vendedor, digite 2");
	int Op = sh.nextInt();

	// Inicia el menu de opciones
	switch(Op){

	    //Caso comprador
	case 1: System.out.println("Cual es su nombre?");
	    
	    Scanner sh1 = new Scanner(System.in);
	    String nombre = sh1.nextLine();
	    System.out.println("Cuanto dinero piensa invertir en su nuevo auto?");
	    int dinero = sh1.nextInt();
	    Comprador SSS1 = new Comprador(nombre,dinero);
	    System.out.println("A que vendedor desea solicitarle informes?");
	    Badbunny.mostrarNombre();
	    Leon.mostrarNombre();
	    Maluma.mostrarNombre();
	    Axl.mostrarNombre();
	    int Op2 = sh1.nextInt();

	    switch(Op2){
	    case 1: Badbunny.Frase1();
		Scanner sh2 = new Scanner(System.in);
		System.out.println("Estos son los coches en venta ");

		coche1.mostrarDatos();
		coche2.mostrarDatos();
		coche3.mostrarDatos();
		coche4.mostrarDatos();
		coche5.mostrarDatos();
    
		System.out.println("\nCual desea comprar?");
		int Ncoche = sh2.nextInt();
		if(Ncoche==1){
		    if(SSS1.Disp()>=coche1.Price()){
			int Resto = SSS1.Disp() - coche1.Price();
			System.out.println("Felicidades por tu nuevo LAMBORGHINI, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche==2){
		    if(SSS1.Disp()>=coche2.Price()){
			int Resto = SSS1.Disp() - coche2.Price();
			System.out.println("Felicidades por tu nuevo Ford, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche==3){
		    if(SSS1.Disp()>=coche3.Price()){
			int Resto = SSS1.Disp() - coche3.Price();
			System.out.println("Felicidades por tu nuevo Dodge, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche==4){
		    if(SSS1.Disp()>=coche4.Price()){
			int Resto = SSS1.Disp() - coche4.Price();
			System.out.println("Felicidades por tu nuevo Volkswagen, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche==5){
		    if(SSS1.Disp()>=coche5.Price()){
			int Resto = SSS1.Disp() - coche5.Price();
			System.out.println("Felicidades por tu nuevo Chevrolet, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}



		break;

	    case 2: Leon.Frase1();
		Scanner sh3 = new Scanner(System.in);
		System.out.println("Estos son los coches en venta ");

		coche1.mostrarDatos();
		coche2.mostrarDatos();
		coche3.mostrarDatos();
		coche4.mostrarDatos();
		coche5.mostrarDatos();
    
		System.out.println("\nCual desea comprar?");
		int Ncoche1 = sh3.nextInt();
		if(Ncoche1==1){
		    if(SSS1.Disp()>=coche1.Price()){
			int Resto = SSS1.Disp() - coche1.Price();
			System.out.println("Felicidades por tu nuevo LAMBORGHINI, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche1==2){
		    if(SSS1.Disp()>=coche2.Price()){
			int Resto = SSS1.Disp() - coche2.Price();
			System.out.println("Felicidades por tu nuevo Ford, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche1==3){
		    if(SSS1.Disp()>=coche3.Price()){
			int Resto = SSS1.Disp() - coche3.Price();
			System.out.println("Felicidades por tu nuevo Dodge, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche1==4){
		    if(SSS1.Disp()>=coche4.Price()){
			int Resto = SSS1.Disp() - coche4.Price();
			System.out.println("Felicidades por tu nuevo Volkswagen, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche1==5){
		    if(SSS1.Disp()>=coche5.Price()){
			int Resto = SSS1.Disp() - coche5.Price();
			System.out.println("Felicidades por tu nuevo Chevrolet, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}



		break;

	    case 3: Maluma.Frase1();
		Scanner sh4 = new Scanner(System.in);
		System.out.println("Estos son los coches en venta ");

		coche1.mostrarDatos();
		coche2.mostrarDatos();
		coche3.mostrarDatos();
		coche4.mostrarDatos();
		coche5.mostrarDatos();
    
		System.out.println("\nCual desea comprar?");
		int Ncoche2 = sh4.nextInt();
		if(Ncoche2==1){
		    if(SSS1.Disp()>=coche1.Price()){
			int Resto = SSS1.Disp() - coche1.Price();
			System.out.println("Felicidades por tu nuevo LAMBORGHINI, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche2==2){
		    if(SSS1.Disp()>=coche2.Price()){
			int Resto = SSS1.Disp() - coche2.Price();
			System.out.println("Felicidades por tu nuevo Ford, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche2==3){
		    if(SSS1.Disp()>=coche3.Price()){
			int Resto = SSS1.Disp() - coche3.Price();
			System.out.println("Felicidades por tu nuevo Dodge, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche2==4){
		    if(SSS1.Disp()>=coche4.Price()){
			int Resto = SSS1.Disp() - coche4.Price();
			System.out.println("Felicidades por tu nuevo Volkswagen, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche2==5){
		    if(SSS1.Disp()>=coche5.Price()){
			int Resto = SSS1.Disp() - coche5.Price();
			System.out.println("Felicidades por tu nuevo Chevrolet, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}



		break;

	    case 4: Axl.Frase1();
		Scanner sh5 = new Scanner(System.in);
		System.out.println("Estos son los coches en venta ");

		coche1.mostrarDatos();
		coche2.mostrarDatos();
		coche3.mostrarDatos();
		coche4.mostrarDatos();
		coche5.mostrarDatos();
    
		System.out.println("\nCual desea comprar?");
		int Ncoche5 = sh5.nextInt();
		if(Ncoche5==1){
		    if(SSS1.Disp()>=coche1.Price()){
			int Resto = SSS1.Disp() - coche1.Price();
			System.out.println("Felicidades por tu nuevo LAMBORGHINI, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche5==2){
		    if(SSS1.Disp()>=coche2.Price()){
			int Resto = SSS1.Disp() - coche2.Price();
			System.out.println("Felicidades por tu nuevo Ford, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche5==3){
		    if(SSS1.Disp()>=coche3.Price()){
			int Resto = SSS1.Disp() - coche3.Price();
			System.out.println("Felicidades por tu nuevo Dodge, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche5==4){
		    if(SSS1.Disp()>=coche4.Price()){
			int Resto = SSS1.Disp() - coche4.Price();
			System.out.println("Felicidades por tu nuevo Volkswagen, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}
		if(Ncoche5==5){
		    if(SSS1.Disp()>=coche5.Price()){
			int Resto = SSS1.Disp() - coche5.Price();
			System.out.println("Felicidades por tu nuevo Chevrolet, tu dinero restante es: " + Resto);
		    } else{System.out.println("No te alcanza para este coche :c"); break;}
		}



		break;
		
	    default: System.out.println("Ese no es uno de nuestros vendedores u.u");
		break;
	    }


	    break;
	    //Caso Vendedor
	case 2: System.out.println("Que desea hacer?");
	    Scanner sh6 = new Scanner(System.in);
	    System.out.println("Entrar a Facebook(1) \nAgregar nuevos coches(2) \nRenunciar(3)");
	    int OpV = sh6.nextInt();
	    switch(OpV){
	    case 1: System.out.println("Seguro eres Maluma, ya ponte a chambear");
		break;
	    case 2: System.out.println("Opción aun no disponible.");
		break;
	    case 3: System.out.println("Leon para renunciar, primero debes pagarme lo que te preste.");
		break;
	    default: System.out.println("Axl ya se que no hablas bien español, pidele ayuda a Bad Bunny");
		break;
	    }
	    
	    break;

	    //Caso por default
	default: System.out.println("Esta no era una opcion, ves por que no impresionas a tu crush?");
	}

        
	
	
    }
}
