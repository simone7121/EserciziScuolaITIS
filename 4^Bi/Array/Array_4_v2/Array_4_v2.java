/*

Algoritmo:  Chiedere all'utente di inserire un numero finito di elementi, 
            dopodiche' chiedendone l'input dei singoli, conta quanti sono pari 
            e infine ne esegue il relativo output.

Programmatore: Simone D'Anna
Data: 05/10/2021

*/

import java.io.*;

class Array_4_v2{
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        int contPari = 0;
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nContatore numeri Pari array\n");

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

            if ( arrayNumeri[i] % 2 == 0 ) {
                contPari++;
            }              

        }

        System.out.print("Su " + arrayNumeri.length + " numeri inseriti\n" + contPari + " di essi sono pari. ");

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