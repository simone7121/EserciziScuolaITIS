/*

    Algoritmo:  Implementare un metodo statico di nome filtra che prende come parametro un array a 
                di numeri interi e un intero positivo k, e che restituisce un nuovo array b di 
                numeri interi contenente i soli elementi di a che sono divisibili per k.

    Programmatore: Simone D'Anna
    Data: 18/03/2022
    Versione: V1.0

*/

import java.io.*;
import java.util.*;

public class MainFiltra {
    public static void main(String[] args) throws IOError, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int k;
        
        Vector<Integer> v1 = new Vector<Integer>();                             // Creo un nuovo vettore con passo e dimensione predefinita.
        Vector<Integer> v2 = new Vector<Integer>();                             // Creo un nuovo vettore con passo e dimensione predefinita.

        System.out.println("Inserire i numeri ( -999 PER FINIRE L'INSERIMENTO ): ");

        do {

            v1.addElement(Integer.parseInt(tastiera.readLine()));               // Aggiunge gli elementi al vettore leggendo da tastiera.

        } while (v1.elementAt(v1.size() - 1) != -999);                          // Fino a quando l'elemento presente nel vettore SIA UGUALE A -999.

        v1.removeElementAt(v1.size() - 1);                                      // Rimuovo l'ultimo oggetto inserito nel vettore, perche' non serve.

        do {

            System.out.print("Inserisci K: ");
            k = Integer.parseInt(tastiera.readLine());                          // Prendo in input k.

        } while (k < 1);                                                        // Fino a quando l'elemento inserito in k SIA MINORE DI 1.

        v2 = filtra(v1, k);                                                     // Chiamo il metodo statico filtra che mi ritorna il vettore di interi divisibile per k, passandogli il vettore di numeri inseriti.

        for (int i = 0; i < v2.size(); i++) {                                   // Per tutta l'effettiva dimensione dell'vettore v2.

            System.out.println(v2.elementAt(i));                                // Stampo l'iesimo elemento del Vettore v2.

        }

    }

    private static Vector <Integer> filtra (Vector<Integer> a, int k) {

        Vector<Integer> b = new Vector<Integer>();                              // Creo un nuovo vettore con passo e dimensione predefinita.

        for (int i = 0; i < a.size(); i++) {                                    // Per tutta l'effettiva dimensione dell'vettore a.

            if (a.elementAt(i) % k == 0) {                                      // Se l'iesimo elemento del vettore a fratto k da resto 0.
                
                b.addElement(a.elementAt(i));                                   // Aggiungo l'iesimo numero del vettore a che puo' essere diviso per k nel vettore b.

            }

        }

        return b;                                                               // Ritorno il vettore b.

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