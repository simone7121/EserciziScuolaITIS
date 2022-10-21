
public class Famiglia {

    String cognome;
    int totNucleo;
    Persona nomeComponenti[];

    public Famiglia(String cognome, int totNucleo) {
        this.cognome = cognome;
        this.totNucleo = totNucleo;
        nomeComponenti = new Persona[totNucleo];
    }

    public String getCognome() {
        return cognome;
    }

    public int getTotNucleo() {
        return totNucleo;
    }

    public void setPersona(String nome, int eta, int index) {

        nomeComponenti[index] = new Persona(nome, eta);

    }

    public String nomePiugrande() {

        int indexlastgrande = 0;

        for (int i = 0; i < nomeComponenti.length; i++) {

            if (nomeComponenti[i].getEta() > nomeComponenti[indexlastgrande].getEta() ) {
                indexlastgrande = i;
            }

        }

        return "La persona piu' grande e': | " + nomeComponenti[indexlastgrande].getNome() + " , Eta': "
                + nomeComponenti[indexlastgrande].getEta() + " | \n";

    }

    public void minorenni() {

        System.out.println("I minorenni sono: ");

        for (int i = 0; i < nomeComponenti.length; i++) {

            if (nomeComponenti[i].getEta() < 18) {
                System.out.print("| " + nomeComponenti[i].getNome() + " , Eta': " + nomeComponenti[i].getEta() + " | \n");
            }

        }

    }

    public void stampa() {

        String div = "\n____________________________________________________";

        System.out.format("%20s", "|Nome|");
        System.out.format("%20s", "|Cognome|");
        System.out.format("%10s", "|Eta'|");

        System.out.println(div);

        for (int j = 0; j < nomeComponenti.length; j++) {
            System.out.format("%n");
            System.out.format("%20s", nomeComponenti[j].getNome());
            System.out.format("%20s", getCognome());
            System.out.format("%10d", nomeComponenti[j].getEta());
        }

        System.out.println(div);
        System.out.println("\n\n");

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