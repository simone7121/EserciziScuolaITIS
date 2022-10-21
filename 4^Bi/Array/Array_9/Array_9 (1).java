/*

Algoritmo:  Dato un array di N numeri interi, scrivere un programma che scambi l’elemento di
            posizione 0 con quello di posizione N-1, stampare l’array così modificato.

Programmatore: Simone D'Anna
Data: 06/10/2021

*/

import java.io.*;

class Array_9{
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nScambio 0 e 1 posizione di un array\n");

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

        for ( int k=0; k < arrayNumeri.length; k++ ){

            System.out.print(arrayNumeri[k] + " - ");

        }
        
        int appoggio = arrayNumeri[0];
        arrayNumeri[0] =arrayNumeri [1];
        arrayNumeri[1] = appoggio;

        System.out.println(" ");

        for ( int l=0; l < arrayNumeri.length; l++ ){

            System.out.print(arrayNumeri[l] + " - ");

        }

        System.out.println("FINE!");

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