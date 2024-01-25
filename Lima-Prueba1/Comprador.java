public class Comprador{
    //Atributos
    String nombre;
    int dinDis;

    //Método constructor
    public Comprador(String nombre,int dinDis){
	this.nombre = nombre;
	this.dinDis = dinDis;
    }
    //Método para obtener el dinero disponible
    public int Disp(){
	return dinDis;
    }
}
