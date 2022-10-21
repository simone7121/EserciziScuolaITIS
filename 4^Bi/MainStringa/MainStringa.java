/*

    Algoritmo:  Implementare un metodo statico di nome stringaCorta che prende come parametro un array 
                di oggetti String e che restituisce la stringa dell’array avente lunghezza minima. 
                Nel caso vi fossero due o più stringhe con la lunghezza minima, 
                il metodo ne deve restituire una arbitrariamente.

    Programmatore: Simone D'Anna
    Data: 18/03/2022
    Versione: V1.0

*/


import java.io.*;
import java.util.*;

public class MainStringa {
    public static void main(String[] args) throws IOError, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        Vector<String> v1 = new Vector<String>();                                   // Creo un nuovo vettore con passo e dimensione predefinita.

        System.out.println("Inserire delle frasi ( !EXIT PER FINIRE L'INSERIMENTO ): ");

        do {

            v1.addElement(tastiera.readLine());                                     // Aggiunge gli elementi al vettore leggendo da tastiera.

        } while (!"!EXIT".equals(v1.elementAt(v1.size() - 1)));                     // Fino a quando l'elemento presente nel vettore SIA UGUALE A !EXIT.

        v1.removeElementAt(v1.size() - 1);                                          // Rimuovo l'ultimo oggetto inserito nel vettore, perche' non serve.

        System.out.println("La stringa piu' corta e': " + stringaCorta(v1));        // Chiamo il metodo statico che mi ritorna la stringa piu' corta.

    }

    private static String stringaCorta(Vector<String> frasi) {

        String min = frasi.get(0);                                                  // Dichiaro e inizializzo la variabile min al primo elemento del vettore.

        for (int i = 0; i < frasi.size(); i++) {                                    // Per tutta l'effettiva dimensione dell'vettore.

            if (frasi.get(i).length() < min.length()) {                             // Se l'iesimo oggetto di tipo String del vettore frasi ha lunghezza minore della variabile min.

                min = frasi.get(i);                                                 // Setto il nuovo minimo a quello del valore dell'iesimo oggetto del vettore frasi.
                
            }

        }

        return min;                                                                 // Ritorna il valore di min.

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