/*

    Algoritmo:      Scrivere un programma per creare un file contenente i nomi degli alunni di una classe (elenco.txt)
                    Scrivere un altro programma che copia il file elenco.txt in copia.txt
                    
    Programmatore:  Simone D'Anna
    Data:           04/04/2022

*/

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {

        // Dichiaro ANSI_RESET cosi possiamo resettare il colore.
        final String ANSI_RESET = "\u001B[0m";

        // Dichiarazione colori di sfondo e di testo.
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        final String ANSI_BLACK = "\u001B[30m";

        try {
            
            int next;                                               // Dichiaro la variabile next di tipo int.
                
            FileReader reader = new FileReader("elenco.txt");       // Dichiaro e inizializzo lo stream di Input. 
            FileWriter writer = new FileWriter("copia.txt");        // Dichiaro e inizializzo lo stream di Output. 

            do {

                next = reader.read();                               // Legge il prossimo carattere.

                if (next != -1) {                                   // Se effettivamente c'e' un prossimo carattere.

                    char c = (char) next;                           // Casto l’intero a char. 

                    System.out.print(c);                            // Visualizza il valore di c. 

                    writer.write(c);                                // Lo faccio scrivere nel file di output.

                }

            } while (next != -1);                                   // Finche il file non finisce.

            reader.close();                                         // Chiudo il file di Input.
            writer.close();                                         // Chiudo il file di Output.

        } catch (IOException e) {                                   // Nel caso di errori in una delle operazioni.

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
