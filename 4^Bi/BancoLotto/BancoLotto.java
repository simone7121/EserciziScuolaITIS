/*

Algoritmo:  Memorizzare le estrazioni (casuale) dei 5 numeri della ruota di Napoli. Verificare, poi, se è stato estratto il numero ricevuto in input
            Nota bene: i numeri estratti devono essere tutti diversi.

Programmatore: Simone D'Anna
Data: 24/10/2021
Versione: 3.0   26/10/2021

*/

import java.util.Random;
import java.util.Scanner;

class BancoLotto {
    public static void main(String[] args) {

        System.out.print("\t\t~ LOTTERIA NAPOLETANA ~\n\n");
        int lottonumUten = numInp();
        int[] bancogeneratoAuto = generaBanco();
        System.out.print("\n\nBanco: ");
        stampaArry(bancogeneratoAuto, 5);
        String coincidenze = confronta(lottonumUten, bancogeneratoAuto);
        System.out.print("\nTuo Banco: ");
        System.out.println(lottonumUten);
        System.out.print("\n\n" + coincidenze);
    }

    private static int numInp() {

        Scanner in = new Scanner(System.in);

        int risultato;

        do {
            System.out.print("Inserisci il numero: ");
            risultato = in.nextInt();
        } while (risultato > 90 || risultato < 1);


        return risultato;

    }

    private static int[] generaBanco() {

        Random rand = new Random();

        int[] risultato = new int[5];

        boolean duplicato;

        for (int i = 0; i < risultato.length; i++) {

            risultato[i] = rand.nextInt(90) + 1;

        }

        do {

            duplicato = false;

            for (int j = 0; j < risultato.length; j++) {

                for (int k = 0; k < risultato.length; k++) {

                    if (risultato[j] == risultato[k] && j != k) {

                        duplicato = true;
                        risultato[j] = rand.nextInt(90) + 1;

                    }

                }
            }

        } while (duplicato);

        return risultato;
    }

    private static String confronta(int lottoUtente, int[] bancoGenerato) {

        boolean uguali = false;

            for (int k = 0; k < bancoGenerato.length; k++) {

                if (lottoUtente == bancoGenerato[k]) {

                    uguali = true;

                }

            }


        if (uguali == true){
            return "C'è una coincidenza! =)";
        } else {
            return "Nessuna coincidenza, Riprova! ;)";
        }

    }

    private static void stampaArry(int[] array, int n1) {

        for (int j = 0; j < n1; j++) {
            System.out.print(" (" + array[j] + ") ");
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