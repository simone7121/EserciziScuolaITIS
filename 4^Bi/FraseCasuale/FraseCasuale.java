/*

Algoritmo:  Realizzare un dizionario di 15 parole, inserite dall'utente e a partire da esso generando un numero casuale compreso tra 2 e 7 
            che rappresenta il numero di parole che costituiranno una frase. Le parole che fanno parte della frase saranno scelte in modo casuale 
            dal dizionario

Programmatore: Simone D'Anna
Data: 21/10/2021

*/

import java.util.Random;
import java.util.Scanner;

class FraseCasuale {
    public static void main(String[] args) {
        String[] parole = genArr(15);
        int num = danumaParol();
        stampaRis(parole, num);
    }

    private static String[] genArr(int n) {

        Scanner in = new Scanner(System.in);    // Istanzio un nuovo oggetto in dalla classe scanner
        
        String[] risultato = new String[n];     // Si crea l’array da restituire
        
        for (int i = 0; i < n; i++){
            
            System.out.print("Inserisci la "+ (i+1) +" parola: ");
            risultato[i] = in.nextLine();

        }

        return risultato;

    }

    private static int danumaParol() {
        Random rand = new Random ();
        return rand.nextInt(5) + 2;
    }

    private static void stampaRis(String[] array, int n1) {

        Random rand = new Random ();
        
        int x = 0;

        System.out.print("\n\nLa parola generata casualmente equivale a: ");

        for (int j = 0; j < n1; j++) {
            x = rand.nextInt(14);
            System.out.print(" " + array[x]);
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