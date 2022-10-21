/*

Algoritmo:  Scrivere un programma che consenta a una compagnia aerea 
			di gestire una flotta di aerei, con le loro specifiche.
                        
Programmatore: Simone D'Anna
Data: 05/02/2022
Versione: V1.0

*/


import java.io.*;

public class CompagniaAerea {
	
    public static void main(String[] args) throws IOException {

		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        int numAerei;
		String nome;
		String modello;
		int dimensioneSerbatoio;
		String rottaScelta;

		do {

			System.out.print("\nInserisci il totale degli aerei: ");
			numAerei = Integer.parseInt(tastiera.readLine());

		} while (numAerei <= 0);

		Aereo aerei[] = new Aereo[numAerei];

		for (int i = 0; i < aerei.length; i++) {

			System.out.println("\n(" + (i + 1) + "° Aereo)");

			System.out.print("\nInserisci il Nome: ");
			nome = tastiera.readLine();

			System.out.print("\nInserisci il Modello: ");
			modello = tastiera.readLine();

			System.out.print("\nInserisci la dimesione del serbatoio (IN LITRI): ");
			dimensioneSerbatoio = Integer.parseInt(tastiera.readLine());
			
			System.out.print("\nInserisci la Rotta: ");
			rottaScelta = tastiera.readLine();

			aerei[i] = new Aereo(nome,modello,dimensioneSerbatoio,rottaScelta);

		}

		printAerei(aerei);

	}

	private static void printAerei(Aereo aerei[]) {
	
		String div = "\n______________________________________________________________________________________________________________";

		
		System.out.println("\n\n\t\t\t\t  Flotta aerea \n");
		System.out.format("%20s","Nome");
		System.out.format("%15s","Modello");
		System.out.format("%10s","Dimensione Serbatoio");
		System.out.format("%30s","Rotta Scelta");
		System.out.println(div);

		for(int j=0;j<aerei.length;j++){
			System.out.format("\n");
			System.out.format("%20s",aerei[j].getNome());
			System.out.format("%15s",aerei[j].getModello());
			System.out.format("%10d",aerei[j].getDimensioneSerbatoio());
			System.out.format("%30s",aerei[j].getRottaScelta());
		}

		System.out.println(div);

	}

}
