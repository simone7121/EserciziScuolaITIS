/*

Programmatore: Simone D'Anna
Data: 24/10/2021

*/

import java.io.*;

class Rettangolo {
    public static void main(String args[]) throws IOException {

        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));

        RettangoloFunct r1;
        RettangoloFunct r2;

        final String sBase = "Inserisci nuova base= ";
        final String sAltezza = "Inserisci nuova altezza= ";

        r1 = new RettangoloFunct();
        r2 = new RettangoloFunct(5f, 7f);

        r2.stampa();

        System.out.println(sBase);
        r2.setBase(Float.parseFloat(t.readLine()));

        System.out.println(sAltezza);
        r2.setAltezza(Float.parseFloat(t.readLine()));

        System.out.println(sBase);
        r2.stampa();
        r1.stampa();

        System.out.println(sBase);
        r1.setBase(Float.parseFloat(t.readLine()));

        System.out.println(sAltezza);
        r1.setAltezza(Float.parseFloat(t.readLine()));

        System.out.println(sBase);
        r1.stampa();

        System.out.println("Area del 1° rettangolo " + r1.area());
        System.out.println("Perimetro del 2° rettangolo " + r2.perimetro());

        System.out.println("Diagonale del 1° rettangolo " + r1.diagonale());
        System.out.println("Diagonale del 2° rettangolo " + r2.diagonale());
    }
}

class RettangoloFunct {

    private float base;
    private float altezza;

    public RettangoloFunct() {
        base = 2f;
        altezza = 1f;
    }

    public RettangoloFunct(float b, float h) {
        base = b;
        altezza = h;
    }

    public void setBase(float b) {
        base = b;
    }

    public void setAltezza(float h) {
        altezza = h;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float area() {
        return base * altezza;
    }

    public float perimetro() {
        return 2 * (base + altezza);
    }

    public float diagonale() { // Costruttore
        return (float) Math.sqrt((base*base)+(altezza*altezza));
    }

    public void stampa() {
        System.out.println("Base = " + getBase());
        System.out.println("Altezza = " + getAltezza());
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