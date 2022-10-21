public class Auto extends Veicolo {

    protected int porte;
    protected String alimentazione;

    // Costruttore

    public Auto(String targa, String marca, int anno, int cilindrata, int porte, String alimentazione) {
        super(targa, marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    // Getters e Setters

    public int getPorte() {
        return porte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    // Metodi Ausiliari

    @Override
    public String toString() {
        return "|Targa: " + targa + " Marca: " + marca + " Anno: " + anno + " Cilindrata: " + cilindrata + " Porte: " + porte
                + " Alimentazione: " + alimentazione +"|";
    }

}