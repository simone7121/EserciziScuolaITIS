/*

Algoritmo:  Chiedere all'utente di inserire un numero finito di elementi, 
            dopodiche' chiedendone l'input dei singoli, farne la somma 
            soltanto dei multipli di 3, ed eseguirne il relativo output.

Programmatore: Simone D'Anna
Data: 05/10/2021

*/

import java.io.*;

class Array_2_v2{
    
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        int somma = 0;
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nSomma numeri multipli di 3 array\n");

        try {
            
            System.out.print("Inserisci il numero totale di elementi: ");
            arrayNumeri = new int [Integer.parseInt(tastiera.readLine())];

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

        for ( int j=0; j < arrayNumeri.length; j++ ){
            
            if( arrayNumeri[j]%3 == 0 ) {

                somma += arrayNumeri[j];

            } 

        }

        System.out.print("La somma dei numeri multipli di 3 risultera': " + somma);

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