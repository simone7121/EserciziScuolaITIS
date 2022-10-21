/*

Algoritmo:  Definisci una classe Libro caratterizzata da: titolo, autore, casa editrice, prezzo e numero di pagine.
            Definisci tutti i metodi che ritieni necessari e in particolare un metodo per diminuire del 10% il prezzo del libro.
            Realizzare un programma per gestire una libreria e scrivi un metodo ausiliario per simulare una vendita promozionale di tutti i libri. 
            Creare un altro metodo ausiliario per calcolare il valore totale dei libri della libreria
                        
Programmatore: Simone D'Anna
Data: 10/11/2021

*/

import java.io.*;

public class Libreria {
    public static void main(String[] args) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 10; 
        Libro [] libreria = new Libro [n];
        final String libro = " Libro:";
                
        
        for ( int i = 0; i<n; i++ ){

            System.out.print("Titolo " + (i+1)+ libro);
            String titolo = tastiera.readLine();

            System.out.print("Autore " + (i+1)+ libro);
            String autore = tastiera.readLine();

            System.out.print("Casa Editrice " + (i+1)+ libro);
            String casaEdit = tastiera.readLine();

            System.out.print("Prezzo " + (i+1)+ libro);
            Double prezzo = Double.parseDouble(tastiera.readLine());

            System.out.print("Totale Pagine " + (i+1)+ libro);
            int pagine = Integer.parseInt(tastiera.readLine());

            System.out.print("\n-------------------\n\n");

            libreria[i]=new Libro(titolo,autore,casaEdit,prezzo,pagine);

        }

        venditaPromozionale(libreria,n);

        valoreLibreria(libreria,n);

    }

    public static void venditaPromozionale(Libro[] libreria, int num) {

        System.out.println("\t\t Vendita Promozionale !");

        for (int i = 0 ; i < num; i++){

            libreria[i].stampa();
            System.out.println("Prezzo SCONTATO Libro: " + libreria[i].sconto() + "\n-------------------");
        }
        
    }

    public static void valoreLibreria(Libro[] libreria, int num) {

        System.out.println("\t\t Valore libreria !");

        double totvalore = 0;

        for (int i = 0 ; i < num; i++){

            totvalore += libreria[i].getPrezzo();
            
        }


        System.out.println("Il valore di TUTTA la libreria e': " + totvalore + "\n-------------------");
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