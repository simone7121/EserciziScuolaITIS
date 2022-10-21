/*

Algoritmo:  Dato un array di N numeri interi, scrivere un programma per invertire gli elementi 
            (cioè  il primo deve andare all’ultimo posto e viceversa, il secondo deve andare 
            al penultimo posto, ecc)

Programmatore: Simone D'Anna
Data: 07/10/2021

*/

import java.io.*;

class Array_10{
    public static void main(String[] args) {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int arrayNumeri [];
        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nInvertire un array\n");

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

        int arraynumeriScambio [] = new int [arrayNumeri.length];
        
        int pos = arrayNumeri.length;

        for(int j=0; j<arrayNumeri.length; j++){

          arraynumeriScambio[pos - 1] = arrayNumeri[j];
          pos --;

        }

        System.out.println(" ");

        for ( int l=0; l < arrayNumeri.length; l++ ){

            System.out.print(arraynumeriScambio[l] + " - ");

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