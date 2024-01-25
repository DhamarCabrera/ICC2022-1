/**
 * Clase con los planes de pago para los autos vendidos por la agenciaM
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 */

public class Vendedor {
    //atributos privados de los planes de pago
    private int Costo, Plan;
    private boolean Donativo, Seguro;
    /**
     *Metodo constructor con 4 parametros 
     *@param Costo del auto
     *@param Plan de pago a mensualidades
     *@param Seguro del auto
     *@param Donativo 
     */
    public Vendedor() {
        this.Costo = 256000;
        this.Plan = 25;
        this.Seguro = false;
        this.Donativo = false;
    }

    /**
     *Metodo para regresar el costo del auto
     *@return Costo del auto;
     */
    public int getCosto() {
        return Costo;
    }

    /**
     *Metodo que establece el costo del auto
     *@param Costo del auto
     */

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    /**
     *Metodo para regresar si el auto cuenta con seguro incluido
     *@return Seguro del auto;
     */
    public boolean getSeguro() {
        return Seguro;
    }

    /**
     *Metodo que establece si el auto cuenta con seguro
     *@param Seguro del auto
     */

    public void setSeguro(Boolean Seguro) {
        this.Seguro = Seguro;
    }

    /**
     *Metodo para regresar el plan de pago del auto 
     *@return Plan de pago a mensualidades
     */
    public int getPlan() {
        return Plan;
    }
    /**
     *Metodo que establece el plan de pago del auto
     *@param Plan de pago a mensualidades
     */

    public void setPlan(int Plan) {
        this.Plan = Plan;
    }

    /**
     *Metodo para regresar el Donativo del auto a empresas ambientales
     *@return Donativo;
     */
    public boolean getDonativo() {
        return Donativo;
    }
    public void setDonativo(Boolean Donativo) {
        this.Donativo = Donativo;
    }
}
}
