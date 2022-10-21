public class Aereo {

    private String nome;
    private String modello;
    private int dimensioneSerbatoio;
    private String rottaScelta;

    //Costruttori

    public Aereo(String nome, String modello, int dimensioneSerbatoio, String rottaScelta) {
        this.nome = nome;
        this.modello = modello;
        this.dimensioneSerbatoio = dimensioneSerbatoio;
        this.rottaScelta = rottaScelta;
    }

    public Aereo(String nome, String modello, int dimensioneSerbatoio) {
        this.nome = nome;
        this.modello = modello;
        this.dimensioneSerbatoio = dimensioneSerbatoio;
    }
    
    //Getter And Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public int getDimensioneSerbatoio() {
        return dimensioneSerbatoio;
    }
    public void setDimensioneSerbatoio(int dimensioneSerbatoio) {
        this.dimensioneSerbatoio = dimensioneSerbatoio;
    }

    public String getRottaScelta() {
        return rottaScelta;
    }

    public void setRottaScelta(String rottaScelta) {
	    this.rottaScelta = rottaScelta;
	}

    //Metodi ausiliari
    
    
}
/*
 * ____/\\\\\\\\\\\__________/\\\\\\\\\\\\___________________
 * ____/\\\/////////\\\_______\/\\\////////\\\_______________
 * ____\//\\\______\///________\/\\\______\//\\\_____________
 * ______\////\\\_______________\/\\\_______\/\\\____________
 * __________\////\\\____________\/\\\_______\/\\\___________
 * ______________\////\\\_________\/\\\_______\/\\\__________
 * _______/\\\______\//\\\________\/\\\_______/\\\___________
 * ________\///\\\\\\\\\\\/____/\\\_\/\\\\\\\\\\\\/____/\\\__
 * ___________\///////////_____\///__\////////////_____\///__
 */
