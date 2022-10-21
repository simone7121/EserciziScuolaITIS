/*

Algoritmo:  Creare una classe Squadra che rappresenta una squadra di calcio con attributi partite vinte,  partite perse e partite pareggiate.
            La classe dispone di tutti i metodi necessari per assegnare i valori agli attributi e farli visualizzare. Inoltre, ha il metodo punti() che restituisce quanti punti ha in 
            campionato (ogni partita vinta vale 3 punti, ogni partita pareggiata 1, quelle perse 0) e un metodo inizioAnno() che resetta il numero di partite vinte, 
            pareggiate e perse portandole a zero. 
            
            Creare un main per provare la classe creando due istanze Juventus e Milan e si provino ad utilizzare facendo inserire all’utente per entrambe le squadre 
            il numero di partite vinte, perse e pareggiate e poi confrontando quale delle due ha più punti in campionato. 

            NOTA: Si sviluppi usando il paradigma della programmazione ad oggetti ed in particolare rispettando l’information hiding: attributi privati, metodi pubblici.

Programmatore: Simone D'Anna
Data: 07/11/2021
Versione: V2.0

*/

import java.io.*;

public class campionatoSquadra {
    public static void main(String[] args) throws IOException {

        System.out.println("\n\n\t\t ~ CAMPIONATO DI EUROPA ! ~ ");

        Squadra squadra1 = letturaDatiSquadra(); // Inizializzo l'oggetto squadra1 di classe Squadra,
                                                 // chiamando il metodo letturaDatiSquadra.
        Squadra squadra2 = letturaDatiSquadra(); // Inizializzo l'oggetto squadra2 di classe Squadra,
                                                 // chiamando il metodo letturaDatiSquadra.

        confrontoSquadre(squadra1, squadra2); // Chiamo il metodo confrontoSquadre con
                                              // parametri gli oggetti squadra 1 e 2.

    }

    public static Squadra letturaDatiSquadra() throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 50; i++){                                // Divisore Grafico
            System.out.print("_");
        }

        System.out.print("\nInserisci nome squadra: ");
        String nomesquad = tastiera.readLine();

        System.out.println("\n\t\t ~ " + nomesquad + " ~");

        System.out.print("Inserisci le Vincite: ");
        int vincite = Integer.parseInt(tastiera.readLine());

        System.out.print("\nInserisci i Pareggi: ");
        int pareggi = Integer.parseInt(tastiera.readLine());

        System.out.print("\nInserisci le Perdite: ");
        int perdite = Integer.parseInt(tastiera.readLine());

        return new Squadra(vincite, pareggi, perdite, nomesquad);

    }

    public static void confrontoSquadre(Squadra uno, Squadra due) {

        System.out.println("\n\t\t ~ PUNTEGGI ! ~ ");

        System.out.println("\n\t(" + uno.getNomesquadra() + ") PT: " + uno.punti());        // Output punti Squadra 1.
        System.out.println("\t(" + due.getNomesquadra() + ") PT: " + due.punti() + "\n");   // Output punti Squadra 2.

        if (uno.punti() > due.punti()) {

            System.out.println("La squadra ( " + uno.getNomesquadra() + " ) ha piu' punti della squadra ( "
                    + due.getNomesquadra() + " ) !");   // Output
                                                        // matching.

        } else if (uno.punti() < due.punti()) {

            System.out.println("La squadra ( " + due.getNomesquadra() + " ) ha piu' punti della squadra ( "
                    + uno.getNomesquadra() + " ) !");   // Output
                                                        // matching.

        } else {
            System.out.println("Le squadre ( " + uno.getNomesquadra() + " ) e ( " + due.getNomesquadra()
                    + " ) hanno gli stessi punti !");   // Output
                                                        // matching.
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
