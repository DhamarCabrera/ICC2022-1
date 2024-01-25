/**
 *@author Fernando Mendoza Eslava
 *@version 1.0
 *Clase ejecutable que permite al usuario comprar o vender un auto
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Agencia {
    public static void main(String[] args) {
        //Es el nombre del usuario
        String nombre;
        int auto;
        //variable que dependiendo su valor da al usuario la opcion de comprar o vender
        int venta;
        int estandar = 140000;
        String vender;
        String marca;
        //Es la clave del usuario necesaria para confirmar transacciones
        int clave, clave1, clave2, clave3;
        Boolean deacuerdo;
        //son los datos que el vendedor de un auto brinda para darle una cotizacion
        int km, año;
        //creamos un escaner para que el usuario ingrese sus datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la compañia M");
        System.out.println("ingrese su nombre");
        //invocamos el escaner para que el usuario ingrese su nombre      
        nombre = sc.next();
        System.out.println("nombre del cliente: " + nombre);
        System.out.println("genere una clave numerica para confirmar su registro");
        //invocamos el escaner para que el usuario genere una clave      
        clave = sc.nextInt();
        System.out.println("Su clave es: " + clave);
        System.out.println("registro exitoso");
        System.out.println("Si desea vender escriba: 1, Si desea comprar escriba: 2");
        //invocamos el escaner para que el usuario elija si desea vender o comprar
        venta = sc.nextInt();
        //Si el usuario decide vender se le presenta un formato para que ingrese los datos de su auto  
        if (venta == 1) {
            Cliente Usuario1 = new Cliente();
            System.out.println("Formato para cotización de la compra");
            System.out.println("ingrese el kilometraje de su vehiculo");
            //invocamos el escaner para que el usuario ingrese el kilometraje
            km = sc.nextInt();
            Usuario1.setKilometraje(km);
            System.out.println("ingrese el año del vehiculo");
            //invocamos el escaner para que el usuario ingrese el año del producto
            año = sc.nextInt();
            Usuario1.setAño(año);
            //Realizamos la cotizacion segun el kilometraje y el año del vehiculo, aplicandolos al valor estandar de un auto
            System.out.println("su auto esta cotizado en un valor de: " + ((((año - 2021) * 1000) + ((20000 - km) * 0.00001) * 270000) * 0.1 + estandar) + " pesos");
            System.out.println("esta usted de acuerdo con la oferta que le ofrece la agencia: |true| |false|");
            //invocamos el escaner para que el usuario decida si esta deacuerdo con la cotizacion
            deacuerdo = sc.nextBoolean();
            if (deacuerdo == true) {
                System.out.println("gracias por su preferencia " + nombre);
            }
            if (deacuerdo == false) {
                System.out.println(nombre + "lamentamos no poder ofrecer una oferta deacuerdo a sus intereses");
            }
            //Si el usuario decide comprar se le presenta un catalogo con los autos de la agencia
        } else {
            System.out.println("Bienvenido al menu de compra");
            System.out.println("Contamos con los siguientes automoviles: ");
            //Se muestran los datos del auto de la marca Volkswagen
            Autos Volkswagen = new Autos();
            System.out.println("De la marca Volkswagen:");
            System.out.println("Marca: " + Volkswagen.getMarca());
            System.out.println("Color: " + Volkswagen.getColor());
            System.out.println("Matricula: " + Volkswagen.getMatricula());
            System.out.println("Modelo: " + Volkswagen.getModelo());
            System.out.println("Disponible: " + Volkswagen.getDisponible());
            //Se muestran los datos del auto de la marca Kia
            Autos Kia = new Autos();
            System.out.println("De la marca Kia:");
            Kia.setMarca("Kia fiesta");
            System.out.println("Marca: " + Kia.getMarca());
            Kia.setColor("Rojo");
            System.out.println("Color: " + Kia.getColor());
            Kia.setMatricula("K21r");
            System.out.println("Matricula: " + Kia.getMatricula());
            Kia.setModelo(2021);
            System.out.println("Modelo: " + Kia.getModelo());
            Kia.setDisponible(true);
            System.out.println("Disponible: " + Kia.getDisponible());
            //Se muestran los datos del auto de la marca Chevrolet
            Autos Camaro = new Autos();
            System.out.println("De la marca Chevi:");
            Camaro.setMarca("Chevrolet Camaro");
            System.out.println("Marca " + Camaro.getMarca());
            Camaro.setColor("Amarillo");
            System.out.println("Color: " + Camaro.getColor());
            Camaro.setMatricula("CHC21a");
            System.out.println("Matricula: " + Camaro.getMatricula());
            Camaro.setModelo(2021);
            System.out.println("Modelo: " + Camaro.getModelo());
            Camaro.setDisponible(true);
            System.out.println("Disponible: " + Camaro.getDisponible());

            System.out.println("Si desea comprar el Volkswagen escriba 1, si desea comprar el Kia escriba 2, si desea comprar el Camaro escriba 3, si desea salir de la agencia, escriba otro numero");
            //invocamos el escanner para que el usuario decida que auto quiere comprar
            auto = sc.nextInt();
            if (auto == 1) {
                System.out.println("contamos con la siguiente promoción: ");
                //Se muestra el plan de venta para el Volkswagen 
                Vendedor Vendedor = new Vendedor();
                System.out.println("Marca: " + Vendedor.getCosto());
                System.out.println("Color: " + Vendedor.getPlan());
                System.out.println("Matricula: " + Vendedor.getSeguro());
                System.out.println("Modelo: " + Vendedor.getDonativo());
                System.out.println("si desea realizar la compra, ingrese su clave para continuar, en caso contrario ingrese otro numero");
                //invocamos el escanner para que el usuario ingrese su clave para confirmar su compra o salga del menu
                clave1 = sc.nextInt();
                if (clave1 == clave) {
                    DateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
                    System.out.println("gracias por su preferencia " + nombre);
                    System.out.println("Fecha de adquisicion: " + formato.format(new Date()));
                } else {
                    System.out.println(nombre + " la clave ingresada es incorrecta, lamentamos no contar con un producto de su agrado");
                }
            }
            if (auto == 2) {
                System.out.println("contamos con la siguiente promoción: ");
                //Se muestra el plan de venta para el Kia 
                Vendedor Vendedor1 = new Vendedor();
                System.out.println("Costo: " + Vendedor1.getCosto());
                Vendedor1.setCosto(100000);
                System.out.println("Plan de pago: " + Vendedor1.getPlan());
                Vendedor1.setPlan(24);
                System.out.println("seguro: " + Vendedor1.getSeguro());
                Vendedor1.setSeguro(true);
                System.out.println("Donativo: " + Vendedor1.getDonativo());
                Vendedor1.setDonativo(true);
                System.out.println("si desea realizar la compra, ingrese su clave para continuar, en caso contrario ingrese otro numero");
                //invocamos el escanner para que el usuario ingrese su clave para confirmar su compra o salga del menu
                clave2 = sc.nextInt();
                if (clave2 == clave) {
                    DateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
                    System.out.println("gracias por su preferencia " + nombre);
                    System.out.println("Fecha de adquisicion: " + formato.format(new Date()));
                } else {
                    System.out.println(nombre + " la clave ingresada es incorrecta, lamentamos no contar con un producto de su agrado");
                }
            }
            if (auto == 3) {
                System.out.println("contamos con la siguiente promoción: ");
                //Se muestra el plan de venta para el Chevrolet camaro 
                Vendedor Vendedor2 = new Vendedor();
                System.out.println("Costo: " + Vendedor2.getCosto());
                Vendedor2.setCosto(100000);
                System.out.println("Plan de pago: " + Vendedor2.getPlan());
                Vendedor2.setPlan(24);
                System.out.println("seguro: " + Vendedor2.getSeguro());
                Vendedor2.setSeguro(true);
                System.out.println("Donativo: " + Vendedor2.getDonativo());
                Vendedor2.setDonativo(true);
                System.out.println("si desea realizar la compra, ingrese su clave para continuar, en caso contrario ingrese otro numero");
                //invocamos el escanner para que el usuario ingrese su clave para confirmar su compra o salga del menu
                clave3 = sc.nextInt();
                if (clave3 == clave) {
                    DateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
                    System.out.println("gracias por su preferencia " + nombre);
                    System.out.println("Fecha de adquisicion: " + formato.format(new Date()));
                } else {
                    System.out.println(nombre + " la clave ingresada es incorrecta, lamentamos no contar con un producto de su agrado");
                }
            }

        }
    }
}
