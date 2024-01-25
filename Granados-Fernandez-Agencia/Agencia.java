import java.util.Scanner;

/**
 * Clase Agencia clase que simula una agencia de autos
 * 
 * @author Melissa Fernández
 * @author Jose Pablo Granados
 * @version 1.0
 */
public class Agencia {

    public static void main(String[] args) {

        String nombre = "El koala"; // El nombre de la agencia
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor("Josue");
        Vendedor vendedor3 = new Vendedor("Mario");
        Auto auto1 = new Auto(nombre, "KSJ", "mediano", "blanco");
        Auto auto2 = new Auto(nombre, "JHS", "deportivo", "negro");
        Auto auto3 = new Auto(nombre, "JJK", "de lujo", "lila");
        Auto auto4 = new Auto(nombre, "KNJ", "mediano", "azul");
        Auto auto5 = new Auto(nombre, "KTH", "mediano", "rojo");
        Cliente cliente1 = new Cliente("Alejandro", "Rosas", "Diaz");
        Cliente cliente2 = new Cliente("Mariana", "Casas", "Fuentes");
        Cliente cliente3 = new Cliente("Diana", "Islas", "Santiago");
        //Asignar un número a los vendedores
        vendedor1.setNoVendedor(1234);
        vendedor2.setNoVendedor(1235);
        vendedor3.setNoVendedor(1237);

        // Dar bienvenida y preguntar qué hacer
        System.out.println("Bienvenid@ a la agencia" + nombre);
        System.out.println("¿Qué quieres hacer?(imgresa el numero)");
        System.out.println("1) Ver autos");
        System.out.println("2) Comprar auto");
        System.out.println("3) Salir");
        Scanner scan = new Scanner(System.in);// Hacer Scanner
        Scanner newscan = new Scanner(System.in);
        int respuesta = newscan.nextInt();// Leer la respuesta del usuario

        switch (respuesta) {
        case 1:
            System.out.println(vendedor1.presentarse()); //El vendedor se presenta
            System.out.println(vendedor1.ofrecer(auto1, auto2, auto3, auto4, auto5));//El vendedor ofrece los modelos de auto disponibles.
            String respuesta1 = scan.nextLine(); //Leer la respuesta del usuario
            respuesta1= respuesta1.toUpperCase().trim(); //a mayusculas y sin espacios

            Auto nuevoAuto;
            //Condicional dependiendo del modelo que elija el usuario
            if (respuesta1.equals(auto1.getModelo())){
                nuevoAuto = auto1;
            }else if (respuesta1.equals(auto2.getModelo())){
                nuevoAuto = auto2;
            }else if (respuesta1.equals(auto3.getModelo())){
                nuevoAuto = auto3;
            }else if (respuesta1.equals(auto4.getModelo())){
                nuevoAuto = auto4;
            }else if (respuesta1.equals(auto5.getModelo())){
                nuevoAuto = auto5;
            }else {
                System.out.println(vendedor1.sinModelo());
                nuevoAuto=auto1;
                System.exit(0);
            }

            System.out.println(vendedor1.color(nuevoAuto) + " " + vendedor1.deAcuerdo()); //Vendedor da a conocer el color disponible del auto y pregunta al usuario si está de acuerdo.
                String respuesta2 = scan.nextLine();//leer respuesta
                respuesta2=respuesta2.toLowerCase().trim();//a minúsculas y sin espacios
                switch (respuesta2){
                    case "si":
                        String tipoAuto = nuevoAuto.getTipoAuto(); //El tipo de auto
                        double costo;
                        if (tipoAuto.equals("de lujo")){
                            costo = nuevoAuto.getCosto() * 3; 
                        }else if (tipoAuto.equals("deportivo")){
                            costo = nuevoAuto.getCosto();
                        }else{
                            costo = nuevoAuto.getCosto();
                        }
                        nuevoAuto.setCosto(costo); //Se asigna el costo del auto dependiendo del tipo de auto que sea
                        System.out.println("\n**Características de su auto**");
                        System.out.println(nuevoAuto); //Se muestran las características del auto
                        System.out.println(vendedor1.servicio());//Vendedor pregunta si el servicio ha sido bueno
                        String response = scan.nextLine();
                        response = response.toLowerCase().trim();
                        if (response.equals("si")){
                            vendedor1.aplicarDescuento(nuevoAuto);
                        }
                        System.out.println(vendedor1.precio(nuevoAuto));
                        System.out.println(vendedor1.avisoTramite());
                        break;

                    case "no":
                        System.out.println(vendedor1.preguntarColor());//El vendedor pregunta el color deseado
                        String respuesta3 = scan.nextLine();//leer respuesta
                        System.out.println(vendedor1.pedirAuto(respuesta3, nuevoAuto)); //El vendedor asigna el nuevo color del auto y avisa que el auto llegará pronto. También da a conocer el precio del auto.
                        System.out.println(vendedor1.servicio());//Vendedor pregunta si el servicio ha sido bueno
                        String response1 = scan.nextLine();
                        response1 = response1.toLowerCase().trim();
                        //Si el usuario responde que el servicio es bueno, el vendedor aplica un descuento
                        if (response1.equals("si")){ 
                            vendedor1.aplicarDescuento(nuevoAuto);
                            System.out.println("Se le aplicará un descuento.");
                        }
                        System.out.println("\n**Características de su auto**");
                        System.out.println(nuevoAuto);
                        System.out.println(vendedor1.avisoTramite());
                        break;
                    
                    default:
                        System.out.println("Respuesta no válida");
                        break;
                        
                    
                    
                    
                }
            break;
        case 2:
            System.out.println(vendedor2.presentarse());
            System.out.println(vendedor2.modeloAComprar());
            String respuesta4 = scan.nextLine();
            respuesta4 = respuesta4.toUpperCase().trim();

            Auto newAuto;
            //Condicional dependiendo del modelo que elija el usuario
            if (respuesta4.equals(auto1.getModelo())){
                newAuto = auto1;
            }else if (respuesta4.equals(auto2.getModelo())){
                newAuto = auto2;
            }else if (respuesta4.equals(auto3.getModelo())){
                newAuto = auto3;
            }else if (respuesta4.equals(auto4.getModelo())){
                newAuto = auto4;
            }else if (respuesta4.equals(auto5.getModelo())){
                newAuto = auto5;
            }else {
                System.out.println(vendedor2.sinModelo());
                newAuto = auto1;
                System.exit(0);
            }

            System.out.println(vendedor2.preguntarColor());
            String color= scan.nextLine();
            newAuto.setColor(color);

            double aPagar;
            String tipoAuto = newAuto.getTipoAuto();
            if (tipoAuto.equals("de lujo")){
                aPagar = newAuto.getCosto() * 3; 
            }else if (tipoAuto.equals("deportivo")){
                aPagar = newAuto.getCosto();
            }else{
                aPagar = newAuto.getCosto();
            }

            System.out.println(vendedor2.servicio());
            respuesta4 = scan.nextLine();
            if (respuesta4.equals("si")){
                aPagar = aPagar - 30000;
            }
            newAuto.setCosto(aPagar);

            System.out.println(vendedor2.pedirDatos());
            String nombreCliente = scan.nextLine();
            String apellido1= scan.nextLine();
            String apellido2= scan.nextLine();

            Cliente cliente4 = new Cliente(nombreCliente, apellido1, apellido2);
            cliente4.setNoCliente(12345);
            cliente4.setFormaPago("tarjeta");
            cliente4.setImporte(aPagar);
            cliente4.setAuto(newAuto);
            cliente4.setAdquisicion(1);

            System.out.println(vendedor2.ticket(cliente4));


            


            break;
        case 3:
            System.out.println("Saliendo");
            break;
        default:
            System.out.println("Respuesta inválida. Por favor vuelve a iniciar el programa.");
        }
        

    }

}
