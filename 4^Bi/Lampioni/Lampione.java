public class Lampione extends Lampadina {
    
    protected int matricolaLampione;
    protected String quartiere;

    // Costruttori 

    public Lampione(int matricolaLampione, String quartiere, String tipo, String tecnologia, int voltaggio, int wattora, int lifespan) {
        
        super(tipo, tecnologia, voltaggio, wattora, lifespan);
        this.matricolaLampione = matricolaLampione;
        this.quartiere = quartiere;

    }

    public Lampione(int matricolaLampione, String quartiere) {
        
        super("E27", "LED", 220, 50, 1000);
        this.matricolaLampione = matricolaLampione;
        this.quartiere = quartiere;

    }
    
    // Getter e Setter

    public int getMatricolaLampione() {
        return matricolaLampione;
    }

    public void setMatricolaLampione(int matricolaLampione) {
        this.matricolaLampione = matricolaLampione;
    }

    public String getQuartiere() {
        return quartiere;
    }

    public void setQuartiere(String quartiere) {
        this.quartiere = quartiere;
    }



    // Metodi Ausiliari

    



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