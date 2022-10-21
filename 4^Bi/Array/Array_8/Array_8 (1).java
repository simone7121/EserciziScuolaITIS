/*

Algoritmo:  Dato un array di N numeri interi, scrivere un programma per calcolare la media di tutti i
            suoi valori e contare i valori sopra la media.

Programmatore: Simone D'Anna
Data: 06/10/2021

*/

import java.io.*;

class Array_8 {
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        int sommaNumeri = 0;
        float mediaNumeri;
        int contamaggioriMedia = 0;
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nCalcolo media e numeri superiori ad essa array\n");

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
            
            sommaNumeri += arrayNumeri[j];

        }

        mediaNumeri =((float) sommaNumeri / (arrayNumeri.length));

        for ( int k=0; k < arrayNumeri.length; k++){

            if (arrayNumeri[k] > mediaNumeri){

                contamaggioriMedia++;

            }

        }

        System.out.println("\n\nTra i " + arrayNumeri.length +" numeri inseriti\nLa media tra di essi risulta: ( " + mediaNumeri + " )\nE i maggiori della media sono in totale ( " + contamaggioriMedia + " )");

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