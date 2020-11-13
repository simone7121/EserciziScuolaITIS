/*

Algoritmo: Ricevuto in input un set di numeri,
           ordinarli in ordine crescente.

Programmatore: Simone D'Anna
Data 8/11/2020

*/

#include <iostream>

using namespace std;

int main()
{
    float Numero_1,Numero_2,Maggiore,Minore;

    cout << "Ordinatore di numeri." << endl << endl << "Inserire il primo numero: ";
    cin >> Numero_1;

    cout << "Inserire il secondo numero: ";
    cin >> Numero_2;


if (Numero_1 < Numero_2) {

        Minore = Numero_1;
        Maggiore = Numero_2;

    } else {

        Minore = Numero_2;
        Maggiore = Numero_1;

    }

    cout << "I numeri in ordine sono: " << Minore <<" " << Maggiore << endl;
    return 0;

}
