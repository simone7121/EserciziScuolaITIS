/*

Algoritmo:  Scrivere un programma che consenta di gestire un rifugio di animali

Programmatore: Simone D'Anna
Data: 03/03/2022
Versione: V3.0

*/

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Rifugiov3 {

    public static void main(String args[]) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        System.out.print("Inserire il numero degli animali: ");
        Animale animale[] = new Animale[Integer.parseInt(tastiera.readLine()) + 5];

        inizializzazione(animale);

        cls();

        menu(animale);

        cls();

    }

    private static void inizializzazione(Animale animale[]) throws IOError {

        Calendar modificata = Calendar.getInstance();

        int i = 5;

        animale[0] = new PorcIndia("Marco", 1.200, 8);

        animale[1] = new Gatto("Genoveffa", 6.000, 8, modificata);

        animale[2] = new Gatto("Leopoldo", 2.000, 0, modificata);

        animale[3] = new Animale("Alberto", 0, 15, "Carne", 4);
        animale[3].setTipoAnimale("Lupo");
        animale[3].setVersoAnimale("AAAHUUU");

        animale[4] = new Cane("Gengo", 19, 4, 1, "M", modificata);

        while (i < animale.length) {
            animale[i] = new Animale();
            i++;
        }

    }

    private static void aggiungi(Animale animale[]) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar modificata = Calendar.getInstance();

        String nome;
        double peso;
        int eta;
        String tipo;

        String taglia;
        int microChip;

        String cibo;
        int zampe;

        int scelta;
        int i;

        do {

            System.out.print("Mantenere gli animali gia' dichiarati DI DEFAULT? (1:SI 0:NO) : ");
            scelta = Integer.parseInt(tastiera.readLine());

            if (scelta == 1) {

                i = 5;

            } else if (scelta == 0) {

                i = 0;

            } else {

                i = 0;

            }

        } while (scelta > 0 && scelta < 1);

        while (i < animale.length) {

            System.out.println("\n\n | Animale Numero: (" + (i + 1) + ") |");

            System.out.print("Imposta Nome: ");
            nome = tastiera.readLine();

            System.out.print("Imposta Peso: ");
            peso = Double.parseDouble(tastiera.readLine());

            System.out.print("Imposta Eta': ");
            eta = Integer.parseInt(tastiera.readLine());

            System.out.print("Imposta Tipo Animale\n\t( Cane, Gatto, Porcellino D'India, Animale, Altro... ): ");
            tipo = tastiera.readLine();

            switch (tipo.toLowerCase()) {

                case "porcellino d'india":

                    animale[i] = new PorcIndia(nome, peso, eta);

                    i++;

                    return;

                case "gatto":

                    System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                    modificata.setTime(formatter1.parse(tastiera.readLine()));

                    animale[i] = new Gatto(nome, peso, eta, modificata);

                    i++;

                    return;

                case "cane":

                    System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                    modificata.setTime(formatter1.parse(tastiera.readLine()));

                    System.out.print("Imposta Taglia {S,M,L,XL}: ");
                    taglia = tastiera.readLine();

                    System.out.print("Imposta NUMERO Microchip: ");
                    microChip = Integer.parseInt(tastiera.readLine());

                    animale[i] = new Cane(nome, peso, eta, microChip, taglia, modificata);

                    i++;

                    return;

                case "animale":
                default:

                    System.out.print("Imposta tipo CIBO: ");
                    cibo = tastiera.readLine();

                    System.out.print("Imposta zampe: ");
                    zampe = Integer.parseInt(tastiera.readLine());

                    animale[i] = new Animale(nome, peso, eta, cibo, zampe);

                    i++;

                    return;

            }

        }

    }

    private static void menu(Animale animale[])
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
                    printAnimali(animale, 3);

                    break;

                case 4:

                    printAnimali(animale, 2);

                    break;

                case 5:

                    printAnimali(animale, 1);

                    break;

                case 6:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;

            }

        } while (scelta < 6);
    }

    private static void printAnimali(Animale animale[], int tipostampa) throws IOError {

        Calendar oggi = Calendar.getInstance();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormattata;

        Gatto gattocopia;
        Cane canecopia;
        PorcIndia porcicopia;

        final String DIV = "\n________________________________\n";

        if (tipostampa == 1) {

            for (int i = 0; i < animale.length; i++) {

                if (animale[i].getTipoAnimale().equalsIgnoreCase("gatto")) {

                    gattocopia = (Gatto) animale[i];

                    if (oggi.before(gattocopia.getScadVacc())) {
                        dataFormattata = formatter.format(gattocopia.getScadVacc().getTime());
                        System.out.println("Il vaccino del gatto " + gattocopia.getNome()
                                + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
                    } else {

                        dataFormattata = formatter.format(gattocopia.getScadVacc().getTime());
                        System.out.println("Il vaccino del gatto " + gattocopia.getNome()
                                + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

                    }

                } else if (animale[i].getTipoAnimale().equalsIgnoreCase("cane")) {

                    canecopia = (Cane) animale[i];

                    if (oggi.before(canecopia.getScadVacc())) {
                        dataFormattata = formatter.format(canecopia.getScadVacc().getTime());
                        System.out.println("Il vaccino del cane " + canecopia.getNome()
                                + " NON E' Scaduto !!\n\t Data scadenza : (" + dataFormattata + ")\n");
                    } else {
                        dataFormattata = formatter.format(canecopia.getScadVacc().getTime());
                        System.out.println("Il vaccino del cane " + canecopia.getNome()
                                + " E' Scaduto !! \n\t Data scadenza : (" + dataFormattata + ")\n");

                    }

                }

            }

        } else if (tipostampa == 2) {

            System.out.println("\n\t\t ~ Elenco degli animali con accanto quantità di acqua e di cibo~\n\n");

            System.out.println(DIV);

            for (int i = 0; i < animale.length; i++) {

                if (animale[i].getTipoAnimale().equalsIgnoreCase("cane")) {
                    canecopia = (Cane) animale[i];
                    System.out.println(canecopia.mangia());
                } else if (animale[i].getTipoAnimale().equalsIgnoreCase("gatto")) {
                    gattocopia = (Gatto) animale[i];
                    System.out.println(gattocopia.mangia());
                } else if (animale[i].getTipoAnimale().equalsIgnoreCase("porcellino")) {
                    porcicopia = (PorcIndia) animale[i];
                    System.out.println(porcicopia.mangia());
                } else {
                    System.out.println(animale[i].bevi());
                }

            }

            System.out.println(DIV);

        } else if (tipostampa == 3) {

            printTabellone(animale);

        }
    }

    private static void printTabellone(Animale animale[]) {

        Cane canecopia;

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

        for (int i = 0; i < animale.length; i++) {

            System.out.print("\n");
            System.out.format("%20s", animale[i].getTipoAnimale());
            System.out.format("%15s", animale[i].getNome());
            System.out.format("%5d", animale[i].getEta());
            System.out.format("%10d", animale[i].getZampe());
            System.out.format("%9.3f", animale[i].getPeso());

            if (animale[i].getTipoAnimale().equalsIgnoreCase("cane")) {
                canecopia = (Cane) animale[i];
                System.out.format("%11s", canecopia.getTaglia());
                System.out.format("%14d", canecopia.getMicroChip());
            } else {
                System.out.format("%11s", "\\");
                System.out.format("%14s", "\\");
            }

        }

        System.out.println(div);

    }

    private static void modifica(Animale animale[]) throws IOError, IOException, ParseException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int scelta;

        String nome;
        double peso;
        int eta;
        String taglia;
        int microChip;
        String cibo;
        int zampe;

        Gatto gattocopia;
        Cane canecopia;
        PorcIndia porcicopia;

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar modificata = Calendar.getInstance();

        
        printTabellone(animale);

        System.out.println(
                "\n\t\t Seleziona soggetto della quale volere modificare i dati");


        System.out.print("SCELTA (da 1 a " + animale.length + "): ");

        scelta = Integer.parseInt(tastiera.readLine())-1;

        cls();

        switch (animale[scelta].getTipoAnimale().toLowerCase()) {

            case "porcellino d'india":
                
                porcicopia = (PorcIndia) animale[scelta]; 

                porcicopia.status();

                System.out.print("\n\n\nImposta Nome: ");
                nome = tastiera.readLine();

                System.out.print("Imposta Peso: ");
                peso = Double.parseDouble(tastiera.readLine());

                System.out.print("Imposta Eta': ");
                eta = Integer.parseInt(tastiera.readLine());

                animale[scelta] = new PorcIndia(nome, peso, eta);

                return;

            case "gatto":

                gattocopia = (Gatto) animale[scelta]; 

                gattocopia.status();

                System.out.print("\n\n\nImposta Nome: ");
                nome = tastiera.readLine();

                System.out.print("Imposta Peso: ");
                peso = Double.parseDouble(tastiera.readLine());

                System.out.print("Imposta Eta': ");
                eta = Integer.parseInt(tastiera.readLine());

                System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                modificata.setTime(formatter1.parse(tastiera.readLine()));

                animale[scelta] = new Gatto(nome, peso, eta, modificata);

                return;

            case "cane":

                canecopia = (Cane) animale[scelta]; 

                canecopia.status();

                System.out.print("\n\n\nImposta Nome: ");
                nome = tastiera.readLine();

                System.out.print("Imposta Peso: ");
                peso = Double.parseDouble(tastiera.readLine());

                System.out.print("Imposta Eta': ");
                eta = Integer.parseInt(tastiera.readLine());

                System.out.print("Imposta Data scadenza vaccino Formato (GG/MM/AAAA): ");
                modificata.setTime(formatter1.parse(tastiera.readLine()));

                System.out.print("Imposta Taglia {S,M,L,XL}: ");
                taglia = tastiera.readLine();

                System.out.print("Imposta NUMERO Microchip: ");
                microChip = Integer.parseInt(tastiera.readLine());

                animale[scelta] = new Cane(nome, peso, eta, microChip, taglia, modificata);

                return;

            case "animale":
            default:

                animale[scelta].status();

                System.out.print("\n\n\nImposta Nome: ");
                nome = tastiera.readLine();

                System.out.print("Imposta Peso: ");
                peso = Double.parseDouble(tastiera.readLine());

                System.out.print("Imposta Eta': ");
                eta = Integer.parseInt(tastiera.readLine());

                System.out.print("Imposta tipo CIBO: ");
                cibo = tastiera.readLine();

                System.out.print("Imposta zampe: ");
                zampe = Integer.parseInt(tastiera.readLine());

                animale[scelta] = new Animale(nome, peso, eta, cibo, zampe);

                return;

        }

    }

    private static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}