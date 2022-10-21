/*

    Algoritmo:      Un oggetto della classe Famiglia rappresenta un nucleo familiare. 
                    La classe Famiglia ha le seguenti informazioni: cognome: che memorizza il cognome della famiglia, nomeComponenti elenco dei componenti della famiglia (i loro nomi) 
                    e età le corrispondenti età.

                    Inoltre la classe Famiglia oltre al costruttore ha i seguenti metodi:
                    • Un metodo di nome piùGrande che restituisce, come unica stringa, cognome e nome del componente della famiglia che ha l’età maggiore 
                        (Se ci sono più di due componenti di età massima, ne restituisce uno arbitrariamente).
                    • Un metodo di nome minori che visualizza i nomi di tutti i componenti della famiglia che sono minorenni (Cioè che hanno meno di 18 anni).

                    Il metodo main della classe di test svolge i seguenti punti:
                    •   Fa inserire all’utente i dati completi di una famiglia (il numero di componenti è scelto
                        dall’utente).
                    •   Visualizza all’utente cognome e nome del componente con età maggiore.
                    •   Visualizza all’utente il nome di tutti i componenti con età minore di 18 anni.
                    
                    Consegnare anche l'UML della classe Famiglia.

    Programmatore:  Simone D'Anna
    
    Data:           02/01/2022

*/

import java.io.*;

public class TestFamiglia {

    static BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        cls();

        int index = numeronucleo();
        String cognome = cognomenucleo();

        Famiglia nucleoFamiglia = new Famiglia(cognome, index);

        scelta(nucleoFamiglia, index);

    }

    private static int numeronucleo() throws NumberFormatException, IOException {

        int numero;

        do {
            System.out.print("\nInserire il numero totale di familiari: ");
            numero = Integer.parseInt(tastiera.readLine());
        } while (numero <= 1);

        return numero;

    }

    private static String cognomenucleo() throws NumberFormatException, IOException {

        System.out.print("\nInserire il Cognome del nucleo Familiare: ");

        return tastiera.readLine();

    }

    private static void scelta(Famiglia nucleoFamiglia, int index) throws NumberFormatException, IOException {

        int scelta;
        boolean inserimento = false;

        cls();

        do {

            System.out.println("\n\t\t ~ Familiarita' (" + nucleoFamiglia.getCognome() + ") ~\n");

            if (inserimento) {
                nucleoFamiglia.stampa();
            }

            System.out.println("\n(1) |Inserire i dati completi di una famiglia \n");
            System.out.println("(2) |Visualizzare il componente con eta maggiore \n");
            System.out.println("(3) |Visualizza all' utente il nome di tutti i componenti con eta minore di 18 anni \n");
            System.out.println("(4) |USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:
                    inserimento = true;
                    inserimentoDati(nucleoFamiglia, index);
                    break;

                case 2:
                    if (inserimento) {
                        System.out.println(nucleoFamiglia.nomePiugrande());
                    } else {
                        System.out.println("ERRORE: Non hai inserito nessun valore dei familiari !!");
                    }

                    break;

                case 3:
                    if (inserimento) {
                        nucleoFamiglia.minorenni();
                    } else {
                        System.out.println("ERRORE: Non hai inserito nessun valore dei familiari !!");
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

    private static void inserimentoDati(Famiglia nucleoFamiglia, int index) throws NumberFormatException, IOException {

        int eta;

        for (int i = 0; i < index; i++) {

            System.out.print("\n\nInserisci il Nome della " + (i + 1) + " Persona: ");
            String nome = tastiera.readLine();

            do {
                System.out.print("Inserisci l'eta' della " + (i + 1) + " Persona: ");
                eta = Integer.parseInt(tastiera.readLine());
            } while (eta < 0);

            nucleoFamiglia.setPersona(nome, eta, i);

        }

        cls();

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