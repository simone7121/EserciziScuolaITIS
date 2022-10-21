/*

Algoritmo:  Usando la classe Contatore, simulare gli ingressi ad un museo. All'ingresso c'è una pulsantiera con le lettere 1(ingresso) 2(Uscita) e 0(chiusura).
            Prima di chiudere controllare le persone ancora nel museo e sollecitare l'uscita.
            Suggerimento: Usare la generazione dei numeri casuali !

Programmatore: Simone D'Anna
Data: 03/11/2021

*/

import java.util.Random;

public class museoContatore {
    public static void main(String args[]) {

        Contatore persone = new Contatore();

        Random rand = new Random();

        int inp = 0;

        System.out.println("Conta MUSEO");

        do {

            System.out.println("\n\n~ Totale persone interne = " + persone.getVal());
            System.out.print("\t(0 = Chiusura, 1 = Entra una persona, 2 = Esce una persona) : ");

            inp = rand.nextInt(3);
            System.out.println(inp + "");

            if (inp == 1) {                                 // Add persone
                System.out.println("|+ 1 Persona|");
                persone.inc();
            } else if (inp == 2 && persone.getVal() != 0) { // Decrementa persone se totale not equal a 0
                System.out.println("|- 1 Persona|");
                persone.dec();
            } else if (persone.getVal() == 0) {             // Nessuna Persona rimanente
                System.out.println("|0 Persone rimanenti|");
            }

            if (inp == 0 && persone.getVal() != 0) {        // Se Qualche persona rimasta and ordine chiusura 
                System.out.println("|IMPOSSIBILE CHIUDERE, Ci sono " + persone.getVal() + " persona/e all'interno del museo ...|");
                inp = 1;
            } else if (inp == 0 && persone.getVal() == 0) { // Se nessuna persona rimasta and ordine chiusura
                System.out.println("|Chiusura museo ...|");
            }

        } while (inp != 0);
    }
}
