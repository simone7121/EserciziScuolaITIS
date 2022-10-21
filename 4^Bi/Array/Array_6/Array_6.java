/*

Algoritmo:  Dato un array di N numeri interi, scrivere un programma per stampare i valori di
            posizione pari (la posizione 0 è considerata pari).

Programmatore: Simone D'Anna
Data: 06/10/2021

*/

import java.io.*;

class Array_6 {
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nStampa numeri posizione pari di un array\n");

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
        
        for ( int j=0; j < arrayNumeri.length; j+=2 ) {
            
            System.out.print( arrayNumeri[j] + " - ");

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