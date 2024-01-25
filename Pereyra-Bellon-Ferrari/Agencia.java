/**
 * Clase Agencia para crear un menú para los autos 
 * que utiliza a la Clase Vendedor 
 *
 * @author Daniela Pereyra - Alan Bellon
 * @version 1.0
 * */
public class Agencia{

    // Atributos
    private String colores;
    private String modelosau;
    private String modelosca;
    private String modelossp;

    // Constructore
    public Agencia(String colores, String modelosau, String modelosca, String modelossp){
	this.colores = colores;
	this.modelosau = modelosau;
	this.modelosca = modelosca;
	this.modelossp = modelossp;
    }
    public Agencia(){
	this.colores = "-Rojo \n-Negro \n-Azul";
	this.modelosau = "-Berlinetta....$123412123 \n-Enzo..........$21232456 \n-LaFerrary.....$1000000";
	this.modelosca = "-PuroSangre....$565656 \n-Hurus.........$343434 \n-Trocona.......$989898";
	this.modelossp = "-Tributo....$121212 \n-Chidorris....$676767 \n-LaVestia....$909090";
    }

    //Métodos
    public String getColores(){
	return this.colores;
    }
    
    public String getModelosau(){
	return this.modelosau;
    }
    
    public String getModelosca(){
	return this.modelosca;
    }
    
    public String getModelossp(){
	return this.modelossp;
    }

    public void setColores(String colores){
	this.colores = colores;
    }
    
    public void setModelosau(String modelosau){
	this.modelosau = modelosau;
    }
    
    public void setModelosca(String modelosca){
	this.modelosca = modelosca;
    }
    
    public void setModelossp(String modelossp){
	this.modelossp = modelossp;
    }
}
