/*

    Algoritmo:  Scrivere un programma che consenta di memorizzare degli studenti e i loro voti.

    Programmatore: Simone D'Anna
    Data: 11/03/2022
    Versione: V1.0

*/

import java.io.*;
import java.util.*;


public class VectorStudente {
    public static void main(String args[]) throws IOException {

        Vector <Studenti> studenti = new Vector(10,2);

        cls();

        menu(studenti);

    }

    private static void menu(Vector <Studenti> studenti) throws IOException {
        
        String nome;
        String cognome;
        int input = 0;
        int scelta = 0;
        double voto;

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        do {

            if (!studenti.isEmpty()) {
                printStudenti(studenti);
            }

            System.out.println("\n\t\t Seleziona operazione");

            System.out.println("\n(1) | Inserimento Voti \n");
            System.out.println("(2) | Modifica Voti \n");
            System.out.println("(3) | Stampa Voti \n");
            System.out.println("(4) | Stampa Su File \n");
            System.out.println("(5) | USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:

                    System.out.print("Inserisci il Nome: ");
                    nome = tastiera.readLine();

                    System.out.print("Inserisci il Cognome:");
                    cognome = tastiera.readLine();

                    System.out.print("Inserisci il Voto: ");
                    voto = Double.parseDouble(tastiera.readLine());

                    studenti.addElement(new Studenti(nome, cognome, voto));

                    break;

                case 2:

                    if (studenti.isEmpty()) {

                        System.out.println("Non ci sono elementi !");

                    } else {

                        printStudenti(studenti);

                        do {

                            System.out.println("Quale voto vuoi rimuovere? ");
                            input = Integer.parseInt(tastiera.readLine());

                        } while (input < 0 || input > studenti.size());

                        studenti.removeElementAt(input - 1);
                        
                    }

                    break;

                case 3:

                    if (studenti.isEmpty()) {

                        System.out.println("Non ci sono elementi !");

                    } else {

                        printStudenti(studenti);
                    }

                    break;
                
                case 4:

                    if (studenti.isEmpty()) {

                        System.out.println("Non ci sono elementi !");

                    } else {

                        printStudenti(studenti);

                        Iterator <Studenti> i = studenti.iterator();

                        while(i.hasNext()) {
                            Studenti appo = i.next();
                            appo.toFile();
                        }
                    }   
                    break;
                
                case 5:
                    return;

                default:

                    System.out.println("Input INVALIDO, Riprova !\n\n");

                    break;
            }

        } while (scelta < 5);

    }

    private static void printStudenti(Vector <Studenti> studenti) {

        String div = "\n_____________________________________________________";

        System.out.println("\n\n\t\t  Elenco studenti \n");
        System.out.format("%3s", "N^");
        System.out.format("%15s", "Nome");
        System.out.format("%15s", "Cognome");
        System.out.format("%6s", "Voto");
        System.out.println(div);

        for (int j = 0; j < studenti.size(); j++) {
            System.out.print("\n");
            System.out.format("%3s", (j+1));
            System.out.format("%15s", studenti.elementAt(j).getNome());
            System.out.format("%15s", studenti.elementAt(j).getCognome());
            System.out.format("%6.2f", studenti.elementAt(j).getVoto());
        }

        System.out.println(div);

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