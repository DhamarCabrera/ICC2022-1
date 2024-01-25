/**
 *clase principal de la agencia de ventas
 *@author Mares Horacio
 *version 1
 */
public class MainAutos{
    /**
     *metodo principal de la venta
     *@param args argumentos
     */
    public static void main(String[] args){
	System.out.print("Saludos en breve pondremos su estatus del auto");
	Auto auto = new Auto();
	
	System.out.println(auto.getColor());
	
	auto.setColor("color: rosa");
	System.out.println(auto.getColor());

	Auto tipo = new Auto();
	
	tipo.setTipo("tipo: deportivo");
	System.out.println(tipo.getTipo());

       	Auto modelo = new Auto();
	
	modelo.setModelo("modelo: Mada MX-5");
	System.out.println(modelo.getModelo());

       	Auto costo = new Auto();
	
	costo.setCosto("costo: 515,900");
	System.out.println(costo.getCosto());
        System.out.printl("tuneada extrea: 100,000");
	System.out.println("datos comrpador: ");

	Auto nombrec = new Auto();
	
	nombrec.setNombreC("Nombre: Alan");
	System.out.println(nombrec.getNombreC());

       	Auto costot = new Auto();
	
	costot.setTotal_pago("pago total: 615,900");
	System.out.println(costot.getTotal_pago());

	System.out.println("datos vendedor: ");

       	Auto nombre = new Auto();
	
	nombre.setNombre("nombre vendedor: Karolina");
	System.out.println(nombre.getNombre());

       	Auto sexo = new Auto();
	
	sexo.setSexo("sexo: femenino");
	System.out.println(sexo.getSexo());

       	Auto ventas = new Auto();
	
	ventas.setVentas("tipo: deportivo");
	System.out.println(tipo.getVentas());

	System.out.println("Gracias por escogernos son 100% legales los autos uwu");

    }
}
