/*

    Algoritmo:  Implementare un metodo statico di nome stringaCorta che prende come parametro un array 
                di oggetti String e che restituisce la stringa dell’array avente lunghezza minima. 
                Nel caso vi fossero due o più stringhe con la lunghezza minima, 
                il metodo ne deve restituire una arbitrariamente.

    Programmatore: Simone D'Anna
    Data: 22/03/2022
    Versione: V2.0

*/

import java.io.*;
import java.util.*;

public class MainStringaV2 {
    public static void main(String[] args) throws IOError, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));     // Dichiaro ed inizializzo la BufferedReader.

        ArrayList <String> v1 = new ArrayList <>();                                         // Dichiaro ed inizializzo un nuovo ArrayList con dimensione predefinita.

        System.out.println("Inserire delle frasi ( !EXIT PER FINIRE L'INSERIMENTO ): ");

        do {

            v1.add(tastiera.readLine());                                                    // Aggiunge gli elementi al ArrayList leggendo da tastiera.

        } while (!"!EXIT".equals(v1.get(v1.size() - 1)));                                   // Fino a quando l'elemento presente nel ArrayList SIA UGUALE A !EXIT.

        v1.remove(v1.size() - 1);                                                           // Rimuovo l'ultimo oggetto inserito nel ArrayList, perche' non serve.

        System.out.println("La stringa piu' corta e': " + stringaCorta(v1));                // Chiamo il metodo statico che mi ritorna la stringa piu' corta.

    }

    private static String stringaCorta(ArrayList<String> frasi) {

        String min = frasi.get(0);                                                          // Dichiaro ed inizializzo min al primo elemento di frasi.
                
        Iterator <String> i = frasi.iterator();                                             // Dichiaro e inizializzo l’oggetto di classe Iterator dell'Arraylist frasi.

        String appo;                                                                        // Dichiaro la variabile di appoggio di tipo String.
                                                
        while (i.hasNext()) {                                                               // Fino a quando i contiene ulteriori elementi.

            appo = i.next();                                                                // Setto la variabile di appoggio ad i.next().

            if (appo.length() < min.length()) {                                             // Se la variabile di appoggio ha lunghezza minore della variabile min.

                min = appo;                                                                 // Setto il nuovo minimo a quello del valore della variabile di appoggio.
                
            }

        }

        return min;                                                                         // Ritorna il valore di min.

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