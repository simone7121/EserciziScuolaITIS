/*

Algoritmo:  Il docente del corso di Programmazione in Java e Gestione della grafica ha proposto agli studenti,
			come alternativa all’esame finale, di superare 5 test intermedi.
			Bisogna pero' stabilire una procedura per il calcolo del voto finale a
			partire dai voti dei test. Il docente propone 3 possibilita':

			1. MediaSemplice
			(In pratica: sommo tutti i risultati, divido per 5 e approssimo il numero all'intero più vicino).

			2. MediaPesata
			Il test 2 vale il 10% in piu' del test 1; il test 3 vale il 20% in piu' del test 1; il test 4 vale il 30% in piu' del test
			1 e il test 5 vale il 40% in piu' del test 1.
			(In pratica: moltiplico il risultato del test 2 per 1.1 , il risultato del test 3 per 1.2, il risultato del test 4 per
			1.3 e il risultato del test 5 per 1.4. Poi sommo tutti i risultati cosi' modificati, divido per 6 e approssimo il
			numero all'intero più vicino)

			3. MediaNoMin
			Escludo dalla media il voto piu' basso ottenuto nei 5 test.
			(In pratica: elimino il voto minimo, sommo tutti i risultati, divido per 4 e approssimo il numero all'intero
			piu' vicino).

			L'obiettivo  e' di verificare quale di questi sistemi potrebbe essere più favorevole a partire da esempi di risultati
			sui 5 test:
                        
Programmatore: Simone D'Anna
Data: 02/02/2022
Versione: V2.0

*/

import java.io.*;

class TestFeb {

	public static void main(String[] args) throws IOException {

		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

		int numStudenti;

		do {

			System.out.print("\nInserisci il totale degli studenti: ");
			numStudenti = Integer.parseInt(tastiera.readLine());

		} while (numStudenti <= 0);

		Studente studenti[] = new Studente[numStudenti];

		for (int i = 0; i < studenti.length; i++) {

			studenti[i] = new Studente();

			System.out.println("\n(" + (i + 1) + "° Studente)");

			System.out.print("\nInserisci il Nome: ");
			studenti[i].setNome(tastiera.readLine());

			System.out.print("Inserisci il Cognome: ");
			studenti[i].setCognome(tastiera.readLine());

			studenti[i].setVotiTest();

		}

		for (int i = 0; i < studenti.length; i++) {
			System.out.println("________________________________________________________");
			studenti[i].stampa();
			System.out.println("________________________________________________________");
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