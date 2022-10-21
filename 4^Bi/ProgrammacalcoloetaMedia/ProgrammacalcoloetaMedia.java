/*

Algoritmo:  Chiedere all'utente di inserire 3 eta', 
            dopodiche' fare il calcolo della media tra le 3 e farne l'output.

Programmatore: Simone D'Anna
Data: 27/09/2021

*/


import java.io.*;

public class ProgrammacalcoloetaMedia {

    public static void main(String[] argv) {
        
        InputStreamReader input = new InputStreamReader(System.in);     // Uso la classe "InputStreamReader" e creo nuovo un oggetto "input"
        BufferedReader tastiera = new BufferedReader(input);            // Uso la classe "BufferedReader" e creo nuovo un oggetto "tastiera" con valore di oggetto "input" 

        int eta1 = 0;                                                   // Dichiaro e inizializzo le variabili
        int eta2 = 0;
        int eta3 = 0;

        String msgErrore = "ERRORE RIPROVA";                            // Dichiaro e inizializzo la costante che serve per gli errori nel blocco logico try catch

        System.out.println("Calcolo media eta' \n");                    // Output
        
        try {

            System.out.print("Inserisci la 1' eta': ");                 // Output
            String valoreInput = tastiera.readLine();                   // Assegno alla variabile "valoreInput" il valore della stringa di classe "tastiera" e di oggetto "readLine"
            eta1 = Integer.parseInt(valoreInput);                       // Eseguo il parsing da tipo "String" a tipo "int" e gli passo il "valoreInput" come parametro della classe
            
        } catch (Exception e) {                                         // Se trova un errore in fase di parsing

            System.out.println(msgErrore);                              // Output messaggio errore
            return;

        }

        try {

            System.out.print("Inserisci la 2' eta': ");                 // Output
            String valoreInput = tastiera.readLine();                   // Assegno alla variabile "valoreInput" il valore della stringa di classe "tastiera" e di oggetto "readLine"
            eta2 = Integer.parseInt(valoreInput);                       // Eseguo il parsing da tipo "String" a tipo "int" e gli passo il "valoreInput" come parametro della classe
            
        } catch (Exception e) {                                         // Se trova un errore in fase di parsing

            System.out.println(msgErrore);                              // Output messaggio errore
            return;
        }

        try {

            System.out.print("Inserisci la 3' eta': ");                 // Output
            String valoreInput = tastiera.readLine();                   // Assegno alla variabile "valoreInput" il valore della stringa di classe "tastiera" e di oggetto "readLine"
            eta3 = Integer.parseInt(valoreInput);                       // Eseguo il parsing da tipo "String" a tipo "int" e gli passo il "valoreInput" come parametro della classe

        } catch (Exception e) {                                         // Se trova un errore in fase di parsing

            System.out.println(msgErrore);                              // Output messaggio errore
            return;

        }
        
        float media = ( (float) eta1 + eta2 + eta3) / 3;                // Calcolo del valore della media in "float", facendo il casting delle variabili da "int" a "float"

        System.out.print("\nLa media tra: " + eta1 +" , "+ eta2 +" , "+ eta3 +" e': "+ media);  // Output risultato
        
    }
    
}
