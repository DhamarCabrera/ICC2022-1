/**
*@author Gil Axel GUtierrez Lara/Javier Alejandro Mancera Quiroz
*@version 1.0
**/
import java.util.Scanner;
public class AgenciaRUNRUN{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Vendedor v1= new Vendedor("Joaquin",2,0,"5590778945","joaquin_man@gmail.com");

      System.out.println(" ");

      //Vendedor da la bienvenida
      System.out.println("-----Bienvenido a la Agencia RUN RUN-----");
      System.out.println(" ");
      System.out.println("Le atiende su servidor "+ v1.getNombreV());
      System.out.println(" -> Por favor escriba su nombre para continuar");

      //Obtenemos datos del cliente
      String nombreU = sc.nextLine();
      Comprador comprador = new Comprador(nombreU,10);
      comprador.setNombre(nombreU);
      System.out.println(" ");
      System.out.println(" - ¡Mucho gusto! "+comprador.getNombre());
      

      //Vendedor ofrece varios autos sin dar a conocer sus caracteristicas
      Auto auto1 = new Auto("Elantra","rojo",2022,"standar",350000.1);
      Auto auto2 = new Auto("Bocho","azul",1990,"standar",400000.1);

      System.out.println(" ");
      System.out.println("Los autos disponibles en inventario son: "+ v1.getAutosDisponibles());
      System.out.println(" ");
      System.out.println(" 1 " + auto1.getNombreA());
      System.out.println(" 2 " + auto2.getNombreA());
      System.out.println(" ");
      System.out.println(" -> " + comprador.getNombre() + " Si le interesa alguno de estos autos, escriba a continuacion el -> numero correspondiente al auto <- de tu interes, de lo contrario escriba el numero 0");

      //Cliente Selecciona un auto de su interes o ninguno
      int eleccion = sc.nextInt();
      System.out.println(" ");
      
      //Vendedor da todas las caracteristicas del auto seleccionado
      switch(eleccion){
      case 0:
	   System.out.println(" - Gracias por visitar la agencia RUN RUN");
	   break;
      case 1:
	  System.out.println(auto1.toString());
	  break;
      case 2:
	  System.out.println(auto2.toString());
	  break;
      default:
	   System.out.println(" - Gracias por visitar la agencia RUN RUN");
      }
     
      //Cliente decide si comprarlo o no
      System.out.println(" ");
      System.out.println(" -> Si desesea comprar el auto, escriba 1; de lo contrario escriba 2");
      int compra = sc.nextInt();
      if(compra==1){
	  System.out.println(" ");
	  System.out.println(comprador.getNombre()+ " - ¡EXELENTE eleccion! Ha adquirido uno de nuestros mejores autos, muchas gracias por tu compra");
      }else{
	  System.out.println(" ");
	  System.out.println(" - Gracias por visitar la agencia RUN RUN");
      }
     
      
      //Vendedor realiza el cobro
      System.out.println("");
      System.out.println(" - " + comprador.getNombre() + " fue un placer haberlo recibido, gracias por habernos elegido.");

      //Pedir calificacion al cliente sobre la agencia
      System.out.println(" ");
      System.out.println(" -> Por último, le pediremos que califique nuestro servicio del 1 al 10:");
      int calif = sc.nextInt();
      comprador.setCalificacion(calif);
      System.out.println(" - Calificación del cliente: " + comprador.getCalificacion());    
      System.out.println(" ");
      System.out.println(" - Gracias por su calificación, asi podremos satisfacer mejor sus necesidades.");
      System.out.println(" ");
      System.out.println(" -> Para cualquier duda puede contactarme por: ");
      System.out.println("No. de celular = " + v1.getNumeroCel());
      System.out.println("Correo electrónico = " + v1.getCorreo());
      System.out.println(" ");
      System.out.println("-------¡Que tenga un excelente dia!-------");
  }
}
