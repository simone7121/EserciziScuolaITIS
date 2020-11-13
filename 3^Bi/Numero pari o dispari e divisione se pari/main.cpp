/*

Algoritmo: Ricevuto in input un numero,Dire se esso è pari o dispari, e se è pari scrivi
in output ache la divisione per 2 di esso.

Programmatore: Simone D'Anna
Data 10/11/2020

*/

#include <iostream>

using namespace std;

int main() {

    int numero1, risultato;

    cout << "Numero pari o Dispari ?  Inserire il numero: ";
    cin >> numero1;

    if (numero1 % 2 == 0) {

        risultato = numero1 / 2;

        cout << "Il numero" << numero1 "e' Pari" << endl;
        cout << "La divisione per 2 da come risultato " << risultato << endl;

    } else {

        cout << "Il numero" << numero1 "e' dispari" << endl;

    }

    return 0;
}
