public class Libro {

    private String titolo;
    private String autore;
    private String casaEdit;
    private double prezzo;
    private int numPag;

    public Libro(String titolo, String autore, String casaEdit, double prezzo, int numPag) {
        this.titolo = titolo;
        this.autore = autore;
        this.casaEdit = casaEdit;
        this.prezzo = prezzo;
        this.numPag = numPag;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getCasaEdit() {
        return casaEdit;
    }

    public void setCasaEdit(String casaEdit) {
        this.casaEdit = casaEdit;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double sconto (){
        return prezzo-(prezzo/10);
    }

    public void stampa(){
        System.out.println("Il titolo: "+titolo);
        System.out.println("L'autore: "+autore);
        System.out.println("La casa editrice: "+casaEdit);
        System.out.println("Il prezzo: "+prezzo);
        System.out.println("Il numero delle pagine: "+numPag);


    }

}
