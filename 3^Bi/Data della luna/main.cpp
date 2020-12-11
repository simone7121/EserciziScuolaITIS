/*

Algoritmo: Ricevuto in input la data di nascita dell'utente
           dire se e nato lo stesso annoi dell'atterraggio
           dell'uomo sulla luna.

Programmatore: Simone D'Anna
Data: 21/11/2020

*/

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int data_Nascita, differenza_Datan_Luna;

    const int data_Uomo_Luna = 1969;

    cout << "Un evento molto importante !" << endl << endl;

    cout << "Inserire la tua data di nascita: ";
    cin >> data_Nascita;

    differenza_Datan_Luna = data_Nascita - data_Uomo_Luna;

    if (data_Nascita >= data_Uomo_Luna) {

        if (data_Nascita == data_Uomo_Luna) {

            cout << endl << "Complimenti, sei nato lo stesso anno\nquando l'uomo e atterrato sulla luna." << endl;

        } else {

            cout << endl << "Mi dispiace, ma sei nato " << differenza_Datan_Luna << " Anni Dopo l'atterraggio dell'uomo sulla luna.";

        }

    } else {

        cout << endl << "Mi dispiace, ma sei nato " << abs(differenza_Datan_Luna) << " Anni Prima dell'atterraggio dell'uomo sulla luna.";

    }





}
