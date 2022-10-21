import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class testExit {
    
    public static void main(String []args) {

        Utente appoUtente = new Utente(null, null);
        String appoString;

        boolean definizioneSingleLogin = false;

        try {

            Scanner reader = new Scanner(new BufferedReader(new FileReader("input.txt")));
            reader.useDelimiter("‖");  

            do {

                appoString = reader.next();

                if (appoString.equals("startUtenza")){

                    System.out.println(reader.next() + reader.next());

                } else if (appoString.equals("startDatiUtente")){
                    
                    definizioneSingleLogin = true;

                    if (appoString.equals("endDatiUtente")) {
                        definizioneSingleLogin = false;
                        break;
                    } else {
                        System.out.println(reader.next()+reader.next()+reader.next());
                    }

                } else if (appoString.equals("endDatiUtente") || !definizioneSingleLogin) {
                    //
                }


            } while (reader.hasNext());

            reader.close(); // Chiudo il file di Input.

        } catch (Exception e) { // Nel caso di errori in una delle operazioni.

            if (e.toString().equals("java.util.NoSuchElementException")) {

                JOptionPane.showMessageDialog(null, "ERRORE DI LETTURA !\nIl file è vuoto.\n" + e, "ERRORE",
                        JOptionPane.ERROR_MESSAGE);

            }

        }
   
    }
}
