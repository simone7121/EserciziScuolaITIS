/*

    Algoritmo:      Realizzare un programma che legge da un file di testo (input.txt) e stampa a video il contenuto. Inoltre conta il numero di parole, di righe e le vocali contenute nel file.
                    I valori dei contatori devono essere stampati a video e salvati nel file output.txt
                    
    Programmatore:  Simone D'Anna
    Data:           06/04/2022

*/

import java.io.*;

public class LeggiTesto {
    public static void main(String[] args) {

        // Dichiaro ANSI_RESET cosi possiamo resettare il colore.
        final String ANSI_RESET = "\u001B[0m";

        // Dichiarazione colori di sfondo e di testo.
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        final String ANSI_BLACK = "\u001B[30m";

        char preC;
        char c = ' ';

        int parola = 0;
        int righe = 1;
        int vocali = 0;

        try {

            int next; // Dichiaro la variabile next di tipo int.

            FileReader reader = new FileReader("input.txt"); // Dichiaro e inizializzo lo stream di Input.
            FileWriter writer = new FileWriter("output.txt"); // Dichiaro e inizializzo lo stream di Output.

            do {

                next = reader.read(); // Legge il prossimo carattere.

                if (next != -1) { // Se effettivamente c'e' un prossimo carattere.

                    preC = c;

                    c = (char) next; // Casto l’intero a char.

                    System.out.print(c); // Visualizza il valore di c.

                    switch (c) {
                        case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':

                            vocali++;

                            break;

                        case ',', '.', ';', ' ', '\n':

                            if (c == '\n') {

                                if (preC == ',' && preC == '.' && preC == ';' && preC == ' ') {
                                    righe++;
                                } else {
                                    parola++;
                                    righe++;
                                }

                            } else {
                                parola++;
                            }
                            break;

                        default:
                            break;
                    }

                }

            } while (next != -1); // Finche il file non finisce.

            writer.write("Parole: " + parola + "\n"); // Lo faccio scrivere nel file di output.
            writer.write("Vocali: " + vocali + "\n"); // Lo faccio scrivere nel file di output.
            writer.write("Righe: " + righe + "\n"); // Lo faccio scrivere nel file di output.

            reader.close(); // Chiudo il file di Input.
            writer.close(); // Chiudo il file di Output.

        } catch (IOException e) { // Nel caso di errori in una delle operazioni.

            System.out.println(ANSI_RED_BACKGROUND + "I/O ERROR !" + ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\t + " + e + ANSI_RESET);

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
