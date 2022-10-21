/*

    Algoritmo:      Realizzare un’applicazione Java con l’uso
                    di finestre di popup per gestire dei
                    numeri casuali letti dall'utente.

    Programmatore:  Simone D'Anna
    Data:           06/05/2022
    Versione:       V 2.0

*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class StannoDandoINumeri {

    static Random random = new Random();

    static Vector<Utente> utenti = new Vector<>();

    // Dichiaro ANSI_RESET cosi possiamo resettare il colore.
    static final String ANSI_RESET = "\u001B[0m";

    // Dichiarazione colori di sfondo e di testo.
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) throws IOError {

        selectDifficult(selectName());
        toFile();

    }

    private static void indovinaNumeri(String difficolta, Utente utente) {

        int scelta;
        int numgen;

        int max;
        int min;

        int points;
        int decremento;

        final int maxTentativi = 5;

        if (difficolta.equals("Facile")) {
            max = 20;
            min = 1;
            decremento = 5;
        } else if (difficolta.equals("Intermedio")) {
            max = 50;
            min = 1;
            decremento = 15;
        } else if (difficolta.equals("Difficile")) {
            max = 69;
            min = 1;
            decremento = 20;
        } else {
            max = 1;
            min = 1;
            points = 1;
            decremento = 1;
        }

        points = decremento * maxTentativi;

        do {

            numgen = genNumCasuale(max, min);

            JOptionPane.showMessageDialog(null,
                    "NUMERO DA " + min + " A " + max + "\n GENERATO CORRETTAMENTE ! \n Hai a disposizione: " + points
                            + " Punti per l'utente: " + utente.getNome()); // icona
            // di
            // tipo
            // "Informazione"

            System.out.println(numgen);

            utente.setPunteggi(points);

            for (int i = 0; i < maxTentativi; i++) {

                int numero = Integer.parseInt(JOptionPane.showInputDialog("Hai a disposizione ( " + (maxTentativi - i)
                        + " TENTATIVI/O e " + utente.getPunteggi() + " Punti)\nInserisci un numero Compreso tra [" + min
                        + " - " + max + "]\n"));

                if (numero > max || numero < min) {

                    JOptionPane.showMessageDialog(null, "VALORE INSERITO NON RIENTRA NELL'INTERVALLO!", "Sbagliato",
                            JOptionPane.ERROR_MESSAGE);
                    i--;

                } else {

                    if (numgen < numero) {

                        JOptionPane.showMessageDialog(null,
                                "VALORE INSERITO ( " + numero + " )\nMAGGIORE DEL NUMERO ESTRATTO!", "Sbagliato !",
                                JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\Close_Icon.png"));
                        points -= decremento;
                        utente.setPunteggi(points);

                    } else if (numgen > numero) {

                        JOptionPane.showMessageDialog(null,
                                "VALORE INSERITO ( " + numero + " )\nMINORE DEL NUMERO ESTRATTO!", "Sbagliato !",
                                JOptionPane.ERROR_MESSAGE, new ImageIcon("images\\Close_Icon.png"));
                        points -= decremento;
                        utente.setPunteggi(points);

                    } else if (numero == numgen) {
                        JOptionPane.showMessageDialog(null,
                                "VALORE INSERITO ( " + numero + " )\nCORRISPONDE AL NUMERO ESTRATTO!\n HAI VINTO !!!",
                                "CORRETTO !", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images\\Tick_Mark.png"));
                        i = maxTentativi;
                        utente.setPunteggi(points);

                    }

                }

            }

            scelta = JOptionPane.showConfirmDialog(null,
                    "Vuoi continuare a giocare con l'utente " + utente.getNome() + " ?", "Scelta",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        } while (scelta != JOptionPane.NO_OPTION);
        
    }

    private static int genNumCasuale(int max, int min) {

        return random.nextInt(max + min) - min;

    }

    private static void toFile() {

        Utente appo;
        Iterator<Utente> i = utenti.iterator();

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt", true));

            while (i.hasNext()) {

                appo = i.next();

                if (!appo.getNome().equals(null)) {
                    writer.write(appo.getNome() + "\n" + appo.getPunteggi() + "\n");
                }

            }

            writer.close();

            System.out.print(ANSI_GREEN_BACKGROUND + "( DATI SCRITTI SUL FILE CORRETTAMENTE ! )" + ANSI_RESET);

        } catch (IOException e) { // Nel caso di errori in una delle operazioni.

            System.out.println(ANSI_RED_BACKGROUND + "I/O ERROR !" + ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\t + " + e + ANSI_RESET);

        }

    }

    private static Vector<Utente> fileToIstance() {

        Utente appo;
        Vector<Utente> utente = new Vector<>();

        try {

            Scanner reader = new Scanner(new BufferedReader(new FileReader("input.txt")));

            do {

                appo = new Utente(reader.next(), reader.nextInt());

                utente.add(appo);

            } while (reader.hasNext());

            reader.close(); // Chiudo il file di Input.

            System.out.print(ANSI_GREEN_BACKGROUND + "( DATI LETTI DAL FILE CORRETTAMENTE ! )" + ANSI_RESET);

            return utente;

        } catch (Exception e) { // Nel caso di errori in una delle operazioni.

            if (e.toString().equals("java.util.NoSuchElementException")) {

                JOptionPane.showMessageDialog(null, "ERRORE DI LETTURA !\nIl file è vuoto.\n" + e, "ERRORE",
                        JOptionPane.ERROR_MESSAGE);

            }

            System.out.println(ANSI_RED_BACKGROUND + "I/O ERROR !" + ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\t + " + e + ANSI_RESET);
            return null;

        }

    }

    private static void selectDifficult(Utente utente) {

        int scelta = 0;
        Object[] possibleValues = { "Facile", "Intermedio", "Difficile" };

        do {

            Object selectInput = JOptionPane.showInputDialog(null,
                    "[ BENVENUTO A Stanno Dando I Numeri ! ]\nUtente: " + utente.getNome()
                            + "\n\nScegli La difficoltà ",
                    "Scelta",
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images\\Roulette.png"), possibleValues,
                    possibleValues[0]);

            if (selectInput != null) {

                indovinaNumeri(selectInput.toString(), utente);
                scelta = JOptionPane.showConfirmDialog(null, "Vuoi uscire dal programma ?", "Scelta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

            }

            if (selectInput == null) { // alla pressione di Annulla oppure dell’icona di uscita

                scelta = JOptionPane.showConfirmDialog(null, "Vuoi uscire dal programma ?", "Scelta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);

            }

        } while (scelta == JOptionPane.NO_OPTION);

    }

    private static Utente selectName() {

        int scelta = 0;
        Utente appo;

        int selezioneFile = JOptionPane.showConfirmDialog(null, "Importo gli utenti da file ?", "Importazione",
                JOptionPane.YES_NO_OPTION);

        if (selezioneFile != JOptionPane.YES_OPTION) {

            do {
                appo = new Utente(JOptionPane.showInputDialog(null, "Dimmi il nome dell'nuovo utente",
                        "Importazione Utente", JOptionPane.INFORMATION_MESSAGE));
            } while (Objects.isNull(appo));

            utenti.add(appo);

            return appo;

        } else {

            Vector<Utente> utentiLocal = fileToIstance();

            Object[] possibleValues = utentiLocal.toArray();

            do {

                Object selectInput = JOptionPane.showInputDialog(null,
                        "[ BENVENUTO A Stanno Dando I Numeri ! ]\n\nScegli L'utente: ", "Scelta",
                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images\\Roulette.png"), possibleValues,
                        possibleValues[0]);

                if (selectInput != null) {

                    Iterator<Utente> i = utentiLocal.iterator();

                    if (i.hasNext()) {

                        appo = i.next();

                        if (appo.getNome().equals(selectInput.toString())) {

                            return appo;

                        }

                    }

                }

                if (selectInput == null) { // alla pressione di Annulla oppure dell’icona di uscita

                    scelta = JOptionPane.showConfirmDialog(null, "Vuoi uscire dal programma ?", "Scelta",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);

                }

            } while (scelta == JOptionPane.NO_OPTION);

            appo = null;

        }

        return appo;

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
