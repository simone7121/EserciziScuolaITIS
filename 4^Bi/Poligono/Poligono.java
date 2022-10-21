public class Poligono {

    protected int numeroLati;
    protected double lato;

    public Poligono(int numeroLati, double lato) {
        this.lato = lato;
        this.numeroLati = numeroLati;
    }

    public double perimetro() {
        return (double) lato * numeroLati;
    }

    public void stampa() {
        System.out.println("Il numero dei lati è: " + numeroLati + "\nIl valore di essi è: " + lato);
    }

    public void aumenta(double modificatore) {
        lato += modificatore;
    }

    public double volume(int altezza) {

        if (numeroLati == 4) {

            return (double) lato * lato * altezza;

        } else {

            return 0.0;

        }

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