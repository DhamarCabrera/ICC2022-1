/**
 * Clase con los datos de diferentes autos vendidos por la agenciaM
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 */
public class Autos {
    //atributos de los autos
    private String Marca, Color, Matricula;
    private int Modelo;
    private boolean Disponible;
    /**
     *Metodo constructor con 5 parametros
     *@param Marca
     *@param Color
     *@param Matricula
     *@param Modelo
     *@param Disponible
     */
    public Autos() {
        this.Marca = "Volkswagen";
        this.Color = "morado";
        this.Matricula = "VLm21";
        this.Modelo = 2021;
        this.Disponible = true;
    }
    /**
     *Metodo para regresar la marca del auto
     *@return Marca;
     */
    public String getMarca() {
        return Marca;
    }

    /**
     *Metodo que establece la marca del auto
     *@param Marca del auto
     */

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     *Metodo para regresar el color del auto
     *@return Color;
     */

    public String getColor() {
        return Color;
    }

    /**
     *Metodo que establece el Color del auto
     *@param Color del auto
     */

    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     *Metodo para regresar la matricula del auto
     *@return Matricula;
     */

    public String getMatricula() {
        return Matricula;
    }

    /**
     *Metodo que establece la matricula del auto
     *@param Matricula del auto
     */

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    /**
     *Metodo para regresar el modelo del auto
     *@return Modelo;
     */

    public int getModelo() {
        return Modelo;
    }

    /**
     *Metodo que establece el modelo del auto
     *@param Modelo del auto
     */

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    /**
     *Metodo para regresar la disponibilidad del auto
     *@return Disponibilidad;
     */

    public boolean getDisponible() {
        return Disponible;
    }


    /**
     *Metodo que establece la disponibilidad del auto
     *@param Disponible 
     */

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

}
