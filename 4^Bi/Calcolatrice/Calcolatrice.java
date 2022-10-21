
/*

Algoritmo:  Descrivere una classe che simula una calcolatrice: 
            deve essere in grado di memorizzare due numeri ed eseguire le operazioni elementari

Programmatore: Simone D'Anna
Data: 16/11/2021

*/
import java.io.*;

public class Calcolatrice {

    public static void main(String args[]) throws IOException {

        char scelta;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserisci il primo numero: ");
        double num1 = Double.parseDouble(in.readLine());

        System.out.print("Inserisci il secondo numero: ");
        double num2 = Double.parseDouble(in.readLine());

        Operazioni operazioni = new Operazioni(num1, num2);

        do {

            scelta = menu();

            switch (scelta) {

                case '+':
                    System.out.println("La somma e' " + operazioni.somma());
                    break;
                case '-':
                    System.out.println("La differenza e' " + operazioni.sottrazione());
                    break;
                case '*':
                    System.out.println("Il prodotto e' " + operazioni.prodotto());
                    break;
                case '/':
                    if (operazioni.getN2() == 0) {
                        System.out.println("Il quoziente non può essere definito ");
                    } else {
                        System.out.println("Il quoziente e': " + operazioni.divisione());
                    }
                    break;
                case 'c':
                    System.out.println("Cambia i valori ");
                    System.out.print("Inserisci il primo numero: ");
                    operazioni.setN1(Double.parseDouble(in.readLine()));
                    System.out.print("Inserisci il secondo numero: ");
                    operazioni.setN2(Double.parseDouble(in.readLine()));
                    break;

            }

        } while (scelta != 'x');

    }

    private static char menu() throws IOException {
        char inserito = ' ';
        do {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(
                    "Seleziona il programma\n +) Somma\n *) Prodotto\n /) Divisione\n -) Sottrazione\n c) Cambia Numeri\n x) EXIT\n Scelta:");

            inserito = in.readLine().charAt(0);

        } while (inserito != '+' && inserito != '*' && inserito != '/' && inserito != '-' && inserito != 'c'
                && inserito != 'x');
        return inserito;
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