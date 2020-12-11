/*

Algoritmo: Ricevuto in input tre numeri, sommare solo quelli positivi.

Programmatore: Simone D'Anna
Data: 21/11/2020

V2

*/

#include <iostream>

using namespace std;

int main() {

    int num1, num2, num3, somma;

    cout << "Sommatore numeri positivi" << endl << endl ;

    cout << "Inserire il primo numero: ";
    cin >> num1;

    if (num1 >= 0) {

        somma = num1;

    } else {

        cout << "Il numero inserito e' Negativo" << endl << endl;

    }

    cout << "Inserire il secondo numero: ";
    cin >> num2;

    if (num2 >= 0) {

        somma = somma + num2;

    } else {

        cout << "Il numero inserito e' Negativo" << endl << endl;

    }

    cout << "Inserire il Terzo numero: ";
    cin >> num3;

    if (num3 >= 0) {

        somma = somma + num3;

    } else {

        cout << "Il numero inserito e' Negativo" << endl << endl;

    }

    cout << "La somma dei numeri positivi da come risultato: " << somma << endl;

    return 0;

}
