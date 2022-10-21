/*

    Algoritmo: Calcolo di un cinema

    Programmatore: Simone D'Anna
    Data: 22/02/2022
    Versione: V1.0

*/

import java.io.*;

public class Esonero2a {
    public static void main(String args[]) throws IOException {

        SalaCinema film1=new SalaCinema("Van Helsing",15);

        film1.vendiBiglietti(5);

        System.out.println("Posti disponibili: "+film1.getPosti()+"\n");

        SalaCinemaP film2=new SalaCinemaP("Scooby-Doo 2: Mostri scatenati",18);
        
        film2.stampaSituazione();

        film2.vendiBiglietti(24);

        System.out.println("Posti disponibili: "+film2.getPosti()+"\n");
        
        film2.calcolaFile();

        film2.stampaSituazione();
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