/*

Algoritmo: Ricevuto in input tre numeri, moltoplicare solo quelli maggiori di 50.

Programmatore: Simone D'Anna
Data: 21/11/2020

*/

#include <iostream>

using namespace std;

int main() {

    int num1, num2, num3, moltiplicazione;

    cout << "Moltiplicazione numeri maggiori di 50" << endl << endl ;

    cout << "Inserire il primo numero: ";
    cin >> num1;

    if (num1 > 50) {

        moltiplicazione = num1;

    } else {

        cout << "Il numero inserito e' minore di 50" << endl << endl;

    }

    cout << "Inserire il secondo numero: ";
    cin >> num2;

    if (num2 > 50) {

        moltiplicazione = moltiplicazione * num2;

    } else {

        cout << "Il numero inserito e' minore di 50" << endl << endl;

    }

    cout << "Inserire il Terzo numero: ";
    cin >> num3;

    if (num3 > 50) {

        moltiplicazione = moltiplicazione * num3;

    } else {

        cout << "Il numero inserito e' minore di 50" << endl << endl;

    }

    cout << "La moltiplicazione dei numeri maggiori di 50 da come risultato: " << moltiplicazione << endl;

    return 0;

}
