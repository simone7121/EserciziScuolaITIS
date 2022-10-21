// Versione: 2.0

import java.util.Random;
import java.io.*;

public class SlotMachine {

    private char[] generazione = new char[3];
    private char[] lettere = new char[3];
    private int moltiplicatore;

    public SlotMachine(char[] lettere) {
        this.lettere = lettere;
    }

    private char giraRiga(int riga) {

        generazione[riga] = getLettera();
        return generazione[riga];

    }

    public void giraSlot() {

        for (int i = 0; i < 3; i++) {
            giraRiga(i);
        }

    }

    private char getLettera() {

        Random rnd = new Random();
        return lettere[rnd.nextInt(3)];

    }

    public boolean scelta() throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int inp;
        int casellauno;
        int caselladue;
        boolean lascelta = true;

        do {

            System.out.print("Scegli quante lettere vuoi tenere: ");
            inp = Integer.parseInt(tastiera.readLine());

        } while (inp > 3 || inp < 0);

        switch (inp) {
            case 0:
                giraSlot();
                break;

            case 1:

                System.out.print("Scegli la casella che vuoi tenere [0][1][2]: ");
                casellauno = Integer.parseInt(tastiera.readLine());

                if (casellauno == 0) {
                    giraRiga(1);
                    giraRiga(2);
                } else if (casellauno == 1) {
                    giraRiga(0);
                    giraRiga(2);
                } else {
                    giraRiga(1);
                    giraRiga(0);
                }

                break;

            case 2:

                System.out.print("Scegli la prima casella che vuoi tenere [0][1][2]: ");
                casellauno = Integer.parseInt(tastiera.readLine());

                System.out.print("Scegli la seconda casella che vuoi tenere [0][1][2]: ");
                caselladue = Integer.parseInt(tastiera.readLine());

                if (casellauno == 0 && caselladue == 1 || casellauno == 1 && caselladue == 0) {

                    giraRiga(2);

                } else if (casellauno == 1 && caselladue == 2 || casellauno == 2 && caselladue == 1) {

                    giraRiga(0);

                } else if (casellauno == 0 && caselladue == 2 || casellauno == 2 && caselladue == 0) {

                    giraRiga(1);

                }
                break;
            case 3:
                lascelta = false;
                break;
            default:
                break;
        }
        return lascelta;
    }

    public void esito() {

        int uguaglianza = 0;

        for (int i = 0; i < 2; i++) {

            for (int j = i; j < 3; j++) {

                if (j != i && generazione[i] == generazione[j]) {

                    uguaglianza++;

                }

            }

        }

        if (uguaglianza == 0) {

            moltiplicatore = 0;

        } else if (uguaglianza == 1) {

            moltiplicatore = 1;

        } else {

            if (generazione[0] == lettere[0]) {
                moltiplicatore = 1;
            } else if (generazione[0] == lettere[1]) {
                moltiplicatore = 2;
            } else {
                moltiplicatore = 3;
            }

        }

    }

    public int getMoltiplicatore() {
        return moltiplicatore;
    }

    public String toString(){
        
        return " _________________\n|  ___  ___  ___  |\n| |   ||   ||   | |\n| | "+generazione[0]+" || "+generazione[1]+" || "+generazione[2]+" | |\n| |___||___||___| | \n|_________________| ()\n|                 | ||\n|  ~SlotMachine~  |_//\n|                 |_/\n \\_______________/";
    
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
