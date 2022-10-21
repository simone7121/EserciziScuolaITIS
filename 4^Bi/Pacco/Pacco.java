public class Pacco {

    protected double base;
    protected double altezza;
    protected double profondita;
    protected int numero;

    // Costruttori

    public Pacco(double base, double altezza, double profondita) {

        this.base = base;
        this.altezza = altezza;
        this.profondita = profondita;
        numero = 0;

    }

    // Getter e Setter

    public void setNumero(int numero) {

        this.numero = numero;

    }

    // Metodi ausiliari

    public double volume() {

        return base * altezza * profondita;

    }

    public void stampa() {
        System.out.print("Base: " + base + "\nAltezza: " + altezza + "\nProfondità: " + profondita);
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
