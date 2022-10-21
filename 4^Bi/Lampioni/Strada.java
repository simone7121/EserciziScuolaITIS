/*

Algoritmo:  Scrivere un programma che consenta di usare dei lampioni in una strada, e di scalarne le ore di utilizzo.

Programmatore: Simone D'Anna
Data: 06/02/2022
Versione: V1.0

*/

import java.io.*;

public class Strada {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int numLampioni;
        String citta;
        Boolean inizializzazione = false;
        int scelta;

        cls();

        System.out.print("\nInserisci il nome della città: ");
        citta = tastiera.readLine();

        do {

            System.out.print("\nInserisci il totale dei lampioni: ");
            numLampioni = Integer.parseInt(tastiera.readLine());

        } while (numLampioni <= 0);

        Lampione lampioni[] = new Lampione[numLampioni];

        do {

            System.out.println("\n\t\t ~ Lampioni di (" + citta + ") ~\n Seleziona operazione");

            System.out.println("\n(1) | Inserimento dati \n");
            System.out.println("(2) | Scala ore \n");
            System.out.println("(3) | Stampa Stato \n");
            System.out.println("(4) |USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:

                    if (inizializzazione) {

                        System.out.println("!!! ELEMENTI GIA INIZIALIZZATI !!!");
                        input(lampioni, citta);

                    } else {

                        input(lampioni, citta);
                        inizializzazione = true;

                    }

                    break;

                case 2:

                    if (inizializzazione) {

                        printLampioni(lampioni, citta);

                        System.out.print("\n\nSeleziona lampione: ");
                        int sceltalamp = Integer.parseInt(tastiera.readLine());

                        System.out.print("\nInserisci le ore da scalare: ");

                        if (lampioni[sceltalamp].uso(Integer.parseInt(tastiera.readLine()))) {
                            System.out.print("\n Ore scalate ! ");
                        } else {
                            System.out.print("\n Ore non scalate ! CAUSA ROTTURA LAMPADINA ");
                        }

                    } else {
                        System.out.print("\n Lampioni NON INSERITI!  ");
                    }
                    break;

                case 3:

                    if (inizializzazione) {

                        printLampioni(lampioni, citta);

                    } else {
                        System.out.print("\n Lampioni NON INSERITI!  ");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;
            }

        } while (scelta < 4);

    }

    private static void input(Lampione lampioni[], String citta) throws IOError, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int matricolaLampione = 0;

        String quartiere;
        String tipo;
        String tecnologia;
        int voltaggio;
        int wattora;
        int lifespan;

        int scelta;
        String nomeQuartiere = "\nInserire Nome Quartiere: ";

        System.out.println("\n\t\t ~ Lampioni di (" + citta + ") ~\n Seleziona operazione di inserimento dati");

        System.out.println("\n(1) | Nuovo set di lampioni \n");
        System.out.println("(2) | Nuovo set di lampioni PREFABBRICATI |E27 LED 220 V 50 W/h 1000 ORE di Vita| \n");
        System.out.print("SCELTA: ");

        scelta = Integer.parseInt(tastiera.readLine());

        cls();

        switch (scelta) {

            case 1:

                for (int i = 0; i < lampioni.length; i++) {

                    System.out.print("( " + (i + 1) + " Lampione )\n");

                    matricolaLampione++;

                    System.out.print(nomeQuartiere);
                    quartiere = tastiera.readLine();

                    System.out.print("Inserire Tipo Attacco Lampadina: ");
                    tipo = tastiera.readLine();

                    System.out.print("Inserire Tecnologia di illuminazione: ");
                    tecnologia = tastiera.readLine();

                    System.out.print("Inserire Voltaggio: ");
                    voltaggio = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire W/hr: ");
                    wattora = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire LifeSpan IN ORE: ");
                    lifespan = Integer.parseInt(tastiera.readLine());

                    lampioni[i] = new Lampione(matricolaLampione, quartiere, tipo, tecnologia, voltaggio, wattora,
                            lifespan);

                    System.out.println();

                }

                return;

            case 2:

                for (int i = 0; i < lampioni.length; i++) {

                    System.out.print("( " + (i + 1) + " Lampione PREFABRICATO )");

                    matricolaLampione++;

                    System.out.print(nomeQuartiere);
                    quartiere = tastiera.readLine();

                    lampioni[i] = new Lampione(matricolaLampione, quartiere);

                    System.out.println();

                }

                return;

            default:
                System.out.println("Input INVALIDO, Riprova !\n\n");
                break;
        }

    }

    private static void printLampioni(Lampione lampioni[], String citta) {

        String div = "\n_____________________________________________________";

        System.out.println("\n\n\t\t  Città di " + citta + " \n");
        System.out.format("%3s", "Num");
        System.out.format("%7s", "Tipo");
        System.out.format("%12s", "Tecnologia");
        System.out.format("%6s", "Volt");
        System.out.format("%8s", "Watt/h");
        System.out.format("%10s", "LifeSpan");
        System.out.println(div);

        for (int j = 0; j < lampioni.length; j++) {
            System.out.print("\n");
            System.out.format("%3d", lampioni[j].getMatricolaLampione());
            System.out.format("%7s", lampioni[j].getTipo());
            System.out.format("%12s", lampioni[j].getTecnologia());
            System.out.format("%6d", lampioni[j].getVoltaggio());
            System.out.format("%8s", lampioni[j].getWattora());
            System.out.format("%10s", lampioni[j].getLifespan());
        }

        System.out.println(div);

    }

    private static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}