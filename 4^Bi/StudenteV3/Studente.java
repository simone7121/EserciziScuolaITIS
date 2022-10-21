//Classe Studente

import java.io.*;

class Studente {

	private String nome;
	private String cognome;
	private int[] votiComp;
	private static final int NUMERO_VOTI = 5;

	public Studente(String nome, String cognome, int[] votiComp) {
		this.cognome = cognome;
		this.nome = nome;
		votiComp = new int[NUMERO_VOTI];
	}

	public Studente() {
		nome = " ";
		cognome = " ";
		votiComp = new int[NUMERO_VOTI];
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setVotiTest() throws IOException,IOError {

		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n\n\t\t| Inserimento voti (Da 0 a 30) |\n\n");

		for (int i = 0; i < NUMERO_VOTI; i++) {
			
			do {

				System.out.print("Inserisci " + (i + 1) + "° Voto: ");
				votiComp[i] = Integer.parseInt(tastiera.readLine());

			} while (votiComp[i] < 0 || votiComp[i] > 30);

		}

	}


	public int mediaSemplice() {

		double media = 0;

		for (int i = 0; i < NUMERO_VOTI; i++){

			media = media + votiComp[i];

		}

		return (int) Math.rint(media / NUMERO_VOTI);

	}

	public int mediaPesata() {

		double media = 0, peso = 1, somma = 0;

		for (int i = 0; i < NUMERO_VOTI; i++) {

			media += votiComp[i] * peso;
			somma += peso;
			peso += 0.1;

		}

		return (int) Math.rint(media / somma);

	}

	public int mediaNoMin() {

		int media = 0;
		double somma = 0;

		for (int i = 1; i < NUMERO_VOTI; i++){
			
			if (votiComp[i] < votiComp[media]){
				media = i;
			}
				
		}
			
		for (int i = 0; i < NUMERO_VOTI; i++){

			if (i != media){
				somma += votiComp[i];
			}
				
		}
			
		return (int) Math.rint(somma / (NUMERO_VOTI - 1));

	}

	public void stampa() {
		System.out.println("\n\t\t-| Media di " +nome+" "+cognome+" |-");

		System.out.print("Voti: ");

		for (int i = 0; i < NUMERO_VOTI; i++){
			System.out.print(" | " + votiComp[i] + " | ");
		}
			
		System.out.println("\n\nMedia Aritmetica: " + mediaSemplice());
		System.out.println("Media Pesata: " + mediaPesata());
		System.out.println("Media senza il minimo: " + mediaNoMin());

		if (mediaSemplice() >= 18 && mediaPesata() >= 18 && mediaNoMin() >= 18){

			System.out.println("\n| Complimenti ! Sei Promosso/a |");

		} else {

			System.out.println("\n| Accidenti ! Sei Bocciato/a |");

		}

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