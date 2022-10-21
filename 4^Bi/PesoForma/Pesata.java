public class Pesata {

    private String nomePersona;
    private double altezza;
    private int peso;

    public Pesata(String nomePersona, double altezza, int peso) {
        this.nomePersona = nomePersona;
        this.altezza = altezza;
        this.peso = peso;
    }

    public String getNomePersona() {
        return nomePersona;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    
    public boolean inForma() {
        
        double bmi = peso/(altezza*altezza);

        if (bmi >= 23 && bmi <= 27){
            return true;
        }else {
            return false;
        }

    }

    public String toString () {
        
        return "Nome: " + nomePersona + "\nAltezza: " +altezza+ "\nPeso: " +peso; 
    
    }
    
}
