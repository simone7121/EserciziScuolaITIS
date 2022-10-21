/*

	Algoritmo:  Scrivere un programma che consenta di gestire un rifugio di animali
	
	Programmatore: Simone D'Anna
	Data: 27/02/2022
	Versione: V1.0

*/

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Rifugio {

    public static void main(String args[]) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        PorcIndia porcellinoMarco = new PorcIndia();
        Gatto gattaGenoveffa = new Gatto();
        Animale lupoAlberto = new Animale();
        Gatto gattoLeopoldo = new Gatto();
        Cane caneGengo = new Cane();

        porcellinoMarco.setPeso(1.200);
        porcellinoMarco.setEta(8);
        porcellinoMarco.setNome("Marco");

        gattaGenoveffa.setPeso(6.000);
        gattaGenoveffa.setEta(8);
        gattaGenoveffa.setNome("Genoveffa");

        lupoAlberto.setZampe(4);
        lupoAlberto.setEta(15);
        lupoAlberto.setVersoAnimale("AAAHUUU");
        lupoAlberto.setNome("Alberto");

        gattoLeopoldo.setPeso(2.000);
        gattoLeopoldo.setEta(0);
        gattoLeopoldo.setNome("Leopoldo");

        caneGengo.setPeso(19);
        caneGengo.setEta(4);
        caneGengo.setNome("Gengo");
        caneGengo.setTaglia("M");

        cls();

        menu(porcellinoMarco, gattaGenoveffa, lupoAlberto, gattoLeopoldo, caneGengo);

    }

    private static void menu(PorcIndia porcellinoMarco, Gatto gattaGenoveffa, Animale lupoAlberto,
            Gatto gattoLeopoldo, Cane caneGengo) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        boolean inizializzazione = true; // Per un futuro aggiornamento nell'inserimento dei dati
        int scelta;

        do {

            System.out.println("\n\t\t ~ Il rifugio dei trovatelli ~\n Seleziona operazione");

            System.out.println("\n(1) | Inserimento dati \n");
            System.out.println("(2) | Modifica valori Animali \n");
            System.out.println("(3) | Stampa Stato Aniamli \n");
            System.out.println("(4) | Stampa Mangime Aniamli \n");
            System.out.println("(5) | Stampa Elenco Vaccinazione Animali \n");
            System.out.println("(6) | USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:

                    /*
                     * 
                     * if (inizializzazione) {
                     * 
                     * System.out.println("!!! ELEMENTI GIA INIZIALIZZATI !!!");
                     * input(lampioni, citta);
                     * 
                     * } else {
                     * 
                     * input(lampioni, citta);
                     * inizializzazione = true;
                     * 
                     * }
                     */
                    break;

                case 2:

                    if (inizializzazione) {

                        modifica(porcellinoMarco, gattaGenoveffa, lupoAlberto, gattoLeopoldo, caneGengo);

                    } else {
                        System.out.print("\n Animali NON INSERITI!  ");
                    }
                    break;

                case 3:
                    if (inizializzazione) {

                        printAnimali(porcellinoMarco, gattaGenoveffa, lupoAlberto, gattoLeopoldo, caneGengo, 3);

                    } else {
                        System.out.print("\n Animali NON INSERITI!  ");
                    }
                    break;

                case 4:
                    if (inizializzazione) {

                        printAnimali(porcellinoMarco, gattaGenoveffa, lupoAlberto, gattoLeopoldo, caneGengo, 2);

                    } else {
                        System.out.print("\n Animali NON INSERITI!  ");
                    }

                    break;

                case 5:

                    if (inizializzazione) {

                        printAnimali(porcellinoMarco, gattaGenoveffa, lupoAlberto, gattoLeopoldo, caneGengo, 1);

                    } else {
                        System.out.print("\n Animali NON INSERITI!  ");
                    }
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;

            }

        } while (scelta < 6);
    }

    private static void printAnimali(PorcIndia porcellinoMarco, Gatto gattaGenoveffa, Animale lupoAlberto,
            Gatto gattoLeopoldo, Cane caneGengo, int tipostampa) throws IOError {

        Calendar oggi = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormattata;

        if (tipostampa == 1) {

            if (oggi.before(gattaGenoveffa.getScadVacc())) {
                dataFormattata = formatter.format(gattaGenoveffa.getScadVacc().getTime());
                System.out.println("Il vaccino della gatta " + gattaGenoveffa.getNome()
                        + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
            } else {

                dataFormattata = formatter.format(gattaGenoveffa.getScadVacc().getTime());
                System.out.println("Il vaccino della gatta " + gattaGenoveffa.getNome()
                        + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

            }

            if (oggi.before(gattoLeopoldo.getScadVacc())) {
                dataFormattata = formatter.format(gattoLeopoldo.getScadVacc().getTime());
                System.out.println("Il vaccino del gatto " + gattoLeopoldo.getNome()
                        + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
            } else {
                dataFormattata = formatter.format(gattoLeopoldo.getScadVacc().getTime());
                System.out.println("Il vaccino del gatto " + gattoLeopoldo.getNome()
                        + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

            }

            if (oggi.before(caneGengo.getScadVacc())) {
                dataFormattata = formatter.format(caneGengo.getScadVacc().getTime());
                System.out.println("Il vaccino del cane " + caneGengo.getNome()
                        + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
            } else {

                dataFormattata = formatter.format(caneGengo.getScadVacc().getTime());
                System.out.println("Il vaccino del cane " + caneGengo.getNome()
                        + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

            }

        } else if (tipostampa == 2) {
            System.out.println("\n\t\t ~ Elenco degli animali con accanto quantità di acqua e di cibo~\n\n");
            System.out.println(porcellinoMarco.mangia());
            System.out.println(gattaGenoveffa.mangia());
            System.out.println(lupoAlberto.bevi());
            System.out.println(gattoLeopoldo.mangia());
            System.out.println(caneGengo.mangia());
        } else if (tipostampa == 3) {
            porcellinoMarco.status();
            gattaGenoveffa.status();
            lupoAlberto.status();
            gattoLeopoldo.status();
            caneGengo.status();
        }
    }

    private static void modifica(PorcIndia porcellinoMarco, Gatto gattaGenoveffa, Animale lupoAlberto,
            Gatto gattoLeopoldo, Cane caneGengo) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int scelta;
        int scelta2;

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar modificata = Calendar.getInstance();

        System.out.println(
                "\n\t\t ~ Il rifugio dei trovatelli ~\n Seleziona soggetto della quale volere modificare i dati");

        System.out.println("\n(1) | Modifica Porcellino Marco \n");
        System.out.println("(2) | Modifica Gatta Genoveffa \n");
        System.out.println("(3) | Modifica Lupo Alberto \n");
        System.out.println("(4) | Modifica Gatto Leopoldo \n");
        System.out.println("(5) | Modifica Cane Gengo \n\n");
        System.out.print("SCELTA: ");

        scelta = Integer.parseInt(tastiera.readLine());

        cls();

        switch (scelta) {

            case 1:

                System.out.println("\n\t\t ~ Porcellino Marco selezionato ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.println("Imposta Nome: ");
                        porcellinoMarco.setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        porcellinoMarco.setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        porcellinoMarco.setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    default:
                        break;
                }

            case 2:
                System.out.println("\n\t\t ~ Gatta Genoveffa selezionata ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n");
                System.out.println("(4) | Modifica Data scadenza vaccino \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.print("Imposta Nome: ");
                        gattaGenoveffa.setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.print("Imposta Peso: ");
                        gattaGenoveffa.setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.print("Imposta Eta': ");
                        gattaGenoveffa.setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    case 4:
                        System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                        modificata.setTime(formatter1.parse(tastiera.readLine()));
                        gattaGenoveffa.setScadVacc(modificata);
                        return;

                    default:
                        break;
                }

            case 3:
                System.out.println("\n\t\t ~ Lupo Alberto selezionato ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.println("Imposta Nome: ");
                        lupoAlberto.setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        lupoAlberto.setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        lupoAlberto.setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    default:
                        break;
                }

            case 4:
                System.out.println("\n\t\t ~ Gatto Leopoldo selezionato ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n");
                System.out.println("(4) | Modifica Data scadenza vaccino \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.println("Imposta Nome: ");
                        gattoLeopoldo.setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        gattoLeopoldo.setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        gattoLeopoldo.setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    case 4:
                        System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                        modificata.setTime(formatter1.parse(tastiera.readLine()));
                        gattaGenoveffa.setScadVacc(modificata);
                        return;

                    default:
                        break;
                }

            case 5:

                System.out.println("\n\t\t ~ Cane Gengo selezionato ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n");
                System.out.println("(4) | Modifica Taglia \n");
                System.out.println("(5) | Modifica Data scadenza vaccino \n\n");
                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.println("Imposta Nome: ");
                        caneGengo.setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        caneGengo.setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        caneGengo.setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    case 4:
                        System.out.println("Imposta Taglia {S,M,L,XL}: ");
                        caneGengo.setTaglia(tastiera.readLine());
                        return;

                    case 5:
                        System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                        modificata.setTime(formatter1.parse(tastiera.readLine()));
                        gattaGenoveffa.setScadVacc(modificata);
                        return;

                    default:
                        break;
                }

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