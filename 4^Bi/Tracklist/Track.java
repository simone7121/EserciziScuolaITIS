public class Track {
    
    private String titolo;
    private int durata ;
    private String cantante ;
    private String autore;

    public Track(String titolo, int durata, String cantante, String autore) {
        this.setTitolo(titolo);
        this.setDurata(durata);
        this.setCantante(cantante);
        this.setAutore(autore);
    }

    public Track(String titolo, int durata, String cantante) {
        this.setTitolo(titolo);
        this.setDurata(durata);
        this.setCantante(cantante);
        this.setAutore("");;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
    public String toString() {
        String s;
        s = "\nTitolo: " +titolo+ "\n\tDurata: "+durata+"\n\tCantante: "+cantante+"\n\tAutore: "+autore;
        return s;
    }


    
}