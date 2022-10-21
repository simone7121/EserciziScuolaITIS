/*

Algoritmo:  Creare una classe che permetta di
            rappresentare una slot machine e un main per gestirla, deve funzionare così :

            Inserita una moneta girano le tre
            rotelle della slot machine e appaiono tre simboli (nel nostro caso tre
            lettere), l’utente per due volte può decidere di tenere una o più lettere
            apparse o fermarsi.

            Quando si ferma se c’è una coppia viene
            restituita una moneta mentre se c’è un tris di lettere uguali viene restituito
            un numero di monete pari alla posizione in ordine alfabetico della lettera del
            tris.

Programmatore: Simone D'Anna
Data: 30/11/2021
Versione: V2.0

*/

import java.io.*;

public class SalaSlot {
    public static void main(String[] args) throws IOException {
        
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        char [] simboli = {'a','b','c'};
        int moneta;
        int scelta;

        SlotMachine slot1 = new SlotMachine (simboli);

        cls();

        do {

            do {
                System.out.print("Inserire la moneta (O): ");
                moneta = tastiera.readLine().charAt(0);
            } while (moneta != 'O');

            slot1.giraSlot();
            System.out.println(slot1);
            
            if(slot1.scelta()){

                cls();

                System.out.println(slot1);
                slot1.scelta();

                cls();

                System.out.println(slot1);

            }
                   
            slot1.esito();

            System.out.println("\n\nHai vinto: " +slot1.getMoltiplicatore()+ " Moneta.");

            System.out.print("\tVuoi continuare ? \n\t(1 'SI') (0 'NO'): ");
            scelta = Integer.parseInt(tastiera.readLine());

            cls();

        } while(scelta == 1);

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