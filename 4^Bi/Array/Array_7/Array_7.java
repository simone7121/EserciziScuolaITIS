/*

Algoritmo:  Dato un array di N numeri interi, scrivere un programma che trovi l’elemento di valore
            massimo e il valore dell’indice corrispondente (da 0 a N-1).

Programmatore: Simone D'Anna
Data: 06/10/2021

*/

import java.io.*;

class Array_7 {
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        int maxNum = 0;
        int maxPos = 0;
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nCerca MAX e Valore indice array\n");

        try {
            
            System.out.print("Inserisci il numero totale di elementi: ");
            arrayNumeri = new int [ Integer.parseInt(tastiera.readLine())];

        } catch (Exception e){
            
            System.err.println(msgErrore);                               
            return;
        }

        for ( int i=0; i < arrayNumeri.length; i++ ){
            
            try {
                
                System.out.print("Inserisci il " + (i+1) +" elemento: ");
                arrayNumeri[i] = Integer.parseInt(tastiera.readLine());
            
            } catch (Exception e) {

                System.err.println(msgErrore);                               
                return;

            }

        }
        
        for ( int j=0; j < arrayNumeri.length; j++ ) {
            
            if (arrayNumeri[j] > maxNum){

                maxNum = arrayNumeri[j];
                maxPos = j ;

            }

        }

        System.out.println("\n\nTra i " + arrayNumeri.length +" numeri inseriti\nIl maggiore e': ( " + maxNum + " )\nNella ( " + maxPos + " ) ^ Posizione dell'array.");

    }

}

/*____/\\\\\\\\\\\__________/\\\\\\\\\\\\_________________
____/\\\/////////\\\_______\/\\\////////\\\_______________
____\//\\\______\///________\/\\\______\//\\\_____________
______\////\\\_______________\/\\\_______\/\\\____________
__________\////\\\____________\/\\\_______\/\\\___________
______________\////\\\_________\/\\\_______\/\\\__________
_______/\\\______\//\\\________\/\\\_______/\\\___________
________\///\\\\\\\\\\\/____/\\\_\/\\\\\\\\\\\\/____/\\\__
___________\///////////_____\///__\////////////_____\///*/