/*

    Algoritmo:      Realizzare un’applicazione Java con l’uso
                    di finestre di popup per gestire dei
                    numeri casuali letti dall'utente.

    Programmatore:  Simone D'Anna
    Data:           06/05/2022
    Versione:       V 2.0

*/

import java.io.*;
import java.util.*;

public class DataLogTemp {

    static BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOError, NumberFormatException, IOException {

        Vector<Temperatura> temperature = new Vector<>();
        Temperatura appoTemp;

        System.out.println("Lettura da file ? \n1 SI / 2 NO:");
        int select = Integer.parseInt(tastiera.readLine());

        if (select == 1) {

            temperature = leggifile();

        } else {

            System.out.println("Inserisci nome: ");
            appoTemp = new Temperatura(tastiera.readLine());

            int i = 0;
            int tempAppo;

            do {

                i++;

                System.out.println("Inserisci " + i + " Temperatura (-255 per finire):");

                tempAppo = Integer.parseInt(tastiera.readLine());

                if (tempAppo != -255) {

                    appoTemp.addTemperatura(tempAppo);
                }

            } while (tempAppo != -255);

            temperature.add(appoTemp);

        }

        calcoloMediaTemperature(temperature);

    }

    private static Vector<Temperatura> leggifile() {

        Vector<Temperatura> appoVect = new Vector<>();
        Temperatura appoTemp;

        try (Scanner file = new Scanner(new BufferedReader(new FileReader("input.txt")))) {

            while (file.hasNext()) {

                appoTemp = new Temperatura(file.next());

                while (file.hasNextInt()) {
                    appoTemp.addTemperatura(file.nextInt());
                }

                appoVect.add(appoTemp);

            }

        } catch (Exception e) {
            System.out.println("Errore");
        }

        return appoVect;

    }

    private static void scrivifile(Vector<Temperatura> temperature) {

        Iterator<Temperatura> i = temperature.iterator();
        Temperatura appo;

        try (BufferedWriter file = new BufferedWriter(new FileWriter("input.txt", true));) {
            while (i.hasNext()) {

                appo = i.next();

                file.write(appo.getNome() + "\n");

                Iterator<Integer> j = appo.getTemperature().iterator();

                while (j.hasNext()) {
                    file.write(j.next() + "\n");
                }

            }
        } catch (Exception e) {
            System.out.println("Errore");
        }

    }

    private static void calcoloMediaTemperature(Vector<Temperatura> temperature) throws IOException {

        Temperatura selectTemp;
        Vector<Integer> temperatureTemp;

        int sommatoria = 0;
        int media;
        int scelta;

        stampa(temperature);

        do {
            System.out.println("Seleziona l'intervallo:");
            scelta = Integer.parseInt(tastiera.readLine()) - 1;
        } while (scelta > temperature.size());
            
        selectTemp = temperature.get(scelta);

        temperatureTemp = selectTemp.getTemperature();

        System.out.println("Calcolo la media delle temperature ...");

        Iterator<Integer> i = temperatureTemp.iterator();

        while (i.hasNext()) {

            sommatoria += i.next();

        }

        media = sommatoria / temperatureTemp.size();

        System.out.println("La media e': " + media);

        scrivifile(temperature);

    }

    public static void stampa(Vector<Temperatura> temperature) {

        Iterator<Temperatura> i = temperature.iterator();
        Temperatura appo;

        String div = "\n____________________________________________________________________________________________________________________";

        System.out.format("%20s", "|Nome|");
        System.out.format("%80s", "|Temperature|");

        System.out.println(div);

        while (i.hasNext()) {

            appo = i.next();

            System.out.format("%n");
            System.out.format("%20s", appo.getNome());
            System.out.format("%80s", appo.getTemperature());

        }

        System.out.println(div);
        System.out.println("\n\n");

    }
}
