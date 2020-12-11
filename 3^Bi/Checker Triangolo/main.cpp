/*

Algoritmo: Ricevuto in input 3 lati di un triangolo
           dire se il triangolo e' fattibile, e dire
           di che triangolo si tratta.

Programmatore: Simone D'Anna
Data: 18/11/2020

*/

#include <iostream>

using namespace std;

int main() {

    float lato1, lato2, lato3;

    cout << "Triangolo Checker 2870" << endl << endl;

    cout << "Inserire il primo lato: ";
    cin >> lato1;

    cout << endl << "Inserire il secondo lato: ";
    cin >> lato2;

    cout << endl << "Inserire il terzo lato: ";
    cin >> lato3;

    if ((lato1 < (lato2 + lato3)) && (lato2 < (lato1 + lato3)) && (lato3 < (lato1 + lato2))) {

        if ((lato1 == lato2) && (lato2 == lato3)) {

            cout << endl << "Tutti e tre i lati sono uguali, quindi e' un triangolo equilatero." << endl;

        } else {

            if ((lato1 == lato2) || (lato1 == lato3) || (lato2 == lato3)) {

                cout << endl << "Solo due lati sono uguali, quindi e' un triangolo isoscele." << endl;

            } else {

                cout << endl << "Tutti e tre i lati sono disuguali, quindi e' un triangolo scaleno." << endl;

            }

        }

    } else {

        cout << endl << "Con i dati immessi non e' possibile stabilire che triangolo si puo' costruire. \nRicorda!! Ogni lato e' minore della somma degli altri due !" << endl;

    }

    return 0;

}
