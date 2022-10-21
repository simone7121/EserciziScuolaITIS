/*

Algoritmo:  Si implementi la classe Intervallo, che
            rappresenta un intervallo di numeri reali. Un intervallo
            può essere chiuso oppure aperto, sia a sinistra che a destra.

            Il metodo contiene
            prende come argomento un numero x e restituisce vero se e solo se x appartiene
            a questo intervallo.

            Il metodo unisce restituisce l'unione di due intervalli, senza modificarli,
            stampando il messaggio "errore" nel caso in cui questa unione non sia
            un intervallo.

Programmatore: Simone D'Anna
Data: 01/12/2021
Versione: V2.0

*/

public class TestIntervalli {
    public static void main(String args[]){

        Intervallo i1 = new Intervallo(5, 10.5,"as","ad"); 

        Intervallo i2 = new Intervallo(7, 20,"cs","cd"); 
        
        Intervallo i3 = i1. unisci (i2);

        
        System.out.println(i3.contiene(20));

        System.out.println(i1.toString());

        System.out.println(i2.toString());

        System.out.println(i3.toString());

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