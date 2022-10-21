/*

Algoritmo:  Creare un programma che chiede in input 2 numeri e l'operazione da effettuare ( somma, differenza, moltiplicazione, divisione) e restituisca il risultato dell'operazione.
            Effettuare tutti i dovuti controlli.

Programmatore: Simone D'Anna
Data: 26/10/2021
Versione: 1.0

*/

import java.io.*;

public class Calcolo2Numeri {

    static final String INSERISCIUNO = "Inserire il 1 numero: ";
    static final String INSERISCIDUE = "\nInserire 2 numero: ";

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int scelta;

        do {

            System.out.println("\n\t\t ~ CALCOLATRICE V1.0 ~\n");

            System.out.println("Premi 1 per Addizionare      (+) \n");
            System.out.println("Premi 2 per Sottrarre        (-) \n");
            System.out.println("Premi 3 per Moltiplicare     (*) \n");
            System.out.println("Premi 4 per Dividere         (/) \n\n\n");
            System.out.println("SCELTA: ");

            scelta = Integer.parseInt(in.readLine());

            switch (scelta) {

            case 1:
                sommatoria();
                break;

            case 2:
                differenza();
                break;

            case 3:
                prodotto();
                break;

            case 4:
                divisione();
                break;

            default:
                System.out.println("Input INVALIDO, Riprova !\n\n");
                break;

            }

        } while (scelta < 4);
    }

    public static void sommatoria() throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t ~ SOMMATORIA ~\n");
        System.out.println("Inserire i 2 numeri per eseguire la sommatoria\n\n");

        System.out.println(INSERISCIUNO);
        int num1 = Integer.parseInt(in.readLine());

        System.out.println(INSERISCIDUE);
        int num2 = Integer.parseInt(in.readLine());

        int risultato = num1 + num2;

        System.out.println("\n\n\tLa sommatoria e': " + risultato);
    }

    public static void differenza() throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t ~ DIFFERENZA ~\n");
        System.out.println("Inserire i 2 numeri per eseguire la differenza\n\n");

        System.out.println(INSERISCIUNO);
        int num1 = Integer.parseInt(in.readLine());

        System.out.println(INSERISCIDUE);
        int num2 = Integer.parseInt(in.readLine());

        int risultato = num1 - num2;

        System.out.println("\n\n\tLa differenza e': " + risultato);
    }

    public static void prodotto() throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t ~ PRODOTTO ~\n");
        System.out.println("Inserire i 2 numeri per eseguire la divisione\n\n");

        System.out.println(INSERISCIUNO);
        int num1 = Integer.parseInt(in.readLine());

        System.out.println(INSERISCIDUE);
        int num2 = Integer.parseInt(in.readLine());

        int risultato = num1 * num2;

        System.out.println("\n\n\tIl prodotto e': " + risultato);

    }

    public static void divisione() throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int risultato = 0;
        int resto = 0;

        System.out.println("\t\t ~ DIVISIONE ~\n");
        System.out.println("Inserire i 2 numeri per eseguire la divisione\n\n");

        System.out.println("Inserire il NUMERATORE: ");
        int num1 = Integer.parseInt(in.readLine());

        System.out.println("\nInserire il DENOMINATORE: ");
        int num2 = Integer.parseInt(in.readLine());

        if (num1 == 0 || num2 == 0) {

            System.out.println("Input INVALIDO! \n\n");

        } else {

            risultato = num1 / num2;
            resto = num1 % num2;

            System.out.println("\n\n\tIl quoziente e': " + risultato);
            System.out.println("\n\tIl resto e': " + resto + "\n\n");

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