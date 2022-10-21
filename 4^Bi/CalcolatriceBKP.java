/*

Programmatore: Simone D'Anna
Data: 16/11/2021

*/

import java.util.Scanner;

public class CalcolatriceBKP {

    public static void main(String[] args) {

        double risultato = 0;
        char scelta = 'N';
        double num1 = 0;
        double num2 = 0;
        String risultatoStr = "Il risultato è: ";
        do {

            do {
                System.out.print(
                        "Seleziona il programma\n +) Somma\n *) Prodotto\n /) Divisione\n -) Sottrazione\n !) EXIT\nScelta:");
                scelta = input.next();
            } while (scelta != '+' && scelta != '-' && scelta != '*' && scelta != '/' && scelta != '!' );

            switch (scelta) {

                case '+':
                    System.out.print("Inserisci 1 numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Inserisci 2 numero: ");
                    num2 = input.nextDouble();
                    risultato = Operazioni.somma(num1, num2); // chiamata del metodo somma
                    System.out.println(risultatoStr + risultato);
                break;

                case '*':
                    System.out.print("Inserisci 1 numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Inserisci 2 numero: ");
                    num2 = input.nextDouble();
                    risultato = Operazioni.prodotto(num1, num2); // chiamata del metodo prodotto
                    System.out.println(risultatoStr + risultato);
                break;

                case '/':
                    System.out.print("Inserisci 1 numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Inserisci 2 numero: ");
                    num2 = input.nextDouble();
                    risultato = Operazioni.divisione(num1, num2); // chiamata del metodo divisione
                    System.out.println(risultatoStr + risultato);
                break;

                case '-':
                    System.out.print("Inserisci 1 numero: ");
                    num1 = input.nextDouble();
                    System.out.print("Inserisci 2 numero: ");
                    num2 = input.nextDouble();
                    risultato = Operazioni.sottrazione(num1, num2); // chiamata del metodo sottrazione
                    System.out.println(risultatoStr + risultato);
                break;

                case '!':
                    System.out.println("Uscita ...");
                    return;
                
                default:
                    System.out.println("Carattere errato, Riprova!");
                    return;
            }

        } while (scelta != 7);

    }

}
