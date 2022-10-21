/*

    Algoritmo:  Gestione di un garage :
                    Il garage ha al max 20 posti ognuno dei quali è identificato da un num a partire da 0 e 
                    può ospitare solo auto moto e furgoni partendo dalla classe base Veicolo ; 
                    la si estenda, realizzando anche le classi che modellano le classi Furgone,Auto e Moto.
                    Ridefinire il metodo toString in modo che ogni classe possa esternalizzare in forma di 
                    stringa tutte le informazioni che la riguardano.
                    
                    Si implementi una classe che modelli il garage offrendo le seguenti operazioni di gestione
                        1] immissione di un nuovo veicolo
                        2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
                        3] stampa della situazione corrente dei posti nel garage 

                        Veicolo:marca,anno,cilindrata;

                    Caratteristiche delle classi derivate:
                        Auto:porte, alimentazione (diesel/benzina)
                        Moto:tempi
                        Furgone:capacità di carico

    Programmatore: Simone D'Anna
    Data: 31/03/2022
    Versione: V1.0

*/

import java.io.*;

public class AutoRimessa {

    static BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOError, IOException {

        Garage garage = new Garage(20);

        System.out.print("Inserire il nome del garage: ");
        garage.setNome(tastiera.readLine());

        selezione(garage);

    }

    public static void selezione(Garage garage) throws IOError, IOException {

        int scelta;
        boolean inserimento = false;

        cls();

        do {

            System.out.println("\n\t\t ~ Garage (" + garage.getNome() + ") ~\n");

            if (inserimento) {
                garage.stampaStatoGarage();
            }

            System.out.println("\n(1) |Entrata veicolo \n");
            System.out.println("(2) |Uscita veicolo \n");
            System.out.println("(3) |Stampa veicoli presenti nel garage \n");
            System.out.println("(4) |USCIRE \n\n\n");
            System.out.print("SCELTA: ");

            scelta = Integer.parseInt(tastiera.readLine());

            cls();

            switch (scelta) {

                case 1:

                    inserimento = true;

                    if (garage.getPostioccupati() == garage.getMaxposti()) {
                        System.out.println("ERRORE: Non c'e' NESSUN POSTO DISPONIBILE !!");
                    } else {
                        entrataVeicolo(garage); 
                    }

                    break;

                case 2:

                    if (inserimento) {
                        
                        if (!uscitaVeicolo(garage)) {
                            System.out.println("ERRORE: Non c'e' nessun veicolo da far uscire in quel posto !!");
                        }
                        
                    } else {
                        System.out.println("ERRORE: Non c'e' nessun veicolo nel garage !!");
                    }

                    break;

                case 3:
                    if (inserimento) {
                        garage.stampaVeicoli();
                    } else {
                        System.out.println("ERRORE: Non c'e' nessun veicolo !!");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Input INVALIDO, Riprova !\n\n");
                    break;

            }

        } while (scelta < 4);

    }

    public static String entrataVeicolo(Garage garage) throws IOException, IOError {

        int scelta;

        String targa;
        String marca;
        int anno;
        int cilindrata;

        int tempi;

        int porte;
        String alimentazione;

        int capacita; // Espressa in kg

        cls();

        System.out.println("\n\t\t ~ Seleziona il tipo di veicolo ~\n");

        System.out.println("\n(1) |Moto \n");
        System.out.println("(2) |Furgone \n");
        System.out.println("(3) |Auto \n");
        System.out.println("(4) |Veicolo (GENERICO) \n\n\n");
        System.out.print("SCELTA: ");

        scelta = Integer.parseInt(tastiera.readLine());

        cls();

        switch (scelta) {

            case 1:

                System.out.println("Inserisci la targa: ");
                targa = tastiera.readLine();

                System.out.println("Inserisci la marca: ");
                marca = tastiera.readLine();

                System.out.println("Inserisci l'anno: ");
                anno = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci la cilindrata: ");
                cilindrata = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci i tempi del motore: ");
                tempi = Integer.parseInt(tastiera.readLine());

                Moto motoappo = new Moto(targa, marca, anno, cilindrata, tempi);

                garage.addVeicolo(motoappo);

                return "Moto";

            case 2:

                System.out.println("Inserisci la targa: ");
                targa = tastiera.readLine();

                System.out.println("Inserisci la marca: ");
                marca = tastiera.readLine();

                System.out.println("Inserisci l'anno: ");
                anno = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci la cilindrata: ");
                cilindrata = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci La capacita': ");
                capacita = Integer.parseInt(tastiera.readLine());

                Furgoni furgoappo = new Furgoni(targa, marca, anno, cilindrata, capacita);

                garage.addVeicolo(furgoappo);

                return "Furgoni";

            case 3:

                System.out.println("Inserisci la targa: ");
                targa = tastiera.readLine();

                System.out.println("Inserisci la marca: ");
                marca = tastiera.readLine();

                System.out.println("Inserisci l'anno: ");
                anno = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci la cilindrata: ");
                cilindrata = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci le porte: ");
                porte = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci l'alimentazione del motore: ");
                alimentazione = tastiera.readLine();

                Auto autoappo = new Auto(targa, marca, anno, cilindrata, porte, alimentazione);

                garage.addVeicolo(autoappo);

                return "Auto";

            case 4:

                System.out.println("Inserisci la targa: ");
                targa = tastiera.readLine();

                System.out.println("Inserisci la marca: ");
                marca = tastiera.readLine();

                System.out.println("Inserisci l'anno: ");
                anno = Integer.parseInt(tastiera.readLine());

                System.out.println("Inserisci la cilindrata: ");
                cilindrata = Integer.parseInt(tastiera.readLine());

                Veicolo veicolappo = new Veicolo(targa, marca, anno, cilindrata);

                garage.addVeicolo(veicolappo);

                return "Veicolo";

            default:
                System.out.println("Input INVALIDO, Riprova !\n\n");
                return "ERROR";

        }

    }

    private static boolean uscitaVeicolo(Garage garage) throws IOError,IOException{
        
        int scelta;
             
        garage.stampaVeicoli();

        System.out.print("\n\nSeleziona il veicolo da 1 a " + garage.getMaxposti() + ": ");
        scelta = Integer.parseInt(tastiera.readLine()) - 1;

        return garage.removeVeicolo(scelta);


    }


    private static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
