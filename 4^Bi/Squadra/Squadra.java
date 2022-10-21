// Versione: V2.0

public class Squadra {

    // Attributi della Classe

    private int partitevinte;
    private int partitepareggiate;
    private int partiteperse;
    private String nomesquadra;

    // Metodi Costruttori

    public Squadra() {
        partitevinte = 0;
        partitepareggiate = 0;
        partiteperse = 0;
        nomesquadra = "";
    }

    public Squadra(int partitevinte, int partitepareggiate, int partiteperse,String nomesquadra) {
        this.partitevinte = partitevinte;
        this.partitepareggiate = partitepareggiate;
        this.partiteperse = partiteperse;
        this.nomesquadra = nomesquadra;
    }

    // Metodi Get

    int getPartiteVinte() {
        return partitevinte;
    }

    int getPartitePareggiate() {
        return partitepareggiate;
    }

    int getPartitePerse() {
        return partiteperse;
    }

    String getNomesquadra() {
        return nomesquadra;
    }

    // Metodi Set

    void setPartiteVinte(int partitevinte) {
        this.partitevinte = partitevinte;
    }

    void setPartitePareggiate(int partitepareggiate) {
        this.partitepareggiate = partitepareggiate;
    }

    void setPartitePerse(int partiteperse) {
        this.partiteperse = partiteperse;
    }

    void setNomesquadra(String nomesquadra) {
        this.nomesquadra = nomesquadra;
    }

    // Metodi Query

    int punti() {
        return (3 * partitevinte) + partitepareggiate;
    }

    void inizioAnno() {
        setPartiteVinte(0);
        setPartitePareggiate(0);
        setPartitePerse(0);
    }

    void stampa() {
        System.out.println("Nome Squadra: "+ nomesquadra);
        System.out.println("Partite Vinte: " + partitevinte);
        System.out.println("Partite Pareggiate: " + partitepareggiate);
        System.out.println("Partite Perse: " + partiteperse);
    }

}
