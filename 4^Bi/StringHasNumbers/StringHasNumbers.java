/*

Algoritmo:  Il programma legge una stringa da tastiera e
            controlla se il testo inserito è composto solo da
            numeri o se sono presenti anche delle lettere.
            Stampa a video il risultato, “È un numero” oppure
            “Non è un numero”.

Programmatore: Simone D'Anna
Data: 14/10/2021

*/

import java.util.Scanner;

public class StringHasNumbers {
   
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        
        String stringa = input.next();
        int lunghezza = stringa.length();

        if (presenzaLettere(stringa, lunghezza) == true){
            System.out.println("E' Un Numero");
        } else {
            System.out.println("NON e' Un Numero");
        }


    }
   
    public static boolean presenzaLettere(String str, int n)
    {

        boolean numeri = true;
        int i = 0;

        while(i<str.length()&& numeri==true){
    
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numeri = true;
            } else {
                numeri = false;
            }

            i++;
        
        }

        return numeri;

    }
} 
