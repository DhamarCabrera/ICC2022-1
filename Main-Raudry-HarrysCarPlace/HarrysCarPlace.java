public class HarrysCarPlace{
    public static void main(String[] args){
	
	Auto autos[] = new Auto[6];
	autos[0] = new Auto("DeLorean", "Plateado","1982", 200000);
	autos[1] = new Auto("KITT", "Negro", "1982", 150000);
	autos[2] = new Auto("Tsuru", "Arcoiris", "2001", 430000);
	autos[3] = new Auto("Tractor de combate", "Violeta", "1969", 500000);
	autos[4] = new Auto("HomeroMovil", "Verde", "1991", 190000);
	autos[5] = new Auto();

	Auto autosB[] = new Auto[7];
	autosB[0] = new Auto("Vocho", "Amarillo","1976", 200000);
	autosB[1] = new Auto("Plymouth Fury", "Rojo", "1958", 150000);
	autosB[2] = new Auto("Tesla de Magna", "Azul", "1977", 430000);
	autosB[3] = new Auto("Tsuru tuneado", "Azul menta", "2003", 500000);
	autosB[4] = new Auto();
	autosB[5] = new Auto("AutoCar", "Rojo", "2006", 14000);
	autosB[6] = new Auto();


	Auto autosC[] = new Auto[4];
	autosC[0] = new Auto("4x4 Fisher Price", "Naranja", "1985", 594594);
	autosC[1] = new Auto("Triciclo Apache", "Amarillo", "2003", 12000);
	autosC[2] = new Auto("Patines de los polinesios", "Rosa", "2020", 5000);
	autosC[3] = new Auto("Hotwheels Batman", "Azul", "2007", 10000);
	
	Vendedor v1 = new Vendedor("Pedrito", autos);
	Vendedor v2 = new Vendedor("Martina", autosB);
	Vendedor v3 = new Vendedor("Raymundo", autosC);

	v1.setNombre("Angel");
	
        Comprador c1 = new Comprador("Estela", 5000000, 10);
	Comprador c2 = new Comprador("Diego", 10000000, 3);
	Comprador c3 = new Comprador("Alfredo", 6000000, 5);

	System.out.println("----------------------------------------");
	System.out.println("---Bienvenido a Harry's Car Place---");
	
	System.out.println("/////////////");
	System.out.println("Primer Comprador: ");
	System.out.println("/////////////");
	System.out.println("Nombre del comprador: " + c1.getNombre());
	System.out.println("Dinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	c1.comprarAuto(autos[0]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	c1.comprarAuto(autos[1]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	c1.comprarAuto(autos[1]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());

	c1.comprarAuto(autos[2]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());

	c1.comprarAuto(autos[3]);
	System.out.println("\n\nDinero actual de " + c1.getNombre() + ": $" + c1.getDinero());
	
	System.out.print("\n");
	
	c1.mostrarAutosEnPosesion();


	System.out.println("\n\n");
	System.out.println("///////////");
	System.out.println("Segundo comprador: ");
	System.out.println("/////////////");
	System.out.println("Nombre del comprador: " + c2.getNombre());
	System.out.println("Dinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	c2.comprarAuto(autosB[0]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	c2.comprarAuto(autosB[1]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	c2.comprarAuto(autosB[2]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());

	c2.comprarAuto(autosB[3]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());

	c2.comprarAuto(autosB[4]);
	System.out.println("\n\nDinero actual de " + c2.getNombre() + ": $" + c2.getDinero());
	
	System.out.print("\n");
	
	c2.mostrarAutosEnPosesion();

	System.out.println("\n\n");
	System.out.println("///////////");
	System.out.println("Tercer comprador: : ");
	System.out.println("/////////////");
	System.out.println("Nombre del comprador: " + c3.getNombre());
	System.out.println("Dinero actual de " + c3.getNombre() + ": $" + c3.getDinero());
	c3.comprarAuto(autosB[3]);
	System.out.println("\n\nDinero actual de " + c3.getNombre() + ": $" + c3.getDinero());
	c3.comprarAuto(autosB[4]);
	System.out.println("\n\nDinero actual de " + c3.getNombre() + ": $" + c3.getDinero());
	
	System.out.print("\n");
	
	c3.mostrarAutosEnPosesion();

	System.out.println("\n=====Rendimiento de los vendedores:=====\n");
	System.out.println(v1.toString());
	System.out.println(v2.toString());
	System.out.println(v3.toString());
	
	System.out.println("\n#################\n"+"Empleado del mes: " + v1.empleadoDelMes(v1, v2, v3) + "\n#################\n");
	System.out.println("\n#################\n"+"Empleado a despedir este mes: " + v1.proximoDespido(v1, v2, v3) + "\n#################\n");

    }
}
