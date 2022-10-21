/*

Algoritmo:  Implementare in Java la classe Punto.
            Creare un main per usare due oggetti della classe Punto

Programmatore: Simone D'Anna
Data: 17/11/2021

*/

import java.io.*;

public class Puntiv1 {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t CALCOLO ASSI CARTESIANI");

        Genlinea(50);

        Punto p = generaPunto(1);

        Genlinea(50);

        Punto p1 = generaPunto(2);

        Genlinea(50);

        System.out.print("\nInserisci le coordinate x da traslare: ");
        int a1 = Integer.parseInt(tastiera.readLine());

        System.out.print("\nInserisci le coordinate y da traslare: ");
        int a2 = Integer.parseInt(tastiera.readLine());
        
        Punto p2 = p.puntoTraslato(a1,a2);

        System.out.println("\nIl nuovo punto equivale a:" + p2.toString());

        Genlinea(50);

        double distanza = Punto.distanzaTra(p, p1);

        System.out.println("\nLa distanza tra i due punti e' " + distanza);

        boolean equality = p.equals(p1);

        if (equality == true) {
            System.out.println("\nLe coordinate dei due punti sono uguali !");
        } else {
            System.out.println("\nLe coordinate dei due punti sono diverse !");
        }

        System.out.println(p.toString());
        System.out.println(p1.toString());

        Genlinea(50);
        
    }

    public static void Genlinea(int lunghezza) {

        System.out.print("\n");

        for (int i = 0; i < lunghezza; i++){
            System.out.print("-");
        }
        
        System.out.print("\n");

    }

    public static Punto generaPunto(int num) throws NumberFormatException, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nInserisci le coordinate x del "+num+" punto : ");
        int a1 = Integer.parseInt(tastiera.readLine());

        System.out.print("\nInserisci le coordinate y del "+num+" punto : ");
        int a2 = Integer.parseInt(tastiera.readLine());

        return new Punto(a1,a2);
        
    }

    
}
