/*

Algoritmo: Instanziare 2 oggetti Quadrato e visualizzare quello con l'area maggiore

Programmatore: Simone D'Anna
Data: 28/10/2021

*/

import java.io.*;

class QuadratoTest {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        Quadrato quad1;
        Quadrato quad2;

        final String slato = "Inserisci nuova lato: ";

        quad1 = new Quadrato();
        quad2 = new Quadrato();

        System.out.print(slato);
        quad1.setlato(Float.parseFloat(tastiera.readLine()));

        System.out.print(slato);
        quad2.setlato(Float.parseFloat(tastiera.readLine()));

        quad1.stampa();
        quad2.stampa();

        System.out.println("\nPerimetro del 1° quadrato: " + quad1.perimetro());
        System.out.println("Perimetro del 2° quadrato: " + quad2.perimetro());

        System.out.println("\nArea del 1° quadrato: " + quad1.area());
        System.out.println("Area del 2° quadrato: " + quad2.area());     

        System.out.println("\nDiagonale del 1° quadrato: " + quad1.diagonale());
        System.out.println("Diagonale del 2° quadrato: " + quad2.diagonale());

        if(quad1.area() > quad2.area()){
            System.out.println("\n\nL'Area del 1° quadrato e maggiore del 2° quadrato ");
        } else if (quad1.area() < quad2.area()){
            System.out.println("\n\nL'Area del 2° quadrato e maggiore del 1° quadrato ");
        } else {
            System.out.println("\n\nL'Area del 1° quadrato e uguale al 2° quadrato ");
        }

        if(quad1.perimetro() > quad2.perimetro()){
            System.out.println("\nIl Perimetro del 1° quadrato e maggiore del 2° quadrato ");
        } else if (quad1.perimetro() < quad2.perimetro()){
            System.out.println("\nIl Perimetro del 2° quadrato e maggiore del 1° quadrato ");
        } else {
            System.out.println("\nIl Perimetro del 1° quadrato e uguale al 2° quadrato ");
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