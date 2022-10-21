import java.io.*;

public class Punti {
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserisci il primo punto: ");
        double num1 = Double.parseDouble(in.readLine());

        System.out.print("Inserisci il secondo punto: ");
        double num2 = Double.parseDouble(in.readLine());

        Punto punti1 = new Punto(num1,num2);

        System.out.print("Inserisci il primo punto: ");
        num1 = Double.parseDouble(in.readLine());

        System.out.print("Inserisci il secondo punto: ");
        num2 = Double.parseDouble(in.readLine());

        Punto punti2 = new Punto(num1,num2);

        System.out.println("La distanza dal 2 punto al 1 è: " + punti1.distanzaDa(punti2));
        System.out.println("La distanza dal 2 punto al 1 è: " + punti2.distanzaDa(punti1));
    
        System.out.println("La distanza tra" + punti1.toString() + punti2.toString()+"\nPunto è: " + Punto.distanzaTra(punti1,punti2));
    
    
    
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
