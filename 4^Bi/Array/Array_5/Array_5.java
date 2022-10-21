/*

Algoritmo:  Dato un array di N numeri interi, scrivere un programma per contare quante volte si
            ripete un certo valore K fornito in input.

Programmatore: Simone D'Anna
Data: 06/10/2021

*/

import java.io.*;

class Array_5 {
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        int numeroRiferimento = 0;
        int contRiferimento = 0;
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nContatore N numeri array\n");

        try {
            
            System.out.print("Inserisci il numero totale di elementi: ");
            arrayNumeri = new int [ Integer.parseInt(tastiera.readLine())];

            System.out.print("Inserisci il numero di riferimento: ");
            numeroRiferimento = Integer.parseInt(tastiera.readLine());

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
            
            if ( arrayNumeri[j] == numeroRiferimento ) {
                contRiferimento++;
            }

        }
        
        System.out.print("Su " + arrayNumeri.length + " numeri inseriti\n" + contRiferimento + " di essi equivalgono a " + numeroRiferimento);

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