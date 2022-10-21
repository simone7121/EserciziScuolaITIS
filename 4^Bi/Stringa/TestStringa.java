/*

Algoritmo:  Scrivere un programma che consenta di usare la classe Stringa, contenente i vari metodi
            di manipolazione di una stringa.
                        
Programmatore: Simone D'Anna
Data: 03/12/2021
Versione: V1.0

*/

import java.io.*;

class TestStringa {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        System.out.print("Inserire una frase o una parola: ");
        String frase = new String(tastiera.readLine());

        String carattere = "";
        
        if (frase.length() % 2 == 0) {

            carattere += frase.charAt(frase.length() / 2 - 1);
            carattere += frase.charAt(frase.length() / 2);

        } else {

            carattere += frase.charAt(frase.length() / 2);

        }

        System.out.println(carattere);

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