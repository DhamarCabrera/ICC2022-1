import java.util.Scanner;
/**
 * Agencia represeta una Agencia de venta de autos.
 * En la cual se podra comprar un auto y se mostraran modelos de autos al usuario.
 * @author Dylan Enrique Juarez Martinez, Yoshua Isai Flores Santillan.
 * @version 1.0
 */
public class Agencia{
	public static void main(String[] args){
      Scanner preguntaMenu = new Scanner(System.in);
      boolean volverMenu = false; //valor para volver al menu principal
      do{ 
      System.out.println("════════════════════════ Bienvenido a la Agencia Dinamita ═══════════════════════════"); 
      System.out.println("Seleccione una opcion para continuar: ");
      System.out.println("\t" + "⇒" + " 1. Venta de autos.");
      System.out.println("\t" + "⇒" + " 2. Dejar  un comentario.");
      System.out.println("\t" + "⇒" + " 3. salir.");
      int opcion = preguntaMenu.nextInt();
      switch(opcion){
        case 1 : // opcion venta de autos.
        boolean volverVentaDeAutos = false; // valor para volver al menu de venta de autos.

        do{
        System.out.println("════════════════════════ Venta de autos ════════════════════════════════════════════");
        Scanner preguntaMenuPrincipal = new Scanner(System.in);
        System.out.println("Seleccione una opcion para continuar: ");
        System.out.println("\t" + "⇒" + " 1. comprar un auto.");
        System.out.println("\t" + "⇒" + " 2. Ver algunos autos disponible.");
        System.out.println("\t" + "⇒" + " 3. Salilr.");
        int opcionMenuPrincipal = preguntaMenu.nextInt();
        switch(opcionMenuPrincipal){
          case 1 :
          Scanner preguntaComprarAuto = new Scanner(System.in);
          Scanner preguntaComprarAuto2 = new Scanner(System.in);
          Scanner preguntaComprarAuto3 = new Scanner(System.in);
          Scanner preguntaComprarAuto4 = new Scanner(System.in);
          System.out.println("══════════════════════ Caracteristicas del auto ════════════════════════════╗");
          System.out.println("Introduce el modelo del auto que deseas comprar: ");
          String modelo = preguntaComprarAuto.nextLine(); 
          System.out.println("Introduce el año del auto que deseas comprar: ");
          int ano = preguntaComprarAuto.nextInt();
          System.out.println("Introduce el numero de llantas del auto que deseas comprar: "); 
          int llantas = preguntaComprarAuto2.nextInt();
          System.out.println("Introduce el numero de puertas del auto que deseas comprar: "); 
          int puertas = preguntaComprarAuto2.nextInt();
          System.out.println("Introduce el color del auto que deseas comprar: "); 
          String color = preguntaComprarAuto3.nextLine();
          System.out.println("Introduce la potencia del auto que deseas comprar: "); 
          double potencia = preguntaComprarAuto3.nextInt();
          System.out.println("Introduce el tamaño del auto que deseas comprar: Familiar / compacto / Camioneta / micro auto / limusina / deportivo");
          String tamano = preguntaComprarAuto4.nextLine();
          System.out.println("Introduce el precio esperado por el auto: ");
          double precio = preguntaComprarAuto4.nextDouble();
          System.out.println("════════════════════════════════════════════════════════════════════════════╝");
          Auto autoComprador = new Auto(modelo, ano, llantas, puertas, color, potencia, tamano, precio);
          System.out.println("Las Caracteristicas del auto que eligio son: ");
          System.out.println(autoComprador.toString());
          System.out.println("════════════════════════════════════════════════════════════════════════════╝");
          Scanner preguntaPagarAuto = new Scanner(System.in);
          System.out.println("¿Desea comprar este  auto? : si / no");
          String repuestaPagarAuto = preguntaPagarAuto.nextLine();
          if (repuestaPagarAuto.equals("si")) {
            System.out.println("══════════════════════ Paso por caja ═════════════════════════════════════╗");
            //datos de usuario
            Scanner datosCliente = new Scanner(System.in);
            Scanner datosCliente2 = new Scanner(System.in);
            System.out.println("Introduce tu nombre: ");
            String nombreCliente = datosCliente.nextLine();
            System.out.println("Introduce tu direccion: ");
            String direccionCliente = datosCliente.nextLine();
            System.out.println("Introduce la cantidad de dinero que tengas disponible: ");
            int dineroCliente = datosCliente2.nextInt();
            System.out.println("Introduce tu edad: ");
            int edadCliente = datosCliente2.nextInt();
            Cliente clienteCompra = new Cliente(nombreCliente,  direccionCliente,  dineroCliente,  edadCliente); 
            //datos del vendedor
            Scanner datosVendedor = new Scanner(System.in);
            System.out.println("Introduce el nombre del vendedor del auto: ");
            String nombreVendedor = datosVendedor.nextLine();
            System.out.println("Introduce numero de venta del auto: ");
            double numeroFactura = datosVendedor.nextInt();
            System.out.println("Introduce el precio real del auto: ");
            double costoReal = datosVendedor.nextDouble();
            Vendedor vendedorCompra = new Vendedor(nombreVendedor, numeroFactura, costoReal);
            System.out.println("════════════════════════════════════════════════════════════════════════════╝");
            //comparacion de precios.
            System.out.println("El precio esperado por el auto es de: ");
            System.out.println("\t" + "⇒" + " $ " + autoComprador.obtenerPrecio());
            System.out.println("El precio real  del auto es de: ");
            System.out.println("\t" + "⇒" + " $ " + vendedorCompra.getCostoAuto());
            System.out.println("El dinero disponible del cliente: ");
            System.out.println("\t" + "⇒" + " $ " + clienteCompra.getDineroDisponible());
            if(vendedorCompra.getCostoAuto() > clienteCompra.getDineroDisponible()){
              System.out.println("Dinero insuficiente para realizar la compra");   
            }else if(vendedorCompra.getCostoAuto()  < clienteCompra.getDineroDisponible()){
              System.out.println("══════════════════════ Factura ═════════════════════════════════════╗");
              double cambio = clienteCompra.getDineroDisponible() - vendedorCompra.getCostoAuto();   
              System.out.println(clienteCompra.toString());
              System.out.println(vendedorCompra.toString());
              System.out.println("Dinero restante: " + " $ " + cambio );
              System.out.println("════════════════════════════════════════════════════════════════════╝");

            }else{ 
              System.out.println("══════════════════════ Factura ═════════════════════════════════════╗");  
              System.out.println(clienteCompra.toString());
              System.out.println(vendedorCompra.toString());
              System.out.println("Dinero restante: " + " $ " + "0");
              System.out.println("════════════════════════════════════════════════════════════════════╝");               
            }
             //pregunta para volver al menu comprar autos.
             Scanner preguntaSalidaVenta = new Scanner(System.in);
             System.out.println("¿Desea volver al menu venta de autos?: si / no");
             String respuestaSalidaVenta = preguntaSalidaVenta.nextLine();
             if (respuestaSalidaVenta.equals("si")) {
          	  volverVentaDeAutos = false;
             }else if(respuestaSalidaVenta.equals("no")){
              volverVentaDeAutos = true; 
             }else{System.out.println("no repondiste a la pregutan."); System.exit(0);}

          }else if(repuestaPagarAuto.equals("no")){

          	//pregunta para volver al menu comprar autos.
            Scanner preguntaSalidaVenta = new Scanner(System.in);
            System.out.println("¿Desea volver al menu venta de autos?: si / no");
            String respuestaSalidaVenta = preguntaSalidaVenta.nextLine();
            if (respuestaSalidaVenta.equals("si")) {
          	  volverVentaDeAutos = false;
            }else if(respuestaSalidaVenta.equals("no")){
              volverVentaDeAutos = true; 
            }else{System.out.println("no repondiste a la pregutan."); System.exit(0); }
 

            
          }else{System.out.println("no repondiste a la pregutan.");} 


          break; // finaliza la opcion comprar auto


          

          case 2 : // opcion ver algunos autos disponibles
          Auto automuestra1 = new Auto("Nissan", 2003, 4 , 3, "azul marino", 900 ,"Familiar", 92000);
          Auto automuestra2 = new Auto("Sturu", 2005, 4, 4, "negro elegante", 850, "compacto", 70000);
          Auto automuestra3 = new Auto("chevrolet" , 2009, 2, 2, "blanco", 650, "micro auto", 50000);
          Auto automuestra4 = new Auto("cheney", 1998, 4, 2, "gris claro", 700, "Camioneta", 100000);
          Auto automuestra5 = new Auto("Lincoln" , 2000, 4, 6, "negro", 550, "limusina", 150000);
          Auto automuestra6 = new Auto("Ferrari", 2010, 4, 2, "rojo", 1200, "deportivo", 2000000);
          Scanner preguntaCatalogo = new Scanner(System.in);
          System.out.println("══════════════════════ Algunos autos disponibles ════════════════════════════╗");
          System.out.println("catalogo de autos: ");
          System.out.println("\n");
          System.out.println(automuestra1.toString());
          System.out.println("\n");
          System.out.println(automuestra2.toString());
          System.out.println("\n");
          System.out.println(automuestra3.toString());
          System.out.println("\n");
          System.out.println(automuestra4.toString());
          System.out.println("\n");
          System.out.println(automuestra5.toString());
          System.out.println("\n");
          System.out.println(automuestra6.toString()); 
          System.out.println("═════════════════════════════════════════════════════════════════════════════╝");
          //pregunta para volver al menu comprar autos.
            Scanner preguntaSalidaVenta = new Scanner(System.in);
            System.out.println("¿Desea volver al menu venta de autos?: si / no");
            String respuestaSalidaVenta = preguntaSalidaVenta.nextLine();
            if (respuestaSalidaVenta.equals("si")) {
              volverVentaDeAutos = false;
            }else if(respuestaSalidaVenta.equals("no")){
              volverVentaDeAutos = true; 
            }else{System.out.println("no repondiste a la pregutan."); System.exit(0);}
 
           
          break;//finaliza el caso 2 que es ver algunos autos disponibles.

          case 3 : // opcion salir
          System.exit(0); //cierra el programa.

          default :
          System.out.println("La opcion que introduciste no corresponde a ninguna del menu");

          
          }
          
        


        } while(!volverVentaDeAutos);


        break; //finaliza el caso 1 que es venta de autos 
        //fin de la opcion venta de autos.
        

        case 2 : // Agregar un comentario
        System.out.println("════════════════════════ Comentario ═══════════════════════════════════════════════════");
        Scanner comentario = new Scanner(System.in);
        System.out.println("Escribe tu comentario sobre la aplicacion: ");
        String repuesta = comentario.nextLine();
        System.out.println("Tu comentario fue : ");
        System.out.println("\t" + "⇒ " + repuesta.toUpperCase());
        System.out.println("Gracias por tu comentario!!!");
        Scanner preguntaSalida = new Scanner(System.in);
        System.out.println("¿Desea volver al menu principal?: si / no ");
        String repuestaSalida = preguntaSalida.nextLine();
        if(repuestaSalida.equals("si")){	
           volverMenu = false; 
        }else if(repuestaSalida.equals("no")){
           volverMenu = true;   
        }else{System.out.println("no repondiste a la pregutan."); System.exit(0);}
        
        break;//finaliza el caso 2 que es agregar un comentario.

        case 3 : // salir del programa.
        System.exit(0);// cierra el programa.

        default :
        System.out.println("La opcion que introduciste no corresponde a ninguna del menu");

      	}

        

      
       }while(!volverMenu);






	}
}