/*

Algoritmo: Ricevuto in input un numero, dire se
           è negativo o positivo.

Programmatore: Simone D'Anna
Data 8/11/2020

*/

#include <iostream>

using namespace std;

int main()
{
    float Numero;

    cout << "Numero negativo o positivo ?" << endl << endl << "Inserire il numero: ";
    cin >> Numero;

     if (Numero >= 0) {

        cout << "Il numero " << Numero << " e' positivo." << endl;

    } else {

        cout << "Il numero " << Numero << " e' negativo." << endl;

        }

        return 0;

    }
