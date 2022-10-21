import java.io.*;

public class Matita {

    protected int lunghezza; // In CM (Classica 18)
    protected String durezza;
    protected String colore;
    protected int caratteririmanenti = 100;

    public Matita(int lunghezza, String durezza, String colore) {
        
        this.lunghezza = lunghezza;
        this.durezza = durezza;
        this.colore = colore;

    }

    public Matita(String durezza, String colore) {
        
        lunghezza = 18;
        this.durezza = durezza;
        this.colore = colore;

    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getDurezza() {
        return durezza;
    }

    public void setDurezza(String durezza) {
        this.durezza = durezza;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void tempera() {

        if (lunghezza != 1) {

            lunghezza--;
            caratteririmanenti = 100;

        }

    }

    public String scrivi() throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        String output="";

        if (lunghezza != 1){

            System.out.println("Scrivi: ");
            input = tastiera.readLine();
            
            if (input.length() > caratteririmanenti) {

                System.out.println("Hai scritto troppi caratteri, puoi scrivere solo "+caratteririmanenti+" caratteri. \n");

            } else {

                output = input;
                caratteririmanenti -= input.length();

            }

            if (caratteririmanenti < 1) {

                System.out.println("Tempero la matita, hai finito i caratteri a disposizione ! ");
                tempera();

            }

        } else {

            System.out.println("Non puoi scrivere !! Hai finito la lunghezza. ");

        }

        return output;

    }

    public String toString() {
        
        return "[("+lunghezza+") Cm  ("+durezza+") ("+colore+")" + "(Caratteri rimanenti: "+caratteririmanenti+")"+"]";

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