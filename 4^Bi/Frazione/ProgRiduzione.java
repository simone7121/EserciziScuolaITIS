/*

Algoritmo:  Definisci una classe frazione e scrivere un main per far funzionare i suoi metodi.
                        
Programmatore: Simone D'Anna
Data: 27/11/2021

*/

import java.io.*;

class ProgRiduzione {
    public static void main(String argv[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int num = 1;
        int den = 1;
        boolean semplificata;

        System.out.print("Inserisci il numeratore (Se inserisci un numero negativo sarà 1): ");

        num = Integer.parseInt(tastiera.readLine());

        System.out.print("Inserisci il denominatore (Se inserisci un numero negativo sarà 1): ");

        den = Integer.parseInt(tastiera.readLine());

        Frazione fraz = new Frazione(num, den);

        System.out.println("\nFrazione inserita");
        fraz.mostra();

        semplificata = fraz.semplifica();

        if (semplificata) {

            System.out.println("Frazione semplificata");
            fraz.mostra();

        } else {

            System.out.println("Non puo' essere semplificata.");

        }

        String tipo = fraz.getTipo();

        fraz.mostra();

        System.out.println("\nLa frazione e' di tipo:  " + tipo);
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