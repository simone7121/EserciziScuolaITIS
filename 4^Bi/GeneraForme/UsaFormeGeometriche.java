/*

Algoritmo:  Scrivere un programma che consenta di generare delle forme, 
            in funzione alla base ed eventuale altezza
                        
Programmatore: Simone D'Anna
Data: 10/02/2022
Versione: V1.0

*/

import java.io.*;

public class UsaFormeGeometriche {

  public static void main(String[] args) throws IOException {

		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

    int scelta;
    int a = 0;
    int b = 0;


    do {

      System.out.println("\n\t\t ~ GeneraForme V 1.0 ~\n Scegli");

      System.out.println("\n(1) | Genera Rettangolo \n");
      System.out.println("(2) | Genera Quadrato \n");
      System.out.println("(3) | Genera Asterischi \n");
      System.out.println("(4) | Genera Rombo \n");
      System.out.println("(5) | USCIRE \n\n\n");
      System.out.print("SCELTA: ");

      scelta = Integer.parseInt(tastiera.readLine());

      switch (scelta) {

          case 1:

              System.out.print("Inserisci la dimensione della base: ");
              a = Integer.parseInt(tastiera.readLine());

              System.out.print("\nInserisci la dimensione dell'altezza: ");
              b = Integer.parseInt(tastiera.readLine());

              Generatore.stampaRettangolo(a,b);

              break;

          case 2:

              System.out.print("Inserisci la dimensione del lato: ");
              a = Integer.parseInt(tastiera.readLine());

              Generatore.stampaQuadrato(a);

              break;

          case 3:
              System.out.print("Inserisci la dimensione del lato: ");
              a = Integer.parseInt(tastiera.readLine());

              Generatore.stampaAsterischi(a);
              break;

          case 4:
              System.out.print("Inserisci la dimensione del lato: ");
              a = Integer.parseInt(tastiera.readLine());

              Generatore.stampaRombo(a);
              break;

          case 5:
              return;

          default:
              System.out.println("Input INVALIDO, Riprova !\n\n");
              break;

      }

    } while (scelta < 5);

  }
    
}
