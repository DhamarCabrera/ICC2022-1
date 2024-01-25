/**
*@author Juan Luis Rivera Ibarra
*@version 1.3
*/
import java.util.ArrayList;
import java.util.Scanner;

/**
*Clase Agencia
*Programa que simula la operacion y administracion de una agencia de autos
*@since 1.0
*/
public class Agencia{
  /**
  *Metodo main, el cual es forzoso y lleva  acabo la ejecucion del programa
  */
  public static void main(String[] args){
    //Crea el arreglo de objetos de la clase Auto
    ArrayList<Auto> autos = new ArrayList<>();

    //Crea el arreglo de objetos de la clase Vendedor
    ArrayList<Vendedor> vendedores = new ArrayList<>();

    //Crea el arreglo de objetos de la clase Comprador
    ArrayList<Comprador> compradores = new ArrayList<>();

    //Se crea
    Scanner input = new Scanner(System.in);

    int menu0 = -1;

    System.out.println("Escoge una opcion numerica del 0 al 5 para elegir la lista sobre la cual añadir/modificar/eliminar/buscar informacion: \n");
    System.out.println("Compradores (1): \n");
    System.out.println("Vendedores (2): \n");
    System.out.println("Automoviles (3): \n");
    System.out.println("Terminar programa (4): \n");
    System.out.println("Realizar venta (5): \n");
    System.out.println("Volver a mostrar este menu (0): \n");

    do {
      if (menu0 != -1) {
        System.out.println("\nEscoge una opcion numerica del 0 al 5 para elegir la lista sobre la cual añadir/modificar/eliminar/buscar/imprimir informacion: \n");
      }
      menu0 = input.nextInt();

      //Se selecciono trabajar en la lista de Compradores
      if (menu0 == 1){

        System.out.println("\nEscoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Compradores: \n");
        System.out.println("Añadir (1): \n");
        System.out.println("Modificar (2): \n");
        System.out.println("Eliminar (3): \n");
        System.out.println("Buscar (4): \n");
        System.out.println("Imprimir lista (5): \n");
        System.out.println("Regresar al menu principal (6): \n");
        System.out.println("Volver a mostrar este menu (0): \n");

        int op = -1;

        do {
          if (op != -1) {
	      System.out.println("\nEscoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Compradores: \n");
          }
	  
          op = input.nextInt();
	  input.nextLine();
	  
          //Añadir
          if (op == 1) {
	      System.out.println("\nIngresa el nombre del comprador: \n");
	      String nombre = input.nextLine();
	      
	      System.out.println("\nIngresa el dinero del comprador: \n");
	      double dinero = input.nextDouble();
	      input.nextLine();
	      //Crea y agrega el nuevo objeto comprador a la lista
	      compradores.add(new Comprador(nombre, dinero));
	      
          }

          //Modificar
          if (op == 2) {
	      
	      System.out.println("\nIngresa el numero referente a la posicion del comprador a modificar en la lista de compradores: \n");

	      int lugar = input.nextInt();
	      input.nextLine();
	      
	      System.out.println("\nIngresa el nombre del comprador: \n");
	      String nombre = input.nextLine();
	      
	      System.out.println("\nIngresa el dinero del comprador: \n");
	      double dinero = input.nextDouble();
	      input.nextLine();

	      compradores.set(lugar, new Comprador(nombre, dinero));
	    
          }

          //Eliminar
          if (op == 3) {

	      System.out.println("\nIngresa el numero referente a la posicion del comprador a modificar en la lista de compradores: \n");

	      int lugar = input.nextInt();
	      input.nextLine();

	      compradores.remove(lugar);

	      
          }

          //Buscar
          if (op == 4) {

	      System.out.println("\nIngresa el nombre del comprador: \n");
	      String nombre = input.nextLine();

	      System.out.println("\nIngresa el dinero del comprador: \n");
	      double dinero = input.nextDouble();
	      input.nextLine();

            System.out.println("\n\n");

            Comprador compradoraux = new Comprador(nombre, dinero);
            boolean estaenlista = false;
            int i = 0;
            int cont = 0;

            for (Comprador comprador: compradores) {
		if (comprador.getNombre().equals(compradoraux.getNombre()) && comprador.getDinero()==compradoraux.getDinero()) {
                i = compradores.indexOf(comprador);
                cont ++;
                estaenlista = true;
                if (cont >= 1) {
                  System.out.println("\nLa conincidencia numero: " + cont + " se encuentra en la posicion: " + i + " de la lista de compradores.\n");
                }
              }
            }
            if (estaenlista) {

            }
            else {
              System.out.println("\nEl comprador no se encuentra en la lista de compradores.\n");
            }
	      
          }

          //Imprimir
          if (op == 5) {
            
            System.out.println("\n\n");
            for (Comprador comprador: compradores) {
                System.out.println(comprador);
                System.out.println("\n");
            }
          }

          //Menu
          if (op == 0) {
            System.out.println("Escoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Compradores: \n");
            System.out.println("Añadir (1): \n");
            System.out.println("Modificar (2): \n");
            System.out.println("Eliminar (3): \n");
            System.out.println("Buscar (4): \n");
	    System.out.println("Imprimir lista (5): \n");
            System.out.println("Regresar al menu principal (6): \n");
            System.out.println("Volver a mostrar este menu (0): \n");
          }

        } while (op != 6);

      }

      //Se selecciono trabajar en la lista de Vendedores
      if (menu0 == 2) {

        System.out.println("\nEscoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Vendedores: \n");
        System.out.println("Añadir (1): \n");
        System.out.println("Modificar (2): \n");
        System.out.println("Eliminar (3): \n");
        System.out.println("Buscar (4): \n");
        System.out.println("Imprimir lista (5): \n");
        System.out.println("Regresar al menu principal (6): \n");
        System.out.println("Volver a mostrar este menu (0): \n");

        int op = -1;

        do {
          if (op != -1) {
            System.out.println("\nEscoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Vendedores: \n");
          }

          op = input.nextInt();
          input.nextLine();

          //Añadir
          if (op == 1) {
            System.out.println("\nIngresa el nombre del vendedor: \n");
            String nombre = input.nextLine();
            System.out.println("\nIngresa el horario de entrada: \n");
            int entrada = input.nextInt();
            System.out.println("\nIngresa el horario de salida: \n");
            int salida = input.nextInt();
            input.nextLine();
            System.out.println("\nIngresa el salario: \n");
            double salario = input.nextDouble();

            //Crea y agrega el nuevo objeto auto a la lista
            vendedores.add(new Vendedor(nombre, entrada, salida, salario));
          }

          //Modificar
          if (op == 2) {
            System.out.println("\nIngresa el numero referente a la posicion del vendedor a modificar en la lista de vendedores: \n");

            int lugar = input.nextInt();
            input.nextLine();

            System.out.println("\nIngresa el nombre del vendedor: \n");
            String nombre = input.nextLine();

            System.out.println("\nIngresa el horario de entrada: \n");
            int entrada = input.nextInt();

            System.out.println("\nIngresa el horario de salida: \n");
            int salida = input.nextInt();
            input.nextLine();

            System.out.println("\nIngresa el salario: \n");
            double salario = input.nextDouble();

            vendedores.set(lugar, new Vendedor(nombre, entrada, salida, salario));
          }

          //Eliminar
          if (op == 3) {
            System.out.println("\nIngresa el numero referente a la posicion del vendedor a modificar en la lista de vendedores: \n");

            int lugar = input.nextInt();
            input.nextLine();

            vendedores.remove(lugar);
          }

          //Buscar
          if (op == 4) {
            System.out.println("\nIngresa el nombre del vendedor: \n");
            String nombre = input.nextLine();

            System.out.println("\nIngresa el horario de entrada: \n");
            int entrada = input.nextInt();

            System.out.println("\nIngresa el horario de salida: \n");
            int salida = input.nextInt();
            input.nextLine();

            System.out.println("\nIngresa el salario: \n");
            double salario = input.nextDouble();

            System.out.println("\n\n");

            Vendedor vendedoraux = new Vendedor(nombre, entrada, salida, salario);
            boolean estaenlista = false;
            int i = 0;
            int cont = 0;

            for (Vendedor vendedor: vendedores) {
              if (vendedor.toString().equals(vendedoraux.toString())) {
                i = vendedores.indexOf(vendedor);
                cont ++;
                estaenlista = true;
                if (cont >= 1) {
                  System.out.println("\nLa conincidencia numero: " + cont + " se encuentra en la posicion: " + i + " de la lista de vendedores.\n");
                }
              }
            }
            if (estaenlista) {

            }
            else {
              System.out.println("\nEl vendedor no se encuentra en la lista de vendedores.\n");
            }

          }

          //Imprimir
          if (op == 5) {
            System.out.println("\n\n");
            for (Vendedor vendedor: vendedores) {
                System.out.println(vendedor);
                System.out.println("\n");
            }
          }

          //Menu
          if (op == 0) {
            System.out.println("Escoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Vendedores: \n");
            System.out.println("Añadir (1): \n");
            System.out.println("Modificar (2): \n");
            System.out.println("Eliminar (3): \n");
            System.out.println("Buscar (4): \n");
	    System.out.println("Imprimir lista (5): \n");
            System.out.println("Regresar al menu principal (6): \n");
            System.out.println("Volver a mostrar este menu (0): \n");
          }

        } while (op != 6);

      }

      //Se selecciono trabajar en la lista de Automoviles
      if (menu0 == 3) {

        System.out.println("\nEscoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Automoviles: \n");
        System.out.println("Añadir (1): \n");
        System.out.println("Modificar (2): \n");
        System.out.println("Eliminar (3): \n");
        System.out.println("Buscar (4): \n");
        System.out.println("Imprimir lista (5): \n");
        System.out.println("Regresar al menu principal (6): \n");
        System.out.println("Volver a mostrar este menu (0): \n");

        int op = -1;

        do {
          if (op != -1) {
            System.out.println("\nEscoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Automoviles: \n");
          }

          op = input.nextInt();
          //Limpia el buffer (necesario hacer despues de cambiar el tipo de dato que recibe el scanner)
          input.nextLine();

          //Añadir
          if (op == 1) {
            System.out.println("\nIngresa la marca del automovil: \n");
            String marca = input.nextLine();

            System.out.println("\nIngresa el modelo del automovil: \n");
            String modelo = input.nextLine();

            System.out.println("\nIngresa el año del automovil: \n");
            int anio = input.nextInt();
            input.nextLine();

            System.out.println("\nIngresa el color del automovil: \n");
            String color = input.nextLine();

	    System.out.println("\nIngresa el precio del automovil: \n");
            double precio = input.nextDouble();
	    input.nextLine();

            System.out.println("\n\n");

            //Crea y agrega el nuevo objeto auto a la lista
            autos.add(new Auto(marca, modelo, anio, color, precio));
          }

          //Modificar
          if (op == 2) {
            System.out.println("\nIngresa el numero referente a la posicion del automovil a modificar en la lista de automoviles: \n");

            int lugar = input.nextInt();
            input.nextLine();

            System.out.println("\nIngresa la marca del automovil: \n");
            String marca = input.nextLine();

            System.out.println("\nIngresa el modelo del automovil: \n");
            String modelo = input.nextLine();

            System.out.println("\nIngresa el año del automovil: \n");
            int anio = input.nextInt();
            input.nextLine();

            System.out.println("\nIngresa el color del automovil: \n");
            String color = input.nextLine();

	    System.out.println("\nIngresa el precio del automovil: \n");
            double precio = input.nextDouble();

            autos.set(lugar, new Auto(marca, modelo, anio, color, precio));
          }

          //Eliminar
          if (op == 3) {
            System.out.println("\nIngresa el numero referente a la posicion del automovil en la lista de automoviles: \n");

            int lugar = input.nextInt();
            input.nextLine();

            autos.remove(lugar);
          }

          //Buscar
          if (op == 4) {

            System.out.println("\nIngresa la marca del automovil: \n");
            String marca = input.nextLine();

            System.out.println("\nIngresa el modelo del automovil: \n");
            String modelo = input.nextLine();

            System.out.println("\nIngresa el año del automovil: \n");
            int anio = input.nextInt();
            input.nextLine();

	    System.out.println("\nIngresa el color del automovil: \n");
            String color = input.nextLine();

	    System.out.println("\nIngresa el precio del automovil: \n");
            double precio = input.nextDouble();

            System.out.println("\n\n");

            Auto autoaux = new Auto(marca, modelo, anio, color, precio);
            boolean estaenlista = false;
            int i = 0;
            int cont = 0;

            for (Auto auto: autos) {
              if (auto.toString().equals(autoaux.toString())) {
                i = autos.indexOf(auto);
                cont ++;
                estaenlista = true;
                if (cont >= 1) {
                  System.out.println("\nLa conincidencia numero: " + cont + " se encuentra en la posicion: " + i + " de la lista de automoviles.\n");
                }
              }
            }
            if (estaenlista) {

            }
            else {
              System.out.println("\nEl automovil no se encuentra en la lista de automoviles.\n");
            }

          }

          //Imprimir
          if (op == 5) {
            System.out.println("\n\n");
            for (Auto auto: autos) {
                System.out.println(auto);
                System.out.println("\n");
            }
          }

          //Menu
          if (op == 0) {
            System.out.println("Escoge una opcion numerica del 0 al 6 para realizar alguna operacion sobre la lista de Automoviles: \n");
            System.out.println("Añadir (1): \n");
            System.out.println("Modificar (2): \n");
            System.out.println("Eliminar (3): \n");
            System.out.println("Buscar (4): \n");
	    System.out.println("Imprimir lista (5): \n");
            System.out.println("Regresar al menu principal (6): \n");
            System.out.println("Volver a mostrar este menu (0): \n");
          }

        } while (op != 6);

      }



      //Se selecciona realizar una venta
      if(menu0==5){
	  System.out.println("\nIngresa el numero referente a la posicion del comprador del automovil en la lista de compradores: \n");
	  int lugarComprador = input.nextInt();

	  System.out.println("\nIngresa el numero referente a la posicion del vendedor del automovil en la lista de vendedores: \n");
	  int lugarVendedor = input.nextInt();

	  System.out.println("\nIngresa el numero referente a la posicion del automovil que se va a vender en la lista de automoviles: \n");
	  int lugarAuto = input.nextInt();

	  if(compradores.get(lugarComprador).comprar(autos.get(lugarAuto))){
	      autos.remove(lugarAuto);
	      System.out.println("\nOperación completada\n");
	  }else{
	      System.out.println("\nNo se pude realizar la operación");
	      if(compradores.get(lugarComprador).getDinero() < autos.get(lugarAuto).getPrecio()){
		  System.out.println("El comprador no tiene suficiente dinero\n");
	      }else{
		  System.out.println("El comprador no tiene ningún espacio libre\n");
	      }
	  }
      }


      
      //Se selecciona reimprimir el menu principal
      if (menu0 == 0) {
        System.out.println("Escoge una opcion numerica del 0 al 5 para elegir la lista sobre la cual añadir/modificar/eliminar/buscar informacion: \n");
        System.out.println("Compradores (1): \n");
        System.out.println("Vendedores (2): \n");
        System.out.println("Automoviles (3): \n");
        System.out.println("Terminar programa (4): \n");
	System.out.println("Realizar venta (5): \n");
        System.out.println("Volver a mostrar el menu (0): \n");
      }

      //Se ingreso un valor de menu invalido
      if (menu0 > 5 || menu0 < 0) {
        System.out.println("La opcion ingresada es invalida, ingrese un valor numerico valido\n");
      }

    } while (menu0 != 4);

    input.close();
  }
}
