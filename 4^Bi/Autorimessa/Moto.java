public class Moto extends Veicolo {

    protected int tempi; // Espressa in 2 o 4

    // Costruttore

    public Moto(String targa, String marca, int anno, int cilindrata, int tempi) {
        super(targa, marca, anno, cilindrata);
        this.tempi = tempi;
    }

    // Getters e Setters

    public int getTempi() {
        return tempi;
    }

    // Metodi Ausiliari

    @Override
    public String toString() {
        return "|Targa: " + targa + " Marca: " + marca + " Anno: " + anno + " Cilindrata: " + cilindrata
                + " Tempi: " + tempi + "|";
    }
    
}
