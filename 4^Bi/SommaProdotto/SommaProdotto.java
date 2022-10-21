import java.io.*;

public class SommaProdotto {
    
    public static void main(String[] argv) {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input); 

        int value1 = 0;
        int value2 = 0;

        String msgErrore = "ERRORE RIPROVA";

        System.out.println("Calcolo Somma e prodotto di INTERI' \n"); 

        try {

            System.out.print("Inserisci il 1^ numero INTERO: ");                 
            value1 = Integer.parseInt(tastiera.readLine());

            System.out.print("Inserisci il 2^ numero INTERO: ");                 
            value2 = Integer.parseInt(tastiera.readLine());  
            
        } catch (Exception e) {                                         

            System.out.println(msgErrore);                               
            return;

        }

        int prodotto = value1 * value2 ;
        int somma = value1 + value2;

        System.out.print("\n\nLa somma di " + value1 + " e " + value2 + " equivale a : " + somma);
        System.out.print("\nIl prodotto di " + value1 + " e " + value2 + " equivale a : " + prodotto);

    }
}
