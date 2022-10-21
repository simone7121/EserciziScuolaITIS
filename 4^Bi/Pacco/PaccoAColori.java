public class PaccoAColori extends Pacco {

    protected String colore;

    // Costruttori


    public PaccoAColori(double base, double altezza, double profondita) {

        super(base, altezza, profondita);
        colore = null;

    }

    // Getter e Setter

    public void setColore(String colore) {

        this.colore = colore;

    }

    // Metodi ausiliari

    @Override
    public void stampa() {
        System.out.print("\nBase: " + base + "\nAltezza: " + altezza + "\nProfondità: " + profondita + "\nColore: " + colore);

    }

    public void stampaVolume() {
        System.out.print("\n\tIl volume del pacco a colori è: "+volume());

    }

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
