/*

Algoritmo: Gioco di Carte

Programmatore: Simone D'Anna
Data: 05/12/2020

*/

#include <iostream>

using namespace std;

int main() {

    int num1, num2, risultato;                                                                  // Declare Variabili Intere
    char casecarta, letterapic;                                                                 // Declare Char X If e Funzione P

    cout << "(Cuori Picche Fiori o Quadri ?)" << endl;

    cout << "Inserire solo l'iniziale della carta scelta (C P F Q): ";
    cin >> casecarta;
    cout << endl;

    if (casecarta == 'f' || casecarta == 'F') {                                                 // Caso Fiori

        cout << "Hai selezionato: Fiori" << endl ;

        cout << "Inserire un numero: ";
        cin >> num1;

        cout << "Inserire un altro numero: " ;
        cin >> num2;

        risultato = num1 + num2;                                                                // Esegue la somma dei 2 numeri inseriti

        if (risultato % 2 == 0) {                                                               // Se il risultato e' pari

            cout << endl;
            cout << "Hai vinto !!" << endl;

        } else {

            cout << endl;
            cout << "Hai Perso !!" << endl;

        }
    }

    if (casecarta == 'c' || casecarta == 'C' || casecarta == 'q' || casecarta == 'Q') {         // Caso Cuori o Quadri

        cout << "Hai selezionato: Cuori o Quadri" << endl ;

        cout << "Inserire un numero: ";
        cin >> num1;

        risultato = num1 * 3;                                                                   // Moltiplica il risultato per 3

        if (risultato >= 50 || risultato <= 65) {                                               // Se il risultato e' compreso tra 50 e 65

            cout << endl;
            cout << "Hai vinto !!" << endl;

        } else {

            cout << endl;
            cout << "Hai Perso !!" << endl;

        }
    }

    if (casecarta == 'p' || casecarta == 'P') {                                                 // Caso Picche

        cout << "Hai selezionato: Picche" << endl ;

        cout << "Inserire una lettera: ";                                                       // Input di una lettera
        cin >> letterapic;

        if (letterapic == 'a' || letterapic == 'A' || letterapic == 'e' || letterapic == 'E' || letterapic == 'i' ||letterapic == 'I' || letterapic == 'o' || letterapic == 'O' || letterapic == 'u' || letterapic == 'U') {

            cout << "Inserire un numero: ";                                                     // ^^^^ Se la lettera inserita e' una Vocale ^^^^
            cin >> num1;

            cout << endl;
            cout << "Hai inserito il numero: " << num1 << endl;                                 // Esegue l'output del numero inseritosi prima

        } else {

            cout << endl;
            cout << "La carta che hai selezionato e' di colore NERA" << endl;                   // Esegue l'output del colore della carta.

        }
    }

    return 0;

}
