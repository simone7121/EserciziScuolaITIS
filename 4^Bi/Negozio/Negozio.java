import java.io.*;
import java.util.*;

public class Negozio {
    public static void main(String[] args) throws IOException,IOError{

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        Vector<CapoAbbigliamento> vestiti = new Vector<>();
        String marca, modello;
        float costo;
        String taglia;
        int quantita, scelta;
        String tagliaScelta;
        int counter = 0;
        int minCosto = 50;
        CapoAbbigliamento temporaneo;

        do {
            System.out.print("Marca: ");
            marca = tastiera.readLine();

            System.out.print("Modello: ");
            modello = tastiera.readLine();

            System.out.print("Costo: ");
            costo = Integer.parseInt(tastiera.readLine());

            System.out.print("Taglia: ");
            taglia = tastiera.readLine();

            System.out.print("Quantità totale: ");
            quantita = Integer.parseInt(tastiera.readLine());

            do {
                System.out.println("Continuo ? : ");
                scelta = Integer.parseInt(tastiera.readLine());
            } while (scelta < 0 && scelta > 1);

            temporaneo = new CapoAbbigliamento(marca, modello, costo, taglia, quantita);

            vestiti.add(temporaneo);

        } while (scelta != 0);

        System.out.println("Inserire taglia: ");
        tagliaScelta = tastiera.readLine();

        Iterator<CapoAbbigliamento> i = vestiti.iterator();

        while (i.hasNext()) {

            temporaneo = (CapoAbbigliamento) i.next();

            if (temporaneo.getTaglia().equals(tagliaScelta)) {

                counter++;

                if (temporaneo.getCosto(true) < minCosto) {

                    temporaneo.getDettagli();

                }

            }

        }

        System.out.println("Il totale di abbigliamenti della taglia: (" + tagliaScelta + ") è " + counter);

    }
    
}
