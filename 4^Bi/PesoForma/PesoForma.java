/*

Algoritmo:  Definisci una classe Pesata che contiene i seguenti dati privati: nome, altezza in metri e
            peso in Kg (con opportuno costruttore e metodi get/set) e che possegga un metodo
            inForma che valuta se una persona è in pesoforma.

            Una persona è in pesoforma se il rapporto tra peso e quadrato dell’altezza è compreso tra 23 e 27.
            Scrivi una classe main che dopo aver registrato in un array 5 “pesate” di persone diverse,
            visualizza il nome e il numero delle persone in pesoforma. Ad esempio metti i dati dei tuoi
            familiari
                        
Programmatore: Simone D'Anna
Data: 27/01/2022
Versione: V1.0

*/
import java.io.*;

public class PesoForma {
    public static void main(String args[]) throws IOException{
        
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserire il numero di persone da pesare: ");
        int inp = Integer.parseInt(tastiera.readLine());

        Pesata clienti []= new Pesata[inp];

        for (int i = 0; i < inp; i++) {
            clienti[i]=inpCli(i);            
        }

        System.out.println("\n\n(PERSONE IN FORMA)");

        for (int i = 0; i < inp; i++) {     
            if(clienti[i].inForma()){
                System.out.println(clienti[i] + "\n\n");
            }
        }

    }

    private static Pesata inpCli (int i) throws IOException{

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        cls();

        double alte = 0;

        System.out.println("\t\t ( "+(i+1)+" Persona )");

        System.out.print("Inserire Il nome: ");
        String nome = tastiera.readLine();

        do {
            System.out.print("Inserire l'altezza in METRI: ");
            alte = Double.parseDouble(tastiera.readLine());
        } while (alte > 2.50 || alte < 0.60);
            

        System.out.print("Inserire Il Peso: ");
        int peso = Integer.parseInt(tastiera.readLine());

        return new Pesata(nome,alte,peso);

    }

    private static void cls() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    
}
