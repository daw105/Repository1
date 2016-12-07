
package hoja_ej_ed4_poo_v;

/**
 *
 * @author DAW105
 */
public class Hipoteca {
    private double capital;
    private double redito;
    private int tiempo;

    public Hipoteca(double capital, double redito, int tiempo) {
        this.capital = capital;
        this.redito = redito;
        this.tiempo = tiempo;
    }
    
    public double Cuota () {
        double cuota = capital * redito * tiempo /100 ;
        return cuota;
    }

    @Override
    public String toString() {
        return "Hipoteca{" + "capital=" + capital + ", redito=" + redito + ", tiempo=" + tiempo + '}';
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getRedito() {
        return redito;
    }

    public void setRedito(double redito) {
        this.redito = redito;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
