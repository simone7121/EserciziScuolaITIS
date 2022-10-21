import java.io.BufferedReader;
import java.io.IOException;

// Creare un oggetto contatore, 
// impostare il passo, mettere a video il 
// valore ed incrementare fino a quando non si raggiunge il valore 100.
import java.io.*;

public class UsaCounter {
    public static void main(String[] args) throws IOException {
        
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int passo = 0 ;
        do{
            System.out.print("Inserisci il passo: ");
            passo = Integer.parseInt(tastiera.readLine());
        } while (passo <= 0);

        Counter contatore = new Counter(passo);

        while(contatore.getValue()<100){
            contatore.increment();
            contatore.stampa();
        }


        
    }
}
