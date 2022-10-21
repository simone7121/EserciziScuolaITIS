public class Veicolo {

    protected String targa;
    protected String marca;
    protected int anno;
    protected int cilindrata;

    public Veicolo(String targa, String marca, int anno, int cilindrata) {
        this.targa = targa;
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    // Getters e setters

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    // Metodi ausiliari

    @Override
    public String toString() {
        return "|Targa: " + targa + " Marca: " + marca + " Anno: " + anno + " Cilindrata: " + cilindrata + "|";
    }

}
