/*

	Algoritmo:  Scrivere un programma che consenta di gestire un rifugio di animali
	
	Programmatore: Simone D'Anna
	Data: 27/02/2022
	Versione: V2.0

*/

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Rifugiov2 {

    public static void main(String args[]) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        System.out.print("Inserire il numero dei porcellini: ");
        PorcIndia porcellino[] = new PorcIndia[Integer.parseInt(tastiera.readLine()) + 1];

        System.out.print("Inserire il numero dei gatti: ");
        Gatto gatti[] = new Gatto[Integer.parseInt(tastiera.readLine()) + 2];

        System.out.print("Inserire il numero dei cani: ");
        Cane cane[] = new Cane[Integer.parseInt(tastiera.readLine()) + 1];

        System.out.print("Inserire il numero degli altri animali: ");
        Animale animale[] = new Animale[Integer.parseInt(tastiera.readLine()) + 1];

        inizializzazione(porcellino, gatti, animale, cane);

        cls();

        menu(animale);

        cls();

    }

    private static void inizializzazione(PorcIndia porcellino[], Gatto gatti[], Animale animale[], Cane cane[])
            throws IOError {

        for (int i = 0; i < porcellino.length; i++) {
            porcellino[i] = new PorcIndia();
        }
        porcellino[0].setPeso(1.200);
        porcellino[0].setEta(8);
        porcellino[0].setNome("Marco");

        for (int i = 0; i < gatti.length; i++) {
            gatti[i] = new Gatto();
        }
        gatti[0].setPeso(6.000);
        gatti[0].setEta(8);
        gatti[0].setNome("Genoveffa");

        gatti[1].setPeso(2.000);
        gatti[1].setEta(0);
        gatti[1].setNome("Leopoldo");

        for (int i = 0; i < animale.length; i++) {
            animale[i] = new Animale(4);

        }
        animale[0].setEta(15);
        animale[0].setVersoAnimale("AAAHUUU");
        animale[0].setNome("Alberto");
        animale[0].setTipoAnimale("Lupo");

        //Cane c = (Cane) animale[i];

        for (int i = 0; i < cane.length; i++) {
            cane[i] = new Cane();
        }
        cane[0].setPeso(19);
        cane[0].setEta(4);
        cane[0].setNome("Gengo");
        cane[0].setTaglia("M");
    }

    private static void menu(PorcIndia porcellino[], Gatto gatti[], Animale animale[], Cane cane[])
            throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

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

                    aggiungi(animale);

                    break;

                case 2:

                    modifica(animale);

                    break;

                case 3:
                    printAnimali(porcellino, gatti, animale, cane, 3);

                    break;

                case 4:

                    printAnimali(porcellino, gatti, animale, cane, 2);

                    break;

                case 5:

                    printAnimali(porcellino, gatti, animale, cane, 1);

                    break;

                case 6:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;

            }

        } while (scelta < 6);
    }

    private static void printAnimali(PorcIndia porcellino[], Gatto gatti[], Animale animale[], Cane cane[],
            int tipostampa) throws IOError {

        Calendar oggi = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormattata;

        final String DIV = "\n________________________________\n";

        if (tipostampa == 1) {

            for (int i = 0; i < gatti.length; i++) {

                if (oggi.before(gatti[i].getScadVacc())) {
                    dataFormattata = formatter.format(gatti[i].getScadVacc().getTime());
                    System.out.println("Il vaccino del gatto " + gatti[i].getNome()
                            + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
                } else {

                    dataFormattata = formatter.format(gatti[i].getScadVacc().getTime());
                    System.out.println("Il vaccino del gatto " + gatti[i].getNome()
                            + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

                }

            }

            for (int i = 0; i < cane.length; i++) {

                if (oggi.before(cane[i].getScadVacc())) {
                    dataFormattata = formatter.format(cane[i].getScadVacc().getTime());
                    System.out.println("Il vaccino del cane " + cane[i].getNome()
                            + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
                } else {

                    dataFormattata = formatter.format(cane[i].getScadVacc().getTime());
                    System.out.println("Il vaccino del cane " + cane[i].getNome()
                            + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

                }

            }

        } else if (tipostampa == 2) {

            System.out.println("\n\t\t ~ Elenco degli animali con accanto quantità di acqua e di cibo~\n\n");

            for (int i = 0; i < porcellino.length; i++) {
                System.out.println(porcellino[i].mangia());
            }

            System.out.println(DIV);

            for (int i = 0; i < gatti.length; i++) {
                System.out.println(gatti[i].mangia());
            }

            System.out.println(DIV);

            for (int i = 0; i < cane.length; i++) {
                System.out.println(cane[i].mangia());
            }

            System.out.println(DIV);

            for (int i = 0; i < animale.length; i++) {
                System.out.println(animale[i].bevi());
            }

            System.out.println(DIV);

        } else if (tipostampa == 3) {

            printTabellone(animale);

        }
    }

    private static void modifica(PorcIndia porcellino[], Gatto gatti[], Animale animale[], Cane cane[])
            throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int scelta;
        int scelta2;
        int index;

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar modificata = Calendar.getInstance();

        System.out.println(
                "\n\t\t ~ Il rifugio dei trovatelli ~\n Seleziona soggetto della quale volere modificare i dati");

        System.out.println("\n(1) | Modifica Porcellini \n");
        System.out.println("(2) | Modifica Gatti \n");
        System.out.println("(3) | Modifica Animali \n");
        System.out.println("(4) | Modifica Cani \n\n");
        System.out.print("SCELTA: ");

        scelta = Integer.parseInt(tastiera.readLine());

        cls();

        switch (scelta) {

            case 1:

                for (int i = 0; i < porcellino.length; i++) {
                    System.out.println("\n\n |Numero: (" + (i + 1) + ") |");
                    porcellino[i].status();
                }

                System.out.print("\n\nSeleziona il porcellino: ");
                index = Integer.parseInt(tastiera.readLine()) - 1;

                System.out.println("\n\t\t ~ Porcellino " + porcellino[index].getNome()
                        + " ~\n Seleziona operazione di modifica dati");
                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.println("Imposta Nome: ");
                        porcellino[index].setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        porcellino[index].setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        porcellino[index].setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    default:
                        break;
                }

                return;

            case 2:
                for (int i = 0; i < gatti.length; i++) {
                    System.out.println("\n\n |Numero: (" + (i + 1) + ") |");
                    gatti[i].status();
                }

                System.out.print("\n\nSeleziona il gatto: ");
                index = Integer.parseInt(tastiera.readLine()) - 1;

                System.out.println("\n\t\t ~ Gatto " + gatti[index].getNome()
                        + " selezionato ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n");
                System.out.println("(4) | Modifica Data scadenza vaccino \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.print("Imposta Nome: ");
                        gatti[index].setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.print("Imposta Peso: ");
                        gatti[index].setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.print("Imposta Eta': ");
                        gatti[index].setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    case 4:
                        System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                        modificata.setTime(formatter1.parse(tastiera.readLine()));
                        gatti[index].setScadVacc(modificata);
                        return;

                    default:
                        break;
                }

                return;

            case 3:

                for (int i = 0; i < animale.length; i++) {
                    System.out.println("\n\n |Numero: (" + (i + 1) + ") |");
                    animale[i].status();
                }

                System.out.print("\n\nSeleziona l'animale: ");
                index = Integer.parseInt(tastiera.readLine()) - 1;

                System.out.println("\n\t\t ~ Animale " + animale[index].getNome()
                        + " selezionato ~\n Seleziona operazione di modifica dati");

                System.out.println("\n(1) | Modifica Nome \n");
                System.out.println("(2) | Modifica Peso \n");
                System.out.println("(3) | Modifica Eta \n\n");
                System.out.println("(4) | Modifica Tipo animale \n\n");

                System.out.print("SCELTA: ");

                scelta2 = Integer.parseInt(tastiera.readLine());

                switch (scelta2) {
                    case 1:
                        System.out.println("Imposta Nome: ");
                        animale[index].setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        animale[index].setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        animale[index].setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    case 4:
                        System.out.println("Imposta Tipo Animale': ");
                        animale[index].setTipoAnimale(tastiera.readLine());
                        return;

                    default:
                        break;
                }

                return;

            case 5:

                for (int i = 0; i < cane.length; i++) {
                    System.out.println("\n\n |Numero: (" + (i + 1) + ") |");
                    cane[i].status();
                }

                System.out.print("\n\nSeleziona il cane: ");
                index = Integer.parseInt(tastiera.readLine()) - 1;

                System.out.println("\n\t\t ~ Cane " + cane[index].getNome()
                        + " selezionato ~\n Seleziona operazione di modifica dati");

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
                        cane[index].setNome(tastiera.readLine());
                        return;

                    case 2:
                        System.out.println("Imposta Peso: ");
                        cane[index].setPeso(Double.parseDouble(tastiera.readLine()));
                        return;

                    case 3:
                        System.out.println("Imposta Eta': ");
                        cane[index].setPeso(Integer.parseInt(tastiera.readLine()));
                        return;

                    case 4:
                        System.out.println("Imposta Taglia {S,M,L,XL}: ");
                        cane[index].setTaglia(tastiera.readLine());
                        return;

                    case 5:
                        System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                        modificata.setTime(formatter1.parse(tastiera.readLine()));
                        cane[index].setScadVacc(modificata);
                        return;

                    default:
                        break;
                }

                return;

            default:
                System.out.println("Input INVALIDO, Riprova !\n\n");
                break;

        }

    }

    private static void aggiungi(PorcIndia porcellino[], Gatto gatti[], Animale animale[], Cane cane[])
            throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int scelta;

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar modificata = Calendar.getInstance();

        System.out.println(
                "\n\t\t ~ Il rifugio dei trovatelli ~\n Seleziona soggetto della quale volere aggiungere i dati");

        System.out.println("\n(1) | Modifica Porcellini \n");
        System.out.println("(2) | Modifica Gatti \n");
        System.out.println("(3) | Modifica Animali \n");
        System.out.println("(4) | Modifica Cani \n\n");
        System.out.print("SCELTA: ");

        scelta = Integer.parseInt(tastiera.readLine());

        cls();

        switch (scelta) {

            case 1:

                for (int i = 0; i < porcellino.length; i++) {

                    System.out.println("\n\n | Porcellino Numero: (" + (i + 1) + ") |");

                    System.out.print("Imposta Nome: ");
                    porcellino[i].setNome(tastiera.readLine());

                    System.out.print("Imposta Peso: ");
                    porcellino[i].setPeso(Double.parseDouble(tastiera.readLine()));

                    System.out.print("Imposta Eta': ");
                    porcellino[i].setEta(Integer.parseInt(tastiera.readLine()));

                }

                return;

            case 2:

                for (int i = 0; i < gatti.length; i++) {

                    System.out.println("\n\n | Gatto Numero: (" + (i + 1) + ") |");

                    System.out.print("Imposta Nome: ");
                    gatti[i].setNome(tastiera.readLine());

                    System.out.print("Imposta Peso: ");
                    gatti[i].setPeso(Double.parseDouble(tastiera.readLine()));

                    System.out.print("Imposta Eta': ");
                    gatti[i].setEta(Integer.parseInt(tastiera.readLine()));

                    System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                    modificata.setTime(formatter1.parse(tastiera.readLine()));
                    gatti[i].setScadVacc(modificata);

                }

                return;

            case 3:

                for (int i = 0; i < animale.length; i++) {

                    System.out.println("\n\n | Animale Numero: (" + (i + 1) + ") |");

                    System.out.print("Imposta Nome: ");
                    animale[i].setNome(tastiera.readLine());

                    System.out.print("Imposta Peso: ");
                    animale[i].setPeso(Double.parseDouble(tastiera.readLine()));

                    System.out.print("Imposta Eta': ");
                    animale[i].setEta(Integer.parseInt(tastiera.readLine()));

                    System.out.print("Imposta Tipo Animale: ");
                    animale[i].setTipoAnimale(tastiera.readLine());

                }

                return;

            case 4:

                for (int i = 0; i < cane.length; i++) {

                    System.out.println("\n\n | Cane Numero: (" + (i + 1) + ") |");

                    System.out.print("Imposta Nome: ");
                    cane[i].setNome(tastiera.readLine());

                    System.out.print("Imposta Peso: ");
                    cane[i].setPeso(Double.parseDouble(tastiera.readLine()));

                    System.out.print("Imposta Eta': ");
                    cane[i].setEta(Integer.parseInt(tastiera.readLine()));

                    System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                    modificata.setTime(formatter1.parse(tastiera.readLine()));
                    cane[i].setScadVacc(modificata);

                    System.out.print("Imposta Taglia {S,M,L,XL}: ");
                    cane[i].setTaglia(tastiera.readLine());

                }

                return;

            default:
                System.out.println("Input INVALIDO, Riprova !\n\n");
                break;

        }

    }

    private static void printTabellone(PorcIndia porcellino[], Gatto gatti[], Animale animale[], Cane cane[]) {

        String div = "\n______________________________________________________________________________________________";

        System.out.println("\n\n\t\t\t  Animali del rifugio \n");
        System.out.format("%20s", "Tipo");
        System.out.format("%15s", "Nome");
        System.out.format("%5s", "Eta");
        System.out.format("%10s", "Zampe");
        System.out.format("%9s", "Peso");
        System.out.format("%11s", "Taglia");
        System.out.format("%14s", "Microchip");
        System.out.println(div);

        for (int i = 0; i < cane.length; i++) {
            System.out.print("\n");
            System.out.format("%20s", cane[i].getTipoAnimale());
            System.out.format("%15s", cane[i].getNome());
            System.out.format("%5d", cane[i].getEta());
            System.out.format("%10d", cane[i].getZampe());
            System.out.format("%9.3f", cane[i].getPeso());
            System.out.format("%11s", cane[i].getTaglia());
            System.out.format("%14d", cane[i].getMicroChip());
        }

        for (int i = 0; i < porcellino.length; i++) {
            System.out.print("\n");
            System.out.format("%20s", porcellino[i].getTipoAnimale());
            System.out.format("%15s", porcellino[i].getNome());
            System.out.format("%5d", porcellino[i].getEta());
            System.out.format("%10d", porcellino[i].getZampe());
            System.out.format("%9.3f", porcellino[i].getPeso());
            System.out.format("%11s", "\\");
            System.out.format("%14s", "\\");
        }

        for (int i = 0; i < gatti.length; i++) {
            System.out.print("\n");
            System.out.format("%20s", gatti[i].getTipoAnimale());
            System.out.format("%15s", gatti[i].getNome());
            System.out.format("%5d", gatti[i].getEta());
            System.out.format("%10d", gatti[i].getZampe());
            System.out.format("%9.3f", gatti[i].getPeso());
            System.out.format("%11s", "\\");
            System.out.format("%14s", "\\");
        }

        for (int i = 0; i < animale.length; i++) {
            System.out.print("\n");
            System.out.format("%20s", animale[i].getTipoAnimale());
            System.out.format("%15s", animale[i].getNome());
            System.out.format("%5d", animale[i].getEta());
            System.out.format("%10d", animale[i].getZampe());
            System.out.format("%9.3f", animale[i].getPeso());
            System.out.format("%11s", "\\");
            System.out.format("%14s", "\\");
        }

        System.out.println(div);

    }

    private static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}