/*

    Algoritmo:      Un ente per il monitoraggio delle condizioni climatiche pubblica 
                    i dati rilevati per le principali citta' italiane come segue:

                    Data (gg-mm-aaaa)
                    Citta'
                    Temperatura Max (Gradi Centigradi)
                    Temperatura Min (Gradi Centigradi)
                    Umidita' (%)

                    Esempio:
                    21-09-2011
                    Napoli
                    21
                    12
                    33

                    Scrivere un programma che registri i dati delle citta' per consentire di 
                    effettuare le interrogazioni, come ad esempio: 

                        la temperatura massima registrata a Salerno il 22-10-2021 
                        l'elenco delle citta' in cui l'umidita' ha superato il 75%

                    Prevedere la possibilita' di registrare i dati in un file di testo 

    Programmatore:  Simone D'Anna
    Data:           26/04/2022
    Versione:       V1.0

*/

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class MonitoraggioClimatico {

    public static void main(String[] args) throws IOError, IOException, ParseException {

        Vector<Datalog> datiAcquisiti = new Vector<>();

        menu(datiAcquisiti);

    }

    private static void menu(Vector<Datalog> datiAcquisiti)
            throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int scelta;

        do {

            System.out.println("\n\t\t ~ Registro climatico ~\n Seleziona operazione");

            System.out.println("\n(1) | Inserimento dati \n");
            System.out.println("(2) | Stampa Tabellone \n");
            System.out.println("(3) | Stampa Temperatura Media di tutte le Citta' \n");
            System.out.println("(4) | Stampa l'elenco delle Citta' in cui l'umidita' ha superato il 75% \n");
            System.out.println("(5) | Salva dati in un file \n");
            System.out.println("(6) | USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:
                    inserimento(datiAcquisiti);
                    break;

                case 2:
                    printTabellone(datiAcquisiti);
                    break;

                case 3:
                    System.out.println(
                            "La media di tutte le temperature delle citta' e: " + printTempMedia(datiAcquisiti));
                    break;

                case 4:
                    printCittaUmiditaMax(datiAcquisiti, 75);
                    break;

                case 5:
                    salvataggio(datiAcquisiti);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;

            }

        } while (scelta < 6);
    }

    private static void inserimento(Vector<Datalog> datiAcquisiti) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        // Dichiaro ANSI_RESET cosi possiamo resettare il colore.
        final String ANSI_RESET = "\u001B[0m";

        // Dichiarazione colori di sfondo e di testo.
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

        final String ANSI_BLACK = "\u001B[30m";

        Datalog appo;

        String dataAcqisizione;
        String citta;
        int tempMax;
        int tempMin;
        int umidita;

        int scelta;

        try {

            do {

                System.out.println("(TIPO DI LETTURA)");
                System.out.println("\tLettura da file (0)\n\tLettura manuale (1)\n\n");
                System.out.print("SCELTA: ");

                scelta = Integer.parseInt(tastiera.readLine());

            } while (scelta < 0 && scelta > 1);

            if (scelta == 0) {

                Scanner reader = new Scanner(new BufferedReader(new FileReader("input.txt ")));

                do {

                    appo = new Datalog(reader.next(), reader.next(), reader.nextInt(), reader.nextInt(),
                            reader.nextInt());

                    datiAcquisiti.add(appo);

                } while (reader.hasNext());

                reader.close(); // Chiudo il file di Input.

                System.out.print(ANSI_GREEN_BACKGROUND+"( DATI LETTI DAL FILE CORRETTAMENTE ! )"+ANSI_RESET);

            } else if (scelta == 1) {

                System.out.print("\n\nInserisci Data (gg-mm-aaaa): ");
                dataAcqisizione = tastiera.readLine();

                System.out.print("Inserisci Citta': ");
                citta = tastiera.readLine();

                System.out.print("Inserisci Temperatura Max (Gradi Centigradi): ");
                tempMax = Integer.parseInt(tastiera.readLine());

                System.out.print("Inserisci Temperatura Min (Gradi Centigradi): ");
                tempMin = Integer.parseInt(tastiera.readLine());

                System.out.print("Inserisci Umidita'  (%): ");
                umidita = Integer.parseInt(tastiera.readLine());

                appo = new Datalog(dataAcqisizione, citta, tempMax, tempMin, umidita);

                datiAcquisiti.add(appo);

            }

        } catch (IOException e) { // Nel caso di errori in una delle operazioni.

            System.out.println(ANSI_RED_BACKGROUND + "I/O ERROR !" + ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\t + " + e + ANSI_RESET);

        } catch (ParseException e) { // Nel caso di errori di parsing in una delle operazioni.

            System.out.println(ANSI_RED_BACKGROUND + "PARSE ERROR !" + ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\t + " + e + ANSI_RESET);
        }

    }

    private static void printTabellone(Vector<Datalog> datiAcquisiti) {

        String div = "\n______________________________________________________________________________________________";

        Iterator<Datalog> i = datiAcquisiti.iterator();
        Datalog appo;

        System.out.println("\n\n\t\t\t  Registro climatico \n");
        System.out.format("%10s", "Data");
        System.out.format("%15s", "Citta");
        System.out.format("%10s", "Temp Max");
        System.out.format("%10s", "Temp Min");
        System.out.format("%9s", "Umidita'");

        System.out.println(div);

        while (i.hasNext()) {

            appo = i.next();

            System.out.print("\n");
            System.out.format("%10s", appo.getDataAcqisizioneStr());
            System.out.format("%15s", appo.getCitta());
            System.out.format("%10d", appo.getTempMax());
            System.out.format("%10d", appo.getTempMin());
            System.out.format("%9d", appo.getUmidita());

        }

        System.out.println(div);

    }

    private static double printTempMedia(Vector<Datalog> datiAcquisiti) {

        Iterator<Datalog> i = datiAcquisiti.iterator();
        Datalog appo;

        int sommatoria = 0;
        double media;
        int counter = 0;

        while (i.hasNext()) {

            appo = i.next();

            sommatoria += (appo.getTempMax() + appo.getTempMin()) / 2;

            counter++;

        }

        media = (double) sommatoria / counter;

        return media;

    }

    private static void printCittaUmiditaMax(Vector<Datalog> datiAcquisiti, int perc) {

        String div = "\n______________________________________________________________________________________________";

        Iterator<Datalog> i = datiAcquisiti.iterator();
        Datalog appo;

        System.out.println("\n\n\t\t\t  Registro climatico con umidita' MAGGIORI DEL " + perc + "% \n");
        System.out.format("%10s", "Data");
        System.out.format("%15s", "Citta");
        System.out.format("%10s", "Temp Max");
        System.out.format("%10s", "Temp Min");
        System.out.format("%9s", "Umidita'");

        System.out.println(div);

        while (i.hasNext()) {

            appo = i.next();

            if (appo.getUmidita() > perc) {
                System.out.print("\n");
                System.out.format("%10s", appo.getDataAcqisizioneStr());
                System.out.format("%15s", appo.getCitta());
                System.out.format("%10d", appo.getTempMax());
                System.out.format("%10d", appo.getTempMin());
                System.out.format("%9d", appo.getUmidita());
            }

        }

        System.out.println(div);

    }

    private static void salvataggio(Vector<Datalog> datiAcquisiti) {

        // Dichiaro ANSI_RESET cosi possiamo resettare il colore.
        final String ANSI_RESET = "\u001B[0m";

        // Dichiarazione colori di sfondo e di testo.
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_BLACK = "\u001B[30m";

        Datalog appo;
        Iterator<Datalog> i = datiAcquisiti.iterator();

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt",true));

            while (i.hasNext()) {

                appo = i.next();
                writer.write(appo.toFormattedStr());

            }

            writer.close();

            System.out.print(ANSI_GREEN_BACKGROUND + "( DATI SCRITTI SUL FILE CORRETTAMENTE ! )" + ANSI_RESET);

        } catch (IOException e) { // Nel caso di errori in una delle operazioni.

            System.out.println(ANSI_RED_BACKGROUND + "I/O ERROR !" + ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\t + " + e + ANSI_RESET);

        }

    }

    private static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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