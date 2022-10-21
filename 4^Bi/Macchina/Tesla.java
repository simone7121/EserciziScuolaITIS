/*

Algoritmo:  Scrivere un programma che consenta di manovrare un'automobile. 
            Le due operazioni possibili sono: accelerare (A) e frenare (F) spegnere (S) e accendere (L). 
            Il programma resta in attesa che l'utente inserisca un comando. 
            Se la macchina è spenta non è possibile né accelerare né frenare.
            Se inse-risce il carattere A, l'automobile aumenta la velocità di 5 km/h. 
            Se inserisce il carattere F l'automobile rallenta la velocità di 10 km/h. 
            Dopo l'inserimento di ogni comando si deve mostrare la velocità attuale dell'automobile. 
            Se si superano i 90 km/h deve essere segnalato un avvertimento: "Vai troppo forte. Rallenta". 
            La velocità non può essere inferiore a zero. Inizialmente l'automobile sta viaggiando a 50 km/h. 
                        
Programmatore: Simone D'Anna
Data: 02/12/2021
Versione: V1.0

*/
import java.io.*;

public class Tesla {
    public static void main(String args[]) throws IOException{

        char azione;
        int i = 0;

        Automobile teslamodel3 = new Automobile("Tesla Model 3"," Km/h");

        cls();

        do {

            azione = selezione(teslamodel3);

            i++;

            cls();

            if (i == 1 && azione != 'L') {

                do {
                    System.out.println("Devi prima accendere la macchina");
                    azione = selezione(teslamodel3);

                } while (azione != 'L');   

            }



            if (azione == 'A'){
                teslamodel3.accelerare();
                System.out.println(teslamodel3);
            } else if (azione == 'F'){
                teslamodel3.frena();
                System.out.println(teslamodel3);
            } else if (azione == 'S'){
                System.out.println("Spengo la macchina, Arrivederci guidatore !");
            }
            
            if (teslamodel3.getVelocita() >= 90) {
                System.out.println("\nVai troppo forte. Rallenta!!!\n");
            }
            
            if (teslamodel3.getVelocita() > 180){
                System.out.println("HAI SCIOLTO IL MOTORE FRATELLI' !!!\n");
                System.out.println("Hai distrutto la macchina, Arrivederci guidatore ! \n\n");
                azione = 'S';
            }

        } while (azione != 'S');

    }


    private static char selezione(Automobile macchina) throws IOException{
        
        char selezione = ' ';

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.print("\n La tua: "+macchina.getNomeAuto()+"\n\t(L) Accendi\n\t(A) Accelera\n\t(F) Frena\n\t(S) Spegni\n\nSelezione: ");
            selezione = tastiera.readLine().charAt(0);
            
        } while (selezione != 'A'  && selezione != 'F'  && selezione != 'S' && selezione != 'L' );

        return selezione;
    }

    private static void cls() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

}
/*
 * ____/\\\\\\\\\\\__________/\\\\\\\\\\\\___________________
 * ____/\\\/////////\\\_______\/\\\////////\\\_______________
 * ____\//\\\______\///________\/\\\______\//\\\_____________
 * ______\////\\\_______________\/\\\_______\/\\\____________
 * __________\////\\\____________\/\\\_______\/\\\___________
 * ______________\////\\\_________\/\\\_______\/\\\__________
 * _______/\\\______\//\\\________\/\\\_______/\\\___________
 * ________\///\\\\\\\\\\\/____/\\\_\/\\\\\\\\\\\\/____/\\\__
 * ___________\///////////_____\///__\////////////_____\///__
 */