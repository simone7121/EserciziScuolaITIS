/*

Algoritmo:  Realizzate una classe Studente. 

            Ogni studente ha un nome e un punteggio totale dei questionari a cui ha risposto. 

            Progettate un costruttore appropriato e i metodi get; addPunt(int valore), per registrare il punteggio di un nuovo questionario; 
            Totale(), per conoscere il punteggio totale; Media(), per ottenere la media dei punteggi.

            Per calcolare tale media dovete registrare anche il numero dei questionari a cui lo studente ha dovuto rispondere. 

            Progettate anche una classe StudenteTest che collaudi tutti i metodi.

            Volendo gestire i dati di un’intera classe?      

Programmatore: Simone D'Anna
Data: 02/01/2022

*/

import java.io.*;

public class StudenteTest {
    public static void main(String[] args) throws IOException {

        cls();

        int len = lunghezza();
        Studente classeStudenti[] = new Studente [len];

        array(classeStudenti);
        cls();
        
        aggiungiVoto(classeStudenti);

    }

    private static int lunghezza()throws IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int lenght;
        
        do {
            System.out.print("\nInserire il numero totale di studenti: ");
            lenght = Integer.parseInt(tastiera.readLine());
            System.out.println();
        } while (lenght<=1);

        cls();

        return lenght;
    }

    private static void array(Studente [] array)throws IOException {
        
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        String nome;
        String cognome;
        int totQuestionari; 
        int punteggio;

        for (int i = 0; i < array.length; i++) {

            String studente = " Studente: ";

            System.out.print("Inserire Nome " + (i+1) + studente);
            nome = tastiera.readLine();

            System.out.print("Inserire Cognome " + (i+1) + studente);
            cognome = tastiera.readLine();

            System.out.print("Inserire Totale Punteggio " + (i+1) + studente);
            punteggio = Integer.parseInt(tastiera.readLine());

            System.out.print("Inserire Totale Questionari " + (i+1) + studente);
            totQuestionari = Integer.parseInt(tastiera.readLine());
            
            array[i]= new Studente (nome,cognome, totQuestionari, punteggio);

            System.out.println();
            cls();
        }

    }

    private static void aggiungiVoto(Studente [] array) throws NumberFormatException, IOException {

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        
        int scelta;
        int sceltastudente;

        do{

            do {
                System.out.print("\n\nVorresti aggiungere un nuovo voto ? (1=Si)(0=No): ");
                scelta = Integer.parseInt(tastiera.readLine());
                System.out.print("\n");
            } while (scelta <= 0 && scelta > 1);

            cls();

            if (scelta == 1) {

                stampa(array);

                do {
                    System.out.print("\nScegli lo Studente: ");
                    sceltastudente = Integer.parseInt(tastiera.readLine())-1;
                } while (sceltastudente < 0 || sceltastudente > array.length-1);
                
                System.out.println("\n\t\t\t~ Studente scelto ~");

                System.out.print(array[sceltastudente]);
                System.out.print("Media Punteggi = "+ array[sceltastudente].media()+" |");

                System.out.print("\n\nAggiungi il nuovo punteggio: ");

                array[sceltastudente].addPunt(Integer.parseInt(tastiera.readLine()));

                System.out.print("\n" + array[sceltastudente]);
                System.out.print("Media Punteggi = "+ array[sceltastudente].media()+" |");
                
            } else {

                System.out.println("\t\t\t~ Tabulato Studenti ~");
                stampa(array);
            }

        }while(scelta != 0);
        
    }

    private static void stampa(Studente [] array) {

        printlinea(150);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("Media Punteggi = "+ array[i].media()+" |");
        }

        System.out.println();

        printlinea(150);
        
    }

    private static void printlinea(int lunghezza) {
        for (int i = 0; i < lunghezza; i++) {
            System.out.print("_");            
        }
        System.out.println();
    }

    private static void cls() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
   
}