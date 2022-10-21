/*

Algoritmo:  Scrivere un programma che consenta di usare delle matite e dei pastelli
            in un borsello. 
                        
Programmatore: Simone D'Anna
Data: 30/01/2022
Versione: V2.0

*/

import java.io.*;

public class Borsello {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        Matita matitaikea = new Matita("B", "Grafite");
        Matita pastellobianco = new Matita("Pastello", "Bianco");
        MatitaConGommino matitastandler = new MatitaConGommino("HB", "Grafite", 10);

        String frasescritta = "";

        int scelta = 0;

        cls();

        System.out.println("Inserisci il tuo nome: ");
        String nomeutente = tastiera.readLine();

        cls();

        do {

            System.out.println("Frase composta : " + frasescritta+"\n\n\n");

            System.out.println("\n\t\t ~ Borsello di (" + nomeutente + ") ~\n Seleziona matita");

            System.out.println("\n(1) | Matita Ikea "+matitaikea+" \n");
            System.out.println("(2) | Matita Standler "+matitastandler+" \n");
            System.out.println("(3) | Matita Standler (CANCELLA) \n");
            System.out.println("(4) | Pastello Bianco "+pastellobianco+" \n");
            System.out.println("(5) |USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:
                    frasescritta += matitaikea.scrivi();
                    break;

                case 2:
                    frasescritta +=matitastandler.scrivi();
                    break;

                case 3:
                    frasescritta = matitastandler.cancella(frasescritta);
                    break;

                case 4:
                    frasescritta +=pastellobianco.scrivi();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;

            }

        } while (scelta < 5);

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