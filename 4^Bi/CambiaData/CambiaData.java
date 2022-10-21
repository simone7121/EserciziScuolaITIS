/*

Algoritmo:  Il programma legge una stringa da tastiera
            interpretandola come una data nel formato
            GG/MM/AAAA, ne estrae i vari campi (giorno,
            mese ed anno) convertendoli in formato numerico
            ed infine stampa a video i risultati.

            Effettua i controlli su mese anno e data.


            Il mese viene stampato anche in formato testuale:
            1 (Gennaio) - 2 (Febbraio) - 3 (Marzo) - 4 (Aprile)
            5 (Maggio) - 6 (Giugno) - 7 (Luglio) - 8 (Agosto)
            9 (Settembre) - 10 (Ottobre) - 11 (Novembre)
            12 (Dicembre)

Programmatore: Simone D'Anna
Data: 20/10/2021

*/

import java.util.Scanner;

public class CambiaData {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);    //Istanzio un nuovo oggetto in dalla classe scanner
        boolean ritorno;

        do {

            System.out.println("\n\nInserisci una data GG/MM/AAAA: ");

            String data = in.nextLine();    //Prendo in input una stringa e la metto in data
            int lunghezza = data.length();  // Mi estrapolo la lunghezza della stringa

            ritorno = dataParser(data, lunghezza); // Chiamo il metodo dataParser

        } while (!ritorno); // While fino a quando non c'e' un errore

    }

    private static boolean dataParser(String dataNo, int dim) {

        if (dataNo.charAt(2) == '/' && dataNo.charAt(5) == '/') { // Check notazione
            
            byte gg = Byte.parseByte(dataNo.substring(0, 2));   // Parsing da String a Byte
            byte mm = Byte.parseByte(dataNo.substring(3, 5));   // Parsing da String a Byte
            short aaaa = Short.parseShort(dataNo.substring(6, 10)); // Parsing da String a Short

            String output = dataCheck(gg, mm, aaaa);  // Chiamo il metodo dataCheck

            System.out.print("La data " + dataNo);

            if (output.charAt(0) == '(') { // Stampa messaggio di errore di output
                System.out.print(" Non e' Valida.\n" + output);
                return false;
            } else if (dim != 10) { // Stampa messaggio di errore dimensione eccessiva anno
                System.out.print(" Non e' Valida.\n(Errore Lunghezza Anno, Riprova!)");
                return false;
            } else { // Output Valido
                System.out.print(" E' Valida!\n" + gg + "/" + output + "/" + aaaa);
                return true;
            }

        } else {
            System.out.print("La data " + dataNo + " Non e' Valida.\n(Errore Notazione Data, Riprova!)"); // Stampa messaggio di errore di notazione 
            return false;
        }
    }

    private static String dataCheck(byte giorno, byte mese, short anno) {

        final String errG = "(Errore Giorno, Riprova!)"; // Istanzio e dichiaro una stringa final con il messaggio di errore sul giorno

        switch (mese) { // Inizio a switchare sul mese

        case 1:
            if (giorno <= 31) { // Eseguo controllo giorno
                return "1 (Gennaio)"; // Ritorno il valore corretto
            } else {
                return errG;    // Ritorno la stringa errG
            }
        case 2:
            if ((anno % 4 == 0 && anno % 100 == 0) || (anno % 400) == 0) { // Controllo se l'anno e' bisestile
                if (giorno <= 29) {
                    return "2 (Febbraio)";
                } else {
                    return errG;
                }
            } else {
                if (giorno <= 28) {
                    return "2 (Febbraio)";
                } else {
                    return errG;
                }
            }
        case 3:
            if (giorno <= 31) {
                return "3 (Marzo)";
            } else {
                return errG;
            }

        case 4:
            if (giorno <= 30) {
                return "4 (Aprile)";
            } else {
                return errG;
            }

        case 5:
            if (giorno <= 31) {
                return "5 (Maggio)";
            } else {
                return errG;
            }

        case 6:
            if (giorno <= 30) {
                return "6 (Giugno)";
            } else {
                return errG;
            }

        case 7:
            if (giorno <= 31) {
                return "7 (Luglio)";
            } else {
                return errG;
            }

        case 8:
            if (giorno <= 31) {
                return "8 (Agosto)";
            } else {
                return errG;
            }

        case 9:
            if (giorno <= 30) {
                return "9 (Settembre)";
            } else {
                return errG;
            }

        case 10:
            if (giorno <= 31) {
                return "10 (Ottobre)";
            } else {
                return errG;
            }

        case 11:
            if (giorno <= 30) {
                return "11 (Novembre)";
            } else {
                return errG;
            }

        case 12:
            if (giorno <= 31) {
                return "12 (Dicembre)";
            } else {
                return errG;
            }

        default: // Se non c'e il case di un mese ritorno messaggio di errore mese
            return "(Errore Mese, Riprova!)";
        }

    }

}

/*
____/\\\\\\\\\\\__________/\\\\\\\\\\\\___________________
____/\\\/////////\\\_______\/\\\////////\\\_______________
____\//\\\______\///________\/\\\______\//\\\_____________
______\////\\\_______________\/\\\_______\/\\\____________
__________\////\\\____________\/\\\_______\/\\\___________
______________\////\\\_________\/\\\_______\/\\\__________
_______/\\\______\//\\\________\/\\\_______/\\\___________
________\///\\\\\\\\\\\/____/\\\_\/\\\\\\\\\\\\/____/\\\__
___________\///////////_____\///__\////////////_____\///__
*/





