/*

    Algoritmo:  
                1.  Scrivere la classe Pacco avente i seguenti attributi base, altezza e profondità: tre numeri 
                    con la virgola rispettivamente la base,l'altezza e la profondità del pacco, e l'attributo numero di 
                    tipo numero intero che identifica il pacco. Il costruttore ha come parametri tre numeri con 
                    la virgola (coerente con la scelta fatta per gli attributi base altezza e profondità) 
                    ed assegna il valore dei parametri agli attributi base, altezza e profondità.
                    Scrivere il metodo setNumero che ha come parametro una variabile di tipo numero intero, tale 
                    metodo assegna il valore del parametro all'attributo numero. 
                    Scrivere il metodo volume che restituisce il valore del volume del pacco prodotto dei tre 
                    attributi base, altezza e profondità). 

                2.  Scrivere la sottoclasse PaccoAColori della classe Pacco, avente in più l'attributo colore di 
                    tipo stringa. La sottoclasse ha i seguenti metodi: - il metodo setColore che ha un parametro 
                    di tipo stringa, il metodo assegna all'attributo 
                    colore il valore del parametro - il metodo stampa che stampa a video i valori degli attributi. 
                    Il metodo stampa Volume che stampa a video il valore del volume utilizzando il metodo volume 

                3.  Scrivere la classe Prova che ha il metodo main in cui occorre istanziare un oggetto di tipo 
                    Pacco con base 3,5 altezza 4,5 e profondità 6,0. Richiamare il metodo setNumero con 
                    parametro pari a 3 e stampare il valore del volume del pacco richiamando opportunamente 
                    il metodo volume. Istanziare un altro oggetto di tipo PaccoAColori con base 2,4 altezza 5,3 
                    profondità 5,5 e richiamare il metodo setColore con colore rosso. Infine richiamare il metodo 
                    stampa Volume per stampare il volume del pacco a colori. 


    Programmatore: Simone D'Anna
    Data: 20/02/2022
    Versione: V2.0

*/

import java.io.*;

public class Prova {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        int numPacchiColor;
        int numPacchi;
        boolean inizializzazione = false;
        int scelta;

        do {

            System.out.print("\nInserisci il totale dei pacchi normali: ");
            numPacchi = Integer.parseInt(tastiera.readLine());

        } while (numPacchi < 0);

        Pacco pacchi[] = new Pacco[numPacchi];

        do {

            System.out.print("\nInserisci il totale dei pacchi a colori: ");
            numPacchiColor = Integer.parseInt(tastiera.readLine());

        } while (numPacchiColor < 0);

        PaccoAColori pacchicolori[] = new PaccoAColori[numPacchiColor];

        do {

            System.out.println("\n\t\t Seleziona operazione");

            System.out.println("\n(1) | Inserimento dati \n");
            System.out.println("(2) | Stampa pacchi normali \n");
            System.out.println("(3) | Stampa pacchi a colori \n");
            System.out.println("(4) | USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:

                    if (inizializzazione) {

                        System.out.println("!!! ELEMENTI GIA INIZIALIZZATI !!!");
                        input(pacchi, pacchicolori);

                    } else {

                        input(pacchi, pacchicolori);
                        inizializzazione = true;

                    }

                    break;

                case 2:

                    if (inizializzazione) {

                        for (int i = 0; i < pacchi.length; i++) {
                            pacchi[i].stampa();
                            System.out.print("\n\tIl volume e' : " + pacchi[i].volume() + "\n");
                        }

                    } else {

                        System.out.print("\n Pacchi NON INSERITI ! ");

                    }

                    break;

                case 3:

                    if (inizializzazione) {

                        for (int i = 0; i < pacchicolori.length; i++) {
                            pacchicolori[i].stampa();
                            pacchicolori[i].stampaVolume();
                        }

                    } else {

                        System.out.print("\n Pacchi NON INSERITI ! ");

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

    private static void input(Pacco pacchi[], PaccoAColori pacchicolori[]) throws IOError, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int matricolaPacco = 1;

        int base;
        int altezza;
        int profondita;
        String colore;

        int scelta;

        System.out.println("\n\t\t Seleziona operazione di inserimento dati");

        System.out.println("\n(1) | Nuovo set di Pacchi \n");
        System.out.println("(2) | Nuovo set di Pacchi a Colori \n");
        System.out.print("SCELTA: ");

        scelta = Integer.parseInt(tastiera.readLine());

        cls();

        switch (scelta) {

            case 1:

                for (int i = 0; i < pacchi.length; i++) {

                    System.out.print("( " + (i + 1) + " Lampione )\n");

                    matricolaPacco++;

                    System.out.print("Inserire Base: ");
                    base = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire Altezza: ");
                    altezza = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire Profondita': ");
                    profondita = Integer.parseInt(tastiera.readLine());

                    pacchi[i] = new Pacco(base, altezza, profondita);

                    pacchi[i].setNumero(matricolaPacco);

                    matricolaPacco++;

                    System.out.println();

                }

                return;

            case 2:

                for (int i = 0; i < pacchicolori.length; i++) {

                    System.out.print("( " + (i + 1) + " Lampione )\n");

                    matricolaPacco++;

                    System.out.print("Inserire Base: ");
                    base = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire Altezza: ");
                    altezza = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire Profondita': ");
                    profondita = Integer.parseInt(tastiera.readLine());

                    System.out.print("Inserire il colore: ");
                    colore = tastiera.readLine();

                    pacchicolori[i] = new PaccoAColori(base, altezza, profondita);

                    pacchicolori[i].setColore(colore);

                    pacchicolori[i].setNumero(matricolaPacco);

                    matricolaPacco++;

                    System.out.println();

                }

                return;

            default:
                System.out.println("Input INVALIDO, Riprova !\n\n");
                break;
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