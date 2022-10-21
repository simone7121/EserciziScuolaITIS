/*

Algoritmo:  Scrivere una classe Appartamento i cui oggetti rappresentano appartamenti di un appartamento. Le
            caratteristiche di un appartamento sono:
            nome del proprietario, superficie, piano e numero abitanti.
            Queste informazioni devono essere rese disponibili tramite opportuni metodi. Solo il nome del
            proprietario e il numero degli inquilini potranno essere modificati successivamente alla creazione di un
            oggetto di questa classe (tramite opportuni metodi).
            Aggiungere un metodo visualizza che stampa sullo schermo tutte le caratteristiche dell’appartamento.
            Per testare la classe, scrivere un programma Condominio che gestisce tutti gli appartamenti del
            appartamento, stampare i dati dell'appartamento più grande del terzo piano e visualizzare il numero
            totale di persone che abitano nel appartamento.
            Realizzare il diagramma UML, la pseudo codifica dei metodi e la codifica in linguaggio Java.
                        
Programmatore: Simone D'Anna
Data: 02/12/2021
Versione: V2.0


*/

import java.io.*;

public class Condominio {
    public static void main(String[] args) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        System.out.print("Inserire il numero di appartamenti nel condominio: ");
        int inp = Integer.parseInt(tastiera.readLine());

        Appartamento cond []= new Appartamento[inp];

        for (int i = 0; i < inp; i++) {
            cond[i]=inpAp(i);            
        }

        stampaCondominioMax(cond,3,inp);

    }

    private static Appartamento inpAp (int i) throws NumberFormatException, IOException{

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        System.out.println("\t\t ( "+(i+1)+" Appartamento )");

        System.out.print("Inserire Il proprietario: ");
        String prop = tastiera.readLine();

        System.out.print("Inserire la Superificie: ");
        int sup = Integer.parseInt(tastiera.readLine());

        System.out.print("Inserire Il Piano: ");
        int pia = Integer.parseInt(tastiera.readLine());

        System.out.print("Inserire Il numero degli abitanti: ");
        int abi = Integer.parseInt(tastiera.readLine());

        return new Appartamento(prop, sup, pia, abi) ;

    }

    private static void stampaCondominioMax(Appartamento [] appartamento , int piano, int dim) {

        Appartamento maxAppartamento = appartamento[0];

        for (int i = 1; i <= dim-1 ; i++) {
            
            if ((appartamento[i].getSuperficie() > maxAppartamento.getSuperficie())&&(appartamento[i].getPiano() == piano)){

                maxAppartamento = appartamento[i];
                
            }
            
        }

        System.out.println("\n\nL'appartamento più grande è :\n" + maxAppartamento);
        
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