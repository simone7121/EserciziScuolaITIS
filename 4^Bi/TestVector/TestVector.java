import java.io.*;
import java.util.*;

public class TestVector {
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cod, desc;
        double prez;
        int sc, c;

        Vector<Articoli> neg = new Vector<Articoli>();

        do {
            sc = menu();
            switch (sc) {
                case 1:
                    System.out.println("Inserisci il codice: ");
                    cod = in.readLine();
                    System.out.println("Inserisci la descrizione: ");
                    desc = in.readLine();
                    System.out.println("Inserisci il prezzo: ");
                    prez = Double.parseDouble(in.readLine());

                    neg.addElement(new Articoli(cod, desc, prez));
                    break;
                case 2:
                    if (!neg.isEmpty()) {
                        do {
                            System.out.println("Quale articolo vuoi rimuovere? ");
                            c = Integer.parseInt(in.readLine());
                        } while (c < 0 || c > neg.size());
                        neg.removeElementAt(c - 1);
                    } else {
                        System.out.println("Non ci sono elementi");
                    }
                    break;
                case 3:
                    if (!neg.isEmpty()) {
                        System.out.println(neg);
                        do {
                            System.out.println("A quale articolo vuoi stampare le informazioni ");
                            c = Integer.parseInt(in.readLine());
                        } while (c < 0 || c > neg.size());
                        Articoli a = (Articoli) neg.elementAt(c - 1);
                        System.out.println(a);
                    } else {
                        System.out.println("Non ci sono elementi");
                    }
                    break;
            }
        } while (sc != 4);

    }

    private static int menu() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        do {
            System.out.println("1)Inserisci un nuovo articolo\n2)Elimina un articolo\n3)Stampa un articolo\n4)Fine");
            s = Integer.parseInt(in.readLine());
        } while (s < 1 || s > 4);
        return s;
    }
}