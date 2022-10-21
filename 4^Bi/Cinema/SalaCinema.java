public class SalaCinema {

    protected String film;
    protected int postiOcc;
    protected int n_file;
    protected static final int maxFila = 21;

    public SalaCinema(String film, int n_file) {
        this.film = film;
        postiOcc = 0;
        this.n_file = n_file;
    }

    public int getPosti() {
        return (n_file * maxFila) - postiOcc;
    }

    public void vendiBiglietti(int postiDaOccupare) {

        if (postiDaOccupare > getPosti()) {
            System.out.println("Troppi posti richiesti, puoi richiederli massimo : " + getPosti());
        } else {
            postiOcc += postiDaOccupare;

        }

    }

    public void stampaSituazione() {
        System.out.println("|Film : " + film +
                " |\n|Posti Occupati: " + postiOcc +
                " |\n|Numero File: " + n_file + " | ");
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