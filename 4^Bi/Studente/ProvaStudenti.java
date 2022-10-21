/*

Algoritmo:  Scrivere una classe ProvaStudente che verifica il corretto funzionamento della
            classe Studente definita nell’Esercizio 1. La classe ProvaStudente avrò il solo metodo
            speciale main, il quale svolgerà le seguenti azioni:

            x   Fa inserire all’utente nome e cognome di due studente e crea i rispettivi oggetti
                Studente.
            x   Visualizza all’utente una descrizione completa dei due studente inseriti, utilizzando il
                metodo toString della classe Studente.
            x   Visualizza all’utente il numero di matricola dell’eventuale prossimo studente.
            x   Chiede all’utente di ridefinire i dati (nome e cognome) del primo studente inserito,
                ed aggiorna i dati del corrispondente oggetto Studente.
            x   Visualizza all’utente una descrizione completa del primo studente, al fine di
                mostrare come i dati dell’oggetto sono effettivamente cambiati.
                        
Programmatore: Simone D'Anna
Data: 26/11/2021

*/

import java.io.*;

public class ProvaStudenti {
    public static void main(String[] args) throws IOException {

        int len = lunghezza();
        Studente tabulato[] = new Studente [len];

        array(tabulato);
        printlinea(60);
        stampa(tabulato);
        printlinea(60);

        System.out.println("\nLa matricola successiva all'ultima è: "+Studente.getProssimaMatricola());

        ridefinisci(tabulato, 0);

        printlinea(60);
    }

    private static void printlinea(int lunghezza) {
        for (int i = 0; i < lunghezza; i++) {
            System.out.print("_");            
        }
        System.out.println();
    }

    private static int lunghezza()throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int lenght;
        
        do {
            System.out.print("Inserire il numero totale di studenti: ");
            lenght = Integer.parseInt(tastiera.readLine());
            System.out.println();
        } while (lenght<=1);

        return lenght;
    }

    private static void array(Studente [] array)throws IOException {
        
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        String nome,cognome;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserire Nome " + (i+1) + " Studente: ");
            nome = tastiera.readLine();
            System.out.print("Inserire Cognome " + (i+1) + " Studente: ");
            cognome = tastiera.readLine();
            array[i]= new Studente (nome,cognome);
            System.out.println();
        }
        
        return;
    }

    private static void stampa(Studente [] array)throws IOException {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }

    private static void ridefinisci(Studente [] array, int matricola)throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        String precnome = array[matricola].getNome();
        String precognome = array[matricola].getCognome();
        
        System.out.print("\n\nInserire il nuovo Nome del " + (matricola+1) + " Studente: ");
        array[matricola].setNome(tastiera.readLine());

        System.out.print("Inserire il nuovo Cognome del " + (matricola+1) + " Studente: ");
        array[matricola].setCognome(tastiera.readLine());
        
        System.out.println("\n\nPrima: |Nome = " + precnome + 
        "\t|Cognome = " + precognome + 
        "\t|Matricola = "+ (matricola+1) + 
        "\t|");

        System.out.print("Dopo:  " + array[matricola] + "\n");
    }

    
}
