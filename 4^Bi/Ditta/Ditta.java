/*

    Algoritmo:  Del seguente problema realizzare l'Uml della classe base e rispondere a due dei 3
                punti richiesti di cui uno con un metodo ausiliario. Vengono introdotti i dati 
                (nome, città, tipocliente, importo) relativi a N clienti di una
                ditta che vende per corrispondenza. 

                Determinare:

                    1. La media degli importi:
                    2. Scelta una città, l'elenco, in ordine alfabetico, dei clienti di quella città; 
                    3. La somma delle prime 5 vendite relative ai clienti di tipo "abituale".

    Programmatore: Simone D'Anna
    Data: 25/02/2022
    Versione: V2.0

*/

import java.io.*;

public class Ditta {
    public static void main(String args[]) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int dim = 0;
        float sommatoria = 0.00f;
        int contatore = 0;
        float media = 0.00f;
        Utenze temp;

        final String DIV = "\n_______________________________________________________________";

        do {
            System.out.print("Inserire numeri clienti (MINIMO 2): "); // itera fino a quando l'utente ha inserito almeno
                                                                      // 2 clienti.
            dim = Integer.parseInt(tastiera.readLine());
        } while (dim <= 1);

        Utenze clienti[] = new Utenze[dim]; // Creo un array di oggetti di tipo Utente, lo chiamo clienti e gli assegno
                                            // come dimensione dell'array la dim richiesta precedentemente.

        for (int i = 0; i < clienti.length; i++) { // Fetch clienti in input

            System.out.println("\n\n\t~| CLIENTE N^ " + (i + 1) + " |~");

            System.out.print("Inserire nome: ");
            String nome = tastiera.readLine().toUpperCase();

            System.out.print("Inserire citta': ");
            String citta = tastiera.readLine();

            System.out.print("Inserire Tipo Cliente: ");
            String tipoCliente = tastiera.readLine();

            System.out.print("Inserire importo: ");
            float importo = Float.parseFloat(tastiera.readLine());

            clienti[i] = new Utenze(nome, citta, tipoCliente, importo); // Creo ed inizializzo un oggetto di tipo Utenze
                                                                        // e memorizza il riferimento all'oggetto creato
                                                                        // nell'elelmento dell array di oggetti
                                                                        // clienti[i].

        }

        for (int i = 0; i < clienti.length; i++) {
            sommatoria += clienti[i].getImporto(); // Chiamo [.getImporto()] dell'oggetto clienti[i] e lo somma a
                                                   // sommatoria.
        }

        media = sommatoria / clienti.length; // Faccio la media.

        System.out.println(DIV);

        System.out.println("\n\n\t\tLa media degli incassi e': " + media); // Output.

        System.out.println(DIV);

        sommatoria = 0; // Resetto la sommatoria.

        for (int i = 0; i < clienti.length; i++) {

            /*
             * Se chiamando [.getTipoCliente()] e
             * lo confronto denza differenze tra maiuscole
             * e minuscole ad "abituale" [.equalsIgnoreCase("abituale")] dell'oggetto
             * clienti[i] messo a sistema con la condizione
             * che controlla se [contatore < 5].
             */

            if (clienti[i].getTipoCliente().equalsIgnoreCase("abituale") && contatore < 5) {

                sommatoria += clienti[i].getImporto(); // Chiamo [.getImporto()] dell'oggetto clienti[i] e lo somma a
                                                       // sommatoria.
                contatore++; // Incremento il contatore.

            }
        }

        System.out.println("\n\n\t\tLa somma delle prime 5 vendite e': " + sommatoria); // Output.

        System.out.println(DIV);

        sommatoria = 0; // Resetto la sommatoria.

        System.out.print("\nScegli la citta: ");
        String scelta = tastiera.readLine(); // Ordinamento dell'array di oggetti in modo alfabetico (Considerando la
                                             // Citta).

        for (int i = 0; i < clienti.length; i++) { // Primo Scorrimento.

            for (int j = i + 1; j < clienti.length; j++) { // Secondo Scorrimento.

                /*
                 * Se chiamando [.getNome()] e
                 * lo comparo a [.compareTo(clienti[j].getNome())]
                 * dell'oggetto clienti[i] sia maggiore di 0
                 * (Trova una discrepanza).
                 */
                if (clienti[i].getNome().compareTo(clienti[j].getNome()) > 0) {
                    temp = clienti[i];
                    clienti[i] = clienti[j];
                    clienti[j] = temp;
                }

            }

        }

        // Output formattato.

        System.out.println("\n\n\t\t Elenco Citta di " + scelta + " \n");
        System.out.format("%20s", "Nome");
        System.out.format("%12s", "Citta'");
        System.out.format("%15s", "Tipo Cliente");
        System.out.format("%11s", "Importo");

        System.out.println(DIV);

        for (int j = 0; j < clienti.length; j++) {

            /*
             * Se chiamando [.getCitta()] e
             * lo confronto denza differenze tra maiuscole
             * e minuscole alla scelta dell'utente
             * [.equalsIgnoreCase(scelta)] dell'oggetto
             * clienti[j].
             */

            if (clienti[j].getCitta().equalsIgnoreCase(scelta)) {
                System.out.print("\n");
                System.out.format("%20s", clienti[j].getNome());
                System.out.format("%12s", clienti[j].getCitta());
                System.out.format("%15s", clienti[j].getTipoCliente());
                System.out.format("%11.2f", clienti[j].getImporto());
            }
        }

        System.out.println(DIV);
        System.out.println("");

    }
}
