public class Sapone {

    // Attributi della Classe

    private int quantitaSapone;
    private int quantitaErogazione;
    private String fragranza;

    // Metodi Costruttori

    public Sapone(int quantitaSapone, int quantitaErogazione, String fragranza) {
        this.quantitaSapone = quantitaSapone;
        this.quantitaErogazione = quantitaErogazione;
        this.fragranza = fragranza;
    }

    public Sapone() {
        quantitaSapone = 500;
        quantitaErogazione = 10;
        fragranza = "Neutra";
    }

    // Metodi Get

    public int getQuantitaSapone() {
        return quantitaSapone;
    }

    public int getQuantitaErogazione() {
        return quantitaErogazione;
    }

    public String getFragranza() {
        return fragranza;
    }

    // Metodi Set

    public void setFragranza(String fragranza) {
        this.fragranza = fragranza;
    }

    public void setQuantitaErogazione(int quantitaErogazione) {
        this.quantitaErogazione = quantitaErogazione;
    }

    public void setQuantitaSapone(int quantitaSapone) {
        this.quantitaSapone = quantitaSapone;
    }

    // Metodi Query

    void stampa() {
        System.out.println("Fragranza Sapone: "+ fragranza);
        System.out.println("Erogazione: " + quantitaErogazione + " ML");
        System.out.println("Totale Sapone: " + quantitaSapone + " ML");

    }
}
