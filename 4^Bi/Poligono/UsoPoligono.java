/*

    Algoritmo:  Uso di Cubo e Poligono

    Programmatore: Simone D'Anna
    Data: 22/02/2022
    Versione: V1.0

*/

import java.io.*;

public class UsoPoligono {
    public static void main(String args[]) throws IOException {

        Poligono poli1 = new Poligono(4, 6.8);

        System.out.println("\nOggetto Poligono Creato!");

        System.out.println("\n\nIl suo perimetro è: " + poli1.perimetro());
        poli1.stampa();

        poli1.aumenta(1.2);
        System.out.println("\n\nOggetto Poligono Aumentato!");

        System.out.println("\n\nIl suo volume è: " + poli1.volume(5));

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
