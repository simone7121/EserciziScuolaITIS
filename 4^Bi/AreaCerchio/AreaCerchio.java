import java.io.*;

public class AreaCerchio {
    public static void main(String argv []) {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input); 

        float raggio = 0;
        final Float PIGRECO = 3.1415f;

        String msgErrore = "ERRORE RIPROVA";

        System.out.println("\nCalcolo Area Cerchio \n");

        try {

            System.out.print("Inserisci il raggio del cerchio: ");                 
            raggio = Float.parseFloat(tastiera.readLine());
            
        } catch (Exception e) {                                         

            System.out.println(msgErrore);                               
            return;

        }

        float area = (raggio * raggio) * PIGRECO ;

        System.out.print("L'area del cerchio con raggio " + raggio + " equivale a: " + area);  
    }

}
