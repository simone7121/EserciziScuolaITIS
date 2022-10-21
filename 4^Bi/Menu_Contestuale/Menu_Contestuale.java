/*

Programmatore: Simone D'Anna
Data: 14/10/2021

*/

import java.util.Scanner;

public class Menu_Contestuale {
    public static void main(String[] args) {

        lista();
        return;

    }

    private static void lista() {

        Scanner input = new Scanner(System.in);
        int risultato = 0;
        int scelta = 0;
        String risultatoStr = "Il risultato è: ";
        do {

            do {
                System.out.print(
                        "Seleziona il programma\n 1. Somma da 1 a 10\n 2. Prodotto da 1 a 10\n 3. Somma di 2 numeri interi\n 4. Stampa messaggio\n 5. Stampa asterischi \n 6. Doppio di un numero assoluto \n 7. EXIT \nScelta:");
                scelta = input.nextInt();
            } while (scelta < 1 || scelta > 7);

            switch (scelta) {

                case 1:
                    risultato = somma10(); // chiamata del metodo somma10
                    System.out.println(risultatoStr + risultato);
                    break;

                case 2:
                    risultato = prodotto10(); // chiamata del metodo prodotto10
                    System.out.println(risultatoStr + risultato);
                    break;

                case 3:
                    System.out.print("Inserisci 1 numero: ");
                    int num1 = input.nextInt();
                    System.out.print("Inserisci 2 numero: ");
                    int num2 = input.nextInt();
                    risultato = somma(num1, num2); // chiamata del metodo somma
                    System.out.println(risultatoStr + risultato);
                    break;

                case 4:

                    stampaMessaggio(); // chiamata del metodo stampaMessaggio
                    break;

                case 5:
                    System.out.println("Inserisci dimensione ");
                    num1 = input.nextInt();
                    stampaAsterischi(num1); // chiamata del metodo stampaAsterischi
                    break;

                case 6:
                    System.out.println("Inserisci numero intero ");
                    num1 = input.nextInt();
                    risultato = doubleAbs(num1); // chiamata del metodo doubleAbs
                    System.out.println(risultatoStr + risultato);
                    break;
                case 7:
                    System.out.println("Uscita ...");
                    return;
                
                default:
                    System.out.println("Numero errato, riprova!");
                    return;
            }

        } while (scelta != 7);
    }

    // metodo ausiliario che calcola la somma da 1 a 10
    private static int somma10() {
        int ris = 0;
        for (int i = 1; i <= 10; i++)
            ris += i;
        return ris;
    }

    // metodo ausiliario che calcola il prodotto da 1 a 10
    private static int prodotto10() {
        int ris = 1;
        for (int i = 1; i <= 10; i++)
            ris *= i;
        return ris;
    }

    // metodo ausiliario che calcola la somma di a e b
    private static int somma(int n1, int n2) {
        return n1 + n2;
    }

    // metodo ausiliario che Stampa un messaggio
    private static void stampaMessaggio() {
        System.out.println(" Messaggio di prova ");
    }

    // metodo ausiliario che Stampa n asterischi
    private static void stampaAsterischi(int n) {
        if (n <= 0) {
            System.out.println(" valore errato ");
            return; // corretto , ma usare con cautela !
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*"); // niente else !
        }
        System.out.println(" ");
    }

    // metodo ausiliario che calcola il doppio di abs
    private static int doubleAbs(int n) {
        int res = Math.abs(n);
        return 2 * res;
    }

}
