public class Furgoni extends Veicolo {

    protected int capacita; // Espressa in kg

    // Costruttore

    public Furgoni(String targa, String marca, int anno, int cilindrata, int capacita) {
        super(targa, marca, anno, cilindrata);
        this.capacita = capacita;
    }

    // Getters e Setters

    public int getCapacita() {
        return capacita;
    }

    // Metodi Ausiliari

    @Override
    public String toString() {
        return "|Targa: " + targa + " Marca: " + marca + " Anno: " + anno + " Cilindrata: " + cilindrata
                + " Capacità: " + capacita + "|";
    }

}
