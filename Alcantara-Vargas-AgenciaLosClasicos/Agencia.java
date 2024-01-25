import java.util.Scanner;

/**
 * Clase agencia con el metodo main ejecutable
 *
 * @author Isaac Alcantara y Eduardo Vargas
 * @version 1.0
 **/
public class Agencia{
    /**
     * Metodo principal main, donde se realizar todo el comportamiento de la agencia
     * 
     * @param args Los argumentos
     **/
    public static void main(String[] args){
	//Imprimir el nombre de la agencia y si podemos ayudar en algo
	System.out.println("***AGENCIA LOS CLASICOS***" + "\n"+ "Bienvenido, ¿podemos ayudarle en algo? (ingresar el numero) \n 1. Deseo hablar con un vendedor \n 2. Solamente estoy viendo");

	//Se crean objetos de la clase auto para ser rentados
	Auto ToyotaPrius = new Auto();
	Auto KiaRent2018 = new Auto("Kia", "Forte Sedán", 2018, 4560.50, "Rojo");
	Auto KiaRent2014 = new Auto("Kia", "Rio Sedán", 2014, 3600.80, "Azul");
       	Auto ChevroletRent2021 = new Auto("Chevrolet", "Aveo", 2021, 5600.30, "Arena");
	Auto ChevroletRent2010 = new Auto("Chevrolet", "Cavalier", 2010, 3350.00, "Blanco");
	Auto ChevroletRent1990 = new Auto("Chevrolet", "Camaro", 1990, 6700.27, "Negro");
	//Objetos de la clase Scanner para las respuestas del usuario
	Scanner numeros = new Scanner(System.in);
	Scanner strings = new Scanner(System.in);
	Scanner rentanum = new Scanner(System.in);
	
	//Para la respuesta del usuario
	int respuesta = numeros.nextInt();
	respuesta = Math.abs(respuesta); //Tomemos el valor absoluto
	
	//Abrimos casos donde si desea hablar con el vendedor y donde no
	if(respuesta == 1){
	    //Preguntar con cual de los 5 vendedores disponibles quiere hablar (Juan, Isaac, Eduardo, Renata, Maria)
	    System.out.println("Estan disponibles Juan, Isaac, Eduardo, Renata y Maria. \nIngrese el nombre del vendedor por el que quiera ser atendido: ");
	    //Variable String para guardar la respuesta del usuario
	    String vendedor = strings.nextLine();
	    //Creando objeto de la clase vendedor para atender al cliente
	    boolean humor = true;
	    Vendedor v = new Vendedor(vendedor, humor);
	    //El vendedor se presenta y pregunta si quiere comprar o rentar
	    System.out.println("\n" + v.presentarse() + "\n 1. Deseo comprar un auto \n 2. Deseo rentar un auto");
	    //Respuesta del usuario
	    respuesta = numeros.nextInt();
	    respuesta = Math.abs(respuesta);
	    //Variables para el nombre y el apellido del cliente
	    String nombreC;
	    String apellidoC;
	    //Objeto de la clase comprador
	    Comprador cliente = new Comprador();
	    //Preguntar el nombre del cliente
	    System.out.println("Antes de seguir, ¿cual es su nombre?");
	    nombreC = strings.nextLine();
	    System.out.println("¿Y su apellido?");
	    apellidoC = strings.nextLine();
	    //Cambiando el nombre y apellido del cliente
	    cliente.setNombre(nombreC);
	    cliente.setApellido(apellidoC);
	    
	    switch(respuesta){
	    case 1:     //En caso de querer comprar;
		//Mostrar al cliente las opciones de marcas para compra
		System.out.println("\nDe acuerdo " + cliente.getNombre() + " " + cliente.getApellido() + "\nEn esta agencia solamente manejamos 5 marcas de autos para comprar: \n 1. Nissan \n 2. Kia \n 3. Chevrolet \n 4. Toyota \n 5. Volkswagen \nIngrese el numero de la marca deseada:");
		
		//Guarda la opcion en la variable respuesta
		respuesta = numeros.nextInt();
		respuesta = Math.abs(respuesta);
		
		//Solicitar ahora el numero de cuenta y el dinero disponible en ella
		System.out.println("Para poder continuar con el trámite necesito saber su numero de cuenta bancaria (De cuatro digitos): ");
		int cuentaC = numeros.nextInt();
		cliente.setNumCuenta(cuentaC); //Establece el numero de cuenta
		
		//Solicita el dinero disponible en la cuenta
		System.out.println("Ahora necesito saber cuanto dinero tiene: ");
		double dineroC = numeros.nextInt();
		dineroC = Math.abs(dineroC);
		cliente.setDinero(dineroC); //Establece el dinero disponible

		//Creando un objeto de la clase Auto
		Auto carro = new Auto();
		
		//Se abren los casos dependiendo de la marca seleccionada por el usuario
		String marcaC; //Variable para la marca del auto
		String modeloC; //Variable para el modelo del auto
		double precioC; //Variable para el precio del auto
		int anoC; //Variable para el año del auto
		String colorC;
		
		switch(respuesta){
		case 1: //Si la respuesta es Nissan
		    //Modifica la marca de carro 
		    marcaC = "Nissan";
		    carro.setMarca(marcaC);

		    //Preguntar el modelo deseado
		    System.out.println("De la marca Nissan contamos con los siguientes modelos: \n 1. Tsuru \n 2. March \n 3. Sentra \n 4. Versa \n 5. Tiida \nIngresa el número del modelo deseado: ");
		    respuesta = numeros.nextInt();
		    //Se abren casos dependiendo el modelo deseado
		    switch(respuesta){
		    case 1: //Si la respuesta es tsuru
			modeloC = "Tsuru";
			//Preguntar el color
			System.out.println("¿De que color quieres tu tsuru?");
			colorC = strings.nextLine();
			//Preguntar si lo quiere tuneado
			System.out.println("¿Lo quieres tuneado?");
			String tuneado = strings.nextLine();
			tuneado = tuneado.toLowerCase();
			if (tuneado.equals("si")){ //Si lo quiere tuneado
			    System.out.println("Los Tsurus tuneados los manejamos en el precio de 100,000 pesos");
			    double precioTsuruT = 100000;
			    //Si le alcanza al cliente es suyo el auto
			    if(dineroC >= 100000){
				System.out.println(cliente.comprar(precioTsuruT) + "\n" + v.vender(precioTsuruT, marcaC, modeloC, 2005, colorC));
			    }else{
				System.out.println(cliente.comprar(precioTsuruT));
			    }
			}else{ //Si no lo quiere tuneado 
			    System.out.println("Los Tsurus los manejamos en el precio de 40,000 pesos");
			    double precioTsuru = 40000;
			    //Si le alcanza al cliente es suyo el auto
			    if(dineroC >= 400000){
				System.out.println(cliente.comprar(precioTsuru) + "\n" + v.vender(precioTsuru, marcaC, modeloC, 2005, colorC));
			    }else{
				System.out.println(cliente.comprar(precioTsuru));
			    }
			}
			break;
		    case 2: //CASO MARCH
			modeloC = "March";
			//Preguntar el color
			System.out.println("¿De que color quieres tu march?");
			colorC = strings.nextLine();
			System.out.println("Los March los manejamos en el precio de 200,000 pesos");
			double precioMarch = 200000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 200000){
			    System.out.println(cliente.comprar(precioMarch) + "\n" + v.vender(precioMarch, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioMarch));
			}
			break;
		    case 3: //CASO SENTRA
			modeloC = "Sentra";
			//Preguntar el color
			System.out.println("¿De que color quieres tu sentra?");
			colorC = strings.nextLine();
			System.out.println("Los Sentra los manejamos en el precio de 220,000 pesos");
			double precioSentra = 220000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 220000){
			    System.out.println(cliente.comprar(precioSentra) + "\n" + v.vender(precioSentra, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioSentra));
			}
			break;
		    case 4: //CASO VERSA
			modeloC = "Versa";
			//Preguntar el color
			System.out.println("¿De que color quieres tu versa?");
			colorC = strings.nextLine();
			System.out.println("Los Versa los manejamos en el precio de 220,000 pesos");
			double precioVersa = 220000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 220000){
			    System.out.println(cliente.comprar(precioVersa) + "\n" + v.vender(precioVersa, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioVersa));
			}
			break;
		    case 5: //CASO TIIDA
			modeloC = "Tiida";
			//Preguntar el color
			System.out.println("¿De que color quieres tu tiida?");
			colorC = strings.nextLine();
			System.out.println("Los Tiida los manejamos en el precio de 250,000 pesos");
			double precioTiida = 250000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 250000){
			    System.out.println(cliente.comprar(precioTiida) + "\n" + v.vender(precioTiida, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioTiida));
			}
			break;
		    default:
			System.out.println("Esa no es una opcion");
		    }
		    break;
		case 2: //Si la respuesta es Kia
		    marcaC = "Kia";
		    carro.setMarca(marcaC);
		    
