import java.io.*;

public class AtelierSapone {

    public static void main(String[] args) throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        Sapone dispenser1  = new Sapone();
        dispenser1.stampa();

        System.out.print("\n\nInserisci la Fragranza del sapone: ");
        String fragranzasapone = tastiera.readLine();

        System.out.print("Inserisci la quantità TOTALE di sapone: ");
        int quantita = Integer.parseInt(tastiera.readLine());

        System.out.print("Inserisci la quantità EROGATA di sapone dal dispenser: ");
        int quantitaerogata = Integer.parseInt(tastiera.readLine());

        Sapone dispenser2 = new Sapone (quantita,quantitaerogata,fragranzasapone);

        dispenser2.stampa();

        toterog(dispenser1);

        toterog(dispenser2);

    }

    public static void toterog(Sapone sapone){

        int totalerogazioni = sapone.getQuantitaSapone()/sapone.getQuantitaErogazione();
        int rimanente = sapone.getQuantitaSapone()%sapone.getQuantitaErogazione();

        System.out.println("\n\nIl totale di erogazioni disponibili per " + sapone.getQuantitaSapone() +" ml di prodotto sono : " + totalerogazioni + " \ncon " + rimanente+ "ML rimanenti nel dispenser.");

    }
   
}
