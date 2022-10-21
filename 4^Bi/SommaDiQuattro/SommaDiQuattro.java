import java.io.*;

public class SommaDiQuattro {
    public static void main(String argv []) {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input); 

        int inputVal = 0;
        int totalizz = 0;

        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nCalcolo Somma 4 Numeri INTERI' \n"); 

        for (int i=1; i<=4; i++){
            
            try {

                System.out.print("Inserisci il " + i + " numero INTERO: ");                 
                inputVal = Integer.parseInt(tastiera.readLine());

                totalizz+= inputVal;
                
            } catch (Exception e) {                                         

                System.out.println(msgErrore);                               
                return;

            }

        }

        System.out.print("\n\nLa somma equivale a : " + totalizz);

    }

}
