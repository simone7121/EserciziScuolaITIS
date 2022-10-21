/*

Algoritmo:  Creare 2 oggetti rettangolo e manipolarli con la classe Rettangolo.java

Programmatore: Simone D'Anna
Data: 20/11/2021
              
Versione: 2.0
Changes:    Sulla base dell'UML e implementazione della classe Punto fornita, aggiungere alla classe Rettangolo i metodi:
            - boolean equiEsteso(Rettangolo r) che stabilisce se i due rettangoli hanno la stessa area
            - Rettangolo copia() che crea un rettangolo copia
            - Rettangolo ingrandisci( int x, int y) che crea un nuovo rettangolo ottenuto dall'attuale aumentando le 
              dimensioni rispettivamente di x e y volte


*/

import java.io.*;

class RettangoloFunct {
    public static void main(String args[]) throws IOException {

        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));

        Rettangolo r1;
        Rettangolo r2;
        Rettangolo r3;
        Rettangolo r4;

        int input;

        final String sBase = "Inserisci nuova base: ";
        final String sAltezza = "Inserisci nuova altezza: ";

        r1 = new Rettangolo();
        r2 = new Rettangolo(5f, 7f);

        System.out.println(r2.toString());

        System.out.print(sBase);
        r2.setBase(Float.parseFloat(t.readLine()));

        System.out.print(sAltezza);
        r2.setAltezza(Float.parseFloat(t.readLine()));

        System.out.println(r2.toString());
        System.out.println(r1.toString());

        System.out.print(sBase);
        r1.setBase(Float.parseFloat(t.readLine()));

        System.out.print(sAltezza);
        r1.setAltezza(Float.parseFloat(t.readLine()));

        System.out.print(sBase);
        System.out.println(r1.toString());

        System.out.println("Area del 1° rettangolo " + r1.area());
        System.out.println("Perimetro del 2° rettangolo " + r2.perimetro());

        System.out.println("Diagonale del 1° rettangolo " + r1.diagonale());
        System.out.println("Diagonale del 2° rettangolo " + r2.diagonale());

        if (r1.equiEsteso(r2)) {
            System.out.println("I rettangoli inseriti hanno la stessa area!");
        } else {
            System.out.println("I rettangoli inseriti NON hanno la stessa area!");
        }

        do {
            System.out.print("CREA UN NUOVO RETTANGOLO! \n\n Seleziona il rettangolo: ");
            input = Integer.parseInt(t.readLine());
        } while (input < 1 && input > 2);

        System.out.print("\nInserisci le coordinate x del nuovo rettangolo : ");
        int x = Integer.parseInt(t.readLine());

        System.out.print("\nInserisci le coordinate y del nuovo rettangolo : ");
        int y = Integer.parseInt(t.readLine());

        switch (input) {

        case 1:
            r3 = r1.ingrandisci(x, y);
            System.out.println(r3.toString());
            break;

        case 2:
            r3 = r2.ingrandisci(x, y);
            System.out.println(r3.toString());
            break;

        default:
            break;
        }
        do {
            System.out.print("COPIA UN RETTANGOLO! \n\n Seleziona il rettangolo: ");
            input = Integer.parseInt(t.readLine());
        } while (input < 1 && input > 2);

        switch (input) {
        case 1:
            r4 = r1.copia();
            System.out.println(r4.toString());
            break;

        case 2:
            r4 = r2.copia();
            System.out.println(r4.toString());
            break;

        default:
            break;
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