		    //Preguntar el modelo deseado
		    System.out.println("De la marca Kia contamos con los siguientes modelos: \n 1. Forte S \n 2. Forte H \n 3. Rio \nIngresa el número del modelo deseado: ");
		    respuesta = numeros.nextInt();
		    //Se abren casos dependiendo el modelo deseado
		    switch(respuesta){
		    case 1: //CASO FORTE S 
			modeloC = "Forte S";
			//Preguntar el color
			System.out.println("¿De que color quieres tu Forte S?");
			colorC = strings.nextLine();
			System.out.println("Los Forte S los manejamos en el precio de 310,000 pesos");
			double precioForteS = 310000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 310000){
			    System.out.println(cliente.comprar(precioForteS) + "\n" + v.vender(precioForteS, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioForteS));
			}
			break;
		    case 2: //CASO FORTE H
			modeloC = "Forte H";
			//Preguntar el color
			System.out.println("¿De que color quieres tu Forte H?");
			colorC = strings.nextLine();
			System.out.println("Los Forte H los manejamos en el precio de 350,000 pesos");
			double precioForteH = 350000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 350000){
			    System.out.println(cliente.comprar(precioForteH) + "\n" + v.vender(precioForteH, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioForteH));
			}
			break;
		    case 3: //CASO RIO
			modeloC = "Rio";
			//Preguntar el color
			System.out.println("¿De que color quieres tu Rio?");
			colorC = strings.nextLine();
			System.out.println("Los Rio los manejamos en el precio de 300,000 pesos");
			double precioRio = 300000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 30000){
			    System.out.println(cliente.comprar(precioRio) + "\n" + v.vender(precioRio, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioRio));
			}
			break;
		    default:
			System.out.println("Esa no es una opcion");
		    }
		    break;
		case 3: //Si la respuesta es Chevrolet
		    marcaC = "Chevrolet";
		    carro.setMarca(marcaC);
		   
		    //Preguntar el modelo deseado
		    System.out.println("De la marca Chevrolet contamos con los siguientes modelos: \n 1. Beat  \n 2. Spark \n 3. Aveo \nIngresa el número del modelo deseado: ");
		    respuesta = numeros.nextInt();
		    //Se abren casos dependiendo el modelo deseado
		    switch(respuesta){
		    case 1: //CASO BEAT 
			modeloC = "Beat";
			//Preguntar el color
			System.out.println("¿De que color quieres tu Beat?");
			colorC = strings.nextLine();
			System.out.println("Los Beat los manejamos en el precio de 180,000 pesos");
			double precioBeat = 180000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 180000){
			    System.out.println(cliente.comprar(precioBeat) + "\n" + v.vender(precioBeat, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioBeat));
			}
			break;
		    case 2: //CASO SPARK
			modeloC = "Spark";
			//Preguntar el color
			System.out.println("¿De que color quieres tu spark?");
			colorC = strings.nextLine();
			System.out.println("Los Spark los manejamos en el precio de 150,000 pesos");
			double precioSpark = 150000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 150000){
			    System.out.println(cliente.comprar(precioSpark) + "\n" + v.vender(precioSpark, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioSpark));
			}
			break;
		    case 3: //CASO AVEO
			modeloC = "Aveo";
			//Preguntar el color
			System.out.println("¿De que color quieres tu aveo?");
			colorC = strings.nextLine();
			System.out.println("Los Aveo los manejamos en el precio de 235,000 pesos");
			double precioAveo = 235000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 235000){
			    System.out.println(cliente.comprar(precioAveo) + "\n" + v.vender(precioAveo, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioAveo));
			}
			break;
		    default:
			System.out.println("Esa no es una opcion");
		    }
		    break;
		case 4: //Si la respuesta es Toyota
		    marcaC = "Toyota";
		    carro.setMarca(marcaC);
		    
		    //Preguntar el modelo deseado
		    System.out.println("De la marca Toyota contamos con los siguientes modelos: \n 1. Prius  \n 2. Yaris \n 3. Corolla \nIngresa el número del modelo deseado: ");
		    respuesta = numeros.nextInt();
		    //Se abren casos dependiendo el modelo deseado
		    switch(respuesta){
		    case 1: //CASO PRIUS
			modeloC = "Prius";
			//Preguntar el color
			System.out.println("¿De que color quieres tu Prius?");
			colorC = strings.nextLine();
			System.out.println("Los Prius los manejamos en el precio de 360,000 pesos");
			double precioPrius = 360000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 360000){
			    System.out.println(cliente.comprar(precioPrius) + "\n" + v.vender(precioPrius, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioPrius));
			}
			break;
		    case 2: //CASO YARIS
			modeloC = "Yaris";
			//Preguntar el color
			System.out.println("¿De que color quieres tu Yaris?");
			colorC = strings.nextLine();
			System.out.println("Los Yaris los manejamos en el precio de 299,999 pesos");
			double precioYaris = 299999;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 299999){
			    System.out.println(cliente.comprar(precioYaris) + "\n" + v.vender(precioYaris, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioYaris));
			}
			break;
		    case 3: //CASO COROLLA
			modeloC = "Corolla";
			//Preguntar el color
			System.out.println("¿De que color quieres tu corolla?");
			colorC = strings.nextLine();
			System.out.println("Los Corolla los manejamos en el precio de 280,000 pesos");
			double precioCorolla = 280000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 280000){
			    System.out.println(cliente.comprar(precioCorolla) + "\n" + v.vender(precioCorolla, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioCorolla));
			}
			break;
		    default:
			System.out.println("Esa no es una opcion");
		    }
		    break;
		case 5: //Si la respuesta es Volkswagen
		    marcaC = "Volkswagen";
		    carro.setMarca(marcaC);
		  
		    //Preguntar el modelo deseado
		    System.out.println("De la marca Volkswagen contamos con los siguientes modelos: \n 1. Vocho \n 2. Gol \n 3. Vento \n 4. Golf \n 5. Lupo \nIngresa el número del modelo deseado: ");
		    respuesta = numeros.nextInt();
		    //Se abren casos dependiendo el modelo deseado
		    switch(respuesta){
		    case 1: //CASO VOCHO
			modeloC = "Vochito";
			//Preguntar el color
			System.out.println("¿De que color quieres tu vocho?");
			colorC = strings.nextLine();
			//Preguntar si lo quiere tuneado
			System.out.println("¿Lo quieres tuneado?");
			String tuneadoV = strings.nextLine();
			tuneadoV = tuneadoV.toLowerCase();
			if (tuneadoV.equals("si")){ //Si lo quiere tuneado
			    System.out.println("Los Vochos tuneados los manejamos en el precio de 100,000 pesos");
			    double precioVochoT = 100000;
			    //Si le alcanza al cliente es suyo el auto
			    if(dineroC >= 100000){
				System.out.println(cliente.comprar(precioVochoT) + "\n" + v.vender(precioVochoT, marcaC, modeloC, 2000, colorC));
			    }else{
				System.out.println(cliente.comprar(precioVochoT));
			    }
			}else{ //Si no lo quiere tuneado 
			    System.out.println("Los Vochos los manejamos en el precio de 40,000 pesos");
			    double precioVocho = 40000;
			    //Si le alcanza al cliente es suyo el auto
			    if(dineroC >= 400000){
				System.out.println(cliente.comprar(precioVocho) + "\n" + v.vender(precioVocho, marcaC, modeloC, 2000, colorC));
			    }else{
				System.out.println(cliente.comprar(precioVocho));
			    }
			}
			break;
		    case 2: //CASO GOL
			modeloC = "Gol";
			//Preguntar el color
			System.out.println("¿De que color quieres tu gol?");
			colorC = strings.nextLine();
			System.out.println("Los Gol los manejamos en el precio de 150,000 pesos");
			double precioGol = 150000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 150000){
			    System.out.println(cliente.comprar(precioGol) + "\n" + v.vender(precioGol, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioGol));
			}
			break;
		    case 3: //CASO VENTO
			modeloC = "Vento";
			//Preguntar el color
			System.out.println("¿De que color quieres tu vento?");
			colorC = strings.nextLine();
			System.out.println("Los Vento los manejamos en el precio de 220,000 pesos");
			double precioVento = 220000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 220000){
			    System.out.println(cliente.comprar(precioVento) + "\n" + v.vender(precioVento, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioVento));
			}
			break;
		    case 4: //CASO GOLF
			modeloC = "Golf";
			//Preguntar el color
			System.out.println("¿De que color quieres tu golf?");
			colorC = strings.nextLine();
			System.out.println("Los Golf los manejamos en el precio de 200,000 pesos");
			double precioGolf = 200000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 200000){
			    System.out.println(cliente.comprar(precioGolf) + "\n" + v.vender(precioGolf, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioGolf));
			}
			break;
		    case 5: //CASO LUPO
			modeloC = "Lupo";
			//Preguntar el color
			System.out.println("¿De que color quieres tu lupo?");
			colorC = strings.nextLine();
			System.out.println("Los Lupo los manejamos en el precio de 80,000 pesos");
			double precioLupo = 80000;
			//Si le alcanza al cliente es suyo el auto
			if(dineroC >= 80000){
			    System.out.println(cliente.comprar(precioLupo) + "\n" + v.vender(precioLupo, marcaC, modeloC, 2021, colorC));
			}else{
			    System.out.println(cliente.comprar(precioLupo));
			}
			break;
		    default:
			System.out.println("Esa no es una opcion");
		    }
		    break;
		default:
		    System.out.println("Esa no es una opcion");
		}
		System.out.println(cliente.feliz());
		break;
	    case 2:     //En caso de querer rentar
		System.out.println("De acuerdo " + cliente.getNombre() + " "  + cliente.getApellido() + "\nEn esta agencia solamente manejamos 3 marcas de autos para rentar: \n 1. Kia \n 2. Toyota \n 3. Chevrolet");
		//Se solicita al usuario que elija la marca del coche que desea rentar
		System.out.println("\n Elija la marca de coche que desea rentar seleccionando el número asociado a este");
			//Se crea una variable para el precio de la renta por día del auto
		double precio;
		//Para la respuesta del usuario
		int respRenta = rentanum.nextInt();
		respRenta = Math.abs(respRenta); //Tomemos el valor absoluto
		switch(respRenta){
		    //Se muestran los autos existentes de la marca Kia
		case 1: System.out.println("\n Actualmente contamos sólo con dos ejemplares disponibles de esta marca para rentar");
		    //Auto uno de Kia
		    System.out.println("1.Primer ejemplar \n" + KiaRent2018.toString() + " (Por día de renta) \n");
		    //Auto 2 de Kia
		     System.out.println("2.Segundo ejemplar \n" + KiaRent2014.toString() + " (Por día de renta)");
		     //Se solicita al usuario que elija el auto a rentar
		     System.out.println("Elija el ejemplar que desea rentar escribiendo el número asociado a este");
	//Para la respuesta del usuario
		int autoRenta = rentanum.nextInt();
		autoRenta = Math.abs(autoRenta); //Tomemos el valor absoluto
	
		 System.out.println("Ingrese el número de días que desee rentar el automóvil");
		 //Se crea una variable para alamacenar la cantidad de días que el usuario rentará el auto
		 int dias= numeros.nextInt();
		 //Se abre una condicional donde se pregunta si el número de días a rentar es igual a 0
		 if(dias<=0){
		     //De cumplirse se coloca un mensaje en pantalla y salimos del switch
		     System.out.println("No se haga el chistoso, fuera de aquí");
		     break;

		 }
		 //Se solicita al usuario que dé su número de tarjeta
		 	System.out.println("Para poder continuar con el trámite necesito saber su numero de cuenta bancaria (De cuatro digitos): ");
			//Se asigna el valor dado por el usuario a la variable cuentaC
		cuentaC = numeros.nextInt();
		cliente.setNumCuenta(cuentaC); //Establece el numero de cuenta
		
		//Solicita el dinero disponible en la cuenta
		System.out.println("Ahora necesito saber cuanto dinero tiene: ");
		dineroC = numeros.nextInt();
		dineroC = Math.abs(dineroC); //Valor absoluto
		cliente.setDinero(dineroC); //Establece el dinero disponible
		//Se abre condicional donde los casos corresponden al ejemplar de auto a rentar elegido por el usuario
		if(autoRenta == 1){
		    //El precio será el valor del atributo "precio" del objeto de la clase auto
		     precio = KiaRent2018.getPrecio();
		     //Se llama al método rentar de la clase comprador y se imrpime en pantalla
		     System.out.println(cliente.rentar(dias, precio));
		}else if(autoRenta==2){
		     //El precio será el valor del atributo "precio" del objeto de la clase auto
		    precio = KiaRent2014.getPrecio();
		      //Se llama al método rentar de la clase comporador y se imrpime en pantalla
		    System.out.println(cliente.rentar(dias,precio));
		}else{
		    //Si el usuario elige un modelo que no está disponible sale un mensaje en pantalla expresando esto
		    System.out.println("Lo siento, sólo contamos con esos modelos y usted seleccionó un modelo con el que no contamos actualmente");
		}
		//El vendedor se despide
		System.out.println("Espero haber sido de ayuda, hasta luego");
		//Se abre una condicional donde el usuario se despide según su estado de ánimo
		 if(cliente.getEstadoAnimo()=="Feliz"){
             System.out.println(cliente.feliz());


	    }else{
		 System.out.println(cliente.enojado());

	    }
		break;
		//Caso donde se elige la marca TOYOTA
		case 2: System.out.println("\n Actualmente contamos sólo conun  ejemplar disponible de esta marca para rentar");
		    //Se modifica el precio del auto para que sea asequible en su renta
		    ToyotaPrius.setPrecio(4899.75);
		    //Auto único de Toyota
		    System.out.println("Ejemplar \n" + ToyotaPrius.toString() + " (Por día de renta) \n");
		  autoRenta = 1;
		    //Se solicita al usuario que indique cuántos días desea rentar el auto
		 System.out.println("Ingrese el número de días que desee rentar el automóvil");
		 //Se crea una variable para alamacenar la cantidad de días que el usuario rentará el auto
		 dias= numeros.nextInt();
		 //Se abre una condicional donde se pregunta si el número de días a rentar es igual a 0
		 if(dias<=0){
		     //De cumplirse se coloca un mensaje en pantalla y salimos del switch
		     System.out.println("No se haga el chistoso, fuera de aquí");
		     break;

		 }
		 //Se solicita al usuario que dé su número de tarjeta
		 	System.out.println("Para poder continuar con el trámite necesito saber su numero de cuenta bancaria (De cuatro digitos): ");
			//Se asigna el valor dado por el usuario a la variable cuentaC
		cuentaC = numeros.nextInt();
		cliente.setNumCuenta(cuentaC); //Establece el numero de cuenta
		
		//Solicita el dinero disponible en la cuenta
		System.out.println("Ahora necesito saber cuanto dinero tiene: ");
		dineroC = numeros.nextInt();
		dineroC = Math.abs(dineroC); //Valor absoluto
		cliente.setDinero(dineroC); //Establece el dinero disponible
		//Se abre condicional donde los casos corresponden al ejemplar de auto a rentar elegido por el usuario
		if(autoRenta == 1){
		    //El precio será el valor del atributo "precio" del objeto de la clase auto
		     precio = ToyotaPrius.getPrecio();
		     //Se llama al método rentar de la clase comprador y se imrpime en pantalla
		     System.out.println(cliente.rentar(dias, precio));
		
		}else{
		    //Si el usuario elige un modelo que no está disponible sale un mensaje en pantalla expresando esto
		    System.out.println("Lo siento, sólo contamos con esos modelos y usted seleccionó un modelo con el que no contamos actualmente");
		}
			//El vendedor se despide
		System.out.println("Espero haber sido de ayuda, hasta luego");
		//Se abre una condicional donde el usuario se despide según su estado de ánimo
		 if(cliente.getEstadoAnimo()=="Feliz"){
             System.out.println(cliente.feliz());


	    }else{
		 System.out.println(cliente.enojado());

	    }
		 break;
		 //Caso donde elige la marca Chevrolet
		case 3:  System.out.println("\n Actualmente contamos sólo con tres ejemplares disponibles de esta marca para rentar");
		    //Auto uno de Chevrolet
		    System.out.println("1.Primer ejemplar \n" + ChevroletRent2021.toString() + " (Por día de renta) \n");
		    //Auto 2 de Chevrolet
		     System.out.println("2.Segundo ejemplar \n" + ChevroletRent2010.toString() + " (Por día de renta)");
		     		    //Auto 3 de Chevrolet
		     System.out.println("\n3.Tercer ejemplar \n" + ChevroletRent1990.toString() + " (Por día de renta)");

		     //Se solicita al usuario que elija el auto a rentar
		     System.out.println("\nElija el ejemplar que desea rentar escribiendo el número asociado a este");
	//Para la respuesta del usuario
		 autoRenta = rentanum.nextInt();
		autoRenta = Math.abs(autoRenta); //Tomemos el valor absoluto
	
		 System.out.println("Ingrese el número de días que desee rentar el automóvil");
		 //Se crea una variable para alamacenar la cantidad de días que el usuario rentará el auto
		  dias= numeros.nextInt();
		 //Se abre una condicional donde se pregunta si el número de días a rentar es igual a 0
		 if(dias<=0){
		     //De cumplirse se coloca un mensaje en pantalla y salimos del switch
		     System.out.println("No se haga el chistoso, fuera de aquí");
		     break;

		 }
		 //Se solicita al usuario que dé su número de tarjeta
		 	System.out.println("Para poder continuar con el trámite necesito saber su numero de cuenta bancaria (De cuatro digitos): ");
			//Se asigna el valor dado por el usuario a la variable cuentaC
		cuentaC = numeros.nextInt();
		cliente.setNumCuenta(cuentaC); //Establece el numero de cuenta
		
		//Solicita el dinero disponible en la cuenta
		System.out.println("Ahora necesito saber cuanto dinero tiene: ");
		dineroC = numeros.nextInt();
		dineroC = Math.abs(dineroC); //Valor absoluto
		cliente.setDinero(dineroC); //Establece el dinero disponible
		//Se abre condicional donde los casos corresponden al ejemplar de auto a rentar elegido por el usuario
		if(autoRenta == 1){
		    //El precio será el valor del atributo "precio" del objeto de la clase auto
		     precio = ChevroletRent2021.getPrecio();
		     //Se llama al método rentar de la clase comprador y se imrpime en pantalla
		     System.out.println(cliente.rentar(dias, precio));
		}else if(autoRenta==2){
		     //El precio será el valor del atributo "precio" del objeto de la clase auto
		    precio = ChevroletRent2010.getPrecio();
		      //Se llama al método rentar de la clase comporador y se imrpime en pantalla
		    System.out.println(cliente.rentar(dias,precio));
		    }else if(autoRenta==3){
		     //El precio será el valor del atributo "precio" del objeto de la clase auto
		    precio = ChevroletRent1990.getPrecio();
		    
		      //Se llama al método rentar de la clase comporador y se imrpime en pantalla
		    System.out.println(cliente.rentar(dias,precio));
		}else{
		    //Si el usuario elige un modelo que no está disponible sale un mensaje en pantalla expresando esto
		    System.out.println("Lo siento, sólo contamos con esos modelos y usted seleccionó un modelo con el que no contamos actualmente");
		}
		//El vendedor se despide
		System.out.println("Espero haber sido de ayuda, hasta luego");
		//Se abre una condicional donde el usuario se despide según su estado de ánimo
		 if(cliente.getEstadoAnimo()=="Feliz"){
             System.out.println(cliente.feliz());


	    }else{
		 System.out.println(cliente.enojado());

	    }
		    
		    break;
 default:
			System.out.println("Esa no es una opción");
		
		//}
               
	    }	
		// default:
		//	System.out.println("Esa no es una opción");
	    }
	   
	    System.out.println("Estamos para servirle.");
	}else{
	    System.out.println("Escriba 1 o 2");
	}
    }
}
