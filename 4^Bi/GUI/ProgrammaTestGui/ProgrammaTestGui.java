/*

    Algoritmo:      Realizzare un’applicazione Java con l’uso
                    di finestre di popup per:

                        1. Leggere una sequenza di parole e
                        contare quante volte è stata inserita 
                        una parola;

                        2. Calcolare il fattoriale di un numero n;

                        3. Stampare n termini della sequenza di
                        Fibonacci

    Programmatore:  Simone D'Anna
    Data:           30/04/2022
    Versione:       V 2.0

*/

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class ProgrammaTestGui {

    public static void main(String[] args) throws IOError {

        int scelta;

        do {

            scelta = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "(Scegli operazione)\n 1) Conta parole\n 2) Fattoriale numero\n 3) Sequenza Fibonacci\n 4) EXIT",
                    "0"));
            switch (scelta) {
                case 1:
                    contaparole();
                    break;
                case 2:
                    fattoriale();
                    break;
                case 3:
                    fibonacci();
                    break;
                case 4:
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "VALORE INSERITO ERRATO!", "Errore", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (scelta != 4);

    }

    private static void contaparole() {

        int scelta;

        do {

            String testo = JOptionPane.showInputDialog("Inserisci una frase");

            String stringa = JOptionPane.showInputDialog("Inserisci una stringa da trovare nella frase");

            int counter = 0;

            String paroleSplit[] = testo.split("\\s+");

            for (int i = 0; i < paroleSplit.length; i++) {

                if (paroleSplit[i].equals(stringa)) {
                    counter++;
                }

            }

            JOptionPane.showMessageDialog(null,
                    " Il testo: " + testo + "\n\n( CONTIENE " + stringa + "  " + counter + " Volta\\e)", "Risultato",
                    JOptionPane.INFORMATION_MESSAGE);

            scelta = JOptionPane.showConfirmDialog(null, "Vuoi continuare ?", "Scelta", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        } while (scelta != JOptionPane.NO_OPTION);

    }

    private static void fattoriale() {

        int scelta;

        do {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));

            Long fact = Long.parseUnsignedLong("1");

            for (int i = 1; i <= numero; i++) {

                fact *= i;

            }

            JOptionPane.showMessageDialog(null,
                    " Il fattoriale di : " + numero + "\n\n( E' Uguale a : " + Long.toUnsignedString(fact) + ")",
                    "Risultato", JOptionPane.INFORMATION_MESSAGE);

            scelta = JOptionPane.showConfirmDialog(null, "Vuoi continuare ?", "Scelta", JOptionPane.YES_NO_OPTION);

        } while (scelta != JOptionPane.NO_OPTION);

    }

    private static void fibonacci() {

        int scelta;

        do {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));

            int massimo = 1;
            int minimo = 1;

            Vector<Integer> sequenza = new Vector<>();

            try {

                sequenza.add(minimo);

                while (massimo < numero && numero < 2000000000) {

                    sequenza.add(massimo);
                    massimo = minimo + massimo;
                    minimo = massimo - minimo;

                }

            } catch (InputMismatchException e) {

                System.out.println("(Limite raggiunto !!!)");

            }

            JOptionPane.showMessageDialog(null,
                    " La sequenza di fibonacci del numero : " + numero + "\n\n( E' Uguale a : " + toStringFormatted(sequenza ,10)
                            + ")",
                    "Risultato", JOptionPane.INFORMATION_MESSAGE);

            scelta = JOptionPane.showConfirmDialog(null, "Vuoi continuare ?", "Scelta", JOptionPane.YES_NO_OPTION);

        } while (scelta != JOptionPane.NO_OPTION);

    }

    private static String toStringFormatted(Vector <Integer> vect, int dimensioneStampa){

        Iterator <Integer> i = vect.iterator();
        int counter = 0;
        
        if (! i.hasNext()){
            return "[]";
        }

        StringBuilder formattedStr = new StringBuilder();

        formattedStr.append('[');
        
        for (;;) {

            Integer e = i.next();

            formattedStr.append(e);

            if (! i.hasNext()){
                return formattedStr.append(']').toString();
            }
            
            if (counter > dimensioneStampa) {

                formattedStr.append("\n");
                counter = 0;
                
            }

            formattedStr.append(',').append(' ');

            counter ++;

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
