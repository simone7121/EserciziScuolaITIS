/*

Algoritmo:  Realizza la classe Impiegato con treattributi cognome, nome e reparto. Istanzia
            due oggetti, stampa il loro stato con il metodo stampa e verifica se hanno lo
            stesso nome.
            
Programmatore: Simone D'Anna
Data: 24/10/2021

*/

import java.io.*;

public class Dipendenti {

    public static void main(String[] args) throws IOException {

        System.out.print("DIPENDENTI \n\n");

        Impiegato impiegato1;
        Impiegato impiegato2;

        impiegato1 = inputDati(1);
        impiegato2 = inputDati(2);

        impiegato1.stampa();
        impiegato2.stampa();

        verificaNomi(impiegato1, impiegato2);

    }

    public static Impiegato inputDati(int numeroImp) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        final String impiegatoOut = "^ impiegato: ";

        System.out.print("\n\nNome " + numeroImp + impiegatoOut);
        String nome=in.readLine();

        System.out.print("Cognome " + numeroImp + impiegatoOut);
        String cognome=in.readLine();

        System.out.print("Reparto " + numeroImp + impiegatoOut);
        String reparto=in.readLine();

        return new Impiegato(nome,cognome,reparto);

    }

    public static void verificaNomi(Impiegato impiegato1, Impiegato impiegato2) {
        if (impiegato1.getNome().toUpperCase().equals(impiegato2.getNome().toUpperCase())) {
            System.out.println("\nIl nome del primo impiegato e' uguale al secondo !");
        }
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