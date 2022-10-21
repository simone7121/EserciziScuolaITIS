public class SalaCinemaP extends SalaCinema {

    protected int fileOccupate;

    public SalaCinemaP(String film, int n_file) {
        super(film, n_file);
        fileOccupate = 0;
    }

    public void calcolaFile() {

        fileOccupate = postiOcc / maxFila;

        if (fileOccupate == 0) {
            System.out.println("La sala è vuota !");
        }

    }

    public void stampaSituazione() {
        super.stampaSituazione();
        System.out.print("|File Occupate: " + fileOccupate + " |\n\n");
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